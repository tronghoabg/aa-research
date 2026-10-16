package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AddTextContextMenuDataComponentsElement extends ModifierNodeElement<AddTextContextMenuDataComponentsNode> {
    private final l<TextContextMenuBuilderScope, ab> builder;

    /* JADX WARN: Multi-variable type inference failed */
    public AddTextContextMenuDataComponentsElement(l<? super TextContextMenuBuilderScope, ab> lVar) {
        this.builder = lVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public AddTextContextMenuDataComponentsNode create() {
        return new AddTextContextMenuDataComponentsNode(this.builder);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddTextContextMenuDataComponentsElement) && this.builder == ((AddTextContextMenuDataComponentsElement) obj).builder;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.builder.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("addTextContextMenuDataComponents");
        inspectorInfo.getProperties().set("builder", this.builder);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(AddTextContextMenuDataComponentsNode addTextContextMenuDataComponentsNode) {
        addTextContextMenuDataComponentsNode.setBuilder(this.builder);
    }
}
