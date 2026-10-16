package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DerivedWidthModifierElement extends ModifierNodeElement<DerivedWidthModifierNode> {
    private final WindowInsets insets;
    private final l<InspectorInfo, ab> inspectorInfo;
    private final WindowInsetsWidthCalculator widthCalc;

    /* JADX WARN: Multi-variable type inference failed */
    public DerivedWidthModifierElement(WindowInsets windowInsets, l<? super InspectorInfo, ab> lVar, WindowInsetsWidthCalculator windowInsetsWidthCalculator) {
        this.insets = windowInsets;
        this.inspectorInfo = lVar;
        this.widthCalc = windowInsetsWidthCalculator;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public DerivedWidthModifierNode create() {
        return new DerivedWidthModifierNode(this.insets, this.widthCalc);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DerivedWidthModifierElement)) {
            return false;
        }
        DerivedWidthModifierElement derivedWidthModifierElement = (DerivedWidthModifierElement) obj;
        return x.n(this.insets, derivedWidthModifierElement.insets) && this.widthCalc == derivedWidthModifierElement.widthCalc;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.insets.hashCode() * 31) + this.widthCalc.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(DerivedWidthModifierNode derivedWidthModifierNode) {
        derivedWidthModifierNode.update(this.insets, this.widthCalc);
    }
}
