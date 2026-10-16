package androidx.compose.runtime;

import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DisposableEffectImpl implements RememberObserver {
    private final l<DisposableEffectScope, DisposableEffectResult> effect;
    private DisposableEffectResult onDispose;

    /* JADX WARN: Multi-variable type inference failed */
    public DisposableEffectImpl(l<? super DisposableEffectScope, ? extends DisposableEffectResult> lVar) {
        this.effect = lVar;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        DisposableEffectResult disposableEffectResult = this.onDispose;
        if (disposableEffectResult != null) {
            disposableEffectResult.dispose();
        }
        this.onDispose = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.onDispose = this.effect.invoke(EffectsKt.InternalDisposableEffectScope);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }
}
