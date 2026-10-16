package androidx.compose.foundation.text;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextStyle;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class HeightInLinesElement extends ModifierNodeElement<HeightInLinesNode> {
    private final int maxLines;
    private final int minLines;
    private final TextStyle textStyle;

    public HeightInLinesElement(TextStyle textStyle, int i2, int i3) {
        this.textStyle = textStyle;
        this.minLines = i2;
        this.maxLines = i3;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public HeightInLinesNode create() {
        return new HeightInLinesNode(this.textStyle, this.minLines, this.maxLines);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeightInLinesElement)) {
            return false;
        }
        HeightInLinesElement heightInLinesElement = (HeightInLinesElement) obj;
        return x.n(this.textStyle, heightInLinesElement.textStyle) && this.minLines == heightInLinesElement.minLines && this.maxLines == heightInLinesElement.maxLines;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.textStyle.hashCode() * 31) + this.minLines) * 31) + this.maxLines;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("heightInLines");
        inspectorInfo.getProperties().set("minLines", Integer.valueOf(this.minLines));
        inspectorInfo.getProperties().set("maxLines", Integer.valueOf(this.maxLines));
        inspectorInfo.getProperties().set("textStyle", this.textStyle);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(HeightInLinesNode heightInLinesNode) {
        heightInLinesNode.update(this.textStyle, this.minLines, this.maxLines);
    }
}
