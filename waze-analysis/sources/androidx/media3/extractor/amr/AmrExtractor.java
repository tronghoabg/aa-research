package androidx.media3.extractor.amr;

import android.net.Uri;
import androidx.media3.common.C;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.extractor.ConstantBitrateSeekMap;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.IndexSeekMap;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.d.b.an;
import com.google.d.d.bn;
import java.io.EOFException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AmrExtractor implements Extractor {
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING_ALWAYS = 2;
    public static final int FLAG_ENABLE_INDEX_SEEKING = 4;
    private static final int NUM_SAME_SIZE_CONSTANT_BIT_RATE_THRESHOLD = 20;
    private static final int SAMPLE_RATE_NB = 8000;
    private static final int SAMPLE_RATE_WB = 16000;
    private static final int SAMPLE_TIME_PER_FRAME_US = 20000;
    private int currentSampleBytesRemaining;
    private int currentSampleSize;
    private long currentSampleTimeUs;
    private TrackOutput currentTrackOutput;
    private ExtractorOutput extractorOutput;
    private long firstSamplePosition;
    private int firstSampleSize;
    private final int flags;
    private boolean hasOutputFormat;
    private boolean isSeekInProgress;
    private boolean isWideBand;
    private int numSamplesWithSameSize;
    private TrackOutput realTrackOutput;
    private final byte[] scratch;
    private SeekMap seekMap;
    private long seekTimeUs;
    private final TrackOutput skippingTrackOutput;
    private long timeOffsetUs;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.amr.AmrExtractor$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return AmrExtractor.lambda$static$0();
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
    private static final int[] frameSizeBytesByTypeNb = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] frameSizeBytesByTypeWb = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] amrSignatureNb = Util.getUtf8Bytes("#!AMR\n");
    private static final byte[] amrSignatureWb = Util.getUtf8Bytes("#!AMR-WB\n");

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public AmrExtractor(int i2) {
        this.flags = (i2 & 2) != 0 ? i2 | 1 : i2;
        this.scratch = new byte[1];
        this.firstSampleSize = -1;
        DiscardingTrackOutput discardingTrackOutput = new DiscardingTrackOutput();
        this.skippingTrackOutput = discardingTrackOutput;
        this.currentTrackOutput = discardingTrackOutput;
    }

    static byte[] amrSignatureNb() {
        byte[] bArr = amrSignatureNb;
        return Arrays.copyOf(bArr, bArr.length);
    }

    static byte[] amrSignatureWb() {
        byte[] bArr = amrSignatureWb;
        return Arrays.copyOf(bArr, bArr.length);
    }

    private void assertInitialized() {
        an.B(this.realTrackOutput);
        int i2 = Util.SDK_INT;
    }

    static int frameSizeBytesByTypeNb(int i2) {
        return frameSizeBytesByTypeNb[i2];
    }

    static int frameSizeBytesByTypeWb(int i2) {
        return frameSizeBytesByTypeWb[i2];
    }

    private static int getBitrateFromFrameSize(int i2, long j2) {
        return (int) ((i2 * 8000000) / j2);
    }

    private SeekMap getConstantBitrateSeekMap(long j2, boolean z) {
        return new ConstantBitrateSeekMap(j2, this.firstSamplePosition, getBitrateFromFrameSize(this.firstSampleSize, 20000L), this.firstSampleSize, z);
    }

    private int getFrameSizeInBytes(int i2) throws ParserException {
        boolean zIsValidFrameType = isValidFrameType(i2);
        boolean z = this.isWideBand;
        if (zIsValidFrameType) {
            return z ? frameSizeBytesByTypeWb[i2] : frameSizeBytesByTypeNb[i2];
        }
        throw ParserException.createForMalformedContainer("Illegal AMR " + (true != z ? "NB" : "WB") + " frame type " + i2, null);
    }

    private boolean isNarrowBandValidFrameType(int i2) {
        if (this.isWideBand) {
            return false;
        }
        return i2 < 12 || i2 > 14;
    }

    private boolean isSeekTimeUsWithinRange(long j2, long j3) {
        return Math.abs(j3 - j2) < 20000;
    }

    private boolean isValidFrameType(int i2) {
        if (i2 < 0 || i2 > 15) {
            return false;
        }
        return isWideBandValidFrameType(i2) || isNarrowBandValidFrameType(i2);
    }

    private boolean isWideBandValidFrameType(int i2) {
        if (this.isWideBand) {
            return i2 < 10 || i2 > 13;
        }
        return false;
    }

    static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new AmrExtractor()};
    }

    private void maybeOutputFormat() {
        if (this.hasOutputFormat) {
            return;
        }
        this.hasOutputFormat = true;
        boolean z = this.isWideBand;
        String str = MimeTypes.AUDIO_AMR_WB;
        String str2 = true != z ? MimeTypes.AUDIO_AMR : MimeTypes.AUDIO_AMR_WB;
        if (true != z) {
            str = MimeTypes.AUDIO_AMR_NB;
        }
        int i2 = true != z ? 8000 : 16000;
        int i3 = z ? frameSizeBytesByTypeWb[8] : frameSizeBytesByTypeNb[7];
        TrackOutput trackOutput = this.realTrackOutput;
        Format.Builder builder = new Format.Builder();
        builder.setContainerMimeType(str2);
        builder.setSampleMimeType(str);
        builder.setMaxInputSize(i3);
        builder.setChannelCount(1);
        builder.setSampleRate(i2);
        trackOutput.format(builder.build());
    }

    private void maybeOutputSeekMap(long j2, int i2) {
        int i3;
        if (this.seekMap != null) {
            return;
        }
        int i4 = this.flags;
        if ((i4 & 4) != 0) {
            this.seekMap = new IndexSeekMap(new long[]{this.firstSamplePosition}, new long[]{0}, C.TIME_UNSET);
        } else if ((i4 & 1) == 0 || !((i3 = this.firstSampleSize) == -1 || i3 == this.currentSampleSize)) {
            this.seekMap = new SeekMap.Unseekable(C.TIME_UNSET);
        } else if (this.numSamplesWithSameSize >= 20 || i2 == -1) {
            SeekMap constantBitrateSeekMap = getConstantBitrateSeekMap(j2, (i4 & 2) != 0);
            this.seekMap = constantBitrateSeekMap;
            this.realTrackOutput.durationUs(constantBitrateSeekMap.getDurationUs());
        }
        SeekMap seekMap = this.seekMap;
        if (seekMap != null) {
            this.extractorOutput.seekMap(seekMap);
        }
    }

    private static boolean peekAmrSignature(ExtractorInput extractorInput, byte[] bArr) {
        extractorInput.resetPeekPosition();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        extractorInput.peekFully(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    private int peekNextSampleSize(ExtractorInput extractorInput) throws ParserException {
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.scratch, 0, 1);
        byte b2 = this.scratch[0];
        if ((b2 & 131) <= 0) {
            return getFrameSizeInBytes((b2 >> 3) & 15);
        }
        throw ParserException.createForMalformedContainer("Invalid padding bits for frame header " + ((int) b2), null);
    }

    private boolean readAmrHeader(ExtractorInput extractorInput) {
        byte[] bArr = amrSignatureNb;
        if (peekAmrSignature(extractorInput, bArr)) {
            this.isWideBand = false;
            extractorInput.skipFully(bArr.length);
            return true;
        }
        byte[] bArr2 = amrSignatureWb;
        if (!peekAmrSignature(extractorInput, bArr2)) {
            return false;
        }
        this.isWideBand = true;
        extractorInput.skipFully(bArr2.length);
        return true;
    }

    private int readSample(ExtractorInput extractorInput) throws ParserException {
        if (this.currentSampleBytesRemaining == 0) {
            try {
                int iPeekNextSampleSize = peekNextSampleSize(extractorInput);
                this.currentSampleSize = iPeekNextSampleSize;
                this.currentSampleBytesRemaining = iPeekNextSampleSize;
                int i2 = this.firstSampleSize;
                if (i2 == -1) {
                    this.firstSamplePosition = extractorInput.getPosition();
                    iPeekNextSampleSize = this.currentSampleSize;
                    this.firstSampleSize = iPeekNextSampleSize;
                    i2 = iPeekNextSampleSize;
                }
                if (i2 == iPeekNextSampleSize) {
                    this.numSamplesWithSameSize++;
                }
                SeekMap seekMap = this.seekMap;
                if (seekMap instanceof IndexSeekMap) {
                    IndexSeekMap indexSeekMap = (IndexSeekMap) seekMap;
                    long j2 = this.timeOffsetUs + this.currentSampleTimeUs + 20000;
                    long position = extractorInput.getPosition() + this.currentSampleSize;
                    if (!indexSeekMap.isTimeUsInIndex(j2, SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US)) {
                        indexSeekMap.addSeekPoint(j2, position);
                    }
                    if (this.isSeekInProgress && isSeekTimeUsWithinRange(j2, this.seekTimeUs)) {
                        this.isSeekInProgress = false;
                        this.currentTrackOutput = this.realTrackOutput;
                    }
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iSampleData = this.currentTrackOutput.sampleData((DataReader) extractorInput, this.currentSampleBytesRemaining, true);
        if (iSampleData == -1) {
            return -1;
        }
        int i3 = this.currentSampleBytesRemaining - iSampleData;
        this.currentSampleBytesRemaining = i3;
        if (i3 > 0) {
            return 0;
        }
        this.currentTrackOutput.sampleMetadata(this.timeOffsetUs + this.currentSampleTimeUs, 1, this.currentSampleSize, 0, null);
        this.currentSampleTimeUs += 20000;
        return 0;
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
        extractorOutput.endTracks();
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws ParserException {
        assertInitialized();
        if (extractorInput.getPosition() == 0 && !readAmrHeader(extractorInput)) {
            throw ParserException.createForMalformedContainer("Could not find AMR header.", null);
        }
        maybeOutputFormat();
        int sample = readSample(extractorInput);
        maybeOutputSeekMap(extractorInput.getLength(), sample);
        if (sample == -1) {
            SeekMap seekMap = this.seekMap;
            if (seekMap instanceof IndexSeekMap) {
                long j2 = this.timeOffsetUs + this.currentSampleTimeUs;
                ((IndexSeekMap) seekMap).setDurationUs(j2);
                this.extractorOutput.seekMap(this.seekMap);
                this.realTrackOutput.durationUs(j2);
                return -1;
            }
        }
        return sample;
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j2, long j3) {
        this.currentSampleTimeUs = 0L;
        this.currentSampleSize = 0;
        this.currentSampleBytesRemaining = 0;
        this.seekTimeUs = j3;
        SeekMap seekMap = this.seekMap;
        if (!(seekMap instanceof IndexSeekMap)) {
            if (j2 == 0 || !(seekMap instanceof ConstantBitrateSeekMap)) {
                this.timeOffsetUs = 0L;
                return;
            } else {
                this.timeOffsetUs = ((ConstantBitrateSeekMap) seekMap).getTimeUsAtPosition(j2);
                return;
            }
        }
        long timeUs = ((IndexSeekMap) seekMap).getTimeUs(j2);
        this.timeOffsetUs = timeUs;
        if (isSeekTimeUsWithinRange(timeUs, this.seekTimeUs)) {
            return;
        }
        this.isSeekInProgress = true;
        this.currentTrackOutput = this.skippingTrackOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        return readAmrHeader(extractorInput);
    }

    public AmrExtractor() {
        this(0);
    }
}
