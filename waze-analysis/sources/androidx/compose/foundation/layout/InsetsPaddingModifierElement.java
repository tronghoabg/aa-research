package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class InsetsPaddingModifierElement extends ModifierNodeElement<InsetsPaddingModifierNode> {
    private final WindowInsets insets;
    private final l<InspectorInfo, ab> inspectorInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public InsetsPaddingModifierElement(WindowInsets windowInsets, l<? super InspectorInfo, ab> lVar) {
        this.insets = windowInsets;
        this.inspectorInfo = lVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public InsetsPaddingModifierNode create() {
        return new InsetsPaddingModifierNode(this.insets);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InsetsPaddingModifierElement) {
            return x.n(((InsetsPaddingModifierElement) obj).insets, this.insets);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.insets.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(InsetsPaddingModifierNode insetsPaddingModifierNode) {
        insetsPaddingModifierNode.update(this.insets);
    }
}
