package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import h.ab;
import h.g.a.l;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FocusedBoundsObserverNode extends Modifier.Node implements TraversableNode {
    private l<? super LayoutCoordinates, ab> onPositioned;
    private final Object traverseKey = TraverseKey;
    public static final TraverseKey TraverseKey = new TraverseKey(null);
    public static final int $stable = 8;

    public FocusedBoundsObserverNode(l<? super LayoutCoordinates, ab> lVar) {
        this.onPositioned = lVar;
    }

    public final l<LayoutCoordinates, ab> getOnPositioned() {
        return this.onPositioned;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    public final void onFocusBoundsChanged(LayoutCoordinates layoutCoordinates) {
        this.onPositioned.invoke(layoutCoordinates);
        FocusedBoundsObserverNode focusedBoundsObserverNode = (FocusedBoundsObserverNode) TraversableNodeKt.findNearestAncestor(this);
        if (focusedBoundsObserverNode != null) {
            focusedBoundsObserverNode.onFocusBoundsChanged(layoutCoordinates);
        }
    }

    public final void setOnPositioned(l<? super LayoutCoordinates, ab> lVar) {
        this.onPositioned = lVar;
    }

    /* compiled from: WazeSource */
    public final class TraverseKey {
        private TraverseKey() {
        }

        public /* synthetic */ TraverseKey(o oVar) {
            this();
        }
    }
}
