package androidx.compose.material3.internal.ripple;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Density;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RippleAnimationKt {
    private static final float BoundedRippleExtraRadius = 10.0f;
    private static final int FadeInDuration = 75;
    private static final int FadeOutDuration = 150;
    private static final int RadiusDuration = 225;

    /* renamed from: getRippleEndRadius-cSwnlzA, reason: not valid java name */
    public static final float m6397getRippleEndRadiuscSwnlzA(Density density, boolean z, long j2) {
        int i2 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fM7978getDistanceimpl = Offset.m7978getDistanceimpl((Float.floatToRawIntBits(Float.intBitsToFloat(i2)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)) / 2.0f;
        return z ? fM7978getDistanceimpl + density.mo2127toPx0680j_4(BoundedRippleExtraRadius) : fM7978getDistanceimpl;
    }

    /* renamed from: getRippleStartRadius-uvyYCjk, reason: not valid java name */
    public static final float m6398getRippleStartRadiusuvyYCjk(long j2) {
        return Math.max(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2))) * 0.3f;
    }
}
