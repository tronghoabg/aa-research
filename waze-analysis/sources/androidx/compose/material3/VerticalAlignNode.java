package androidx.compose.material3;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class VerticalAlignNode extends Modifier.Node implements ParentDataModifierNode {
    public static final int $stable = 8;
    private Alignment.Vertical alignment;

    public VerticalAlignNode(Alignment.Vertical vertical) {
        this.alignment = vertical;
    }

    public final Alignment.Vertical getAlignment() {
        return this.alignment;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public ButtonGroupParentData modifyParentData(Density density, Object obj) {
        ButtonGroupParentData buttonGroupParentData = obj instanceof ButtonGroupParentData ? (ButtonGroupParentData) obj : null;
        if (buttonGroupParentData == null) {
            buttonGroupParentData = new ButtonGroupParentData(0.0f, null, null, 7, null);
        }
        buttonGroupParentData.setAlignment(this.alignment);
        return buttonGroupParentData;
    }

    public final void setAlignment(Alignment.Vertical vertical) {
        this.alignment = vertical;
    }
}
