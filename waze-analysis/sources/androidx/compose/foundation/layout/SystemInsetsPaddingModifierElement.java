package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SystemInsetsPaddingModifierElement extends ModifierNodeElement<SystemInsetsPaddingModifierNode> {
    private final l<WindowInsetsHolder, WindowInsets> insetsGetter;
    private final l<InspectorInfo, ab> inspectorInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public SystemInsetsPaddingModifierElement(l<? super InspectorInfo, ab> lVar, l<? super WindowInsetsHolder, ? extends WindowInsets> lVar2) {
        this.inspectorInfo = lVar;
        this.insetsGetter = lVar2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SystemInsetsPaddingModifierNode create() {
        return new SystemInsetsPaddingModifierNode(this.insetsGetter);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SystemInsetsPaddingModifierElement) && this.insetsGetter == ((SystemInsetsPaddingModifierElement) obj).insetsGetter;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.insetsGetter.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SystemInsetsPaddingModifierNode systemInsetsPaddingModifierNode) {
        systemInsetsPaddingModifierNode.update(this.insetsGetter);
    }
}
