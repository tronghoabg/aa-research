package androidx.compose.material3.internal;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ChildSemanticsNodeElement extends ModifierNodeElement<ChildSemanticsNode> {
    public static final int $stable = 0;
    private final l<SemanticsPropertyReceiver, ab> properties;

    /* JADX WARN: Multi-variable type inference failed */
    public ChildSemanticsNodeElement(l<? super SemanticsPropertyReceiver, ab> lVar) {
        this.properties = lVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ChildSemanticsNode create() {
        return new ChildSemanticsNode(this.properties);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChildSemanticsNodeElement) && this.properties == ((ChildSemanticsNodeElement) obj).properties;
    }

    public final l<SemanticsPropertyReceiver, ab> getProperties() {
        return this.properties;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.properties.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("childSemantics");
        inspectorInfo.getProperties().set("properties", this.properties);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ChildSemanticsNode childSemanticsNode) {
        childSemanticsNode.setProperties(this.properties);
        SemanticsModifierNodeKt.invalidateSemantics(childSemanticsNode);
    }
}
