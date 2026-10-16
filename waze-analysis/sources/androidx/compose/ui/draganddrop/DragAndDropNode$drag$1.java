package androidx.compose.ui.draganddrop;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class DragAndDropNode$drag$1 extends y implements p<DragAndDropStartTransferScope, Offset, ab> {
    final /* synthetic */ long $decorationSize;
    final /* synthetic */ l<DrawScope, ab> $drawDragDecoration;
    final /* synthetic */ DragAndDropTransferData $transferData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DragAndDropNode$drag$1(DragAndDropTransferData dragAndDropTransferData, long j2, l<? super DrawScope, ab> lVar) {
        super(2);
        this.$transferData = dragAndDropTransferData;
        this.$decorationSize = j2;
        this.$drawDragDecoration = lVar;
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ ab invoke(DragAndDropStartTransferScope dragAndDropStartTransferScope, Offset offset) {
        m7736invokeUv8p0NA(dragAndDropStartTransferScope, offset.m7990unboximpl());
        return ab.f48028a;
    }

    /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
    public final void m7736invokeUv8p0NA(DragAndDropStartTransferScope dragAndDropStartTransferScope, long j2) {
        dragAndDropStartTransferScope.mo7730startDragAndDropTransfer12SF9DM(this.$transferData, this.$decorationSize, this.$drawDragDecoration);
    }
}
