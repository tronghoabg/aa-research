package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviors;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldCoreModifier extends ModifierNodeElement<TextFieldCoreModifierNode> {
    public static final int $stable = 0;
    private final Brush cursorBrush;
    private final boolean isDragHovered;
    private final boolean isFocused;
    private final Orientation orientation;
    private final PlatformSelectionBehaviors platformSelectionBehaviors;
    private final ScrollState scrollState;
    private final TextFieldSelectionState textFieldSelectionState;
    private final TransformedTextFieldState textFieldState;
    private final TextLayoutState textLayoutState;
    private final ToolbarRequester toolbarRequester;
    private final boolean writeable;

    public TextFieldCoreModifier(boolean z, boolean z2, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z3, ScrollState scrollState, Orientation orientation, ToolbarRequester toolbarRequester, PlatformSelectionBehaviors platformSelectionBehaviors) {
        this.isFocused = z;
        this.isDragHovered = z2;
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.cursorBrush = brush;
        this.writeable = z3;
        this.scrollState = scrollState;
        this.orientation = orientation;
        this.toolbarRequester = toolbarRequester;
        this.platformSelectionBehaviors = platformSelectionBehaviors;
    }

    private final boolean component1() {
        return this.isFocused;
    }

    private final ToolbarRequester component10() {
        return this.toolbarRequester;
    }

    private final PlatformSelectionBehaviors component11() {
        return this.platformSelectionBehaviors;
    }

    private final boolean component2() {
        return this.isDragHovered;
    }

    private final TextLayoutState component3() {
        return this.textLayoutState;
    }

    private final TransformedTextFieldState component4() {
        return this.textFieldState;
    }

    private final TextFieldSelectionState component5() {
        return this.textFieldSelectionState;
    }

    private final Brush component6() {
        return this.cursorBrush;
    }

    private final boolean component7() {
        return this.writeable;
    }

    private final ScrollState component8() {
        return this.scrollState;
    }

    private final Orientation component9() {
        return this.orientation;
    }

    public static /* synthetic */ TextFieldCoreModifier copy$default(TextFieldCoreModifier textFieldCoreModifier, boolean z, boolean z2, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z3, ScrollState scrollState, Orientation orientation, ToolbarRequester toolbarRequester, PlatformSelectionBehaviors platformSelectionBehaviors, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = textFieldCoreModifier.isFocused;
        }
        if ((i2 & 2) != 0) {
            z2 = textFieldCoreModifier.isDragHovered;
        }
        if ((i2 & 4) != 0) {
            textLayoutState = textFieldCoreModifier.textLayoutState;
        }
        if ((i2 & 8) != 0) {
            transformedTextFieldState = textFieldCoreModifier.textFieldState;
        }
        if ((i2 & 16) != 0) {
            textFieldSelectionState = textFieldCoreModifier.textFieldSelectionState;
        }
        if ((i2 & 32) != 0) {
            brush = textFieldCoreModifier.cursorBrush;
        }
        if ((i2 & 64) != 0) {
            z3 = textFieldCoreModifier.writeable;
        }
        if ((i2 & 128) != 0) {
            scrollState = textFieldCoreModifier.scrollState;
        }
        if ((i2 & 256) != 0) {
            orientation = textFieldCoreModifier.orientation;
        }
        if ((i2 & 512) != 0) {
            toolbarRequester = textFieldCoreModifier.toolbarRequester;
        }
        if ((i2 & 1024) != 0) {
            platformSelectionBehaviors = textFieldCoreModifier.platformSelectionBehaviors;
        }
        ToolbarRequester toolbarRequester2 = toolbarRequester;
        PlatformSelectionBehaviors platformSelectionBehaviors2 = platformSelectionBehaviors;
        ScrollState scrollState2 = scrollState;
        Orientation orientation2 = orientation;
        Brush brush2 = brush;
        boolean z4 = z3;
        TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
        TextLayoutState textLayoutState2 = textLayoutState;
        return textFieldCoreModifier.copy(z, z2, textLayoutState2, transformedTextFieldState, textFieldSelectionState2, brush2, z4, scrollState2, orientation2, toolbarRequester2, platformSelectionBehaviors2);
    }

    public final TextFieldCoreModifier copy(boolean z, boolean z2, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z3, ScrollState scrollState, Orientation orientation, ToolbarRequester toolbarRequester, PlatformSelectionBehaviors platformSelectionBehaviors) {
        return new TextFieldCoreModifier(z, z2, textLayoutState, transformedTextFieldState, textFieldSelectionState, brush, z3, scrollState, orientation, toolbarRequester, platformSelectionBehaviors);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TextFieldCoreModifierNode create() {
        return new TextFieldCoreModifierNode(this.isFocused, this.isDragHovered, this.textLayoutState, this.textFieldState, this.textFieldSelectionState, this.cursorBrush, this.writeable, this.scrollState, this.orientation, this.toolbarRequester, this.platformSelectionBehaviors);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldCoreModifier)) {
            return false;
        }
        TextFieldCoreModifier textFieldCoreModifier = (TextFieldCoreModifier) obj;
        return this.isFocused == textFieldCoreModifier.isFocused && this.isDragHovered == textFieldCoreModifier.isDragHovered && x.n(this.textLayoutState, textFieldCoreModifier.textLayoutState) && x.n(this.textFieldState, textFieldCoreModifier.textFieldState) && x.n(this.textFieldSelectionState, textFieldCoreModifier.textFieldSelectionState) && x.n(this.cursorBrush, textFieldCoreModifier.cursorBrush) && this.writeable == textFieldCoreModifier.writeable && x.n(this.scrollState, textFieldCoreModifier.scrollState) && this.orientation == textFieldCoreModifier.orientation && x.n(this.toolbarRequester, textFieldCoreModifier.toolbarRequester) && x.n(this.platformSelectionBehaviors, textFieldCoreModifier.platformSelectionBehaviors);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iM = (((((((((((((((((TextFieldCoreModifier$$ExternalSyntheticBackport0.m(this.isFocused) * 31) + TextFieldCoreModifier$$ExternalSyntheticBackport0.m(this.isDragHovered)) * 31) + this.textLayoutState.hashCode()) * 31) + this.textFieldState.hashCode()) * 31) + this.textFieldSelectionState.hashCode()) * 31) + this.cursorBrush.hashCode()) * 31) + TextFieldCoreModifier$$ExternalSyntheticBackport0.m(this.writeable)) * 31) + this.scrollState.hashCode()) * 31) + this.orientation.hashCode()) * 31) + this.toolbarRequester.hashCode();
        PlatformSelectionBehaviors platformSelectionBehaviors = this.platformSelectionBehaviors;
        return (iM * 31) + (platformSelectionBehaviors == null ? 0 : platformSelectionBehaviors.hashCode());
    }

    public String toString() {
        return "TextFieldCoreModifier(isFocused=" + this.isFocused + ", isDragHovered=" + this.isDragHovered + ", textLayoutState=" + this.textLayoutState + ", textFieldState=" + this.textFieldState + ", textFieldSelectionState=" + this.textFieldSelectionState + ", cursorBrush=" + this.cursorBrush + ", writeable=" + this.writeable + ", scrollState=" + this.scrollState + ", orientation=" + this.orientation + ", toolbarRequester=" + this.toolbarRequester + ", platformSelectionBehaviors=" + this.platformSelectionBehaviors + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(TextFieldCoreModifierNode textFieldCoreModifierNode) {
        textFieldCoreModifierNode.updateNode(this.isFocused, this.isDragHovered, this.textLayoutState, this.textFieldState, this.textFieldSelectionState, this.cursorBrush, this.writeable, this.scrollState, this.orientation, this.toolbarRequester, this.platformSelectionBehaviors);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }
}
