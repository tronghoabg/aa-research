package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Dp;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.o;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes.dex */
public final class GridTrackSize implements GridTrackSpec {
    private static final long Auto;
    public static final Companion Companion;
    private static final long MaxContent;
    private static final long MinContent;
    public static final int TypeAuto = 6;
    public static final int TypeFixed = 1;
    public static final int TypeFlex = 3;
    public static final int TypeMaxContent = 5;
    public static final int TypeMinContent = 4;
    public static final int TypeMinMax = 7;
    public static final int TypePercentage = 2;
    private final long encodedValue;

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        MinContent = companion.m2695packALYS8Xw(4, 0.0f);
        MaxContent = companion.m2695packALYS8Xw(5, 0.0f);
        Auto = companion.m2695packALYS8Xw(6, 0.0f);
    }

    private /* synthetic */ GridTrackSize(long j2) {
        this.encodedValue = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GridTrackSize m2683boximpl(long j2) {
        return new GridTrackSize(j2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2685equalsimpl(long j2, Object obj) {
        return (obj instanceof GridTrackSize) && j2 == ((GridTrackSize) obj).m2693unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2686equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getMaxValue-impl$foundation_layout, reason: not valid java name */
    public static final float m2687getMaxValueimpl$foundation_layout(long j2) {
        return Float.intBitsToFloat(((int) (j2 & 1073741823)) << 2);
    }

    /* renamed from: getMinValue-impl$foundation_layout, reason: not valid java name */
    public static final float m2688getMinValueimpl$foundation_layout(long j2) {
        return Float.intBitsToFloat(((int) ((j2 >>> 30) & 1073741823)) << 2);
    }

    /* renamed from: getType-impl$foundation_layout, reason: not valid java name */
    public static final int m2689getTypeimpl$foundation_layout(long j2) {
        return (int) (j2 >>> 60);
    }

    /* renamed from: getValue-impl$foundation_layout, reason: not valid java name */
    public static final float m2690getValueimpl$foundation_layout(long j2) {
        return Float.intBitsToFloat((int) j2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2691hashCodeimpl(long j2) {
        return GridTrackSize$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2692toStringimpl(long j2) {
        switch (m2689getTypeimpl$foundation_layout(j2)) {
            case 1:
                return "Fixed(" + m2690getValueimpl$foundation_layout(j2) + "dp)";
            case 2:
                return "Percentage(" + m2690getValueimpl$foundation_layout(j2) + ')';
            case 3:
                return "Flex(" + m2690getValueimpl$foundation_layout(j2) + "fr)";
            case 4:
                return "MinContent";
            case 5:
                return "MaxContent";
            case 6:
                return "Auto";
            case 7:
                return "MinMax(" + m2688getMinValueimpl$foundation_layout(j2) + "dp, " + m2687getMaxValueimpl$foundation_layout(j2) + "fr)";
            default:
                return "Unknown";
        }
    }

    public boolean equals(Object obj) {
        return m2685equalsimpl(this.encodedValue, obj);
    }

    public int hashCode() {
        return m2691hashCodeimpl(this.encodedValue);
    }

    public String toString() {
        return m2692toStringimpl(this.encodedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m2693unboximpl() {
        return this.encodedValue;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: pack-ALYS8Xw, reason: not valid java name */
        public final long m2695packALYS8Xw(int i2, float f2) {
            long jFloatToRawIntBits = Float.floatToRawIntBits(f2);
            Companion companion = GridTrackSize.Companion;
            return ((i2 & 15) << 60) | (jFloatToRawIntBits & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        }

        /* renamed from: packMinMax-ALYS8Xw, reason: not valid java name */
        private final long m2696packMinMaxALYS8Xw(float f2, float f3) {
            if (f2 < 0.0f || f3 < 0.0f) {
                throw new IllegalArgumentException("minmax values must be non-negative");
            }
            int iFloatToRawIntBits = Float.floatToRawIntBits(f2) >>> 2;
            int iFloatToRawIntBits2 = Float.floatToRawIntBits(f3) >>> 2;
            Companion companion = GridTrackSize.Companion;
            return iFloatToRawIntBits2 | (iFloatToRawIntBits << 30) | 8070450532247928832L;
        }

        /* renamed from: Fixed-psSkOvk, reason: not valid java name */
        public final long m2697FixedpsSkOvk(float f2) {
            if (!Dp.m11169equalsimpl0(f2, Dp.Companion.m11184getUnspecifiedD9Ej5fM()) && f2 >= 0.0f) {
                return m2695packALYS8Xw(1, f2);
            }
            throw new IllegalArgumentException("Fixed size must be non-negative and specified (was " + ((Object) Dp.m11175toStringimpl(f2)) + ')');
        }

        /* renamed from: Flex-KGB9zo8, reason: not valid java name */
        public final long m2698FlexKGB9zo8(float f2) {
            if (f2 >= 0.0f) {
                return m2695packALYS8Xw(3, f2);
            }
            throw new IllegalArgumentException("Flex weight must be non-negative");
        }

        /* renamed from: MinMax-1z8F7YY, reason: not valid java name */
        public final long m2699MinMax1z8F7YY(float f2, float f3) {
            if (f2 < 0.0f) {
                throw new IllegalArgumentException("MinMax minimum size cannot be negative");
            }
            if (f3 >= 0.0f) {
                return m2696packMinMaxALYS8Xw(f2, f3);
            }
            throw new IllegalArgumentException("MinMax max weight cannot be negative");
        }

        /* renamed from: Percentage-9Tp3RV8, reason: not valid java name */
        public final long m2700Percentage9Tp3RV8(float f2) {
            if (f2 >= 0.0f) {
                return m2695packALYS8Xw(2, f2);
            }
            throw new IllegalArgumentException("Percentage cannot be negative");
        }

        /* renamed from: getAuto-eyNpfc4, reason: not valid java name */
        public final long m2701getAutoeyNpfc4() {
            return GridTrackSize.Auto;
        }

        /* renamed from: getMaxContent-eyNpfc4, reason: not valid java name */
        public final long m2702getMaxContenteyNpfc4() {
            return GridTrackSize.MaxContent;
        }

        /* renamed from: getMinContent-eyNpfc4, reason: not valid java name */
        public final long m2703getMinContenteyNpfc4() {
            return GridTrackSize.MinContent;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2684constructorimpl(long j2) {
        return j2;
    }
}
