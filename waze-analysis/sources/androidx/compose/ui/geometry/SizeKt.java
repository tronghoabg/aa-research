package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.muxer.MuxerUtil;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SizeKt {
    public static final long Size(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(f2) << 32);
    }

    /* renamed from: getCenter-uvyYCjk, reason: not valid java name */
    public static final long m8059getCenteruvyYCjk(long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) / 2.0f;
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* renamed from: isSpecified-uvyYCjk, reason: not valid java name */
    public static final boolean m8061isSpecifieduvyYCjk(long j2) {
        return j2 != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isUnspecified-uvyYCjk, reason: not valid java name */
    public static final boolean m8063isUnspecifieduvyYCjk(long j2) {
        return j2 == InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: lerp-VgWVRYQ, reason: not valid java name */
    public static final long m8065lerpVgWVRYQ(long j2, long j3, float f2) {
        float fLerp = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 >> 32)), f2);
        float fLerp2 = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), f2);
        return (Float.floatToRawIntBits(fLerp) << 32) | (Float.floatToRawIntBits(fLerp2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: takeOrElse-TmRCtEA, reason: not valid java name */
    public static final long m8066takeOrElseTmRCtEA(long j2, a<Size> aVar) {
        return j2 != InlineClassHelperKt.UnspecifiedPackedFloats ? j2 : aVar.invoke().m8054unboximpl();
    }

    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m8067timesd16Qtg0(double d2, long j2) {
        return Size.m8052times7Ah8Wj8(j2, (float) d2);
    }

    /* renamed from: toRect-uvyYCjk, reason: not valid java name */
    public static final Rect m8070toRectuvyYCjk(long j2) {
        return RectKt.m8020Recttz77jQw(Offset.Companion.m7996getZeroF1C5BW0(), j2);
    }

    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m8068timesd16Qtg0(float f2, long j2) {
        return Size.m8052times7Ah8Wj8(j2, f2);
    }

    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m8069timesd16Qtg0(int i2, long j2) {
        return Size.m8052times7Ah8Wj8(j2, i2);
    }

    /* renamed from: getCenter-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m8060getCenteruvyYCjk$annotations(long j2) {
    }

    /* renamed from: isSpecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m8062isSpecifieduvyYCjk$annotations(long j2) {
    }

    /* renamed from: isUnspecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m8064isUnspecifieduvyYCjk$annotations(long j2) {
    }
}
