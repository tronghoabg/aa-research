package androidx.media3.extractor;

import androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.container.OpusUtil;
import com.waze.strings.DisplayStrings;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AacUtil {
    public static final int AAC_ELD_MAX_RATE_BYTES_PER_SECOND = 8000;
    public static final int AAC_HE_AUDIO_SAMPLE_COUNT = 2048;
    public static final int AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND = 16000;
    public static final int AAC_HE_V2_MAX_RATE_BYTES_PER_SECOND = 7000;
    public static final int AAC_LC_AUDIO_SAMPLE_COUNT = 1024;
    public static final int AAC_LC_MAX_RATE_BYTES_PER_SECOND = 100000;
    public static final int AAC_LD_AUDIO_SAMPLE_COUNT = 512;
    public static final int AAC_XHE_AUDIO_SAMPLE_COUNT = 1024;
    public static final int AAC_XHE_MAX_RATE_BYTES_PER_SECOND = 256000;
    public static final int AUDIO_OBJECT_TYPE_AAC_ELD = 23;
    public static final int AUDIO_OBJECT_TYPE_AAC_ER_BSAC = 22;
    public static final int AUDIO_OBJECT_TYPE_AAC_LC = 2;
    public static final int AUDIO_OBJECT_TYPE_AAC_PS = 29;
    public static final int AUDIO_OBJECT_TYPE_AAC_SBR = 5;
    public static final int AUDIO_OBJECT_TYPE_AAC_XHE = 42;
    private static final int AUDIO_OBJECT_TYPE_ESCAPE = 31;
    private static final int AUDIO_SPECIFIC_CONFIG_CHANNEL_CONFIGURATION_INVALID = -1;
    private static final int AUDIO_SPECIFIC_CONFIG_FREQUENCY_INDEX_ARBITRARY = 15;
    private static final String CODECS_STRING_PREFIX = "mp4a.40.";
    private static final String TAG = "AacUtil";
    private static final int[] AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE = {DefaultEncoderProfilesProvider.DEFAULT_AUDIO_BITRATE, 88200, 64000, OpusUtil.SAMPLE_RATE, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AacAudioObjectType {
    }

    /* compiled from: WazeSource */
    public final class Config {
        public final int channelCount;
        public final String codecs;
        public final int sampleRateHz;

        private Config(int i2, int i3, String str) {
            this.sampleRateHz = i2;
            this.channelCount = i3;
            this.codecs = str;
        }
    }

    private AacUtil() {
    }

    public static byte[] buildAacLcAudioSpecificConfig(int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = -1;
        while (true) {
            int[] iArr = AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE;
            if (i5 >= iArr.length) {
                break;
            }
            if (i2 == iArr[i5]) {
                i6 = i5;
            }
            i5++;
        }
        int i7 = -1;
        while (true) {
            int[] iArr2 = AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE;
            if (i4 >= iArr2.length) {
                break;
            }
            if (i3 == iArr2[i4]) {
                i7 = i4;
            }
            i4++;
        }
        if (i2 != -1 && i7 != -1) {
            return buildAudioSpecificConfig(2, i6, i7);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i2 + ", " + i3);
    }

    public static byte[] buildAudioSpecificConfig(int i2, int i3, int i4) {
        return new byte[]{(byte) (((i2 << 3) & DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_1) | ((i3 >> 1) & 7)), (byte) (((i3 << 7) & 128) | ((i4 << 3) & 120))};
    }

    private static int getAudioObjectType(ParsableBitArray parsableBitArray) {
        int bits = parsableBitArray.readBits(5);
        return bits == 31 ? parsableBitArray.readBits(6) + 32 : bits;
    }

    private static int getSamplingFrequency(ParsableBitArray parsableBitArray) throws ParserException {
        int bits = parsableBitArray.readBits(4);
        if (bits == 15) {
            if (parsableBitArray.bitsLeft() >= 24) {
                return parsableBitArray.readBits(24);
            }
            throw ParserException.createForMalformedContainer("AAC header insufficient data", null);
        }
        if (bits < 13) {
            return AUDIO_SPECIFIC_CONFIG_SAMPLING_RATE_TABLE[bits];
        }
        throw ParserException.createForMalformedContainer("AAC header wrong Sampling Frequency Index", null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        if (r7 != 3) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.extractor.AacUtil.Config parseAudioSpecificConfig(androidx.media3.common.util.ParsableBitArray r7, boolean r8) throws androidx.media3.common.ParserException {
        /*
            int r0 = getAudioObjectType(r7)
            int r1 = getSamplingFrequency(r7)
            r2 = 4
            int r3 = r7.readBits(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "mp4a.40."
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r5 = 5
            if (r0 == r5) goto L22
            r5 = 29
            if (r0 != r5) goto L32
        L22:
            int r1 = getSamplingFrequency(r7)
            int r0 = getAudioObjectType(r7)
            r5 = 22
            if (r0 != r5) goto L32
            int r3 = r7.readBits(r2)
        L32:
            if (r8 == 0) goto L83
            r8 = 1
            r5 = 3
            r6 = 2
            if (r0 == r8) goto L5f
            if (r0 == r6) goto L5f
            if (r0 == r5) goto L5f
            if (r0 == r2) goto L5f
            r8 = 6
            if (r0 == r8) goto L5f
            r8 = 7
            if (r0 == r8) goto L5f
            r8 = 17
            if (r0 == r8) goto L5f
            switch(r0) {
                case 19: goto L5f;
                case 20: goto L5f;
                case 21: goto L5f;
                case 22: goto L5f;
                case 23: goto L5f;
                default: goto L4c;
            }
        L4c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Unsupported audio object type: "
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            androidx.media3.common.ParserException r7 = androidx.media3.common.ParserException.createForUnsupportedContainerFeature(r7)
            throw r7
        L5f:
            parseGaSpecificConfig(r7, r0, r3)
            switch(r0) {
                case 17: goto L66;
                case 18: goto L65;
                case 19: goto L66;
                case 20: goto L66;
                case 21: goto L66;
                case 22: goto L66;
                case 23: goto L66;
                default: goto L65;
            }
        L65:
            goto L83
        L66:
            int r7 = r7.readBits(r6)
            if (r7 == r6) goto L6f
            if (r7 == r5) goto L70
            goto L83
        L6f:
            r5 = r7
        L70:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Unsupported epConfig: "
            r7.<init>(r8)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            androidx.media3.common.ParserException r7 = androidx.media3.common.ParserException.createForUnsupportedContainerFeature(r7)
            throw r7
        L83:
            int[] r7 = androidx.media3.extractor.AacUtil.AUDIO_SPECIFIC_CONFIG_CHANNEL_COUNT_TABLE
            r7 = r7[r3]
            r8 = -1
            r0 = 0
            if (r7 == r8) goto L91
            androidx.media3.extractor.AacUtil$Config r8 = new androidx.media3.extractor.AacUtil$Config
            r8.<init>(r1, r7, r4)
            return r8
        L91:
            androidx.media3.common.ParserException r7 = androidx.media3.common.ParserException.createForMalformedContainer(r0, r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.AacUtil.parseAudioSpecificConfig(androidx.media3.common.util.ParsableBitArray, boolean):androidx.media3.extractor.AacUtil$Config");
    }

    private static void parseGaSpecificConfig(ParsableBitArray parsableBitArray, int i2, int i3) {
        if (parsableBitArray.readBit()) {
            Log.w(TAG, "Unexpected frameLengthFlag = 1");
        }
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(14);
        }
        boolean bit = parsableBitArray.readBit();
        if (i3 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i2 == 6) {
            parsableBitArray.skipBits(3);
        } else if (i2 == 20) {
            i2 = 20;
            parsableBitArray.skipBits(3);
        }
        if (bit) {
            if (i2 == 22) {
                parsableBitArray.skipBits(16);
                i2 = 22;
            }
            if (i2 == 17 || i2 == 19 || i2 == 20 || i2 == 23) {
                parsableBitArray.skipBits(3);
            }
            parsableBitArray.skipBits(1);
        }
    }

    public static Config parseAudioSpecificConfig(byte[] bArr) {
        return parseAudioSpecificConfig(new ParsableBitArray(bArr), false);
    }
}
