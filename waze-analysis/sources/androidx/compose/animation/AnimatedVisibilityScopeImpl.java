package androidx.compose.animation;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntSize;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AnimatedVisibilityScopeImpl implements AnimatedVisibilityScope {
    public static final int $stable = 8;
    private Transition<EnterExitState> transition;
    private final MutableState<IntSize> targetSize = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m11331boximpl(IntSize.Companion.m11344getZeroYbymL2g()), null, 2, null);
    private final SharedMutableTransformState sharedMutableTransformState = new SharedMutableTransformState();

    public AnimatedVisibilityScopeImpl(Transition<EnterExitState> transition) {
        this.transition = transition;
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    public /* synthetic */ Modifier animateEnterExit(Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str) {
        return AnimatedVisibilityScope.CC.$default$animateEnterExit(this, modifier, enterTransition, exitTransition, str);
    }

    public final SharedMutableTransformState getSharedMutableTransformState$animation() {
        return this.sharedMutableTransformState;
    }

    public final MutableState<IntSize> getTargetSize$animation() {
        return this.targetSize;
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    public Transition<EnterExitState> getTransition() {
        return this.transition;
    }

    public void setTransition(Transition<EnterExitState> transition) {
        this.transition = transition;
    }
}
