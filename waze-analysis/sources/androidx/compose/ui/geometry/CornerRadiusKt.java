package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CornerRadiusKt {
    public static final long CornerRadius(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static /* synthetic */ long CornerRadius$default(float f2, float f3, int i2, Object obj) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f2);
        if ((i2 & 2) == 0) {
            f2 = f3;
        }
        return (Float.floatToRawIntBits(f2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits << 32);
    }

    /* renamed from: lerp-3Ry4LBc, reason: not valid java name */
    public static final long m7953lerp3Ry4LBc(long j2, long j3, float f2) {
        float fLerp = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 >> 32)), f2);
        float fLerp2 = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), f2);
        return (Float.floatToRawIntBits(fLerp) << 32) | (Float.floatToRawIntBits(fLerp2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }
}
