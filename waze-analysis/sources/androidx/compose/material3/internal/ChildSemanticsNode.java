package androidx.compose.material3.internal;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ChildSemanticsNode extends Modifier.Node implements SemanticsModifierNode {
    public static final int $stable = 8;
    private l<? super SemanticsPropertyReceiver, ab> properties;

    public ChildSemanticsNode(l<? super SemanticsPropertyReceiver, ab> lVar) {
        this.properties = lVar;
    }

    static final boolean applySemantics$lambda$0(SemanticsPropertyReceiver semanticsPropertyReceiver, TraversableNode traversableNode) {
        x.d(traversableNode, "null cannot be cast to non-null type androidx.compose.material3.internal.ParentSemanticsNode");
        ((ParentSemanticsNode) traversableNode).obtainSemantics(semanticsPropertyReceiver);
        return false;
    }

    static final boolean onDetach$lambda$0(TraversableNode traversableNode) {
        x.d(traversableNode, "null cannot be cast to non-null type androidx.compose.material3.internal.ParentSemanticsNode");
        ((ParentSemanticsNode) traversableNode).releaseSemantics();
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(final SemanticsPropertyReceiver semanticsPropertyReceiver) {
        TraversableNodeKt.traverseAncestors(this, ParentSemanticsNodeKey.INSTANCE, new l() { // from class: androidx.compose.material3.internal.ChildSemanticsNode$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                ChildSemanticsNode.applySemantics$lambda$0(semanticsPropertyReceiver, (TraversableNode) obj);
                return false;
            }
        });
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
    public /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean isImportantForBounds() {
        return true;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        TraversableNodeKt.traverseAncestors(this, ParentSemanticsNodeKey.INSTANCE, new l() { // from class: androidx.compose.material3.internal.ChildSemanticsNode$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                ChildSemanticsNode.onDetach$lambda$0((TraversableNode) obj);
                return false;
            }
        });
    }

    public final void setProperties(l<? super SemanticsPropertyReceiver, ab> lVar) {
        this.properties = lVar;
    }
}
