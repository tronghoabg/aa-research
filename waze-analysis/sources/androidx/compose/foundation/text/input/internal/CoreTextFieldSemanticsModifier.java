package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CoreTextFieldSemanticsModifier extends ModifierNodeElement<CoreTextFieldSemanticsModifierNode> {
    public static final int $stable = 0;
    private final boolean enabled;
    private final FocusRequester focusRequester;
    private final ImeOptions imeOptions;
    private final boolean isPassword;
    private final TextFieldSelectionManager manager;
    private final OffsetMapping offsetMapping;
    private final boolean readOnly;
    private final LegacyTextFieldState state;
    private final TransformedText transformedText;
    private final TextFieldValue value;

    public CoreTextFieldSemanticsModifier(TransformedText transformedText, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, boolean z, boolean z2, boolean z3, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, FocusRequester focusRequester) {
        this.transformedText = transformedText;
        this.value = textFieldValue;
        this.state = legacyTextFieldState;
        this.readOnly = z;
        this.enabled = z2;
        this.isPassword = z3;
        this.offsetMapping = offsetMapping;
        this.manager = textFieldSelectionManager;
        this.imeOptions = imeOptions;
        this.focusRequester = focusRequester;
    }

    public static /* synthetic */ CoreTextFieldSemanticsModifier copy$default(CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier, TransformedText transformedText, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, boolean z, boolean z2, boolean z3, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, FocusRequester focusRequester, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            transformedText = coreTextFieldSemanticsModifier.transformedText;
        }
        if ((i2 & 2) != 0) {
            textFieldValue = coreTextFieldSemanticsModifier.value;
        }
        if ((i2 & 4) != 0) {
            legacyTextFieldState = coreTextFieldSemanticsModifier.state;
        }
        if ((i2 & 8) != 0) {
            z = coreTextFieldSemanticsModifier.readOnly;
        }
        if ((i2 & 16) != 0) {
            z2 = coreTextFieldSemanticsModifier.enabled;
        }
        if ((i2 & 32) != 0) {
            z3 = coreTextFieldSemanticsModifier.isPassword;
        }
        if ((i2 & 64) != 0) {
            offsetMapping = coreTextFieldSemanticsModifier.offsetMapping;
        }
        if ((i2 & 128) != 0) {
            textFieldSelectionManager = coreTextFieldSemanticsModifier.manager;
        }
        if ((i2 & 256) != 0) {
            imeOptions = coreTextFieldSemanticsModifier.imeOptions;
        }
        if ((i2 & 512) != 0) {
            focusRequester = coreTextFieldSemanticsModifier.focusRequester;
        }
        ImeOptions imeOptions2 = imeOptions;
        FocusRequester focusRequester2 = focusRequester;
        OffsetMapping offsetMapping2 = offsetMapping;
        TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
        boolean z4 = z2;
        boolean z5 = z3;
        return coreTextFieldSemanticsModifier.copy(transformedText, textFieldValue, legacyTextFieldState, z, z4, z5, offsetMapping2, textFieldSelectionManager2, imeOptions2, focusRequester2);
    }

    public final TransformedText component1() {
        return this.transformedText;
    }

    public final FocusRequester component10() {
        return this.focusRequester;
    }

    public final TextFieldValue component2() {
        return this.value;
    }

    public final LegacyTextFieldState component3() {
        return this.state;
    }

    public final boolean component4() {
        return this.readOnly;
    }

    public final boolean component5() {
        return this.enabled;
    }

    public final boolean component6() {
        return this.isPassword;
    }

    public final OffsetMapping component7() {
        return this.offsetMapping;
    }

    public final TextFieldSelectionManager component8() {
        return this.manager;
    }

    public final ImeOptions component9() {
        return this.imeOptions;
    }

    public final CoreTextFieldSemanticsModifier copy(TransformedText transformedText, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, boolean z, boolean z2, boolean z3, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, FocusRequester focusRequester) {
        return new CoreTextFieldSemanticsModifier(transformedText, textFieldValue, legacyTextFieldState, z, z2, z3, offsetMapping, textFieldSelectionManager, imeOptions, focusRequester);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public CoreTextFieldSemanticsModifierNode create() {
        return new CoreTextFieldSemanticsModifierNode(this.transformedText, this.value, this.state, this.readOnly, this.enabled, this.isPassword, this.offsetMapping, this.manager, this.imeOptions, this.focusRequester);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreTextFieldSemanticsModifier)) {
            return false;
        }
        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = (CoreTextFieldSemanticsModifier) obj;
        return x.n(this.transformedText, coreTextFieldSemanticsModifier.transformedText) && x.n(this.value, coreTextFieldSemanticsModifier.value) && x.n(this.state, coreTextFieldSemanticsModifier.state) && this.readOnly == coreTextFieldSemanticsModifier.readOnly && this.enabled == coreTextFieldSemanticsModifier.enabled && this.isPassword == coreTextFieldSemanticsModifier.isPassword && x.n(this.offsetMapping, coreTextFieldSemanticsModifier.offsetMapping) && x.n(this.manager, coreTextFieldSemanticsModifier.manager) && x.n(this.imeOptions, coreTextFieldSemanticsModifier.imeOptions) && x.n(this.focusRequester, coreTextFieldSemanticsModifier.focusRequester);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final ImeOptions getImeOptions() {
        return this.imeOptions;
    }

    public final TextFieldSelectionManager getManager() {
        return this.manager;
    }

    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final LegacyTextFieldState getState() {
        return this.state;
    }

    public final TransformedText getTransformedText() {
        return this.transformedText;
    }

    public final TextFieldValue getValue() {
        return this.value;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = (((this.transformedText.hashCode() * 31) + this.value.hashCode()) * 31) + this.state.hashCode();
        OffsetMapping offsetMapping = this.offsetMapping;
        boolean z = this.isPassword;
        return (((((((((((((iHashCode * 31) + CoreTextFieldSemanticsModifier$$ExternalSyntheticBackport0.m(this.readOnly)) * 31) + CoreTextFieldSemanticsModifier$$ExternalSyntheticBackport0.m(this.enabled)) * 31) + CoreTextFieldSemanticsModifier$$ExternalSyntheticBackport0.m(z)) * 31) + offsetMapping.hashCode()) * 31) + this.manager.hashCode()) * 31) + this.imeOptions.hashCode()) * 31) + this.focusRequester.hashCode();
    }

    public final boolean isPassword() {
        return this.isPassword;
    }

    public String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.transformedText + ", value=" + this.value + ", state=" + this.state + ", readOnly=" + this.readOnly + ", enabled=" + this.enabled + ", isPassword=" + this.isPassword + ", offsetMapping=" + this.offsetMapping + ", manager=" + this.manager + ", imeOptions=" + this.imeOptions + ", focusRequester=" + this.focusRequester + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        coreTextFieldSemanticsModifierNode.updateNodeSemantics(this.transformedText, this.value, this.state, this.readOnly, this.enabled, this.isPassword, this.offsetMapping, this.manager, this.imeOptions, this.focusRequester);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }
}
