package androidx.media3.extractor;

import androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider;
import androidx.media3.common.MimeTypes;
import androidx.media3.container.OpusUtil;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MpegAudioUtil {
    public static final int MAX_FRAME_SIZE_BYTES = 4096;
    private static final int SAMPLES_PER_FRAME_L1 = 384;
    private static final int SAMPLES_PER_FRAME_L2 = 1152;
    private static final int SAMPLES_PER_FRAME_L3_V1 = 1152;
    private static final int SAMPLES_PER_FRAME_L3_V2 = 576;
    private static final String[] MIME_TYPE_BY_LAYER = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};
    private static final int[] SAMPLING_RATE_V1 = {44100, OpusUtil.SAMPLE_RATE, 32000};
    private static final int[] BITRATE_V1_L1 = {32000, 64000, DefaultEncoderProfilesProvider.DEFAULT_AUDIO_BITRATE, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] BITRATE_V2_L1 = {32000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, DefaultEncoderProfilesProvider.DEFAULT_AUDIO_BITRATE, 112000, 128000, 144000, 160000, 176000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND};
    private static final int[] BITRATE_V1_L2 = {32000, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, DefaultEncoderProfilesProvider.DEFAULT_AUDIO_BITRATE, 112000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000, 384000};
    public static final int MAX_RATE_BYTES_PER_SECOND = 40000;
    private static final int[] BITRATE_V1_L3 = {32000, MAX_RATE_BYTES_PER_SECOND, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, DefaultEncoderProfilesProvider.DEFAULT_AUDIO_BITRATE, 112000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000};
    private static final int[] BITRATE_V2 = {8000, 16000, 24000, 32000, MAX_RATE_BYTES_PER_SECOND, OpusUtil.SAMPLE_RATE, 56000, 64000, Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND, DefaultEncoderProfilesProvider.DEFAULT_AUDIO_BITRATE, 112000, 128000, 144000, 160000};

    private MpegAudioUtil() {
    }

    public static int getFrameSize(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (!isMagicPresent(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = i5 - 1;
        int i8 = SAMPLING_RATE_V1[i6];
        if (i3 == 2) {
            i8 /= 2;
        } else if (i3 == 0) {
            i8 /= 4;
        }
        int i9 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? BITRATE_V1_L1[i7] : BITRATE_V2_L1[i7]) * 12) / i8) + i9) * 4;
        }
        int i10 = i3 == 3 ? i4 == 2 ? BITRATE_V1_L2[i7] : BITRATE_V1_L3[i7] : BITRATE_V2[i7];
        if (i3 == 3) {
            return ((i10 * 144) / i8) + i9;
        }
        return (((i4 == 1 ? 72 : 144) * i10) / i8) + i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getFrameSizeInSamples(int i2, int i3) {
        if (i3 == 1) {
            if (i2 == 3) {
                return DisplayStrings.DS_PHOTOS;
            }
            return 576;
        }
        if (i3 == 2) {
            return DisplayStrings.DS_PHOTOS;
        }
        if (i3 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isMagicPresent(int i2) {
        return (i2 & (-2097152)) == -2097152;
    }

    public static int parseMpegAudioFrameSampleCount(int i2) {
        int i3;
        int i4;
        if (!isMagicPresent(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0) {
            return -1;
        }
        int i5 = i2 >>> 12;
        int i6 = (i2 >>> 10) & 3;
        int i7 = i5 & 15;
        if (i7 == 0 || i7 == 15 || i6 == 3) {
            return -1;
        }
        return getFrameSizeInSamples(i3, i4);
    }

    /* compiled from: WazeSource */
    public final class Header {
        public int bitrate;
        public int channels;
        public int frameSize;
        public String mimeType;
        public int sampleRate;
        public int samplesPerFrame;
        public int version;

        public Header(Header header) {
            this.version = header.version;
            this.mimeType = header.mimeType;
            this.frameSize = header.frameSize;
            this.sampleRate = header.sampleRate;
            this.channels = header.channels;
            this.bitrate = header.bitrate;
            this.samplesPerFrame = header.samplesPerFrame;
        }

        public boolean setForHeaderData(int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (!MpegAudioUtil.isMagicPresent(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
                return false;
            }
            int i7 = i5 - 1;
            this.version = i3;
            this.mimeType = MpegAudioUtil.MIME_TYPE_BY_LAYER[3 - i4];
            int i8 = MpegAudioUtil.SAMPLING_RATE_V1[i6];
            this.sampleRate = i8;
            if (i3 == 2) {
                this.sampleRate = i8 / 2;
            } else if (i3 == 0) {
                this.sampleRate = i8 / 4;
            }
            int i9 = (i2 >>> 9) & 1;
            this.samplesPerFrame = MpegAudioUtil.getFrameSizeInSamples(i3, i4);
            if (i4 == 3) {
                int i10 = i3 == 3 ? MpegAudioUtil.BITRATE_V1_L1[i7] : MpegAudioUtil.BITRATE_V2_L1[i7];
                this.bitrate = i10;
                this.frameSize = (((i10 * 12) / this.sampleRate) + i9) * 4;
            } else {
                if (i3 == 3) {
                    int i11 = i4 == 2 ? MpegAudioUtil.BITRATE_V1_L2[i7] : MpegAudioUtil.BITRATE_V1_L3[i7];
                    this.bitrate = i11;
                    this.frameSize = ((i11 * 144) / this.sampleRate) + i9;
                } else {
                    int i12 = MpegAudioUtil.BITRATE_V2[i7];
                    this.bitrate = i12;
                    this.frameSize = (((i4 == 1 ? 72 : 144) * i12) / this.sampleRate) + i9;
                }
            }
            this.channels = ((i2 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }

        public Header() {
        }
    }
}
