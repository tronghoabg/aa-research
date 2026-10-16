package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.ui.unit.Dp;
import h.ab;
import h.c.a.a;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ElevationKt {
    private static final TweenSpec<Dp> DefaultIncomingSpec = new TweenSpec<>(120, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    private static final TweenSpec<Dp> DefaultOutgoingSpec = new TweenSpec<>(150, 0, new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f), 2, null);
    private static final TweenSpec<Dp> HoveredOutgoingSpec = new TweenSpec<>(120, 0, new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    /* renamed from: animateElevation-rAjV9yQ, reason: not valid java name */
    public static final Object m4078animateElevationrAjV9yQ(Animatable<Dp, ?> animatable, float f2, Interaction interaction, Interaction interaction2, e<? super ab> eVar) {
        AnimationSpec<Dp> animationSpecIncomingAnimationSpecForInteraction = interaction2 != null ? ElevationDefaults.INSTANCE.incomingAnimationSpecForInteraction(interaction2) : interaction != null ? ElevationDefaults.INSTANCE.outgoingAnimationSpecForInteraction(interaction) : null;
        if (animationSpecIncomingAnimationSpecForInteraction != null) {
            Object objAnimateTo$default = Animatable.animateTo$default(animatable, Dp.m11162boximpl(f2), animationSpecIncomingAnimationSpecForInteraction, null, null, eVar, 12, null);
            if (objAnimateTo$default == a.f48038a) {
                return objAnimateTo$default;
            }
        } else {
            Object objSnapTo = animatable.snapTo(Dp.m11162boximpl(f2), eVar);
            if (objSnapTo == a.f48038a) {
                return objSnapTo;
            }
        }
        return ab.f48028a;
    }

    /* renamed from: animateElevation-rAjV9yQ$default, reason: not valid java name */
    public static /* synthetic */ Object m4079animateElevationrAjV9yQ$default(Animatable animatable, float f2, Interaction interaction, Interaction interaction2, e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            interaction = null;
        }
        if ((i2 & 4) != 0) {
            interaction2 = null;
        }
        return m4078animateElevationrAjV9yQ(animatable, f2, interaction, interaction2, eVar);
    }
}
