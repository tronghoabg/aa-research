package androidx.camera.camera2.pipe;

import android.graphics.ColorSpace;
import android.os.Build;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes2.dex */
public final class CameraColorSpace {
    private final String colorSpaceName;
    public static final Companion Companion = new Companion(null);
    private static final String UNKNOWN = "UNKNOWN";
    private static final String SRGB = "SRGB";
    private static final String LINEAR_SRGB = "LINEAR_SRGB";
    private static final String EXTENDED_SRGB = "EXTENDED_SRGB";
    private static final String LINEAR_EXTENDED_SRGB = "LINEAR_EXTENDED_SRGB";
    private static final String BT709 = "BT709";
    private static final String BT2020 = "BT2020";
    private static final String DCI_P3 = "DCI_P3";
    private static final String DISPLAY_P3 = "DISPLAY_P3";
    private static final String NTSC_1953 = "NTSC_1953";
    private static final String SMPTE_C = "SMPTE_C";
    private static final String ADOBE_RGB = "ADOBE_RGB";
    private static final String PRO_PHOTO_RGB = "PRO_PHOTO_RGB";
    private static final String ACES = "ACES";
    private static final String ACESCG = "ACESCG";
    private static final String CIE_XYZ = "CIE_XYZ";
    private static final String CIE_LAB = "CIE_LAB";
    private static final String BT2020_HLG = "BT2020_HLG";
    private static final String BT2020_PQ = "BT2020_PQ";

    private /* synthetic */ CameraColorSpace(String str) {
        this.colorSpaceName = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CameraColorSpace m390boximpl(String str) {
        return new CameraColorSpace(str);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m392equalsimpl(String str, Object obj) {
        return (obj instanceof CameraColorSpace) && x.n(str, ((CameraColorSpace) obj).m398unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m393equalsimpl0(String str, String str2) {
        return x.n(str, str2);
    }

    /* renamed from: fromColorSpaceNamed-5GKeQC8, reason: not valid java name */
    public static final String m394fromColorSpaceNamed5GKeQC8(ColorSpace.Named named) {
        return Companion.m399fromColorSpaceNamed5GKeQC8(named);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m395hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toColorSpaceNamed-impl, reason: not valid java name */
    public static final ColorSpace.Named m396toColorSpaceNamedimpl(String str) {
        if (m393equalsimpl0(str, UNKNOWN)) {
            return null;
        }
        if (m393equalsimpl0(str, SRGB)) {
            return ColorSpace.Named.SRGB;
        }
        if (m393equalsimpl0(str, LINEAR_SRGB)) {
            return ColorSpace.Named.LINEAR_SRGB;
        }
        if (m393equalsimpl0(str, EXTENDED_SRGB)) {
            return ColorSpace.Named.EXTENDED_SRGB;
        }
        if (m393equalsimpl0(str, LINEAR_EXTENDED_SRGB)) {
            return ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        }
        if (m393equalsimpl0(str, BT709)) {
            return ColorSpace.Named.BT709;
        }
        if (m393equalsimpl0(str, BT2020)) {
            return ColorSpace.Named.BT2020;
        }
        if (m393equalsimpl0(str, DCI_P3)) {
            return ColorSpace.Named.DCI_P3;
        }
        if (m393equalsimpl0(str, DISPLAY_P3)) {
            return ColorSpace.Named.DISPLAY_P3;
        }
        if (m393equalsimpl0(str, NTSC_1953)) {
            return ColorSpace.Named.NTSC_1953;
        }
        if (m393equalsimpl0(str, SMPTE_C)) {
            return ColorSpace.Named.SMPTE_C;
        }
        if (m393equalsimpl0(str, ADOBE_RGB)) {
            return ColorSpace.Named.ADOBE_RGB;
        }
        if (m393equalsimpl0(str, PRO_PHOTO_RGB)) {
            return ColorSpace.Named.PRO_PHOTO_RGB;
        }
        if (m393equalsimpl0(str, ACES)) {
            return ColorSpace.Named.ACES;
        }
        if (m393equalsimpl0(str, ACESCG)) {
            return ColorSpace.Named.ACESCG;
        }
        if (m393equalsimpl0(str, CIE_XYZ)) {
            return ColorSpace.Named.CIE_XYZ;
        }
        if (m393equalsimpl0(str, CIE_LAB)) {
            return ColorSpace.Named.CIE_LAB;
        }
        if (Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (m393equalsimpl0(str, BT2020_HLG)) {
            return ColorSpace.Named.BT2020_HLG;
        }
        if (m393equalsimpl0(str, BT2020_PQ)) {
            return ColorSpace.Named.BT2020_PQ;
        }
        return null;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m397toStringimpl(String str) {
        return "CameraColorSpace(colorSpaceName=" + str + ")";
    }

    public boolean equals(Object obj) {
        return m392equalsimpl(this.colorSpaceName, obj);
    }

    public final String getColorSpaceName() {
        return this.colorSpaceName;
    }

    public int hashCode() {
        return m395hashCodeimpl(this.colorSpaceName);
    }

    public String toString() {
        return m397toStringimpl(this.colorSpaceName);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m398unboximpl() {
        return this.colorSpaceName;
    }

    /* compiled from: WazeSource */
    public final class Companion {

        /* compiled from: WazeSource */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ColorSpace.Named.values().length];
                try {
                    iArr[ColorSpace.Named.SRGB.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ColorSpace.Named.LINEAR_SRGB.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ColorSpace.Named.EXTENDED_SRGB.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ColorSpace.Named.BT709.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ColorSpace.Named.BT2020.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ColorSpace.Named.DCI_P3.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[ColorSpace.Named.DISPLAY_P3.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[ColorSpace.Named.NTSC_1953.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[ColorSpace.Named.SMPTE_C.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[ColorSpace.Named.ADOBE_RGB.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[ColorSpace.Named.PRO_PHOTO_RGB.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[ColorSpace.Named.ACES.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[ColorSpace.Named.ACESCG.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[ColorSpace.Named.CIE_XYZ.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[ColorSpace.Named.CIE_LAB.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[ColorSpace.Named.BT2020_HLG.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[ColorSpace.Named.BT2020_PQ.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        /* renamed from: fromColorSpaceNamed-5GKeQC8, reason: not valid java name */
        public final String m399fromColorSpaceNamed5GKeQC8(ColorSpace.Named named) {
            x.f(named, "colorSpaceNamed");
            switch (WhenMappings.$EnumSwitchMapping$0[named.ordinal()]) {
                case 1:
                    return m417getSRGBsh9K6P8();
                case 2:
                    return m413getLINEAR_SRGBsh9K6P8();
                case 3:
                    return m411getEXTENDED_SRGBsh9K6P8();
                case 4:
                    return m412getLINEAR_EXTENDED_SRGBsh9K6P8();
                case 5:
                    return m406getBT709sh9K6P8();
                case 6:
                    return m403getBT2020sh9K6P8();
                case 7:
                    return m409getDCI_P3sh9K6P8();
                case 8:
                    return m410getDISPLAY_P3sh9K6P8();
                case 9:
                    return m414getNTSC_1953sh9K6P8();
                case 10:
                    return m416getSMPTE_Csh9K6P8();
                case 11:
                    return m402getADOBE_RGBsh9K6P8();
                case 12:
                    return m415getPRO_PHOTO_RGBsh9K6P8();
                case 13:
                    return m400getACESsh9K6P8();
                case 14:
                    return m401getACESCGsh9K6P8();
                case 15:
                    return m408getCIE_XYZsh9K6P8();
                case 16:
                    return m407getCIE_LABsh9K6P8();
                default:
                    if (Build.VERSION.SDK_INT < 34) {
                        return null;
                    }
                    int i2 = WhenMappings.$EnumSwitchMapping$0[named.ordinal()];
                    if (i2 == 17) {
                        return m404getBT2020_HLGsh9K6P8();
                    }
                    if (i2 != 18) {
                        return null;
                    }
                    return m405getBT2020_PQsh9K6P8();
            }
        }

        /* renamed from: getACES-sh9K6P8, reason: not valid java name */
        public final String m400getACESsh9K6P8() {
            return CameraColorSpace.ACES;
        }

        /* renamed from: getACESCG-sh9K6P8, reason: not valid java name */
        public final String m401getACESCGsh9K6P8() {
            return CameraColorSpace.ACESCG;
        }

        /* renamed from: getADOBE_RGB-sh9K6P8, reason: not valid java name */
        public final String m402getADOBE_RGBsh9K6P8() {
            return CameraColorSpace.ADOBE_RGB;
        }

        /* renamed from: getBT2020-sh9K6P8, reason: not valid java name */
        public final String m403getBT2020sh9K6P8() {
            return CameraColorSpace.BT2020;
        }

        /* renamed from: getBT2020_HLG-sh9K6P8, reason: not valid java name */
        public final String m404getBT2020_HLGsh9K6P8() {
            return CameraColorSpace.BT2020_HLG;
        }

        /* renamed from: getBT2020_PQ-sh9K6P8, reason: not valid java name */
        public final String m405getBT2020_PQsh9K6P8() {
            return CameraColorSpace.BT2020_PQ;
        }

        /* renamed from: getBT709-sh9K6P8, reason: not valid java name */
        public final String m406getBT709sh9K6P8() {
            return CameraColorSpace.BT709;
        }

        /* renamed from: getCIE_LAB-sh9K6P8, reason: not valid java name */
        public final String m407getCIE_LABsh9K6P8() {
            return CameraColorSpace.CIE_LAB;
        }

        /* renamed from: getCIE_XYZ-sh9K6P8, reason: not valid java name */
        public final String m408getCIE_XYZsh9K6P8() {
            return CameraColorSpace.CIE_XYZ;
        }

        /* renamed from: getDCI_P3-sh9K6P8, reason: not valid java name */
        public final String m409getDCI_P3sh9K6P8() {
            return CameraColorSpace.DCI_P3;
        }

        /* renamed from: getDISPLAY_P3-sh9K6P8, reason: not valid java name */
        public final String m410getDISPLAY_P3sh9K6P8() {
            return CameraColorSpace.DISPLAY_P3;
        }

        /* renamed from: getEXTENDED_SRGB-sh9K6P8, reason: not valid java name */
        public final String m411getEXTENDED_SRGBsh9K6P8() {
            return CameraColorSpace.EXTENDED_SRGB;
        }

        /* renamed from: getLINEAR_EXTENDED_SRGB-sh9K6P8, reason: not valid java name */
        public final String m412getLINEAR_EXTENDED_SRGBsh9K6P8() {
            return CameraColorSpace.LINEAR_EXTENDED_SRGB;
        }

        /* renamed from: getLINEAR_SRGB-sh9K6P8, reason: not valid java name */
        public final String m413getLINEAR_SRGBsh9K6P8() {
            return CameraColorSpace.LINEAR_SRGB;
        }

        /* renamed from: getNTSC_1953-sh9K6P8, reason: not valid java name */
        public final String m414getNTSC_1953sh9K6P8() {
            return CameraColorSpace.NTSC_1953;
        }

        /* renamed from: getPRO_PHOTO_RGB-sh9K6P8, reason: not valid java name */
        public final String m415getPRO_PHOTO_RGBsh9K6P8() {
            return CameraColorSpace.PRO_PHOTO_RGB;
        }

        /* renamed from: getSMPTE_C-sh9K6P8, reason: not valid java name */
        public final String m416getSMPTE_Csh9K6P8() {
            return CameraColorSpace.SMPTE_C;
        }

        /* renamed from: getSRGB-sh9K6P8, reason: not valid java name */
        public final String m417getSRGBsh9K6P8() {
            return CameraColorSpace.SRGB;
        }

        /* renamed from: getUNKNOWN-sh9K6P8, reason: not valid java name */
        public final String m418getUNKNOWNsh9K6P8() {
            return CameraColorSpace.UNKNOWN;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static String m391constructorimpl(String str) {
        return str;
    }
}
