package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class MenuItemVisibilityModifier extends Modifier.Node implements ParentDataModifierNode, SemanticsModifierNode {
    private a<Boolean> visible;

    public MenuItemVisibilityModifier(a<Boolean> aVar) {
        this.visible = aVar;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldClearDescendantSemantics() {
        return !this.visible.invoke().booleanValue();
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return false;
    }

    public final a<Boolean> getVisible() {
        return this.visible;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean isImportantForBounds() {
        return true;
    }

    public final void setVisible(a<Boolean> aVar) {
        this.visible = aVar;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public Object modifyParentData(Density density, Object obj) {
        return this;
    }
}
