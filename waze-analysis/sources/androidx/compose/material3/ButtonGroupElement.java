package androidx.compose.material3;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ButtonGroupElement extends ModifierNodeElement<ButtonGroupNode> {
    public static final int $stable = 0;
    private final float weight;

    public /* synthetic */ ButtonGroupElement(float f2, int i2, o oVar) {
        this(1 == (i2 & 1) ? 0.0f : f2);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ButtonGroupNode create() {
        return new ButtonGroupNode(this.weight);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ButtonGroupElement buttonGroupElement = obj instanceof ButtonGroupElement ? (ButtonGroupElement) obj : null;
        return buttonGroupElement != null && this.weight == buttonGroupElement.weight;
    }

    public final float getWeight() {
        return this.weight;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Float.floatToIntBits(this.weight);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("weight");
        inspectorInfo.setValue(Float.valueOf(this.weight));
        inspectorInfo.getProperties().set("weight", Float.valueOf(this.weight));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ButtonGroupNode buttonGroupNode) {
        buttonGroupNode.setWeight(this.weight);
    }

    public ButtonGroupElement(float f2) {
        this.weight = f2;
    }

    public ButtonGroupElement() {
        this(0.0f, 1, null);
    }
}
