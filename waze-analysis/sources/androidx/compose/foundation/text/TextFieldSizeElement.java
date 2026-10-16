package androidx.compose.foundation.text;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextStyle;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextFieldSizeElement extends ModifierNodeElement<TextFieldSizeNode> {
    private final TextStyle style;

    public TextFieldSizeElement(TextStyle textStyle) {
        this.style = textStyle;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TextFieldSizeNode create() {
        return new TextFieldSizeNode(this.style);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextFieldSizeElement) {
            return x.n(this.style, ((TextFieldSizeElement) obj).style);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.style.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("textFieldMinSize");
        inspectorInfo.getProperties().set("style", this.style);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(TextFieldSizeNode textFieldSizeNode) {
        textFieldSizeNode.update(this.style);
    }
}
