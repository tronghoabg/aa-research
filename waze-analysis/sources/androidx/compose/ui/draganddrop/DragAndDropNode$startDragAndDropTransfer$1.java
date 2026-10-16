package androidx.compose.ui.draganddrop;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.unit.IntSizeKt;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class DragAndDropNode$startDragAndDropTransfer$1 extends y implements l<DragAndDropNode, TraversableNode.Companion.TraverseDescendantsAction> {
    final /* synthetic */ a<Boolean> $isTransferStarted;
    final /* synthetic */ LayoutCoordinates $nodeCoordinates;
    final /* synthetic */ long $offset;
    final /* synthetic */ DragAndDropStartTransferScope $this_startDragAndDropTransfer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragAndDropNode$startDragAndDropTransfer$1(long j2, LayoutCoordinates layoutCoordinates, DragAndDropStartTransferScope dragAndDropStartTransferScope, a<Boolean> aVar) {
        super(1);
        this.$offset = j2;
        this.$nodeCoordinates = layoutCoordinates;
        this.$this_startDragAndDropTransfer = dragAndDropStartTransferScope;
        this.$isTransferStarted = aVar;
    }

    @Override // h.g.a.l
    public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
        if (!dragAndDropNode.isAttached()) {
            return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
        }
        p pVar = dragAndDropNode.onStartTransfer;
        if (pVar == null) {
            return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
        }
        if (Offset.m7977equalsimpl0(this.$offset, Offset.Companion.m7995getUnspecifiedF1C5BW0())) {
            pVar.invoke(this.$this_startDragAndDropTransfer, Offset.m7969boximpl(Offset.Companion.m7995getUnspecifiedF1C5BW0()));
        } else {
            long jMo9744localPositionOfR5De75A = DelegatableNodeKt.requireLayoutNode(dragAndDropNode).getCoordinates().mo9744localPositionOfR5De75A(this.$nodeCoordinates, this.$offset);
            if (!SizeKt.m8070toRectuvyYCjk(IntSizeKt.m11351toSizeozmzZPI(dragAndDropNode.m7732getSizeYbymL2g$ui())).m8006containsk4lQ0M(jMo9744localPositionOfR5De75A)) {
                return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
            }
            pVar.invoke(this.$this_startDragAndDropTransfer, Offset.m7969boximpl(jMo9744localPositionOfR5De75A));
        }
        return this.$isTransferStarted.invoke().booleanValue() ? TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal : TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
    }
}
