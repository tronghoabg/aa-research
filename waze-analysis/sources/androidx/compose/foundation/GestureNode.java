package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.TraversableNode;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class GestureNode extends Modifier.Node implements TraversableNode, DelegatableNode {
    public static final TraverseKey TraverseKey = new TraverseKey(null);
    private final GestureConnection gestureConnection;

    public GestureNode(GestureConnection gestureConnection) {
        this.gestureConnection = gestureConnection;
    }

    public final GestureConnection getGestureConnection() {
        return this.gestureConnection;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return TraverseKey;
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
