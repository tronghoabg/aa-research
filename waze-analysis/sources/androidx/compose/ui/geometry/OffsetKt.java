package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.muxer.MuxerUtil;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class OffsetKt {
    public static final long Offset(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(f2) << 32);
    }

    /* renamed from: isFinite-k-4lQ0M, reason: not valid java name */
    public static final boolean m7997isFinitek4lQ0M(long j2) {
        return ((((j2 & InlineClassHelperKt.DualFloatInfinityBase) ^ InlineClassHelperKt.DualFloatInfinityBase) + (-4294967297L)) & (-9223372034707292160L)) == 0;
    }

    /* renamed from: isSpecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m7999isSpecifiedk4lQ0M(long j2) {
        return (j2 & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isUnspecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m8001isUnspecifiedk4lQ0M(long j2) {
        return (j2 & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: lerp-Wko1d7g, reason: not valid java name */
    public static final long m8003lerpWko1d7g(long j2, long j3, float f2) {
        float fLerp = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 >> 32)), f2);
        float fLerp2 = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), f2);
        return (Float.floatToRawIntBits(fLerp) << 32) | (Float.floatToRawIntBits(fLerp2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: takeOrElse-3MmeM6k, reason: not valid java name */
    public static final long m8004takeOrElse3MmeM6k(long j2, a<Offset> aVar) {
        return (9223372034707292159L & j2) != InlineClassHelperKt.UnspecifiedPackedFloats ? j2 : aVar.invoke().m7990unboximpl();
    }

    /* renamed from: isFinite-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m7998isFinitek4lQ0M$annotations(long j2) {
    }

    /* renamed from: isSpecified-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m8000isSpecifiedk4lQ0M$annotations(long j2) {
    }

    /* renamed from: isUnspecified-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m8002isUnspecifiedk4lQ0M$annotations(long j2) {
    }
}
