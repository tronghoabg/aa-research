package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BasicMarqueeKt {
    /* renamed from: MarqueeSpacing-0680j_4, reason: not valid java name */
    public static final MarqueeSpacing m1975MarqueeSpacing0680j_4(final float f2) {
        return new MarqueeSpacing() { // from class: androidx.compose.foundation.BasicMarqueeKt$$ExternalSyntheticLambda0
            @Override // androidx.compose.foundation.MarqueeSpacing
            public final int calculateSpacing(Density density, int i2, int i3) {
                return density.mo2121roundToPx0680j_4(f2);
            }
        };
    }

    /* renamed from: basicMarquee-1Mj1MLw, reason: not valid java name */
    public static final Modifier m1977basicMarquee1Mj1MLw(Modifier modifier, int i2, int i3, int i4, int i5, MarqueeSpacing marqueeSpacing, float f2) {
        return modifier.then(new MarqueeModifierElement(i2, i3, i4, i5, marqueeSpacing, f2, null));
    }

    /* renamed from: basicMarquee-1Mj1MLw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1978basicMarquee1Mj1MLw$default(Modifier modifier, int i2, int i3, int i4, int i5, MarqueeSpacing marqueeSpacing, float f2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = MarqueeDefaults.INSTANCE.getIterations();
        }
        if ((i6 & 2) != 0) {
            i3 = MarqueeAnimationMode.Companion.m2058getImmediatelyZbEOnfQ();
        }
        if ((i6 & 4) != 0) {
            i4 = MarqueeDefaults.INSTANCE.getRepeatDelayMillis();
        }
        if ((i6 & 8) != 0) {
            i5 = true != MarqueeAnimationMode.m2054equalsimpl0(i3, MarqueeAnimationMode.Companion.m2058getImmediatelyZbEOnfQ()) ? 0 : i4;
        }
        if ((i6 & 16) != 0) {
            marqueeSpacing = MarqueeDefaults.INSTANCE.getSpacing();
        }
        if ((i6 & 32) != 0) {
            f2 = MarqueeDefaults.INSTANCE.m2060getVelocityD9Ej5fM();
        }
        return m1977basicMarquee1Mj1MLw(modifier, i2, i3, i4, i5, marqueeSpacing, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createMarqueeAnimationSpec-Z4HSEVQ, reason: not valid java name */
    public static final AnimationSpec<Float> m1979createMarqueeAnimationSpecZ4HSEVQ(int i2, float f2, int i3, int i4, float f3, Density density) {
        TweenSpec<Float> tweenSpecVelocityBasedTween = velocityBasedTween(Math.abs(density.mo2127toPx0680j_4(f3)), f2, i4);
        long jM1911constructorimpl$default = StartOffset.m1911constructorimpl$default((-i4) + i3, 0, 2, null);
        return i2 == Integer.MAX_VALUE ? AnimationSpecKt.m1878infiniteRepeatable9IiC70o$default(tweenSpecVelocityBasedTween, null, jM1911constructorimpl$default, 2, null) : AnimationSpecKt.m1880repeatable91I0pcU$default(i2, tweenSpecVelocityBasedTween, null, jM1911constructorimpl$default, 4, null);
    }

    private static final TweenSpec<Float> velocityBasedTween(float f2, float f3, int i2) {
        return AnimationSpecKt.tween((int) Math.ceil(f3 / (f2 / 1000.0f)), i2, EasingKt.getLinearEasing());
    }
}
