package androidx.compose.runtime;

import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CompositionScopedCoroutineScopeCanceller implements RememberObserver {
    public static final int $stable = 8;
    private final af coroutineScope;

    public CompositionScopedCoroutineScopeCanceller(af afVar) {
        this.coroutineScope = afVar;
    }

    public final af getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        af afVar = this.coroutineScope;
        if (afVar instanceof RememberedCoroutineScope) {
            ((RememberedCoroutineScope) afVar).cancelIfCreated();
        } else {
            aj.h(afVar, new LeftCompositionCancellationException());
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        af afVar = this.coroutineScope;
        if (afVar instanceof RememberedCoroutineScope) {
            ((RememberedCoroutineScope) afVar).cancelIfCreated();
        } else {
            aj.h(afVar, new LeftCompositionCancellationException());
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}
