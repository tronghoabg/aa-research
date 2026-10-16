package androidx.compose.runtime.retain;

import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class RetainedEffectImpl implements RetainObserver {
    private final l<RetainedEffectScope, RetainedEffectResult> effect;
    private RetainedEffectResult onRetire;

    /* JADX WARN: Multi-variable type inference failed */
    public RetainedEffectImpl(l<? super RetainedEffectScope, ? extends RetainedEffectResult> lVar) {
        this.effect = lVar;
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public void onRetained() {
        this.onRetire = this.effect.invoke(RetainedEffectKt.InternalRetainedEffectScope);
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public void onRetired() {
        RetainedEffectResult retainedEffectResult = this.onRetire;
        if (retainedEffectResult != null) {
            retainedEffectResult.retire();
        }
        this.onRetire = null;
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public void onEnteredComposition() {
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public void onExitedComposition() {
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public void onUnused() {
    }
}
