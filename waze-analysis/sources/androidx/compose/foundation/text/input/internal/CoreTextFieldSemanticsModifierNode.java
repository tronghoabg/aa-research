package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldDelegate;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.autofill.FillableData;
import androidx.compose.ui.autofill.FillableData_androidKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteAllCommand;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import h.a.i;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.q;
import h.g.b.x;
import h.n.o;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CoreTextFieldSemanticsModifierNode extends DelegatingNode implements SemanticsModifierNode {
    public static final int $stable = 8;
    private boolean enabled;
    private FocusRequester focusRequester;
    private ImeOptions imeOptions;
    private boolean isPassword;
    private TextFieldSelectionManager manager;
    private OffsetMapping offsetMapping;
    private boolean readOnly;
    private LegacyTextFieldState state;
    private TransformedText transformedText;
    private TextFieldValue value;

    public CoreTextFieldSemanticsModifierNode(TransformedText transformedText, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, boolean z, boolean z2, boolean z3, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, FocusRequester focusRequester) {
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
        textFieldSelectionManager.setRequestAutofillAction$foundation(new a() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return CoreTextFieldSemanticsModifierNode._init_$lambda$0(this.f$0);
            }
        });
    }

    static final ab _init_$lambda$0(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        DelegatableNodeKt.requestAutofill(coreTextFieldSemanticsModifierNode);
        return ab.f48028a;
    }

    static final boolean applySemantics$lambda$1(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, FillableData fillableData) {
        coreTextFieldSemanticsModifierNode.state.setJustAutofilled(true);
        coreTextFieldSemanticsModifierNode.state.setAutofillHighlightOn(true);
        LegacyTextFieldState legacyTextFieldState = coreTextFieldSemanticsModifierNode.state;
        CharSequence textValue = fillableData.getTextValue();
        x.d(textValue, "null cannot be cast to non-null type kotlin.String");
        coreTextFieldSemanticsModifierNode.handleTextUpdateFromSemantics(legacyTextFieldState, (String) textValue, coreTextFieldSemanticsModifierNode.readOnly, coreTextFieldSemanticsModifierNode.enabled);
        return true;
    }

    static final boolean applySemantics$lambda$10(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        coreTextFieldSemanticsModifierNode.manager.cut$foundation();
        return true;
    }

    static final boolean applySemantics$lambda$11(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        coreTextFieldSemanticsModifierNode.manager.paste$foundation();
        return true;
    }

    static final boolean applySemantics$lambda$2(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, List list) {
        if (coreTextFieldSemanticsModifierNode.state.getLayoutResult() == null) {
            return false;
        }
        TextLayoutResultProxy layoutResult = coreTextFieldSemanticsModifierNode.state.getLayoutResult();
        x.c(layoutResult);
        list.add(layoutResult.getValue());
        return true;
    }

    static final boolean applySemantics$lambda$3(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, AnnotatedString annotatedString) {
        coreTextFieldSemanticsModifierNode.handleTextUpdateFromSemantics(coreTextFieldSemanticsModifierNode.state, annotatedString.getText(), coreTextFieldSemanticsModifierNode.readOnly, coreTextFieldSemanticsModifierNode.enabled);
        return true;
    }

    static final boolean applySemantics$lambda$4(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, SemanticsPropertyReceiver semanticsPropertyReceiver, AnnotatedString annotatedString) {
        if (coreTextFieldSemanticsModifierNode.readOnly || !coreTextFieldSemanticsModifierNode.enabled) {
            return false;
        }
        androidx.compose.ui.text.input.TextInputSession inputSession = coreTextFieldSemanticsModifierNode.state.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.Companion.onEditCommand$foundation(i.i(new FinishComposingTextCommand(), new CommitTextCommand(annotatedString, 1)), coreTextFieldSemanticsModifierNode.state.getProcessor(), coreTextFieldSemanticsModifierNode.state.getOnValueChange(), inputSession);
        } else {
            coreTextFieldSemanticsModifierNode.state.getOnValueChange().invoke(new TextFieldValue(o.u(coreTextFieldSemanticsModifierNode.value.getText(), TextRange.m10546getStartimpl(coreTextFieldSemanticsModifierNode.value.m10831getSelectiond9O1mEE()), TextRange.m10541getEndimpl(coreTextFieldSemanticsModifierNode.value.m10831getSelectiond9O1mEE()), annotatedString).toString(), TextRangeKt.TextRange(TextRange.m10546getStartimpl(coreTextFieldSemanticsModifierNode.value.m10831getSelectiond9O1mEE()) + annotatedString.length()), (TextRange) null, 4, (h.g.b.o) null));
        }
        return true;
    }

    static final boolean applySemantics$lambda$5(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, int i2, int i3, boolean z) {
        if (!z) {
            i2 = coreTextFieldSemanticsModifierNode.offsetMapping.transformedToOriginal(i2);
        }
        if (!z) {
            i3 = coreTextFieldSemanticsModifierNode.offsetMapping.transformedToOriginal(i3);
        }
        if (!coreTextFieldSemanticsModifierNode.enabled) {
            return false;
        }
        if (i2 == TextRange.m10546getStartimpl(coreTextFieldSemanticsModifierNode.value.m10831getSelectiond9O1mEE()) && i3 == TextRange.m10541getEndimpl(coreTextFieldSemanticsModifierNode.value.m10831getSelectiond9O1mEE())) {
            return false;
        }
        if (Math.min(i2, i3) < 0 || Math.max(i2, i3) > coreTextFieldSemanticsModifierNode.value.getAnnotatedString().length()) {
            coreTextFieldSemanticsModifierNode.manager.exitSelectionMode$foundation();
            return false;
        }
        if (z || i2 == i3) {
            coreTextFieldSemanticsModifierNode.manager.exitSelectionMode$foundation();
        } else {
            coreTextFieldSemanticsModifierNode.manager.enterSelectionMode$foundation(1 == ((false ? 1 : 0) | (1 & 1)));
        }
        coreTextFieldSemanticsModifierNode.state.getOnValueChange().invoke(new TextFieldValue(coreTextFieldSemanticsModifierNode.value.getAnnotatedString(), TextRangeKt.TextRange(i2, i3), (TextRange) null, 4, (h.g.b.o) null));
        return true;
    }

    static final boolean applySemantics$lambda$6(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        coreTextFieldSemanticsModifierNode.state.getOnImeActionPerformed().invoke(ImeAction.m10714boximpl(coreTextFieldSemanticsModifierNode.imeOptions.m10746getImeActioneUduSuo()));
        return true;
    }

    static final boolean applySemantics$lambda$7(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        CoreTextFieldKt.requestFocusAndShowKeyboardIfNeeded(coreTextFieldSemanticsModifierNode.state, coreTextFieldSemanticsModifierNode.focusRequester, !coreTextFieldSemanticsModifierNode.readOnly);
        return true;
    }

    static final boolean applySemantics$lambda$8(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        coreTextFieldSemanticsModifierNode.manager.enterSelectionMode$foundation(1 == ((false ? 1 : 0) | (1 & 1)));
        return true;
    }

    static final boolean applySemantics$lambda$9(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        coreTextFieldSemanticsModifierNode.manager.copy$foundation(1 == ((false ? 1 : 0) | (1 & 1)));
        return true;
    }

    private final void handleTextUpdateFromSemantics(LegacyTextFieldState legacyTextFieldState, String str, boolean z, boolean z2) {
        if (z || !z2) {
            return;
        }
        androidx.compose.ui.text.input.TextInputSession inputSession = legacyTextFieldState.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.Companion.onEditCommand$foundation(i.i(new DeleteAllCommand(), new CommitTextCommand(str, 1)), legacyTextFieldState.getProcessor(), legacyTextFieldState.getOnValueChange(), inputSession);
        } else {
            legacyTextFieldState.getOnValueChange().invoke(new TextFieldValue(str, TextRangeKt.TextRange(str.length()), (TextRange) null, 4, (h.g.b.o) null));
        }
    }

    static final ab updateNodeSemantics$lambda$0(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        DelegatableNodeKt.requestAutofill(coreTextFieldSemanticsModifierNode);
        return ab.f48028a;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(final SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setInputText(semanticsPropertyReceiver, this.value.getAnnotatedString());
        SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, this.transformedText.getText());
        SemanticsPropertiesKt.m10337setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, this.value.m10831getSelectiond9O1mEE());
        SemanticsPropertiesKt.setContentDataType(semanticsPropertyReceiver, ContentDataType.Companion.getText());
        SemanticsPropertiesKt.setFillableData(semanticsPropertyReceiver, FillableData_androidKt.createFromText(FillableData.Companion, this.value.getAnnotatedString()));
        SemanticsPropertiesKt.onFillData$default(semanticsPropertyReceiver, null, new l() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                CoreTextFieldSemanticsModifierNode.applySemantics$lambda$1(this.f$0, (FillableData) obj);
                return true;
            }
        }, 1, null);
        int iM10747getKeyboardTypePjHm6EE = this.imeOptions.m10747getKeyboardTypePjHm6EE();
        if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10807getEmailPjHm6EE())) {
            SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, ContentType.Companion.getEmailAddress());
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10815getPasswordPjHm6EE()) || KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10812getNumberPasswordPjHm6EE())) {
            SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, ContentType.Companion.getPassword());
        } else if (KeyboardType.m10770equalsimpl0(iM10747getKeyboardTypePjHm6EE, KeyboardType.Companion.m10818getPhonePjHm6EE())) {
            SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, ContentType.Companion.getPhoneNumber());
        }
        if (!this.enabled) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        if (this.isPassword) {
            SemanticsPropertiesKt.password(semanticsPropertyReceiver);
        }
        boolean z = false;
        if (this.enabled && !this.readOnly) {
            z = true;
        }
        SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, z);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new l() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda4
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(CoreTextFieldSemanticsModifierNode.applySemantics$lambda$2(this.f$0, (List) obj));
            }
        }, 1, null);
        if (z) {
            SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new l() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda5
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    CoreTextFieldSemanticsModifierNode.applySemantics$lambda$3(this.f$0, (AnnotatedString) obj);
                    return true;
                }
            }, 1, null);
            SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new l() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda6
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(CoreTextFieldSemanticsModifierNode.applySemantics$lambda$4(this.f$0, semanticsPropertyReceiver, (AnnotatedString) obj));
                }
            }, 1, null);
        }
        SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new q() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda7
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return Boolean.valueOf(CoreTextFieldSemanticsModifierNode.applySemantics$lambda$5(this.f$0, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue()));
            }
        }, 1, null);
        SemanticsPropertiesKt.m10332onImeAction9UiTYpY$default(semanticsPropertyReceiver, this.imeOptions.m10746getImeActioneUduSuo(), null, new a() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda8
            @Override // h.g.a.a
            public final Object invoke() {
                CoreTextFieldSemanticsModifierNode.applySemantics$lambda$6(this.f$0);
                return true;
            }
        }, 2, null);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda9
            @Override // h.g.a.a
            public final Object invoke() {
                CoreTextFieldSemanticsModifierNode.applySemantics$lambda$7(this.f$0);
                return true;
            }
        }, 1, null);
        SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda10
            @Override // h.g.a.a
            public final Object invoke() {
                CoreTextFieldSemanticsModifierNode.applySemantics$lambda$8(this.f$0);
                return true;
            }
        }, 1, null);
        if (!TextRange.m10540getCollapsedimpl(this.value.m10831getSelectiond9O1mEE()) && !this.isPassword) {
            SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda11
                @Override // h.g.a.a
                public final Object invoke() {
                    CoreTextFieldSemanticsModifierNode.applySemantics$lambda$9(this.f$0);
                    return true;
                }
            }, 1, null);
            if (this.enabled && !this.readOnly) {
                SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda12
                    @Override // h.g.a.a
                    public final Object invoke() {
                        CoreTextFieldSemanticsModifierNode.applySemantics$lambda$10(this.f$0);
                        return true;
                    }
                }, 1, null);
            }
        }
        if (!this.enabled || this.readOnly) {
            return;
        }
        SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                CoreTextFieldSemanticsModifierNode.applySemantics$lambda$11(this.f$0);
                return true;
            }
        }, 1, null);
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

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldClearDescendantSemantics() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return true;
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

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean isImportantForBounds() {
        return true;
    }

    public final boolean isPassword() {
        return this.isPassword;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setFocusRequester(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final void setImeOptions(ImeOptions imeOptions) {
        this.imeOptions = imeOptions;
    }

    public final void setManager(TextFieldSelectionManager textFieldSelectionManager) {
        this.manager = textFieldSelectionManager;
    }

    public final void setOffsetMapping(OffsetMapping offsetMapping) {
        this.offsetMapping = offsetMapping;
    }

    public final void setPassword(boolean z) {
        this.isPassword = z;
    }

    public final void setReadOnly(boolean z) {
        this.readOnly = z;
    }

    public final void setState(LegacyTextFieldState legacyTextFieldState) {
        this.state = legacyTextFieldState;
    }

    public final void setTransformedText(TransformedText transformedText) {
        this.transformedText = transformedText;
    }

    public final void setValue(TextFieldValue textFieldValue) {
        this.value = textFieldValue;
    }

    public final void updateNodeSemantics(TransformedText transformedText, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, boolean z, boolean z2, boolean z3, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, FocusRequester focusRequester) {
        boolean z4 = this.enabled;
        boolean z5 = z4 && !this.readOnly;
        boolean z6 = this.isPassword;
        ImeOptions imeOptions2 = this.imeOptions;
        TextFieldSelectionManager textFieldSelectionManager2 = this.manager;
        boolean z7 = z2 && !z;
        this.transformedText = transformedText;
        this.value = textFieldValue;
        this.state = legacyTextFieldState;
        this.readOnly = z;
        this.enabled = z2;
        this.offsetMapping = offsetMapping;
        this.manager = textFieldSelectionManager;
        this.imeOptions = imeOptions;
        this.focusRequester = focusRequester;
        if (z2 != z4 || z7 != z5 || !x.n(imeOptions, imeOptions2) || z3 != z6 || !TextRange.m10540getCollapsedimpl(textFieldValue.m10831getSelectiond9O1mEE())) {
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (x.n(textFieldSelectionManager, textFieldSelectionManager2)) {
            return;
        }
        textFieldSelectionManager.setRequestAutofillAction$foundation(new a() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return CoreTextFieldSemanticsModifierNode.updateNodeSemantics$lambda$0(this.f$0);
            }
        });
    }
}
