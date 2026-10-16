package androidx.media3.extractor.mp3;

import android.net.Uri;
import androidx.media3.common.C;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.Id3Peeker;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import androidx.media3.extractor.mp3.Seeker;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.d.b.ab;
import com.google.d.b.an;
import com.google.d.d.bn;
import com.google.d.j.e;
import com.google.d.l.j;
import java.io.EOFException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.math.RoundingMode;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Mp3Extractor implements Extractor {
    public static final int FLAG_DISABLE_ARTWORK_METADATA = 16;
    public static final int FLAG_DISABLE_ID3_METADATA = 8;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING_ALWAYS = 2;
    public static final int FLAG_ENABLE_INDEX_SEEKING = 4;
    private static final int MAX_SEARCH_BYTES = 131072;
    private static final int MPEG_AUDIO_HEADER_MASK = -128000;
    private static final int SCRATCH_LENGTH = 10;
    private static final int SEEK_HEADER_INFO = 1231971951;
    private static final int SEEK_HEADER_UNSET = 0;
    private static final int SEEK_HEADER_VBRI = 1447187017;
    private static final int SEEK_HEADER_XING = 1483304551;
    private static final String TAG = "Mp3Extractor";
    private long basisTimeUs;
    private TrackOutput currentTrackOutput;
    private boolean disableSeeking;
    private long endPositionOfLastSampleRead;
    private ExtractorOutput extractorOutput;
    private long firstSamplePosition;
    private final int flags;
    private final long forcedFirstSampleTimestampUs;
    private final GaplessInfoHolder gaplessInfoHolder;
    private Metadata id3Metadata;
    private final Id3Peeker id3Peeker;
    private boolean isSeekInProgress;
    private TrackOutput realTrackOutput;
    private int sampleBytesRemaining;
    private long samplesRead;
    private final ParsableByteArray scratch;
    private long seekTimeUs;
    private Seeker seeker;
    private final TrackOutput skippingTrackOutput;
    private final MpegAudioUtil.Header synchronizedHeader;
    private int synchronizedHeaderData;
    private Metadata xingMetadata;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.mp3.Mp3Extractor$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return Mp3Extractor.lambda$static$0();
        }

        @Override // androidx.media3.extractor.ExtractorsFactory
        public /* synthetic */ ExtractorsFactory experimentalSetCodecsToParseWithinGopSampleDependencies(int i2) {
            return this;
        }

        @Override // androidx.media3.extractor.ExtractorsFactory
        public /* synthetic */ ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
            return this;
        }

        @Override // androidx.media3.extractor.ExtractorsFactory
        public /* synthetic */ ExtractorsFactory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            return this;
        }

        @Override // androidx.media3.extractor.ExtractorsFactory
        public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
            return createExtractors();
        }
    };
    private static final Id3Decoder.FramePredicate REQUIRED_ID3_FRAME_PREDICATE = new Id3Decoder.FramePredicate() { // from class: androidx.media3.extractor.mp3.Mp3Extractor$$ExternalSyntheticLambda1
        @Override // androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate
        public final boolean evaluate(int i2, int i3, int i4, int i5, int i6) {
            return Mp3Extractor.lambda$static$1(i2, i3, i4, i5, i6);
        }
    };

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @interface SeekHeader {
    }

    public Mp3Extractor(int i2, long j2) {
        this.flags = (i2 & 2) != 0 ? i2 | 1 : i2;
        this.forcedFirstSampleTimestampUs = j2;
        this.scratch = new ParsableByteArray(10);
        this.synchronizedHeader = new MpegAudioUtil.Header();
        this.gaplessInfoHolder = new GaplessInfoHolder();
        this.basisTimeUs = C.TIME_UNSET;
        this.id3Peeker = new Id3Peeker();
        DiscardingTrackOutput discardingTrackOutput = new DiscardingTrackOutput();
        this.skippingTrackOutput = discardingTrackOutput;
        this.currentTrackOutput = discardingTrackOutput;
        this.endPositionOfLastSampleRead = -1L;
    }

    private void assertInitialized() {
        an.B(this.realTrackOutput);
        int i2 = Util.SDK_INT;
    }

    private long computeFinalIndexSeekerDurationUs(long j2) {
        if (this.gaplessInfoHolder.hasGaplessInfo()) {
            GaplessInfoHolder gaplessInfoHolder = this.gaplessInfoHolder;
            j2 = (j2 - gaplessInfoHolder.encoderDelay) - gaplessInfoHolder.encoderPadding;
        }
        return j2 >= 0 ? computeTimeUs(j2) : C.TIME_UNSET;
    }

    private Seeker computeSeeker(ExtractorInput extractorInput) {
        Seeker seekerMaybeReadSeekFrame = maybeReadSeekFrame(extractorInput);
        MlltSeeker mlltSeekerMaybeHandleSeekMetadata = maybeHandleSeekMetadata(this.id3Metadata, extractorInput.getPosition());
        if (this.disableSeeking) {
            return new Seeker.UnseekableSeeker();
        }
        if (mlltSeekerMaybeHandleSeekMetadata != null) {
            seekerMaybeReadSeekFrame = mlltSeekerMaybeHandleSeekMetadata;
        } else if (seekerMaybeReadSeekFrame == null) {
            seekerMaybeReadSeekFrame = getConstantBitrateSeeker(extractorInput);
        }
        if ((this.flags & 4) != 0 && !seekerMaybeReadSeekFrame.isSeekable()) {
            return new IndexSeeker(seekerMaybeReadSeekFrame.getDurationUs(), extractorInput.getPosition(), seekerMaybeReadSeekFrame.getDataEndPosition());
        }
        if ((seekerMaybeReadSeekFrame instanceof ConstantBitrateSeeker) || !shouldFallbackToConstantBitrateSeeking(seekerMaybeReadSeekFrame)) {
            return seekerMaybeReadSeekFrame;
        }
        long durationUs = seekerMaybeReadSeekFrame.getDurationUs();
        long dataEndPosition = seekerMaybeReadSeekFrame.getDataEndPosition() != -1 ? seekerMaybeReadSeekFrame.getDataEndPosition() : extractorInput.getLength();
        if (durationUs == C.TIME_UNSET || dataEndPosition == -1) {
            return getConstantBitrateSeeker(extractorInput);
        }
        long dataStartPosition = seekerMaybeReadSeekFrame.getDataStartPosition() != -1 ? seekerMaybeReadSeekFrame.getDataStartPosition() : 0L;
        int iComputeAverageBitrate = Mp3Util.computeAverageBitrate(dataEndPosition - dataStartPosition, durationUs);
        return iComputeAverageBitrate == -2147483647 ? getConstantBitrateSeeker(extractorInput) : new ConstantBitrateSeeker(dataEndPosition, dataStartPosition, iComputeAverageBitrate, -1, false, durationUs);
    }

    private long computeTimeUs(long j2) {
        return this.basisTimeUs + ((j2 * 1000000) / this.synchronizedHeader.sampleRate);
    }

    private Seeker getConstantBitrateSeeker(long j2, XingFrame xingFrame, long j3) {
        long j4;
        long j5;
        long jComputeDurationUs = xingFrame.computeDurationUs();
        if (jComputeDurationUs == C.TIME_UNSET) {
            return null;
        }
        long j6 = xingFrame.dataSize;
        if (j6 != -1) {
            j4 = j6 - xingFrame.header.frameSize;
            j5 = j2 + j6;
        } else {
            if (j3 == -1) {
                return null;
            }
            j4 = (j3 - j2) - xingFrame.header.frameSize;
            j5 = j3;
        }
        int iComputeAverageBitrate = Mp3Util.computeAverageBitrate(j4, jComputeDurationUs);
        if (iComputeAverageBitrate == -2147483647) {
            return null;
        }
        return new ConstantBitrateSeeker(j5, xingFrame.header.frameSize + j2, iComputeAverageBitrate, j.h(e.c(j4, xingFrame.frameCount, RoundingMode.HALF_UP)), false, jComputeDurationUs);
    }

    private static long getId3TlenUs(Metadata metadata) {
        TextInformationFrame textInformationFrame;
        return (metadata == null || (textInformationFrame = (TextInformationFrame) metadata.getFirstMatchingEntry(TextInformationFrame.class, new ab() { // from class: androidx.media3.extractor.mp3.Mp3Extractor$$ExternalSyntheticLambda2
            @Override // com.google.d.b.ab
            public final boolean apply(Object obj) {
                return ((TextInformationFrame) obj).id.equals("TLEN");
            }
        })) == null) ? C.TIME_UNSET : Util.msToUs(Long.parseLong(textInformationFrame.values.get(0)));
    }

    private static int getSeekFrameHeader(ParsableByteArray parsableByteArray, int i2) {
        if (parsableByteArray.limit() >= i2 + 4) {
            parsableByteArray.setPosition(i2);
            int i3 = parsableByteArray.readInt();
            if (i3 == SEEK_HEADER_XING) {
                return i3;
            }
            if (i3 == SEEK_HEADER_INFO) {
                return SEEK_HEADER_INFO;
            }
        }
        if (parsableByteArray.limit() < 40) {
            return 0;
        }
        parsableByteArray.setPosition(36);
        if (parsableByteArray.readInt() == SEEK_HEADER_VBRI) {
            return SEEK_HEADER_VBRI;
        }
        return 0;
    }

    private static boolean headersMatch(int i2, long j2) {
        return ((long) (i2 & MPEG_AUDIO_HEADER_MASK)) == (j2 & (-128000));
    }

    static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new Mp3Extractor()};
    }

    static /* synthetic */ boolean lambda$static$1(int i2, int i3, int i4, int i5, int i6) {
        if (i3 == 67) {
            if (i4 == 79) {
                if (i5 != 77) {
                    i4 = 79;
                } else {
                    if (i6 == 77 || i2 == 2) {
                        return true;
                    }
                    i4 = 79;
                    i5 = 77;
                }
            }
            i3 = 67;
        }
        if (i3 == 77 && i4 == 76 && i5 == 76) {
            return i6 == 84 || i2 == 2;
        }
        return false;
    }

    private static MlltSeeker maybeHandleSeekMetadata(Metadata metadata, long j2) {
        MlltFrame mlltFrame;
        if (metadata == null || (mlltFrame = (MlltFrame) metadata.getFirstEntryOfType(MlltFrame.class)) == null) {
            return null;
        }
        return MlltSeeker.create(j2, mlltFrame, getId3TlenUs(metadata));
    }

    private Seeker maybeReadSeekFrame(ExtractorInput extractorInput) {
        int i2;
        int i3;
        ParsableByteArray parsableByteArray = new ParsableByteArray(this.synchronizedHeader.frameSize);
        extractorInput.peekFully(parsableByteArray.getData(), 0, this.synchronizedHeader.frameSize);
        MpegAudioUtil.Header header = this.synchronizedHeader;
        int i4 = 21;
        if ((header.version & 1) != 0) {
            if (header.channels != 1) {
                i4 = 36;
            }
        } else if (header.channels == 1) {
            i4 = 13;
        }
        int seekFrameHeader = getSeekFrameHeader(parsableByteArray, i4);
        if (seekFrameHeader != SEEK_HEADER_INFO) {
            if (seekFrameHeader == SEEK_HEADER_VBRI) {
                VbriSeeker vbriSeekerCreate = VbriSeeker.create(extractorInput.getLength(), extractorInput.getPosition(), this.synchronizedHeader, parsableByteArray);
                extractorInput.skipFully(this.synchronizedHeader.frameSize);
                return vbriSeekerCreate;
            }
            if (seekFrameHeader != SEEK_HEADER_XING) {
                extractorInput.resetPeekPosition();
                return null;
            }
        }
        XingFrame xingFrame = XingFrame.parse(this.synchronizedHeader, parsableByteArray);
        if (!this.gaplessInfoHolder.hasGaplessInfo() && (i2 = xingFrame.encoderDelay) != -1 && (i3 = xingFrame.encoderPadding) != -1) {
            GaplessInfoHolder gaplessInfoHolder = this.gaplessInfoHolder;
            gaplessInfoHolder.encoderDelay = i2;
            gaplessInfoHolder.encoderPadding = i3;
        }
        this.xingMetadata = xingFrame.getMetadata();
        long position = extractorInput.getPosition();
        extractorInput.skipFully(this.synchronizedHeader.frameSize);
        return seekFrameHeader == SEEK_HEADER_XING ? XingSeeker.create(xingFrame, position, extractorInput.getLength()) : getConstantBitrateSeeker(position, xingFrame, extractorInput.getLength());
    }

    private void maybeUpdateCbrDurationToLastSample() {
        Seeker seeker = this.seeker;
        if ((seeker instanceof ConstantBitrateSeeker) && seeker.isSeekable()) {
            long j2 = this.endPositionOfLastSampleRead;
            if (j2 == -1 || j2 == this.seeker.getDataEndPosition()) {
                return;
            }
            this.seeker = ((ConstantBitrateSeeker) this.seeker).copyWithNewDataEndPosition(this.endPositionOfLastSampleRead);
            ExtractorOutput extractorOutput = this.extractorOutput;
            an.B(extractorOutput);
            extractorOutput.seekMap(this.seeker);
            TrackOutput trackOutput = this.realTrackOutput;
            an.B(trackOutput);
            trackOutput.durationUs(this.seeker.getDurationUs());
        }
    }

    private boolean peekEndOfStreamOrHeader(ExtractorInput extractorInput) {
        Seeker seeker = this.seeker;
        if (seeker != null) {
            long dataEndPosition = seeker.getDataEndPosition();
            if (dataEndPosition != -1 && extractorInput.getPeekPosition() > dataEndPosition - 4) {
                return true;
            }
        }
        try {
            return !extractorInput.peekFully(this.scratch.getData(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private int readInternal(ExtractorInput extractorInput) throws NumberFormatException {
        if (this.synchronizedHeaderData == 0) {
            try {
                synchronize(extractorInput, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.seeker == null) {
            Seeker seekerComputeSeeker = computeSeeker(extractorInput);
            this.seeker = seekerComputeSeeker;
            this.realTrackOutput.durationUs(seekerComputeSeeker.getDurationUs());
            this.extractorOutput.seekMap(this.seeker);
            Metadata metadataCopyWithAppendedEntriesFrom = this.id3Metadata;
            if (metadataCopyWithAppendedEntriesFrom == null || (this.flags & 8) != 0) {
                metadataCopyWithAppendedEntriesFrom = this.xingMetadata;
            } else {
                Metadata metadata = this.xingMetadata;
                if (metadata != null) {
                    metadataCopyWithAppendedEntriesFrom = metadataCopyWithAppendedEntriesFrom.copyWithAppendedEntriesFrom(metadata);
                }
            }
            Format.Builder builder = new Format.Builder();
            builder.setContainerMimeType(MimeTypes.AUDIO_MPEG);
            builder.setSampleMimeType(this.synchronizedHeader.mimeType);
            builder.setMaxInputSize(4096);
            builder.setChannelCount(this.synchronizedHeader.channels);
            builder.setSampleRate(this.synchronizedHeader.sampleRate);
            builder.setEncoderDelay(this.gaplessInfoHolder.encoderDelay);
            builder.setEncoderPadding(this.gaplessInfoHolder.encoderPadding);
            builder.setMetadata(metadataCopyWithAppendedEntriesFrom);
            if (this.seeker.getAverageBitrate() != -2147483647) {
                builder.setAverageBitrate(this.seeker.getAverageBitrate());
            }
            this.currentTrackOutput.format(builder.build());
            this.firstSamplePosition = extractorInput.getPosition();
        } else if (this.firstSamplePosition != 0) {
            long position = extractorInput.getPosition();
            long j2 = this.firstSamplePosition;
            if (position < j2) {
                extractorInput.skipFully((int) (j2 - position));
            }
        }
        return readSample(extractorInput);
    }

    private int readSample(ExtractorInput extractorInput) {
        if (this.sampleBytesRemaining == 0) {
            extractorInput.resetPeekPosition();
            if (peekEndOfStreamOrHeader(extractorInput)) {
                return -1;
            }
            this.scratch.setPosition(0);
            int i2 = this.scratch.readInt();
            if (!headersMatch(i2, this.synchronizedHeaderData) || MpegAudioUtil.getFrameSize(i2) == -1) {
                extractorInput.skipFully(1);
                this.synchronizedHeaderData = 0;
                return 0;
            }
            this.synchronizedHeader.setForHeaderData(i2);
            if (this.basisTimeUs == C.TIME_UNSET) {
                this.basisTimeUs = this.seeker.getTimeUs(extractorInput.getPosition());
                if (this.forcedFirstSampleTimestampUs != C.TIME_UNSET) {
                    this.basisTimeUs += this.forcedFirstSampleTimestampUs - this.seeker.getTimeUs(0L);
                }
            }
            this.sampleBytesRemaining = this.synchronizedHeader.frameSize;
            long position = extractorInput.getPosition();
            MpegAudioUtil.Header header = this.synchronizedHeader;
            this.endPositionOfLastSampleRead = position + header.frameSize;
            Seeker seeker = this.seeker;
            if (seeker instanceof IndexSeeker) {
                IndexSeeker indexSeeker = (IndexSeeker) seeker;
                indexSeeker.maybeAddSeekPoint(computeTimeUs(this.samplesRead + header.samplesPerFrame), this.endPositionOfLastSampleRead);
                if (this.isSeekInProgress && indexSeeker.isTimeUsInIndex(this.seekTimeUs)) {
                    this.isSeekInProgress = false;
                    this.currentTrackOutput = this.realTrackOutput;
                }
            }
        }
        int iSampleData = this.currentTrackOutput.sampleData((DataReader) extractorInput, this.sampleBytesRemaining, true);
        if (iSampleData == -1) {
            return -1;
        }
        int i3 = this.sampleBytesRemaining - iSampleData;
        this.sampleBytesRemaining = i3;
        if (i3 > 0) {
            return 0;
        }
        this.currentTrackOutput.sampleMetadata(computeTimeUs(this.samplesRead), 1, this.synchronizedHeader.frameSize, 0, null);
        this.samplesRead += this.synchronizedHeader.samplesPerFrame;
        this.sampleBytesRemaining = 0;
        return 0;
    }

    private boolean shouldFallbackToConstantBitrateSeeking(Seeker seeker) {
        return (seeker.isSeekable() || (this.flags & 1) == 0) ? false : true;
    }

    private boolean synchronize(ExtractorInput extractorInput, boolean z) throws NumberFormatException, EOFException {
        int peekPosition;
        int i2;
        int frameSize;
        extractorInput.resetPeekPosition();
        if (extractorInput.getPosition() == 0) {
            int i3 = this.flags;
            Metadata metadataPeekId3Data = this.id3Peeker.peekId3Data(extractorInput, (i3 & 8) != 0 ? REQUIRED_ID3_FRAME_PREDICATE : (i3 & 16) != 0 ? Id3Decoder.NO_ARTWORK_PREDICATE : null, 131072);
            this.id3Metadata = metadataPeekId3Data;
            if (metadataPeekId3Data != null) {
                this.gaplessInfoHolder.setFromMetadata(metadataPeekId3Data);
            }
            peekPosition = (int) extractorInput.getPeekPosition();
            if (!z) {
                extractorInput.skipFully(peekPosition);
            }
            i2 = 0;
        } else {
            peekPosition = 0;
            i2 = 0;
        }
        int i4 = i2;
        int i5 = i4;
        while (true) {
            if (!peekEndOfStreamOrHeader(extractorInput)) {
                this.scratch.setPosition(0);
                int i6 = this.scratch.readInt();
                if ((i2 == 0 || headersMatch(i6, i2)) && (frameSize = MpegAudioUtil.getFrameSize(i6)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.synchronizedHeader.setForHeaderData(i6);
                        i2 = i6;
                    }
                    extractorInput.advancePeekPosition(frameSize - 4);
                } else {
                    int i7 = i5 + 1;
                    if (i5 == 131072) {
                        if (z) {
                            return false;
                        }
                        maybeUpdateCbrDurationToLastSample();
                        throw new EOFException();
                    }
                    if (z) {
                        extractorInput.resetPeekPosition();
                        extractorInput.advancePeekPosition(peekPosition + i7);
                    } else {
                        extractorInput.skipFully(1);
                    }
                    i4 = 0;
                    i5 = i7;
                    i2 = 0;
                }
            } else if (i4 <= 0) {
                maybeUpdateCbrDurationToLastSample();
                throw new EOFException();
            }
        }
        if (z) {
            extractorInput.skipFully(peekPosition + i5);
        } else {
            extractorInput.resetPeekPosition();
        }
        this.synchronizedHeaderData = i2;
        return true;
    }

    public void disableSeeking() {
        this.disableSeeking = true;
    }

    @Override // androidx.media3.extractor.Extractor
    public /* synthetic */ List getSniffFailureDetails() {
        return bn.p();
    }

    @Override // androidx.media3.extractor.Extractor
    public /* synthetic */ Extractor getUnderlyingImplementation() {
        return this;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        TrackOutput trackOutputTrack = extractorOutput.track(0, 1);
        this.realTrackOutput = trackOutputTrack;
        this.currentTrackOutput = trackOutputTrack;
        this.extractorOutput.endTracks();
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws NumberFormatException {
        assertInitialized();
        int internal = readInternal(extractorInput);
        if (internal == -1 && (this.seeker instanceof IndexSeeker)) {
            long j2 = this.samplesRead - 1;
            long jComputeFinalIndexSeekerDurationUs = j2 >= 0 ? computeFinalIndexSeekerDurationUs(j2) : C.TIME_UNSET;
            if (this.seeker.getDurationUs() != jComputeFinalIndexSeekerDurationUs) {
                ((IndexSeeker) this.seeker).setDurationUs(jComputeFinalIndexSeekerDurationUs);
                this.extractorOutput.seekMap(this.seeker);
                this.realTrackOutput.durationUs(this.seeker.getDurationUs());
                return -1;
            }
        }
        return internal;
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j2, long j3) {
        this.synchronizedHeaderData = 0;
        this.basisTimeUs = C.TIME_UNSET;
        this.samplesRead = 0L;
        this.sampleBytesRemaining = 0;
        this.endPositionOfLastSampleRead = -1L;
        this.seekTimeUs = j3;
        Seeker seeker = this.seeker;
        if (!(seeker instanceof IndexSeeker) || ((IndexSeeker) seeker).isTimeUsInIndex(j3)) {
            return;
        }
        this.isSeekInProgress = true;
        this.currentTrackOutput = this.skippingTrackOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        return synchronize(extractorInput, true);
    }

    public Mp3Extractor(int i2) {
        this(i2, C.TIME_UNSET);
    }

    public Mp3Extractor() {
        this(0);
    }

    private Seeker getConstantBitrateSeeker(ExtractorInput extractorInput) {
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        this.scratch.setPosition(0);
        this.synchronizedHeader.setForHeaderData(this.scratch.readInt());
        int i2 = this.flags & 2;
        return new ConstantBitrateSeeker(extractorInput.getLength(), extractorInput.getPosition(), this.synchronizedHeader, i2 != 0);
    }
}
