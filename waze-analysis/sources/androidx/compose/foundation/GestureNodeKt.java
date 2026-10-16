package androidx.compose.foundation;

import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class GestureNodeKt {
    public static final DelegatableNode gestureNode(GestureConnection gestureConnection) {
        return new GestureNode(gestureConnection);
    }

    public static final void traverseAncestorGestures(DelegatableNode delegatableNode, final l<? super GestureConnection, Boolean> lVar) {
        TraversableNodeKt.traverseAncestors(delegatableNode, GestureNode.TraverseKey, new l() { // from class: androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(GestureNodeKt.traverseAncestorGestures$lambda$0(lVar, (TraversableNode) obj));
            }
        });
    }

    static final boolean traverseAncestorGestures$lambda$0(l lVar, TraversableNode traversableNode) {
        if (!(traversableNode instanceof GestureNode)) {
            throw new IllegalStateException("Node is not a GestureNode instance");
        }
        GestureConnection gestureConnection = ((GestureNode) traversableNode).getGestureConnection();
        if (true != (gestureConnection instanceof GestureConnection)) {
            gestureConnection = null;
        }
        if (gestureConnection == null) {
            return true;
        }
        return ((Boolean) lVar.invoke(gestureConnection)).booleanValue();
    }

    public static final void traverseChildrenGestures(DelegatableNode delegatableNode, final l<? super GestureConnection, Boolean> lVar) {
        TraversableNodeKt.traverseChildren(delegatableNode, GestureNode.TraverseKey, new l() { // from class: androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(GestureNodeKt.traverseChildrenGestures$lambda$0(lVar, (TraversableNode) obj));
            }
        });
    }

    static final boolean traverseChildrenGestures$lambda$0(l lVar, TraversableNode traversableNode) {
        if (!(traversableNode instanceof GestureNode)) {
            throw new IllegalStateException("Node is not a GestureNode instance");
        }
        GestureConnection gestureConnection = ((GestureNode) traversableNode).getGestureConnection();
        if (true != (gestureConnection instanceof GestureConnection)) {
            gestureConnection = null;
        }
        if (gestureConnection == null) {
            return true;
        }
        return ((Boolean) lVar.invoke(gestureConnection)).booleanValue();
    }
}
