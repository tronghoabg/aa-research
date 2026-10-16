package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ConsumedInsetsModifierElement extends ModifierNodeElement<ConsumedInsetsModifierNode> {
    private final l<WindowInsets, ab> block;
    private final l<InspectorInfo, ab> inspectorInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public ConsumedInsetsModifierElement(l<? super WindowInsets, ab> lVar, l<? super InspectorInfo, ab> lVar2) {
        this.block = lVar;
        this.inspectorInfo = lVar2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ConsumedInsetsModifierNode create() {
        return new ConsumedInsetsModifierNode(this.block);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConsumedInsetsModifierElement) && ((ConsumedInsetsModifierElement) obj).block == this.block;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.block.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ConsumedInsetsModifierNode consumedInsetsModifierNode) {
        consumedInsetsModifierNode.update(this.block);
    }
}
