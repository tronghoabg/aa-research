package androidx.media3.extractor.ts;

import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import com.google.d.b.an;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AdtsReader implements ElementaryStreamReader {
    private static final int CRC_SIZE = 2;
    private static final int HEADER_SIZE = 5;
    private static final int ID3_HEADER_SIZE = 10;
    private static final byte[] ID3_IDENTIFIER = {73, 68, 51};
    private static final int ID3_SIZE_OFFSET = 6;
    private static final int MATCH_STATE_FF = 512;
    private static final int MATCH_STATE_I = 768;
    private static final int MATCH_STATE_ID = 1024;
    private static final int MATCH_STATE_START = 256;
    private static final int MATCH_STATE_VALUE_SHIFT = 8;
    private static final int STATE_CHECKING_ADTS_HEADER = 1;
    private static final int STATE_FINDING_SAMPLE = 0;
    private static final int STATE_READING_ADTS_HEADER = 3;
    private static final int STATE_READING_ID3_HEADER = 2;
    private static final int STATE_READING_SAMPLE = 4;
    private static final String TAG = "AdtsReader";
    private static final int VERSION_UNSET = -1;
    private final ParsableBitArray adtsScratch;
    private int bytesRead;
    private final String containerMimeType;
    private int currentFrameVersion;
    private TrackOutput currentOutput;
    private long currentSampleDuration;
    private final boolean exposeId3;
    private int firstFrameSampleRateIndex;
    private int firstFrameVersion;
    private String formatId;
    private boolean foundFirstFrame;
    private boolean hasCrc;
    private boolean hasOutputFormat;
    private final ParsableByteArray id3HeaderBuffer;
    private TrackOutput id3Output;
    private final String language;
    private int matchState;
    private TrackOutput output;
    private final int roleFlags;
    private long sampleDurationUs;
    private int sampleSize;
    private int state;
    private long timeUs;

    public AdtsReader(boolean z, String str, int i2, String str2) {
        this.adtsScratch = new ParsableBitArray(new byte[7]);
        this.id3HeaderBuffer = new ParsableByteArray(Arrays.copyOf(ID3_IDENTIFIER, 10));
        this.firstFrameVersion = -1;
        this.firstFrameSampleRateIndex = -1;
        this.sampleDurationUs = C.TIME_UNSET;
        this.timeUs = C.TIME_UNSET;
        this.exposeId3 = z;
        this.language = str;
        this.roleFlags = i2;
        this.containerMimeType = str2;
        setFindingSampleState();
    }

    private void assertTracksCreated() {
        an.B(this.output);
        int i2 = Util.SDK_INT;
    }

    private void checkAdtsHeader(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() == 0) {
            return;
        }
        this.adtsScratch.data[0] = parsableByteArray.getData()[parsableByteArray.getPosition()];
        this.adtsScratch.setPosition(2);
        int bits = this.adtsScratch.readBits(4);
        int i2 = this.firstFrameSampleRateIndex;
        if (i2 != -1 && bits != i2) {
            resetSync();
            return;
        }
        if (!this.foundFirstFrame) {
            this.foundFirstFrame = true;
            this.firstFrameVersion = this.currentFrameVersion;
            this.firstFrameSampleRateIndex = bits;
        }
        setReadingAdtsHeaderState();
    }

    private boolean checkSyncPositionValid(ParsableByteArray parsableByteArray, int i2) {
        parsableByteArray.setPosition(i2 + 1);
        if (!tryRead(parsableByteArray, this.adtsScratch.data, 1)) {
            return false;
        }
        this.adtsScratch.setPosition(4);
        int bits = this.adtsScratch.readBits(1);
        int i3 = this.firstFrameVersion;
        if (i3 != -1 && bits != i3) {
            return false;
        }
        if (this.firstFrameSampleRateIndex != -1) {
            if (!tryRead(parsableByteArray, this.adtsScratch.data, 1)) {
                return true;
            }
            this.adtsScratch.setPosition(2);
            if (this.adtsScratch.readBits(4) != this.firstFrameSampleRateIndex) {
                return false;
            }
            parsableByteArray.setPosition(i2 + 2);
        }
        if (!tryRead(parsableByteArray, this.adtsScratch.data, 4)) {
            return true;
        }
        this.adtsScratch.setPosition(14);
        int bits2 = this.adtsScratch.readBits(13);
        if (bits2 < 7) {
            return false;
        }
        byte[] data = parsableByteArray.getData();
        int iLimit = parsableByteArray.limit();
        int i4 = i2 + bits2;
        if (i4 >= iLimit) {
            return true;
        }
        byte b2 = data[i4];
        if (b2 == -1) {
            int i5 = i4 + 1;
            if (i5 == iLimit) {
                return true;
            }
            byte b3 = data[i5];
            return isAdtsSyncBytes((byte) -1, b3) && ((b3 & 8) >> 3) == bits;
        }
        if (b2 != 73) {
            return false;
        }
        int i6 = i4 + 1;
        if (i6 == iLimit) {
            return true;
        }
        if (data[i6] != 68) {
            return false;
        }
        int i7 = i4 + 2;
        return i7 == iLimit || data[i7] == 51;
    }

    private boolean continueRead(ParsableByteArray parsableByteArray, byte[] bArr, int i2) {
        int iMin = Math.min(parsableByteArray.bytesLeft(), i2 - this.bytesRead);
        parsableByteArray.readBytes(bArr, this.bytesRead, iMin);
        int i3 = this.bytesRead + iMin;
        this.bytesRead = i3;
        return i3 == i2;
    }

    private void findNextSample(ParsableByteArray parsableByteArray) {
        int i2;
        byte[] data = parsableByteArray.getData();
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        while (position < iLimit) {
            int i3 = position + 1;
            byte b2 = data[position];
            int i4 = b2 & 255;
            if (this.matchState == 512 && isAdtsSyncBytes((byte) -1, (byte) i4) && (this.foundFirstFrame || checkSyncPositionValid(parsableByteArray, position - 1))) {
                this.currentFrameVersion = (b2 & 8) >> 3;
                this.hasCrc = 1 == ((b2 & 1) ^ 1);
                if (this.foundFirstFrame) {
                    setReadingAdtsHeaderState();
                } else {
                    setCheckingAdtsHeaderState();
                }
                parsableByteArray.setPosition(i3);
                return;
            }
            int i5 = this.matchState;
            int i6 = i4 | i5;
            if (i6 != 329) {
                if (i6 == 511) {
                    this.matchState = 512;
                } else if (i6 == 836) {
                    i2 = 1024;
                } else if (i6 == 1075) {
                    setReadingId3HeaderState();
                    parsableByteArray.setPosition(i3);
                    return;
                } else if (i5 != 256) {
                    this.matchState = 256;
                }
                position = i3;
            } else {
                i2 = 768;
            }
            this.matchState = i2;
            position = i3;
        }
        parsableByteArray.setPosition(position);
    }

    private boolean isAdtsSyncBytes(byte b2, byte b3) {
        return isAdtsSyncWord(((b2 & 255) << 8) | (b3 & 255));
    }

    public static boolean isAdtsSyncWord(int i2) {
        return (i2 & 65526) == 65520;
    }

    private void parseAdtsHeader() {
        this.adtsScratch.setPosition(0);
        boolean z = this.hasOutputFormat;
        ParsableBitArray parsableBitArray = this.adtsScratch;
        if (z) {
            parsableBitArray.skipBits(10);
        } else {
            int bits = parsableBitArray.readBits(2) + 1;
            if (bits != 2) {
                Log.w(TAG, "Detected audio object type: " + bits + ", but assuming AAC LC.");
            }
            this.adtsScratch.skipBits(5);
            byte[] bArrBuildAudioSpecificConfig = AacUtil.buildAudioSpecificConfig(2, this.firstFrameSampleRateIndex, this.adtsScratch.readBits(3));
            AacUtil.Config audioSpecificConfig = AacUtil.parseAudioSpecificConfig(bArrBuildAudioSpecificConfig);
            Format.Builder builder = new Format.Builder();
            builder.setId(this.formatId);
            builder.setContainerMimeType(this.containerMimeType);
            builder.setSampleMimeType("audio/mp4a-latm");
            builder.setCodecs(audioSpecificConfig.codecs);
            builder.setChannelCount(audioSpecificConfig.channelCount);
            builder.setSampleRate(audioSpecificConfig.sampleRateHz);
            builder.setInitializationData(Collections.singletonList(bArrBuildAudioSpecificConfig));
            builder.setLanguage(this.language);
            builder.setRoleFlags(this.roleFlags);
            Format formatBuild = builder.build();
            this.sampleDurationUs = 1024000000 / formatBuild.sampleRate;
            this.output.format(formatBuild);
            this.hasOutputFormat = true;
        }
        this.adtsScratch.skipBits(4);
        int bits2 = this.adtsScratch.readBits(13);
        int i2 = bits2 - 7;
        if (this.hasCrc) {
            i2 = bits2 - 9;
        }
        setReadingSampleState(this.output, this.sampleDurationUs, 0, i2);
    }

    private void parseId3Header() {
        this.id3Output.sampleData(this.id3HeaderBuffer, 10);
        this.id3HeaderBuffer.setPosition(6);
        setReadingSampleState(this.id3Output, 0L, 10, this.id3HeaderBuffer.readSynchSafeInt() + 10);
    }

    private void readSample(ParsableByteArray parsableByteArray) {
        int iMin = Math.min(parsableByteArray.bytesLeft(), this.sampleSize - this.bytesRead);
        this.currentOutput.sampleData(parsableByteArray, iMin);
        int i2 = this.bytesRead + iMin;
        this.bytesRead = i2;
        if (i2 == this.sampleSize) {
            an.u(this.timeUs != C.TIME_UNSET);
            this.currentOutput.sampleMetadata(this.timeUs, 1, this.sampleSize, 0, null);
            this.timeUs += this.currentSampleDuration;
            setFindingSampleState();
        }
    }

    private void resetSync() {
        this.foundFirstFrame = false;
        setFindingSampleState();
    }

    private void setCheckingAdtsHeaderState() {
        this.state = 1;
        this.bytesRead = 0;
    }

    private void setFindingSampleState() {
        this.state = 0;
        this.bytesRead = 0;
        this.matchState = 256;
    }

    private void setReadingAdtsHeaderState() {
        this.state = 3;
        this.bytesRead = 0;
    }

    private void setReadingId3HeaderState() {
        this.state = 2;
        this.bytesRead = ID3_IDENTIFIER.length;
        this.sampleSize = 0;
        this.id3HeaderBuffer.setPosition(0);
    }

    private void setReadingSampleState(TrackOutput trackOutput, long j2, int i2, int i3) {
        this.state = 4;
        this.bytesRead = i2;
        this.currentOutput = trackOutput;
        this.currentSampleDuration = j2;
        this.sampleSize = i3;
    }

    private boolean tryRead(ParsableByteArray parsableByteArray, byte[] bArr, int i2) {
        if (parsableByteArray.bytesLeft() < i2) {
            return false;
        }
        parsableByteArray.readBytes(bArr, 0, i2);
        return true;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        assertTracksCreated();
        while (parsableByteArray.bytesLeft() > 0) {
            int i2 = this.state;
            if (i2 == 0) {
                findNextSample(parsableByteArray);
            } else if (i2 == 1) {
                checkAdtsHeader(parsableByteArray);
            } else if (i2 != 2) {
                if (i2 == 3) {
                    if (continueRead(parsableByteArray, this.adtsScratch.data, true != this.hasCrc ? 5 : 7)) {
                        parseAdtsHeader();
                    }
                } else {
                    if (i2 != 4) {
                        throw new IllegalStateException();
                    }
                    readSample(parsableByteArray);
                }
            } else if (continueRead(parsableByteArray, this.id3HeaderBuffer.getData(), 10)) {
                parseId3Header();
            }
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.getTrackId(), 1);
        this.output = trackOutputTrack;
        this.currentOutput = trackOutputTrack;
        if (!this.exposeId3) {
            this.id3Output = new DiscardingTrackOutput();
            return;
        }
        trackIdGenerator.generateNewId();
        TrackOutput trackOutputTrack2 = extractorOutput.track(trackIdGenerator.getTrackId(), 5);
        this.id3Output = trackOutputTrack2;
        Format.Builder builder = new Format.Builder();
        builder.setId(trackIdGenerator.getFormatId());
        builder.setContainerMimeType(this.containerMimeType);
        builder.setSampleMimeType(MimeTypes.APPLICATION_ID3);
        trackOutputTrack2.format(builder.build());
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public /* synthetic */ void endOfInputReached() {
    }

    public long getSampleDurationUs() {
        return this.sampleDurationUs;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public /* synthetic */ void packetFinished() {
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j2, int i2) {
        this.timeUs = j2;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.timeUs = C.TIME_UNSET;
        resetSync();
    }

    public AdtsReader(boolean z, String str) {
        this(z, null, 0, str);
    }
}
