package androidx.collection;

import androidx.media3.muxer.MuxerUtil;
import h.g.a;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class FloatFloatPair {
    public final long packedValue;

    private /* synthetic */ FloatFloatPair(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FloatFloatPair m1672boximpl(long j2) {
        return new FloatFloatPair(j2);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m1673component1impl(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m1674component2impl(long j2) {
        return Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1675constructorimpl(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(f2) << 32);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1677equalsimpl(long j2, Object obj) {
        return (obj instanceof FloatFloatPair) && j2 == ((FloatFloatPair) obj).m1683unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1678equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getFirst-impl, reason: not valid java name */
    public static final float m1679getFirstimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* renamed from: getSecond-impl, reason: not valid java name */
    public static final float m1680getSecondimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1681hashCodeimpl(long j2) {
        return FloatFloatPair$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1682toStringimpl(long j2) {
        int i2 = (int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2);
        return "(" + Float.intBitsToFloat((int) (j2 >> 32)) + ", " + Float.intBitsToFloat(i2) + ")";
    }

    public boolean equals(Object obj) {
        return m1677equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m1681hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m1682toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1683unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1676constructorimpl(long j2) {
        return j2;
    }
}
