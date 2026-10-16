package androidx.camera.camera2.pipe;

import androidx.core.view.InputDeviceCompat;
import h.g.b.o;
import h.g.b.x;
import h.m.k;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes2.dex */
public final class StreamFormat {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int UNKNOWN = 0;
    private static final int PRIVATE = 34;
    private static final int DEPTH16 = 1144402265;
    private static final int DEPTH_JPEG = 1768253795;
    private static final int DEPTH_POINT_CLOUD = 257;
    private static final int FLEX_RGB_888 = 41;
    private static final int FLEX_RGBA_8888 = 42;
    private static final int HEIC = 1212500294;
    private static final int JPEG = 256;
    private static final int JPEG_R = 4101;
    private static final int NV16 = 16;
    private static final int NV21 = 17;
    private static final int RAW10 = 37;
    private static final int RAW12 = 38;
    private static final int RAW_DEPTH = InputDeviceCompat.SOURCE_TOUCHSCREEN;
    private static final int RAW_DEPTH10 = 4099;
    private static final int RAW_PRIVATE = 36;
    private static final int RAW_SENSOR = 32;
    private static final int RGB_565 = 4;
    private static final int Y12 = 842094169;
    private static final int Y16 = 540422489;
    private static final int Y8 = 538982489;
    private static final int YCBCR_P010 = 54;
    private static final int YUV_420_888 = 35;
    private static final int YUV_422_888 = 39;
    private static final int YUV_444_888 = 40;
    private static final int YUY2 = 20;
    private static final int YV12 = 842094169;
    private static final int BLOB = 33;

    private /* synthetic */ StreamFormat(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StreamFormat m918boximpl(int i2) {
        return new StreamFormat(i2);
    }

    /* renamed from: bytesPerImage-_EMV7EA, reason: not valid java name */
    public static final long m919bytesPerImage_EMV7EA(int i2, int i3, int i4) {
        return Companion.m930bytesPerImage_EMV7EA(i2, i3, i4);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m921equalsimpl(int i2, Object obj) {
        return (obj instanceof StreamFormat) && i2 == ((StreamFormat) obj).m929unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m922equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: getBitsPerPixel-impl, reason: not valid java name */
    public static final int m923getBitsPerPixelimpl(int i2) {
        if (m922equalsimpl0(i2, DEPTH16)) {
            return 16;
        }
        if (m922equalsimpl0(i2, FLEX_RGB_888)) {
            return 24;
        }
        if (m922equalsimpl0(i2, FLEX_RGBA_8888)) {
            return 32;
        }
        if (m922equalsimpl0(i2, NV16)) {
            return 16;
        }
        if (m922equalsimpl0(i2, NV21)) {
            return 12;
        }
        if (m922equalsimpl0(i2, RAW10)) {
            return 10;
        }
        if (m922equalsimpl0(i2, RAW12)) {
            return 12;
        }
        if (m922equalsimpl0(i2, RAW_DEPTH) || m922equalsimpl0(i2, RAW_SENSOR) || m922equalsimpl0(i2, RGB_565)) {
            return 16;
        }
        if (m922equalsimpl0(i2, Y12)) {
            return 12;
        }
        if (m922equalsimpl0(i2, Y16)) {
            return 16;
        }
        if (m922equalsimpl0(i2, Y8)) {
            return 8;
        }
        if (m922equalsimpl0(i2, YCBCR_P010)) {
            return 16;
        }
        if (m922equalsimpl0(i2, YUV_420_888)) {
            return 12;
        }
        if (m922equalsimpl0(i2, YUV_422_888)) {
            return 16;
        }
        if (m922equalsimpl0(i2, YUV_444_888)) {
            return 24;
        }
        if (m922equalsimpl0(i2, YUY2)) {
            return 16;
        }
        return m922equalsimpl0(i2, YV12) ? 12 : -1;
    }

    /* renamed from: getName-impl, reason: not valid java name */
    public static final String m924getNameimpl(int i2) {
        if (m922equalsimpl0(i2, UNKNOWN)) {
            return "UNKNOWN";
        }
        if (m922equalsimpl0(i2, PRIVATE)) {
            return "PRIVATE";
        }
        if (m922equalsimpl0(i2, DEPTH16)) {
            return "DEPTH16";
        }
        if (m922equalsimpl0(i2, DEPTH_JPEG)) {
            return "DEPTH_JPEG";
        }
        if (m922equalsimpl0(i2, DEPTH_POINT_CLOUD)) {
            return "DEPTH_POINT_CLOUD";
        }
        if (m922equalsimpl0(i2, FLEX_RGB_888)) {
            return "FLEX_RGB_888";
        }
        if (m922equalsimpl0(i2, FLEX_RGBA_8888)) {
            return "FLEX_RGBA_8888";
        }
        if (m922equalsimpl0(i2, HEIC)) {
            return "HEIC";
        }
        if (m922equalsimpl0(i2, JPEG)) {
            return "JPEG";
        }
        if (m922equalsimpl0(i2, JPEG_R)) {
            return "JPEG_R";
        }
        if (m922equalsimpl0(i2, NV16)) {
            return "NV16";
        }
        if (m922equalsimpl0(i2, NV21)) {
            return "NV21";
        }
        if (m922equalsimpl0(i2, RAW10)) {
            return "RAW10";
        }
        if (m922equalsimpl0(i2, RAW12)) {
            return "RAW12";
        }
        if (m922equalsimpl0(i2, RAW_DEPTH)) {
            return "RAW_DEPTH";
        }
        if (m922equalsimpl0(i2, RAW_DEPTH10)) {
            return "RAW_DEPTH10";
        }
        if (m922equalsimpl0(i2, RAW_PRIVATE)) {
            return "RAW_PRIVATE";
        }
        if (m922equalsimpl0(i2, RAW_SENSOR)) {
            return "RAW_SENSOR";
        }
        if (m922equalsimpl0(i2, RGB_565)) {
            return "RGB_565";
        }
        if (m922equalsimpl0(i2, Y12)) {
            return "Y12";
        }
        if (m922equalsimpl0(i2, Y16)) {
            return "Y16";
        }
        if (m922equalsimpl0(i2, Y8)) {
            return "Y8";
        }
        if (m922equalsimpl0(i2, YCBCR_P010)) {
            return "YCBCR_P010";
        }
        if (m922equalsimpl0(i2, YUV_420_888)) {
            return "YUV_420_888";
        }
        if (m922equalsimpl0(i2, YUV_422_888)) {
            return "YUV_422_888";
        }
        if (m922equalsimpl0(i2, YUV_444_888)) {
            return "YUV_444_888";
        }
        if (m922equalsimpl0(i2, YUY2)) {
            return "YUY2";
        }
        if (m922equalsimpl0(i2, YV12)) {
            return "YV12";
        }
        if (m922equalsimpl0(i2, BLOB)) {
            return "BLOB";
        }
        k.y(16);
        String string = Integer.toString(i2, 16);
        x.e(string, "toString(...)");
        return "UNKNOWN(" + string + ")";
    }

    /* renamed from: isCompressedRgb-hNQ4ISI, reason: not valid java name */
    public static final boolean m926isCompressedRgbhNQ4ISI(int i2) {
        return Companion.m960isCompressedRgbhNQ4ISI(i2);
    }

    /* renamed from: isRaw-hNQ4ISI, reason: not valid java name */
    public static final boolean m927isRawhNQ4ISI(int i2) {
        return Companion.m961isRawhNQ4ISI(i2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m928toStringimpl(int i2) {
        return "StreamFormat(" + m924getNameimpl(i2) + ")";
    }

    public boolean equals(Object obj) {
        return m921equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m928toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m929unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final long estimateCompressedRgbBytesPerImage(int i2, int i3) {
            return (((i2 * 24) * i3) / 8) / 4;
        }

        private final int estimatePrivateBitsPerPixel() {
            return StreamFormat.m923getBitsPerPixelimpl(m955getYUV_420_8888FPWQzE());
        }

        /* renamed from: bytesPerImage-_EMV7EA, reason: not valid java name */
        public final long m930bytesPerImage_EMV7EA(int i2, int i3, int i4) {
            int iM923getBitsPerPixelimpl = StreamFormat.m923getBitsPerPixelimpl(i2);
            if (iM923getBitsPerPixelimpl <= 0 && StreamFormat.m922equalsimpl0(i2, m934getDEPTH_POINT_CLOUD8FPWQzE())) {
                iM923getBitsPerPixelimpl = 16;
            }
            if (iM923getBitsPerPixelimpl <= 0 && m960isCompressedRgbhNQ4ISI(i2)) {
                return estimateCompressedRgbBytesPerImage(i3, i4);
            }
            if (iM923getBitsPerPixelimpl <= 0 && StreamFormat.m922equalsimpl0(i2, m942getPRIVATE8FPWQzE())) {
                iM923getBitsPerPixelimpl = estimatePrivateBitsPerPixel();
            }
            return ((i3 * Math.max(iM923getBitsPerPixelimpl, 0)) * i4) / 8;
        }

        /* renamed from: getBLOB-8FPWQzE, reason: not valid java name */
        public final int m931getBLOB8FPWQzE() {
            return StreamFormat.BLOB;
        }

        /* renamed from: getDEPTH16-8FPWQzE, reason: not valid java name */
        public final int m932getDEPTH168FPWQzE() {
            return StreamFormat.DEPTH16;
        }

        /* renamed from: getDEPTH_JPEG-8FPWQzE, reason: not valid java name */
        public final int m933getDEPTH_JPEG8FPWQzE() {
            return StreamFormat.DEPTH_JPEG;
        }

        /* renamed from: getDEPTH_POINT_CLOUD-8FPWQzE, reason: not valid java name */
        public final int m934getDEPTH_POINT_CLOUD8FPWQzE() {
            return StreamFormat.DEPTH_POINT_CLOUD;
        }

        /* renamed from: getFLEX_RGBA_8888-8FPWQzE, reason: not valid java name */
        public final int m935getFLEX_RGBA_88888FPWQzE() {
            return StreamFormat.FLEX_RGBA_8888;
        }

        /* renamed from: getFLEX_RGB_888-8FPWQzE, reason: not valid java name */
        public final int m936getFLEX_RGB_8888FPWQzE() {
            return StreamFormat.FLEX_RGB_888;
        }

        /* renamed from: getHEIC-8FPWQzE, reason: not valid java name */
        public final int m937getHEIC8FPWQzE() {
            return StreamFormat.HEIC;
        }

        /* renamed from: getJPEG-8FPWQzE, reason: not valid java name */
        public final int m938getJPEG8FPWQzE() {
            return StreamFormat.JPEG;
        }

        /* renamed from: getJPEG_R-8FPWQzE, reason: not valid java name */
        public final int m939getJPEG_R8FPWQzE() {
            return StreamFormat.JPEG_R;
        }

        /* renamed from: getNV16-8FPWQzE, reason: not valid java name */
        public final int m940getNV168FPWQzE() {
            return StreamFormat.NV16;
        }

        /* renamed from: getNV21-8FPWQzE, reason: not valid java name */
        public final int m941getNV218FPWQzE() {
            return StreamFormat.NV21;
        }

        /* renamed from: getPRIVATE-8FPWQzE, reason: not valid java name */
        public final int m942getPRIVATE8FPWQzE() {
            return StreamFormat.PRIVATE;
        }

        /* renamed from: getRAW10-8FPWQzE, reason: not valid java name */
        public final int m943getRAW108FPWQzE() {
            return StreamFormat.RAW10;
        }

        /* renamed from: getRAW12-8FPWQzE, reason: not valid java name */
        public final int m944getRAW128FPWQzE() {
            return StreamFormat.RAW12;
        }

        /* renamed from: getRAW_DEPTH-8FPWQzE, reason: not valid java name */
        public final int m945getRAW_DEPTH8FPWQzE() {
            return StreamFormat.RAW_DEPTH;
        }

        /* renamed from: getRAW_DEPTH10-8FPWQzE, reason: not valid java name */
        public final int m946getRAW_DEPTH108FPWQzE() {
            return StreamFormat.RAW_DEPTH10;
        }

        /* renamed from: getRAW_PRIVATE-8FPWQzE, reason: not valid java name */
        public final int m947getRAW_PRIVATE8FPWQzE() {
            return StreamFormat.RAW_PRIVATE;
        }

        /* renamed from: getRAW_SENSOR-8FPWQzE, reason: not valid java name */
        public final int m948getRAW_SENSOR8FPWQzE() {
            return StreamFormat.RAW_SENSOR;
        }

        /* renamed from: getRGB_565-8FPWQzE, reason: not valid java name */
        public final int m949getRGB_5658FPWQzE() {
            return StreamFormat.RGB_565;
        }

        /* renamed from: getUNKNOWN-8FPWQzE, reason: not valid java name */
        public final int m950getUNKNOWN8FPWQzE() {
            return StreamFormat.UNKNOWN;
        }

        /* renamed from: getY12-8FPWQzE, reason: not valid java name */
        public final int m951getY128FPWQzE() {
            return StreamFormat.Y12;
        }

        /* renamed from: getY16-8FPWQzE, reason: not valid java name */
        public final int m952getY168FPWQzE() {
            return StreamFormat.Y16;
        }

        /* renamed from: getY8-8FPWQzE, reason: not valid java name */
        public final int m953getY88FPWQzE() {
            return StreamFormat.Y8;
        }

        /* renamed from: getYCBCR_P010-8FPWQzE, reason: not valid java name */
        public final int m954getYCBCR_P0108FPWQzE() {
            return StreamFormat.YCBCR_P010;
        }

        /* renamed from: getYUV_420_888-8FPWQzE, reason: not valid java name */
        public final int m955getYUV_420_8888FPWQzE() {
            return StreamFormat.YUV_420_888;
        }

        /* renamed from: getYUV_422_888-8FPWQzE, reason: not valid java name */
        public final int m956getYUV_422_8888FPWQzE() {
            return StreamFormat.YUV_422_888;
        }

        /* renamed from: getYUV_444_888-8FPWQzE, reason: not valid java name */
        public final int m957getYUV_444_8888FPWQzE() {
            return StreamFormat.YUV_444_888;
        }

        /* renamed from: getYUY2-8FPWQzE, reason: not valid java name */
        public final int m958getYUY28FPWQzE() {
            return StreamFormat.YUY2;
        }

        /* renamed from: getYV12-8FPWQzE, reason: not valid java name */
        public final int m959getYV128FPWQzE() {
            return StreamFormat.YV12;
        }

        /* renamed from: isCompressedRgb-hNQ4ISI, reason: not valid java name */
        public final boolean m960isCompressedRgbhNQ4ISI(int i2) {
            return StreamFormat.m922equalsimpl0(i2, m939getJPEG_R8FPWQzE()) || StreamFormat.m922equalsimpl0(i2, m933getDEPTH_JPEG8FPWQzE()) || StreamFormat.m922equalsimpl0(i2, m937getHEIC8FPWQzE()) || StreamFormat.m922equalsimpl0(i2, m938getJPEG8FPWQzE()) || StreamFormat.m922equalsimpl0(i2, m931getBLOB8FPWQzE());
        }

        /* renamed from: isRaw-hNQ4ISI, reason: not valid java name */
        public final boolean m961isRawhNQ4ISI(int i2) {
            return StreamFormat.m922equalsimpl0(i2, m943getRAW108FPWQzE()) || StreamFormat.m922equalsimpl0(i2, m944getRAW128FPWQzE()) || StreamFormat.m922equalsimpl0(i2, m947getRAW_PRIVATE8FPWQzE()) || StreamFormat.m922equalsimpl0(i2, m948getRAW_SENSOR8FPWQzE()) || StreamFormat.m922equalsimpl0(i2, m945getRAW_DEPTH8FPWQzE()) || StreamFormat.m922equalsimpl0(i2, m946getRAW_DEPTH108FPWQzE());
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m920constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m925hashCodeimpl(int i2) {
        return i2;
    }
}
