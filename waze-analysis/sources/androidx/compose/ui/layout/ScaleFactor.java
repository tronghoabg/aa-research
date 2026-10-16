package androidx.compose.ui.layout;

import androidx.media3.muxer.MuxerUtil;
import h.g.b.o;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes.dex */
public final class ScaleFactor {
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = (Float.floatToRawIntBits(Float.NaN) << 32) | (Float.floatToRawIntBits(Float.NaN) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    private final long packedValue;

    private /* synthetic */ ScaleFactor(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ScaleFactor m9854boximpl(long j2) {
        return new ScaleFactor(j2);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m9855component1impl(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m9856component2impl(long j2) {
        return Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    /* renamed from: copy-8GGzs04, reason: not valid java name */
    public static final long m9858copy8GGzs04(long j2, float f2, float f3) {
        return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: copy-8GGzs04$default, reason: not valid java name */
    public static /* synthetic */ long m9859copy8GGzs04$default(long j2, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Float.intBitsToFloat((int) (j2 >> 32));
        }
        if ((i2 & 2) != 0) {
            f3 = Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2));
        }
        return m9858copy8GGzs04(j2, f2, f3);
    }

    /* renamed from: div-44nBxM0, reason: not valid java name */
    public static final long m9860div44nBxM0(long j2, float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / f2;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) / f2;
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m9861equalsimpl(long j2, Object obj) {
        return (obj instanceof ScaleFactor) && j2 == ((ScaleFactor) obj).m9868unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9862equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getScaleX-impl, reason: not valid java name */
    public static final float m9863getScaleXimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* renamed from: getScaleY-impl, reason: not valid java name */
    public static final float m9864getScaleYimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m9865hashCodeimpl(long j2) {
        return ScaleFactor$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: times-44nBxM0, reason: not valid java name */
    public static final long m9866times44nBxM0(long j2, float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * f2;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) * f2;
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m9867toStringimpl(long j2) {
        return "ScaleFactor(" + Float.intBitsToFloat((int) (j2 >> 32)) + ", " + Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) + ')';
    }

    public boolean equals(Object obj) {
        return m9861equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m9865hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m9867toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m9868unboximpl() {
        return this.packedValue;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getUnspecified-_hLwfpc, reason: not valid java name */
        public final long m9870getUnspecified_hLwfpc() {
            return ScaleFactor.Unspecified;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* renamed from: getUnspecified-_hLwfpc$annotations, reason: not valid java name */
        public static /* synthetic */ void m9869getUnspecified_hLwfpc$annotations() {
        }
    }

    public static /* synthetic */ void getScaleX$annotations() {
    }

    public static /* synthetic */ void getScaleY$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m9857constructorimpl(long j2) {
        return j2;
    }
}
