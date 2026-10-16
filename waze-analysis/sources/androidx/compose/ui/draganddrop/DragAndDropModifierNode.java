package androidx.compose.ui.draganddrop;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DelegatableNode;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface DragAndDropModifierNode extends DelegatableNode, DragAndDropTarget {
    boolean acceptDragAndDropTransfer(DragAndDropEvent dragAndDropEvent);

    /* renamed from: drag-12SF9DM, reason: not valid java name */
    void mo7731drag12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j2, l<? super DrawScope, ab> lVar);
}
