package androidx.compose.ui.node;

import h.ab;
import h.g.a.l;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ObserverNodeOwnerScope implements OwnerScope {
    private final ObserverModifierNode observerNode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final l<ObserverNodeOwnerScope, ab> OnObserveReadsChanged = ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1.INSTANCE;

    public ObserverNodeOwnerScope(ObserverModifierNode observerModifierNode) {
        this.observerNode = observerModifierNode;
    }

    public final ObserverModifierNode getObserverNode$ui() {
        return this.observerNode;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.observerNode.getNode().isAttached();
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final l<ObserverNodeOwnerScope, ab> getOnObserveReadsChanged$ui() {
            return ObserverNodeOwnerScope.OnObserveReadsChanged;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
