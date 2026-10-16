package androidx.compose.material3;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.ab;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ExposedDropdownMenuAnchorElement extends ModifierNodeElement<ExposedDropdownMenuAnchorNode> {
    private final a<ab> updateStateOnAttach;

    public ExposedDropdownMenuAnchorElement(a<ab> aVar) {
        this.updateStateOnAttach = aVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ExposedDropdownMenuAnchorNode create() {
        return new ExposedDropdownMenuAnchorNode(this.updateStateOnAttach);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExposedDropdownMenuAnchorElement) && this.updateStateOnAttach == ((ExposedDropdownMenuAnchorElement) obj).updateStateOnAttach;
    }

    public final a<ab> getUpdateStateOnAttach() {
        return this.updateStateOnAttach;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.updateStateOnAttach.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("exposedDropdownMenuAnchorType");
        inspectorInfo.getProperties().set("updateStateOnAttach", this.updateStateOnAttach);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ExposedDropdownMenuAnchorNode exposedDropdownMenuAnchorNode) {
        exposedDropdownMenuAnchorNode.setUpdateStateOnAttach(this.updateStateOnAttach);
    }
}
