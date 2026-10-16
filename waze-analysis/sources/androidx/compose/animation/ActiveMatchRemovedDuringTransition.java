package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionStateMachine;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Rect;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ActiveMatchRemovedDuringTransition extends MatchIsOrHasBeenConfigured {
    public static final int $stable = 8;
    private boolean alternativeTargetConfigured;
    private final MutableState currentBounds$delegate;
    private final TargetData targetData;

    public ActiveMatchRemovedDuringTransition(TargetData targetData, Rect rect) {
        this.targetData = targetData;
        this.currentBounds$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(rect, null, 2, null);
    }

    private void setCurrentBounds(Rect rect) {
        this.currentBounds$delegate.setValue(rect);
    }

    public final boolean getAlternativeTargetConfigured() {
        return this.alternativeTargetConfigured;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.animation.MatchIsOrHasBeenConfigured, androidx.compose.animation.SharedTransitionStateMachine.State
    public Rect getCurrentBounds() {
        return (Rect) this.currentBounds$delegate.getValue();
    }

    @Override // androidx.compose.animation.MatchIsOrHasBeenConfigured, androidx.compose.animation.SharedTransitionStateMachine.State
    public TargetData getTargetData() {
        return this.targetData;
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public SharedTransitionStateMachine.State onMatchFound(BoundsProvider boundsProvider) {
        return new ActiveMatchFoundConfigPending(boundsProvider, getTargetData(), getCurrentBounds());
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public SharedTransitionStateMachine.State onVisibleContentRemovedDuringTransition() {
        return this;
    }

    public final void setAlternativeTargetConfigured(boolean z) {
        this.alternativeTargetConfigured = z;
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public void updateBounds(Rect rect) {
        setCurrentBounds(rect);
    }
}
