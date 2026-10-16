package androidx.compose.runtime.retain;

import h.ab;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RetainedEffectScope {
    public static final int $stable = 0;

    public final RetainedEffectResult onRetire(final a<ab> aVar) {
        return new RetainedEffectResult() { // from class: androidx.compose.runtime.retain.RetainedEffectScope.onRetire.1
            @Override // androidx.compose.runtime.retain.RetainedEffectResult
            public void retire() {
                aVar.invoke();
            }
        };
    }
}
