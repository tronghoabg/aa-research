package androidx.compose.ui.geometry;

import androidx.media3.muxer.MuxerUtil;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class Offset {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Zero = 0;
    private static final long Infinite = InlineClassHelperKt.DualFloatInfinityBase;
    private static final long Unspecified = InlineClassHelperKt.UnspecifiedPackedFloats;

    private /* synthetic */ Offset(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Offset m7969boximpl(long j2) {
        return new Offset(j2);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m7970component1impl(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m7971component2impl(long j2) {
        return Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    /* renamed from: copy-dBAh8RU, reason: not valid java name */
    public static final long m7973copydBAh8RU(long j2, float f2, float f3) {
        return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: copy-dBAh8RU$default, reason: not valid java name */
    public static /* synthetic */ long m7974copydBAh8RU$default(long j2, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Float.intBitsToFloat((int) (j2 >> 32));
        }
        if ((i2 & 2) != 0) {
            f3 = Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2));
        }
        return m7973copydBAh8RU(j2, f2, f3);
    }

    /* renamed from: div-tuRUvjQ, reason: not valid java name */
    public static final long m7975divtuRUvjQ(long j2, float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / f2;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) / f2;
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7976equalsimpl(long j2, Object obj) {
        return (obj instanceof Offset) && j2 == ((Offset) obj).m7990unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7977equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getDistance-impl, reason: not valid java name */
    public static final float m7978getDistanceimpl(long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        return (float) Math.sqrt((fIntBitsToFloat * fIntBitsToFloat) + (fIntBitsToFloat2 * fIntBitsToFloat2));
    }

    /* renamed from: getDistanceSquared-impl, reason: not valid java name */
    public static final float m7979getDistanceSquaredimpl(long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        return (fIntBitsToFloat * fIntBitsToFloat) + (fIntBitsToFloat2 * fIntBitsToFloat2);
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m7980getXimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m7981getYimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7982hashCodeimpl(long j2) {
        return Offset$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: isValid-impl, reason: not valid java name */
    public static final boolean m7983isValidimpl(long j2) {
        return (((j2 & 9223372034707292159L) + InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) == 0;
    }

    /* renamed from: minus-MK-Hz9U, reason: not valid java name */
    public static final long m7984minusMKHz9U(long j2, long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: plus-MK-Hz9U, reason: not valid java name */
    public static final long m7985plusMKHz9U(long j2, long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) + Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: rem-tuRUvjQ, reason: not valid java name */
    public static final long m7986remtuRUvjQ(long j2, float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) % f2;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) % f2;
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: times-tuRUvjQ, reason: not valid java name */
    public static final long m7987timestuRUvjQ(long j2, float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * f2;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) * f2;
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7988toStringimpl(long j2) {
        if ((9223372034707292159L & j2) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return "Offset.Unspecified";
        }
        return "Offset(" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat((int) (j2 >> 32)), 1) + ", " + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), 1) + ')';
    }

    /* renamed from: unaryMinus-F1C5BW0, reason: not valid java name */
    public static final long m7989unaryMinusF1C5BW0(long j2) {
        return j2 ^ (-9223372034707292160L);
    }

    public boolean equals(Object obj) {
        return m7976equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m7982hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m7988toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m7990unboximpl() {
        return this.packedValue;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getInfinite-F1C5BW0, reason: not valid java name */
        public final long m7994getInfiniteF1C5BW0() {
            return Offset.Infinite;
        }

        /* renamed from: getUnspecified-F1C5BW0, reason: not valid java name */
        public final long m7995getUnspecifiedF1C5BW0() {
            return Offset.Unspecified;
        }

        /* renamed from: getZero-F1C5BW0, reason: not valid java name */
        public final long m7996getZeroF1C5BW0() {
            return Offset.Zero;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* renamed from: getInfinite-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m7991getInfiniteF1C5BW0$annotations() {
        }

        /* renamed from: getUnspecified-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m7992getUnspecifiedF1C5BW0$annotations() {
        }

        /* renamed from: getZero-F1C5BW0$annotations, reason: not valid java name */
        public static /* synthetic */ void m7993getZeroF1C5BW0$annotations() {
        }
    }

    public static /* synthetic */ void getX$annotations() {
    }

    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7972constructorimpl(long j2) {
        return j2;
    }
}
