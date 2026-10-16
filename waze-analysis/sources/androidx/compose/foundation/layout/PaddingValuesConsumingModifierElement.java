package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class PaddingValuesConsumingModifierElement extends ModifierNodeElement<PaddingValuesConsumingModifierNode> {
    private final l<InspectorInfo, ab> inspectorInfo;
    private final PaddingValues paddingValues;

    /* JADX WARN: Multi-variable type inference failed */
    public PaddingValuesConsumingModifierElement(PaddingValues paddingValues, l<? super InspectorInfo, ab> lVar) {
        this.paddingValues = paddingValues;
        this.inspectorInfo = lVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public PaddingValuesConsumingModifierNode create() {
        return new PaddingValuesConsumingModifierNode(this.paddingValues);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PaddingValuesConsumingModifierElement) {
            return x.n(((PaddingValuesConsumingModifierElement) obj).paddingValues, this.paddingValues);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.paddingValues.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(PaddingValuesConsumingModifierNode paddingValuesConsumingModifierNode) {
        paddingValuesConsumingModifierNode.update(this.paddingValues);
    }
}
