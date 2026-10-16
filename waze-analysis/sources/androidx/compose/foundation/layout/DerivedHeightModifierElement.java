package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DerivedHeightModifierElement extends ModifierNodeElement<DerivedHeightModifierNode> {
    private final WindowInsetsHeightCalculator heightCalc;
    private final WindowInsets insets;
    private final l<InspectorInfo, ab> inspectorInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public DerivedHeightModifierElement(WindowInsets windowInsets, l<? super InspectorInfo, ab> lVar, WindowInsetsHeightCalculator windowInsetsHeightCalculator) {
        this.insets = windowInsets;
        this.inspectorInfo = lVar;
        this.heightCalc = windowInsetsHeightCalculator;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public DerivedHeightModifierNode create() {
        return new DerivedHeightModifierNode(this.insets, this.heightCalc);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DerivedHeightModifierElement)) {
            return false;
        }
        DerivedHeightModifierElement derivedHeightModifierElement = (DerivedHeightModifierElement) obj;
        return x.n(this.insets, derivedHeightModifierElement.insets) && this.heightCalc == derivedHeightModifierElement.heightCalc;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.insets.hashCode() * 31) + this.heightCalc.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(DerivedHeightModifierNode derivedHeightModifierNode) {
        derivedHeightModifierNode.update(this.insets, this.heightCalc);
    }
}
