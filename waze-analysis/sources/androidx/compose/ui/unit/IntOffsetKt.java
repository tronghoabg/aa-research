package androidx.compose.ui.unit;

import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class IntOffsetKt {
    public static final long IntOffset(int i2, int i3) {
        return (i3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (i2 << 32);
    }

    /* renamed from: lerp-81ZRxRo, reason: not valid java name */
    public static final long m11308lerp81ZRxRo(long j2, long j3, float f2) {
        return (MathHelpersKt.lerp(IntOffset.m11297getYimpl(j2), IntOffset.m11297getYimpl(j3), f2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (MathHelpersKt.lerp(IntOffset.m11296getXimpl(j2), IntOffset.m11296getXimpl(j3), f2) << 32);
    }

    /* renamed from: minus-Nv-tHpc, reason: not valid java name */
    public static final long m11309minusNvtHpc(long j2, long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) - IntOffset.m11296getXimpl(j3);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - IntOffset.m11297getYimpl(j3);
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: minus-oCl6YwE, reason: not valid java name */
    public static final long m11310minusoCl6YwE(long j2, long j3) {
        float fM11296getXimpl = IntOffset.m11296getXimpl(j2) - Float.intBitsToFloat((int) (j3 >> 32));
        float fM11297getYimpl = IntOffset.m11297getYimpl(j2) - Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        return (Float.floatToRawIntBits(fM11296getXimpl) << 32) | (Float.floatToRawIntBits(fM11297getYimpl) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: plus-Nv-tHpc, reason: not valid java name */
    public static final long m11311plusNvtHpc(long j2, long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + IntOffset.m11296getXimpl(j3);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) + IntOffset.m11297getYimpl(j3);
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: plus-oCl6YwE, reason: not valid java name */
    public static final long m11312plusoCl6YwE(long j2, long j3) {
        float fM11296getXimpl = IntOffset.m11296getXimpl(j2) + Float.intBitsToFloat((int) (j3 >> 32));
        float fM11297getYimpl = IntOffset.m11297getYimpl(j2) + Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        return (Float.floatToRawIntBits(fM11296getXimpl) << 32) | (Float.floatToRawIntBits(fM11297getYimpl) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: round-k-4lQ0M, reason: not valid java name */
    public static final long m11313roundk4lQ0M(long j2) {
        return (Math.round(Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Math.round(Float.intBitsToFloat((int) (j2 >> 32))) << 32);
    }

    /* renamed from: toOffset--gyyYBs, reason: not valid java name */
    public static final long m11314toOffsetgyyYBs(long j2) {
        return (Float.floatToRawIntBits(IntOffset.m11297getYimpl(j2)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(IntOffset.m11296getXimpl(j2)) << 32);
    }
}
