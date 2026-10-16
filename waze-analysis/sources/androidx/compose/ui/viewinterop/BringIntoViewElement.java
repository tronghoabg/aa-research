package androidx.compose.ui.viewinterop;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class BringIntoViewElement extends ModifierNodeElement<BringIntoViewNode> {
    private final l<l<? super Rect, ab>, ab> onRequesterReady;

    /* JADX WARN: Multi-variable type inference failed */
    public BringIntoViewElement(l<? super l<? super Rect, ab>, ab> lVar) {
        this.onRequesterReady = lVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public BringIntoViewNode create() {
        return new BringIntoViewNode(this.onRequesterReady);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof BringIntoViewElement) && this.onRequesterReady == ((BringIntoViewElement) obj).onRequesterReady;
        }
        return true;
    }

    public final l<l<? super Rect, ab>, ab> getOnRequesterReady() {
        return this.onRequesterReady;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onRequesterReady.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("requestRectangleBringIntoViewBridge");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(BringIntoViewNode bringIntoViewNode) {
        bringIntoViewNode.update(this.onRequesterReady);
    }
}
