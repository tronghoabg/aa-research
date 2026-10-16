package androidx.compose.material3.internal;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ParentSemanticsNode extends Modifier.Node implements TraversableNode, SemanticsModifierNode {
    public static final int $stable = 8;
    private l<? super SemanticsPropertyReceiver, ab> properties;
    private boolean semanticsConsumed;
    private final Object traverseKey = ParentSemanticsNodeKey.INSTANCE;

    public ParentSemanticsNode(l<? super SemanticsPropertyReceiver, ab> lVar) {
        this.properties = lVar;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (this.semanticsConsumed) {
            return;
        }
        this.properties.invoke(semanticsPropertyReceiver);
    }

    public final l<SemanticsPropertyReceiver, ab> getProperties() {
        return this.properties;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldClearDescendantSemantics() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean isImportantForBounds() {
        return true;
    }

    public final void obtainSemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.semanticsConsumed = true;
        this.properties.invoke(semanticsPropertyReceiver);
        SemanticsModifierNodeKt.invalidateSemantics(this);
    }

    public final void releaseSemantics() {
        this.semanticsConsumed = false;
        SemanticsModifierNodeKt.invalidateSemantics(this);
    }

    public final void setProperties(l<? super SemanticsPropertyReceiver, ab> lVar) {
        this.properties = lVar;
    }
}
