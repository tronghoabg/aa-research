package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LayoutBoundsElement extends ModifierNodeElement<LayoutBoundsNode> {
    public static final int $stable = 0;
    private final LayoutBoundsHolder holder;

    public LayoutBoundsElement(LayoutBoundsHolder layoutBoundsHolder) {
        this.holder = layoutBoundsHolder;
    }

    public static /* synthetic */ LayoutBoundsElement copy$default(LayoutBoundsElement layoutBoundsElement, LayoutBoundsHolder layoutBoundsHolder, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            layoutBoundsHolder = layoutBoundsElement.holder;
        }
        return layoutBoundsElement.copy(layoutBoundsHolder);
    }

    public final LayoutBoundsHolder component1() {
        return this.holder;
    }

    public final LayoutBoundsElement copy(LayoutBoundsHolder layoutBoundsHolder) {
        return new LayoutBoundsElement(layoutBoundsHolder);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public LayoutBoundsNode create() {
        return new LayoutBoundsNode(this.holder);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutBoundsElement) && x.n(this.holder, ((LayoutBoundsElement) obj).holder);
    }

    public final LayoutBoundsHolder getHolder() {
        return this.holder;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.holder.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("layoutBounds");
        inspectorInfo.getProperties().set("holder", this.holder);
    }

    public String toString() {
        return "LayoutBoundsElement(holder=" + this.holder + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(LayoutBoundsNode layoutBoundsNode) {
        layoutBoundsNode.setHolder(this.holder);
        layoutBoundsNode.forceUpdate();
    }
}
