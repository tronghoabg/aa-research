package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.HeightForSingleLineFieldProvider;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextStyle;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextFieldSizeConstrainerElement extends ModifierNodeElement<TextFieldSizeConstrainerNode> {
    private final int maxLines;
    private final int minLines;
    private final HeightForSingleLineFieldProvider singleLineHeightProvider;
    private final boolean softWrap;
    private final TextStyle textStyle;

    public TextFieldSizeConstrainerElement(TextStyle textStyle, int i2, int i3, boolean z, HeightForSingleLineFieldProvider heightForSingleLineFieldProvider) {
        this.textStyle = textStyle;
        this.minLines = i2;
        this.maxLines = i3;
        this.softWrap = z;
        this.singleLineHeightProvider = heightForSingleLineFieldProvider;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TextFieldSizeConstrainerNode create() {
        return new TextFieldSizeConstrainerNode(this.textStyle, this.minLines, this.maxLines, this.softWrap, this.singleLineHeightProvider);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldSizeConstrainerElement)) {
            return false;
        }
        TextFieldSizeConstrainerElement textFieldSizeConstrainerElement = (TextFieldSizeConstrainerElement) obj;
        return x.n(this.textStyle, textFieldSizeConstrainerElement.textStyle) && this.minLines == textFieldSizeConstrainerElement.minLines && this.maxLines == textFieldSizeConstrainerElement.maxLines && this.softWrap == textFieldSizeConstrainerElement.softWrap && x.n(this.singleLineHeightProvider, textFieldSizeConstrainerElement.singleLineHeightProvider);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = this.textStyle.hashCode() * 31;
        HeightForSingleLineFieldProvider heightForSingleLineFieldProvider = this.singleLineHeightProvider;
        return ((((((iHashCode + this.minLines) * 31) + this.maxLines) * 31) + TextFieldSizeConstrainerElement$$ExternalSyntheticBackport0.m(this.softWrap)) * 31) + heightForSingleLineFieldProvider.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("combinedTextFieldSize");
        inspectorInfo.getProperties().set("minLines", Integer.valueOf(this.minLines));
        inspectorInfo.getProperties().set("maxLines", Integer.valueOf(this.maxLines));
        inspectorInfo.getProperties().set("softWrap", Boolean.valueOf(this.softWrap));
        inspectorInfo.getProperties().set("textStyle", this.textStyle);
        inspectorInfo.getProperties().set("textLayoutState", this.singleLineHeightProvider);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(TextFieldSizeConstrainerNode textFieldSizeConstrainerNode) {
        textFieldSizeConstrainerNode.update(this.textStyle, this.minLines, this.maxLines, this.softWrap, this.singleLineHeightProvider);
    }
}
