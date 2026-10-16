package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimation;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface TransitionBasedAnimation<T> extends ComposeAnimation {
    @Override // androidx.compose.animation.tooling.ComposeAnimation
    Transition<T> getAnimationObject();
}
