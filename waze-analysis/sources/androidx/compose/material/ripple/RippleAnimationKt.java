package androidx.compose.material.ripple;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RippleAnimationKt {
    private static final float BoundedRippleExtraRadius = 10.0f;
    private static final int FadeInDuration = 75;
    private static final int FadeOutDuration = 150;
    private static final int RadiusDuration = 225;

    /* renamed from: getRippleEndRadius-cSwnlzA, reason: not valid java name */
    public static final float m4305getRippleEndRadiuscSwnlzA(Density density, boolean z, long j2) {
        float fM7978getDistanceimpl = Offset.m7978getDistanceimpl(OffsetKt.Offset(Size.m8049getWidthimpl(j2), Size.m8046getHeightimpl(j2))) / 2.0f;
        return z ? fM7978getDistanceimpl + density.mo2127toPx0680j_4(BoundedRippleExtraRadius) : fM7978getDistanceimpl;
    }

    /* renamed from: getRippleStartRadius-uvyYCjk, reason: not valid java name */
    public static final float m4306getRippleStartRadiusuvyYCjk(long j2) {
        return Math.max(Size.m8049getWidthimpl(j2), Size.m8046getHeightimpl(j2)) * 0.3f;
    }
}
