package androidx.compose.material3;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class MenuItemVisibleElement extends ModifierNodeElement<MenuItemVisibilityModifier> {
    private final a<Boolean> isVisible;

    public MenuItemVisibleElement(a<Boolean> aVar) {
        this.isVisible = aVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public MenuItemVisibilityModifier create() {
        return new MenuItemVisibilityModifier(this.isVisible);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.isVisible == ((MenuItemVisibleElement) obj).isVisible;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.isVisible.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("itemVisible");
        inspectorInfo.setValue(this.isVisible.invoke());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(MenuItemVisibilityModifier menuItemVisibilityModifier) {
        menuItemVisibilityModifier.setVisible(this.isVisible);
    }
}
