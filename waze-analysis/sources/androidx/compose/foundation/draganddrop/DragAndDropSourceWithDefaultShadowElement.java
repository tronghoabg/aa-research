package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.ab;
import h.c.e;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DragAndDropSourceWithDefaultShadowElement extends ModifierNodeElement<DragSourceNodeWithDefaultPainter> {
    private p<? super DragAndDropStartDetectorScope, ? super e<? super ab>, ? extends Object> detectDragStart;
    private l<? super Offset, DragAndDropTransferData> transferData;

    public DragAndDropSourceWithDefaultShadowElement(p<? super DragAndDropStartDetectorScope, ? super e<? super ab>, ? extends Object> pVar, l<? super Offset, DragAndDropTransferData> lVar) {
        this.detectDragStart = pVar;
        this.transferData = lVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public DragSourceNodeWithDefaultPainter create() {
        return new DragSourceNodeWithDefaultPainter(this.detectDragStart, this.transferData);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DragAndDropSourceWithDefaultShadowElement)) {
            return false;
        }
        DragAndDropSourceWithDefaultShadowElement dragAndDropSourceWithDefaultShadowElement = (DragAndDropSourceWithDefaultShadowElement) obj;
        return this.detectDragStart == dragAndDropSourceWithDefaultShadowElement.detectDragStart && this.transferData == dragAndDropSourceWithDefaultShadowElement.transferData;
    }

    public final p<DragAndDropStartDetectorScope, e<? super ab>, Object> getDetectDragStart() {
        return this.detectDragStart;
    }

    public final l<Offset, DragAndDropTransferData> getTransferData() {
        return this.transferData;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.detectDragStart.hashCode() * 31) + this.transferData.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dragSourceWithDefaultPainter");
        inspectorInfo.getProperties().set("detectDragStart", this.detectDragStart);
        inspectorInfo.getProperties().set("transferData", this.transferData);
    }

    public final void setDetectDragStart(p<? super DragAndDropStartDetectorScope, ? super e<? super ab>, ? extends Object> pVar) {
        this.detectDragStart = pVar;
    }

    public final void setTransferData(l<? super Offset, DragAndDropTransferData> lVar) {
        this.transferData = lVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(DragSourceNodeWithDefaultPainter dragSourceNodeWithDefaultPainter) {
        dragSourceNodeWithDefaultPainter.setDetectDragStart(this.detectDragStart);
        dragSourceNodeWithDefaultPainter.setTransferData(this.transferData);
    }
}
