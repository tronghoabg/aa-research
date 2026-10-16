package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.ab;
import h.c.e;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DragAndDropSourceElement extends ModifierNodeElement<DragAndDropSourceNode> {
    private final p<DragAndDropStartDetectorScope, e<? super ab>, Object> detectDragStart;
    private final l<DrawScope, ab> drawDragDecoration;
    private final l<Offset, DragAndDropTransferData> transferData;

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropSourceElement(l<? super DrawScope, ab> lVar, p<? super DragAndDropStartDetectorScope, ? super e<? super ab>, ? extends Object> pVar, l<? super Offset, DragAndDropTransferData> lVar2) {
        this.drawDragDecoration = lVar;
        this.detectDragStart = pVar;
        this.transferData = lVar2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public DragAndDropSourceNode create() {
        return new DragAndDropSourceNode(this.drawDragDecoration, this.detectDragStart, this.transferData);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DragAndDropSourceElement)) {
            return false;
        }
        DragAndDropSourceElement dragAndDropSourceElement = (DragAndDropSourceElement) obj;
        return this.drawDragDecoration == dragAndDropSourceElement.drawDragDecoration && this.detectDragStart == dragAndDropSourceElement.detectDragStart && this.transferData == dragAndDropSourceElement.transferData;
    }

    public final p<DragAndDropStartDetectorScope, e<? super ab>, Object> getDetectDragStart() {
        return this.detectDragStart;
    }

    public final l<DrawScope, ab> getDrawDragDecoration() {
        return this.drawDragDecoration;
    }

    public final l<Offset, DragAndDropTransferData> getTransferData() {
        return this.transferData;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.drawDragDecoration.hashCode() * 31) + this.detectDragStart.hashCode()) * 31) + this.transferData.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dragSource");
        inspectorInfo.getProperties().set("drawDragDecoration", this.drawDragDecoration);
        inspectorInfo.getProperties().set("detectDragStart", this.detectDragStart);
        inspectorInfo.getProperties().set("transferData", this.transferData);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(DragAndDropSourceNode dragAndDropSourceNode) {
        dragAndDropSourceNode.setDrawDragDecoration(this.drawDragDecoration);
        dragAndDropSourceNode.setDetectDragStart(this.detectDragStart);
        dragAndDropSourceNode.setTransferData(this.transferData);
    }
}
