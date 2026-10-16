package androidx.compose.foundation.layout;

import androidx.media3.muxer.MuxerUtil;
import h.g.b.o;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes.dex */
public final class FlexBasis {
    private static final long TypeAuto = 0;
    private static final long TypeDp = 1;
    private static final long TypePercent = 2;
    private static final int TypeShift = 32;
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Auto = 0;

    private /* synthetic */ FlexBasis(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FlexBasis m2524boximpl(long j2) {
        return new FlexBasis(j2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2526equalsimpl(long j2, Object obj) {
        return (obj instanceof FlexBasis) && j2 == ((FlexBasis) obj).m2534unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2527equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getValue-impl$foundation_layout, reason: not valid java name */
    public static final float m2528getValueimpl$foundation_layout(long j2) {
        return Float.intBitsToFloat((int) j2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2529hashCodeimpl(long j2) {
        return FlexBasis$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: isAuto-impl$foundation_layout, reason: not valid java name */
    public static final boolean m2530isAutoimpl$foundation_layout(long j2) {
        return (j2 >>> 32) == 0;
    }

    /* renamed from: isDp-impl$foundation_layout, reason: not valid java name */
    public static final boolean m2531isDpimpl$foundation_layout(long j2) {
        return (j2 >>> 32) == 1;
    }

    /* renamed from: isPercent-impl$foundation_layout, reason: not valid java name */
    public static final boolean m2532isPercentimpl$foundation_layout(long j2) {
        return (j2 >>> 32) == 2;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2533toStringimpl(long j2) {
        if (m2530isAutoimpl$foundation_layout(j2)) {
            return "FlexBasis.Auto";
        }
        if (m2531isDpimpl$foundation_layout(j2)) {
            return "FlexBasis.Dp(" + m2528getValueimpl$foundation_layout(j2) + ".dp)";
        }
        if (!m2532isPercentimpl$foundation_layout(j2)) {
            return "FlexBasis.Unknown";
        }
        return "FlexBasis.Percent(" + h.h.a.b(m2528getValueimpl$foundation_layout(j2) * 100.0f) + "%)";
    }

    public boolean equals(Object obj) {
        return m2526equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2529hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m2533toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m2534unboximpl() {
        return this.packedValue;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: Dp-cHuBJEI, reason: not valid java name */
        public final long m2535DpcHuBJEI(float f2) {
            return (Float.floatToIntBits(f2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | 4294967296L;
        }

        /* renamed from: Percent-uoj9tHE, reason: not valid java name */
        public final long m2536Percentuoj9tHE(float f2) {
            return (Float.floatToIntBits(f2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | 8589934592L;
        }

        /* renamed from: getAuto-d-lZNVs, reason: not valid java name */
        public final long m2537getAutodlZNVs() {
            return FlexBasis.Auto;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2525constructorimpl(long j2) {
        return j2;
    }
}
