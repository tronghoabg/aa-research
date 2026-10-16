package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ButtonGroupNode extends Modifier.Node implements ParentDataModifierNode {
    public static final int $stable = 8;
    private float weight;

    public ButtonGroupNode(float f2) {
        this.weight = f2;
    }

    public final float getWeight() {
        return this.weight;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public ButtonGroupParentData modifyParentData(Density density, Object obj) {
        ButtonGroupParentData buttonGroupParentData = obj instanceof ButtonGroupParentData ? (ButtonGroupParentData) obj : null;
        if (buttonGroupParentData == null) {
            buttonGroupParentData = new ButtonGroupParentData(0.0f, null, null, 7, null);
        }
        buttonGroupParentData.setWeight(this.weight);
        return buttonGroupParentData;
    }

    public final void setWeight(float f2) {
        this.weight = f2;
    }
}
