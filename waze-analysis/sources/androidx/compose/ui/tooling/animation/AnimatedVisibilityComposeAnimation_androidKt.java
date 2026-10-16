package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AnimatedVisibilityComposeAnimation_androidKt {
    public static final AnimatedVisibilityComposeAnimation parseAnimatedVisibility(Transition<Boolean> transition) {
        String label = transition.getLabel();
        if (label == null) {
            label = "AnimatedVisibility";
        }
        return new AnimatedVisibilityComposeAnimation(transition, label);
    }
}
