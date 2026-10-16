package androidx.compose.ui.graphics;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class MeshGradientBlockModifierElement extends ModifierNodeElement<MeshGradientBlockModifierNode> {
    private final l<MeshGradientScope, ab> block;
    private final int columns;
    private final boolean hasBicubicColor;
    private final int rows;

    /* JADX WARN: Multi-variable type inference failed */
    public MeshGradientBlockModifierElement(int i2, int i3, boolean z, l<? super MeshGradientScope, ab> lVar) {
        this.rows = i2;
        this.columns = i3;
        this.hasBicubicColor = z;
        this.block = lVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public MeshGradientBlockModifierNode create() {
        return new MeshGradientBlockModifierNode(this.rows, this.columns, this.hasBicubicColor, this.block);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MeshGradientBlockModifierElement)) {
            return false;
        }
        MeshGradientBlockModifierElement meshGradientBlockModifierElement = (MeshGradientBlockModifierElement) obj;
        return meshGradientBlockModifierElement.rows == this.rows && meshGradientBlockModifierElement.columns == this.columns && meshGradientBlockModifierElement.hasBicubicColor == this.hasBicubicColor && meshGradientBlockModifierElement.block == this.block;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int i2 = this.rows;
        l<MeshGradientScope, ab> lVar = this.block;
        return (((((i2 * 31) + this.columns) * 31) + MeshGradientBlockModifierElement$$ExternalSyntheticBackport0.m(this.hasBicubicColor)) * 31) + lVar.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("MeshGradient");
        inspectorInfo.getProperties().set("rows", Integer.valueOf(this.rows));
        inspectorInfo.getProperties().set("columns", Integer.valueOf(this.columns));
        inspectorInfo.getProperties().set("hasBicubicColor", Boolean.valueOf(this.hasBicubicColor));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(MeshGradientBlockModifierNode meshGradientBlockModifierNode) {
        meshGradientBlockModifierNode.update(this.rows, this.columns, this.hasBicubicColor, this.block);
    }
}
