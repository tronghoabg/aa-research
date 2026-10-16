package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import h.ab;
import h.g.a.a;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ObserverModifierNodeKt {
    public static final <T extends Modifier.Node & ObserverModifierNode> void observeReads(T t, a<ab> aVar) {
        ObserverNodeOwnerScope ownerScope$ui = t.getOwnerScope$ui();
        if (ownerScope$ui == null) {
            ownerScope$ui = new ObserverNodeOwnerScope(t);
            t.setOwnerScope$ui(ownerScope$ui);
        }
        OwnerSnapshotObserver snapshotObserver = DelegatableNodeKt.requireOwner(t).getSnapshotObserver();
        l<ObserverNodeOwnerScope, ab> onObserveReadsChanged$ui = ObserverNodeOwnerScope.Companion.getOnObserveReadsChanged$ui();
        snapshotObserver.observer.observeReads(ownerScope$ui, onObserveReadsChanged$ui, aVar);
    }
}
