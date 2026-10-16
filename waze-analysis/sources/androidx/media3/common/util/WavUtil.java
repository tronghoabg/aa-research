package androidx.media3.common.util;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class WavUtil {
    public static final int DATA_FOURCC = 1684108385;
    public static final int DS64_FOURCC = 1685272116;
    public static final int FACT_FOURCC = 1717658484;
    public static final int FMT_FOURCC = 1718449184;
    public static final int RF64_FOURCC = 1380333108;
    public static final int RIFF_FOURCC = 1380533830;
    public static final int TYPE_ALAW = 6;
    public static final int TYPE_FLOAT = 3;
    public static final int TYPE_IMA_ADPCM = 17;
    public static final int TYPE_MLAW = 7;
    public static final int TYPE_PCM = 1;
    public static final int TYPE_WAVE_FORMAT_EXTENSIBLE = 65534;
    public static final int WAVE_FOURCC = 1463899717;

    private WavUtil() {
    }

    public static int getPcmEncodingForType(int i2, int i3) {
        if (i2 != 1) {
            if (i2 == 3) {
                return Util.getFloatPcmEncoding(i3);
            }
            if (i2 != 65534) {
                return 0;
            }
        }
        return Util.getPcmEncoding(i3);
    }

    public static int getTypeForPcmEncoding(int i2) {
        if (i2 == 2 || i2 == 3) {
            return 1;
        }
        if (i2 != 4) {
            if (i2 == 21 || i2 == 22) {
                return 1;
            }
            if (i2 != 1879048192) {
                throw new IllegalArgumentException();
            }
        }
        return 3;
    }

    public static boolean isChannelMaskValid(int i2, int i3) {
        if ((i2 >> 18) == 0) {
            return i2 == 0 || Integer.bitCount(i2) == i3;
        }
        return false;
    }

    public static int mapToAudioFormatChannelMask(int i2) {
        if (i2 == 0) {
            return -1;
        }
        return i2 << 2;
    }
}
