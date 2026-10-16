package androidx.compose.material3.internal;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ParentSemanticsNodeElement extends ModifierNodeElement<ParentSemanticsNode> {
    public static final int $stable = 0;
    private final l<SemanticsPropertyReceiver, ab> properties;

    /* JADX WARN: Multi-variable type inference failed */
    public ParentSemanticsNodeElement(l<? super SemanticsPropertyReceiver, ab> lVar) {
        this.properties = lVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ParentSemanticsNode create() {
        return new ParentSemanticsNode(this.properties);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ParentSemanticsNodeElement) && this.properties == ((ParentSemanticsNodeElement) obj).properties;
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
        inspectorInfo.setName("parentSemantics");
        inspectorInfo.getProperties().set("properties", this.properties);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ParentSemanticsNode parentSemanticsNode) {
        parentSemanticsNode.setProperties(this.properties);
        SemanticsModifierNodeKt.invalidateSemantics(parentSemanticsNode);
    }
}
