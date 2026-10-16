package androidx.media3.extractor.ts;

import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.DtsUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import com.google.d.b.an;
import com.google.d.l.j;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DtsReader implements ElementaryStreamReader {
    private static final int CORE_HEADER_SIZE = 18;
    static final int EXTSS_HEADER_SIZE_MAX = 4096;
    static final int FTOC_MAX_HEADER_SIZE = 5408;
    private static final int STATE_CHECKING_FOR_EXTSS_AFTER_CORE = 7;
    private static final int STATE_FINDING_EXTSS_HEADER_SIZE = 2;
    private static final int STATE_FINDING_SYNC = 0;
    private static final int STATE_FINDING_UHD_HEADER_SIZE = 4;
    private static final int STATE_READING_CORE_HEADER = 1;
    private static final int STATE_READING_EXTSS_HEADER = 3;
    private static final int STATE_READING_SAMPLE = 6;
    private static final int STATE_READING_UHD_HEADER = 5;
    private int bytesRead;
    private final String containerMimeType;
    private boolean coreFormatPendingEmit;
    private int coreSampleSize;
    private int extSyncBytes;
    private Format format;
    private String formatId;
    private int frameType;
    private boolean hasCore;
    private final ParsableByteArray headerScratchBytes;
    private final String language;
    private TrackOutput output;
    private final int roleFlags;
    private long sampleDurationUs;
    private int sampleSize;
    private boolean skipExtssUntilCore;
    private int syncBytes;
    private int state = 0;
    private long timeUs = C.TIME_UNSET;
    private long pendingTimeUs = C.TIME_UNSET;
    private final AtomicInteger uhdAudioChunkId = new AtomicInteger();
    private int extensionSubstreamHeaderSize = -1;
    private int uhdHeaderSize = -1;

    public DtsReader(String str, int i2, int i3, String str2) {
        this.headerScratchBytes = new ParsableByteArray(new byte[i3]);
        this.language = str;
        this.roleFlags = i2;
        this.containerMimeType = str2;
    }

    private boolean continueRead(ParsableByteArray parsableByteArray, byte[] bArr, int i2) {
        int iMin = Math.min(parsableByteArray.bytesLeft(), i2 - this.bytesRead);
        parsableByteArray.readBytes(bArr, this.bytesRead, iMin);
        int i3 = this.bytesRead + iMin;
        this.bytesRead = i3;
        return i3 == i2;
    }

    private void parseCoreHeader() {
        this.hasCore = true;
        byte[] data = this.headerScratchBytes.getData();
        if (this.format == null) {
            this.format = DtsUtil.parseDtsFormat(data, this.formatId, this.language, this.roleFlags, this.containerMimeType, null);
            this.coreFormatPendingEmit = true;
        }
        this.sampleSize = DtsUtil.getDtsFrameSize(data);
        this.sampleDurationUs = j.h(Util.sampleCountToDurationUs(DtsUtil.parseDtsAudioSampleCount(data), this.format.sampleRate));
    }

    private void parseExtensionSubstreamHeader() throws ParserException {
        DtsUtil.DtsHeader dtsHdHeader = DtsUtil.parseDtsHdHeader(this.headerScratchBytes.getData());
        updateFormatWithDtsHeaderInfo(dtsHdHeader);
        this.sampleSize = dtsHdHeader.frameSize;
        long j2 = dtsHdHeader.frameDurationUs;
        if (j2 != C.TIME_UNSET) {
            this.sampleDurationUs = j2;
        }
    }

    private void parseUhdHeader() throws ParserException {
        DtsUtil.DtsHeader dtsUhdHeader = DtsUtil.parseDtsUhdHeader(this.headerScratchBytes.getData(), this.uhdAudioChunkId);
        if (this.frameType == 3) {
            updateFormatWithDtsHeaderInfo(dtsUhdHeader);
        }
        this.sampleSize = dtsUhdHeader.frameSize;
        long j2 = dtsUhdHeader.frameDurationUs;
        if (j2 == C.TIME_UNSET) {
            j2 = 0;
        }
        this.sampleDurationUs = j2;
    }

    private void setHeaderScratchBytesFromSyncWord(int i2) {
        byte[] data = this.headerScratchBytes.getData();
        data[0] = (byte) ((i2 >> 24) & 255);
        data[1] = (byte) ((i2 >> 16) & 255);
        data[2] = (byte) ((i2 >> 8) & 255);
        data[3] = (byte) (i2 & 255);
        this.bytesRead = 4;
    }

    private boolean skipToNextSyncWord(ParsableByteArray parsableByteArray) {
        while (parsableByteArray.bytesLeft() > 0) {
            int i2 = this.syncBytes << 8;
            this.syncBytes = i2;
            int unsignedByte = i2 | parsableByteArray.readUnsignedByte();
            this.syncBytes = unsignedByte;
            int frameType = DtsUtil.getFrameType(unsignedByte);
            this.frameType = frameType;
            if (frameType != 0) {
                setHeaderScratchBytesFromSyncWord(this.syncBytes);
                this.syncBytes = 0;
                return true;
            }
        }
        return false;
    }

    private void updateFormatWithDtsHeaderInfo(DtsUtil.DtsHeader dtsHeader) {
        int i2;
        int i3 = dtsHeader.sampleRate;
        if (i3 == -2147483647 || (i2 = dtsHeader.channelCount) == -1) {
            return;
        }
        String str = dtsHeader.mimeType;
        if (str == null) {
            Format format = this.format;
            str = format != null ? format.sampleMimeType : null;
        }
        Format format2 = this.format;
        if (format2 != null && !this.coreFormatPendingEmit && i2 == format2.channelCount && i3 == format2.sampleRate && Objects.equals(str, format2.sampleMimeType)) {
            return;
        }
        Format format3 = this.format;
        Format.Builder builder = format3 == null ? new Format.Builder() : format3.buildUpon();
        builder.setId(this.formatId);
        builder.setContainerMimeType(this.containerMimeType);
        builder.setSampleMimeType(str);
        builder.setChannelCount(dtsHeader.channelCount);
        builder.setSampleRate(dtsHeader.sampleRate);
        builder.setLanguage(this.language);
        builder.setRoleFlags(this.roleFlags);
        Format formatBuild = builder.build();
        this.format = formatBuild;
        this.output.format(formatBuild);
        this.coreFormatPendingEmit = false;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) throws ParserException {
        int i2;
        an.B(this.output);
        while (parsableByteArray.bytesLeft() > 0) {
            int i3 = 2;
            switch (this.state) {
                case 0:
                    if (!skipToNextSyncWord(parsableByteArray)) {
                        break;
                    } else if (!this.skipExtssUntilCore || this.frameType != 2) {
                        int i4 = this.frameType;
                        if (i4 == 1) {
                            this.skipExtssUntilCore = false;
                            i4 = 1;
                        }
                        if (i4 != 3 && i4 != 4) {
                            if (i4 != 1) {
                                this.state = 2;
                                break;
                            } else {
                                this.state = 1;
                                break;
                            }
                        } else {
                            this.state = 4;
                            break;
                        }
                    } else {
                        this.bytesRead = 0;
                        break;
                    }
                    break;
                case 1:
                    if (!continueRead(parsableByteArray, this.headerScratchBytes.getData(), 18)) {
                        break;
                    } else {
                        parseCoreHeader();
                        this.headerScratchBytes.setPosition(0);
                        this.output.sampleData(this.headerScratchBytes, 18);
                        this.state = 6;
                        break;
                    }
                case 2:
                    if (!continueRead(parsableByteArray, this.headerScratchBytes.getData(), 7)) {
                        break;
                    } else {
                        this.extensionSubstreamHeaderSize = DtsUtil.parseDtsHdHeaderSize(this.headerScratchBytes.getData());
                        this.state = 3;
                        break;
                    }
                case 3:
                    if (!continueRead(parsableByteArray, this.headerScratchBytes.getData(), this.extensionSubstreamHeaderSize)) {
                        break;
                    } else {
                        parseExtensionSubstreamHeader();
                        this.headerScratchBytes.setPosition(0);
                        this.output.sampleData(this.headerScratchBytes, this.extensionSubstreamHeaderSize);
                        this.state = 6;
                        break;
                    }
                case 4:
                    if (!continueRead(parsableByteArray, this.headerScratchBytes.getData(), 6)) {
                        break;
                    } else {
                        int dtsUhdHeaderSize = DtsUtil.parseDtsUhdHeaderSize(this.headerScratchBytes.getData());
                        this.uhdHeaderSize = dtsUhdHeaderSize;
                        int i5 = this.bytesRead;
                        if (i5 > dtsUhdHeaderSize) {
                            int i6 = i5 - dtsUhdHeaderSize;
                            this.bytesRead = i5 - i6;
                            parsableByteArray.setPosition(parsableByteArray.getPosition() - i6);
                        }
                        this.state = 5;
                        break;
                    }
                case 5:
                    if (!continueRead(parsableByteArray, this.headerScratchBytes.getData(), this.uhdHeaderSize)) {
                        break;
                    } else {
                        parseUhdHeader();
                        this.headerScratchBytes.setPosition(0);
                        this.output.sampleData(this.headerScratchBytes, this.uhdHeaderSize);
                        this.state = 6;
                        break;
                    }
                case 6:
                    int iMin = Math.min(parsableByteArray.bytesLeft(), this.sampleSize - this.bytesRead);
                    this.output.sampleData(parsableByteArray, iMin);
                    int i7 = this.bytesRead + iMin;
                    this.bytesRead = i7;
                    int i8 = this.sampleSize;
                    if (i7 == i8) {
                        if (this.frameType != 1) {
                            an.u(this.timeUs != C.TIME_UNSET);
                            int i9 = this.sampleSize;
                            int i10 = this.frameType;
                            if (i10 == 2) {
                                i2 = this.coreSampleSize;
                            } else {
                                i3 = i10;
                                i2 = 0;
                            }
                            int i11 = i9 + i2;
                            long j2 = this.timeUs;
                            this.output.sampleMetadata(j2, i3 == 4 ? 0 : 1, i11, 0, null);
                            this.timeUs += this.sampleDurationUs;
                            long j3 = this.pendingTimeUs;
                            if (j3 != C.TIME_UNSET) {
                                if (j3 != j2) {
                                    this.timeUs = j3;
                                }
                                this.pendingTimeUs = C.TIME_UNSET;
                            }
                            this.coreSampleSize = 0;
                            this.state = 0;
                            break;
                        } else {
                            this.coreSampleSize = i8;
                            this.bytesRead = 0;
                            this.extSyncBytes = 0;
                            this.state = 7;
                            break;
                        }
                    } else {
                        break;
                    }
                case 7:
                    while (parsableByteArray.bytesLeft() > 0 && this.bytesRead < 4) {
                        int i12 = this.extSyncBytes << 8;
                        this.extSyncBytes = i12;
                        this.extSyncBytes = i12 | parsableByteArray.readUnsignedByte();
                        this.bytesRead++;
                    }
                    if (this.bytesRead == 4) {
                        if (DtsUtil.getFrameType(this.extSyncBytes) != 2) {
                            if (this.coreFormatPendingEmit) {
                                TrackOutput trackOutput = this.output;
                                Format format = this.format;
                                an.B(format);
                                trackOutput.format(format);
                                this.coreFormatPendingEmit = false;
                            }
                            an.u(this.timeUs != C.TIME_UNSET);
                            long j4 = this.timeUs;
                            this.output.sampleMetadata(j4, 1, this.coreSampleSize, 0, null);
                            this.timeUs += this.sampleDurationUs;
                            long j5 = this.pendingTimeUs;
                            if (j5 != C.TIME_UNSET) {
                                if (j5 != j4) {
                                    this.timeUs = j5;
                                }
                                this.pendingTimeUs = C.TIME_UNSET;
                            }
                            this.coreSampleSize = 0;
                            int i13 = this.extSyncBytes;
                            this.syncBytes = i13;
                            this.extSyncBytes = 0;
                            int frameType = DtsUtil.getFrameType(i13);
                            this.frameType = frameType;
                            if (frameType != 3 && frameType != 4) {
                                if (frameType != 1) {
                                    this.bytesRead = 0;
                                    this.state = 0;
                                    break;
                                } else {
                                    setHeaderScratchBytesFromSyncWord(i13);
                                    this.syncBytes = 0;
                                    this.state = 1;
                                    break;
                                }
                            } else {
                                setHeaderScratchBytesFromSyncWord(i13);
                                this.syncBytes = 0;
                                this.state = 4;
                                break;
                            }
                        } else {
                            setHeaderScratchBytesFromSyncWord(this.extSyncBytes);
                            this.frameType = 2;
                            this.extSyncBytes = 0;
                            this.state = 2;
                            break;
                        }
                    } else {
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 1);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void endOfInputReached() {
        if (this.state == 7) {
            an.B(this.output);
            if (this.coreFormatPendingEmit) {
                TrackOutput trackOutput = this.output;
                Format format = this.format;
                an.B(format);
                trackOutput.format(format);
                this.coreFormatPendingEmit = false;
            }
            long j2 = this.timeUs;
            if (j2 != C.TIME_UNSET) {
                this.output.sampleMetadata(j2, 1, this.coreSampleSize, 0, null);
                this.timeUs += this.sampleDurationUs;
            }
            this.coreSampleSize = 0;
            this.bytesRead = 0;
            this.syncBytes = 0;
            this.extSyncBytes = 0;
            this.state = 0;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public /* synthetic */ void packetFinished() {
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j2, int i2) {
        if (j2 != C.TIME_UNSET) {
            if (this.state != 0) {
                this.pendingTimeUs = j2;
            } else {
                this.timeUs = j2;
                this.pendingTimeUs = C.TIME_UNSET;
            }
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.state = 0;
        this.bytesRead = 0;
        this.syncBytes = 0;
        this.extSyncBytes = 0;
        this.coreSampleSize = 0;
        this.timeUs = C.TIME_UNSET;
        this.pendingTimeUs = C.TIME_UNSET;
        this.uhdAudioChunkId.set(0);
        this.coreFormatPendingEmit = false;
        this.skipExtssUntilCore = this.hasCore;
    }
}
