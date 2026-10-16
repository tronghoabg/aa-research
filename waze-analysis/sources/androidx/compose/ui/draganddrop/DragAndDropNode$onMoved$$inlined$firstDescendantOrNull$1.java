package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.TraversableNode;
import h.g.a.l;
import h.g.b.aq;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1 extends y implements l<DragAndDropNode, TraversableNode.Companion.TraverseDescendantsAction> {
    final /* synthetic */ DragAndDropEvent $event$inlined;
    final /* synthetic */ aq $match;
    final /* synthetic */ DragAndDropNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1(aq aqVar, DragAndDropNode dragAndDropNode, DragAndDropEvent dragAndDropEvent) {
        super(1);
        this.$match = aqVar;
        this.this$0 = dragAndDropNode;
        this.$event$inlined = dragAndDropEvent;
    }

    @Override // h.g.a.l
    public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
        DragAndDropNode dragAndDropNode2 = dragAndDropNode;
        if (!this.this$0.getDragAndDropManager().isInterestedTarget(dragAndDropNode2) || !DragAndDropNodeKt.m7738containsUv8p0NA(dragAndDropNode2, DragAndDrop_androidKt.getPositionInRoot(this.$event$inlined))) {
            return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
        }
        this.$match.f48105a = dragAndDropNode;
        return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
    }
}
