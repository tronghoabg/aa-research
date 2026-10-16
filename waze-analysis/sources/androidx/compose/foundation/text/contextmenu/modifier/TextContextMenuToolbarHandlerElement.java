package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.ab;
import h.c.e;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextContextMenuToolbarHandlerElement extends ModifierNodeElement<TextContextMenuToolbarHandlerNode> {
    private final l<LayoutCoordinates, Rect> computeContentBounds;
    private final l<e<? super ab>, Object> onHide;
    private final l<e<? super ab>, Object> onShow;
    private final ToolbarRequester requester;

    /* JADX WARN: Multi-variable type inference failed */
    public TextContextMenuToolbarHandlerElement(ToolbarRequester toolbarRequester, l<? super e<? super ab>, ? extends Object> lVar, l<? super e<? super ab>, ? extends Object> lVar2, l<? super LayoutCoordinates, Rect> lVar3) {
        this.requester = toolbarRequester;
        this.onShow = lVar;
        this.onHide = lVar2;
        this.computeContentBounds = lVar3;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TextContextMenuToolbarHandlerNode create() {
        return new TextContextMenuToolbarHandlerNode(this.requester, this.onShow, this.onHide, this.computeContentBounds);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextContextMenuToolbarHandlerElement)) {
            return false;
        }
        TextContextMenuToolbarHandlerElement textContextMenuToolbarHandlerElement = (TextContextMenuToolbarHandlerElement) obj;
        return this.requester == textContextMenuToolbarHandlerElement.requester && this.onShow == textContextMenuToolbarHandlerElement.onShow && this.onHide == textContextMenuToolbarHandlerElement.onHide && this.computeContentBounds == textContextMenuToolbarHandlerElement.computeContentBounds;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = this.requester.hashCode() * 31;
        l<e<? super ab>, Object> lVar = this.onShow;
        int iHashCode2 = (iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31;
        l<e<? super ab>, Object> lVar2 = this.onHide;
        return ((iHashCode2 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31) + this.computeContentBounds.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode) {
        textContextMenuToolbarHandlerNode.update(this.requester);
        textContextMenuToolbarHandlerNode.setOnShow(this.onShow);
        textContextMenuToolbarHandlerNode.setOnHide(this.onHide);
        textContextMenuToolbarHandlerNode.setComputeContentBounds(this.computeContentBounds);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }
}
