package androidx.compose.ui.unit;

import androidx.media3.muxer.MuxerUtil;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class Velocity {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = 0;
    private final long packedValue;

    private /* synthetic */ Velocity(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Velocity m11397boximpl(long j2) {
        return new Velocity(j2);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m11398component1impl(long j2) {
        return m11406getXimpl(j2);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m11399component2impl(long j2) {
        return m11407getYimpl(j2);
    }

    /* renamed from: copy-OhffZ5M, reason: not valid java name */
    public static final long m11401copyOhffZ5M(long j2, float f2, float f3) {
        return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: copy-OhffZ5M$default, reason: not valid java name */
    public static /* synthetic */ long m11402copyOhffZ5M$default(long j2, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Float.intBitsToFloat((int) (j2 >> 32));
        }
        if ((i2 & 2) != 0) {
            f3 = Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2));
        }
        return m11401copyOhffZ5M(j2, f2, f3);
    }

    /* renamed from: div-adjELrA, reason: not valid java name */
    public static final long m11403divadjELrA(long j2, float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / f2;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) / f2;
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11404equalsimpl(long j2, Object obj) {
        return (obj instanceof Velocity) && j2 == ((Velocity) obj).m11415unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11405equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m11406getXimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m11407getYimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11408hashCodeimpl(long j2) {
        return Velocity$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: minus-AH228Gc, reason: not valid java name */
    public static final long m11409minusAH228Gc(long j2, long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: plus-AH228Gc, reason: not valid java name */
    public static final long m11410plusAH228Gc(long j2, long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) + Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: rem-adjELrA, reason: not valid java name */
    public static final long m11411remadjELrA(long j2, float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) % f2;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) % f2;
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: times-adjELrA, reason: not valid java name */
    public static final long m11412timesadjELrA(long j2, float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * f2;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) * f2;
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m11413toStringimpl(long j2) {
        return "(" + m11406getXimpl(j2) + ", " + m11407getYimpl(j2) + ") px/sec";
    }

    /* renamed from: unaryMinus-9UxMQ8M, reason: not valid java name */
    public static final long m11414unaryMinus9UxMQ8M(long j2) {
        return j2 ^ (-9223372034707292160L);
    }

    public boolean equals(Object obj) {
        return m11404equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m11408hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m11413toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m11415unboximpl() {
        return this.packedValue;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getZero-9UxMQ8M, reason: not valid java name */
        public final long m11417getZero9UxMQ8M() {
            return Velocity.Zero;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* renamed from: getZero-9UxMQ8M$annotations, reason: not valid java name */
        public static /* synthetic */ void m11416getZero9UxMQ8M$annotations() {
        }
    }

    public static /* synthetic */ void getX$annotations() {
    }

    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m11400constructorimpl(long j2) {
        return j2;
    }
}
