package androidx.compose.ui.viewinterop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class FocusTargetInteropElement extends ModifierNodeElement<FocusTargetInteropNode> {
    public static final FocusTargetInteropElement INSTANCE = new FocusTargetInteropElement();

    private FocusTargetInteropElement() {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return 1019320052;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("focusTargetInterop");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ void update(Modifier.Node node) {
    }

    public void update(FocusTargetInteropNode focusTargetInteropNode) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public FocusTargetInteropNode create() {
        return new FocusTargetInteropNode();
    }
}
