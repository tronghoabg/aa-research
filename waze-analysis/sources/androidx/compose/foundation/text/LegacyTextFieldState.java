package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.HeightForSingleLineFieldProvider;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.waze.strings.DisplayStrings;
import h.a.ac;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LegacyTextFieldState implements HeightForSingleLineFieldProvider {
    public static final int $stable = 8;
    private LayoutCoordinates _layoutCoordinates;
    private TextInputSession inputSession;
    private final KeyboardActionRunner keyboardActionRunner;
    private final SoftwareKeyboardController keyboardController;
    private final RecomposeScope recomposeScope;
    private TextDelegate textDelegate;
    private AnnotatedString untransformedText;
    private final EditProcessor processor = new EditProcessor();
    private final MutableState hasFocus$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final MutableState heightForSingleLineField$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m11162boximpl(0.0f), null, 2, null);
    private final MutableState<TextLayoutResultProxy> layoutResultState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final MutableState handleState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(HandleState.None, null, 2, null);
    private final MutableState showFloatingToolbar$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final MutableState showSelectionHandleStart$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final MutableState showSelectionHandleEnd$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final MutableState showCursorHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private boolean isLayoutResultStale = true;
    private final MutableState isInTouchMode$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
    private final MutableState autofillHighlightOn$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final MutableState justAutofilled$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private l<? super TextFieldValue, ab> onValueChangeOriginal = new l() { // from class: androidx.compose.foundation.text.LegacyTextFieldState$$ExternalSyntheticLambda0
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return ab.f48028a;
        }
    };
    private final l<TextFieldValue, ab> onValueChange = new l() { // from class: androidx.compose.foundation.text.LegacyTextFieldState$$ExternalSyntheticLambda1
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return LegacyTextFieldState.onValueChange$lambda$0(this.f$0, (TextFieldValue) obj);
        }
    };
    private final l<ImeAction, ab> onImeActionPerformed = new l() { // from class: androidx.compose.foundation.text.LegacyTextFieldState$$ExternalSyntheticLambda2
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return LegacyTextFieldState.onImeActionPerformed$lambda$0(this.f$0, (ImeAction) obj);
        }
    };
    private final l<ImeAction, Boolean> onImeActionPerformedWithResult = new l() { // from class: androidx.compose.foundation.text.LegacyTextFieldState$$ExternalSyntheticLambda3
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return Boolean.valueOf(this.f$0.keyboardActionRunner.m3323runActionKlQnJC8(((ImeAction) obj).m10720unboximpl()));
        }
    };
    private final Paint highlightPaint = AndroidPaint_androidKt.Paint();
    private long selectionBackgroundColor = Color.Companion.m8264getUnspecified0d7_KjU();
    private final MutableState selectionPreviewHighlightRange$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TextRange.m10534boximpl(TextRange.Companion.m10551getZerod9O1mEE()), null, 2, null);
    private final MutableState deletionPreviewHighlightRange$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TextRange.m10534boximpl(TextRange.Companion.m10551getZerod9O1mEE()), null, 2, null);

    public LegacyTextFieldState(TextDelegate textDelegate, RecomposeScope recomposeScope, SoftwareKeyboardController softwareKeyboardController) {
        this.textDelegate = textDelegate;
        this.recomposeScope = recomposeScope;
        this.keyboardController = softwareKeyboardController;
        this.keyboardActionRunner = new KeyboardActionRunner(softwareKeyboardController);
    }

    static final ab onImeActionPerformed$lambda$0(LegacyTextFieldState legacyTextFieldState, ImeAction imeAction) {
        legacyTextFieldState.keyboardActionRunner.m3323runActionKlQnJC8(imeAction.m10720unboximpl());
        return ab.f48028a;
    }

    static final ab onValueChange$lambda$0(LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue) {
        String text = textFieldValue.getText();
        AnnotatedString annotatedString = legacyTextFieldState.untransformedText;
        if (!x.n(text, annotatedString != null ? annotatedString.getText() : null)) {
            legacyTextFieldState.setHandleState(HandleState.None);
            if (legacyTextFieldState.getJustAutofilled()) {
                legacyTextFieldState.setJustAutofilled(false);
            } else {
                legacyTextFieldState.setAutofillHighlightOn(false);
            }
        }
        legacyTextFieldState.m3347setSelectionPreviewHighlightRange5zctL8(TextRange.Companion.m10551getZerod9O1mEE());
        legacyTextFieldState.m3344setDeletionPreviewHighlightRange5zctL8(TextRange.Companion.m10551getZerod9O1mEE());
        legacyTextFieldState.onValueChangeOriginal.invoke(textFieldValue);
        legacyTextFieldState.recomposeScope.invalidate();
        return ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getAutofillHighlightOn() {
        return ((Boolean) this.autofillHighlightOn$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getDeletionPreviewHighlightRange-d9O1mEE, reason: not valid java name */
    public final long m3340getDeletionPreviewHighlightRanged9O1mEE() {
        return ((TextRange) this.deletionPreviewHighlightRange$delegate.getValue()).m10550unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final HandleState getHandleState() {
        return (HandleState) this.handleState$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.text.input.internal.HeightForSingleLineFieldProvider
    /* renamed from: getHeightForSingleLineField-D9Ej5fM, reason: not valid java name */
    public float mo3341getHeightForSingleLineFieldD9Ej5fM() {
        return ((Dp) this.heightForSingleLineField$delegate.getValue()).m11178unboximpl();
    }

    public final Paint getHighlightPaint() {
        return this.highlightPaint;
    }

    public final TextInputSession getInputSession() {
        return this.inputSession;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getJustAutofilled() {
        return ((Boolean) this.justAutofilled$delegate.getValue()).booleanValue();
    }

    public final SoftwareKeyboardController getKeyboardController() {
        return this.keyboardController;
    }

    public final LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates layoutCoordinates = this._layoutCoordinates;
        if (layoutCoordinates == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        return layoutCoordinates;
    }

    public final TextLayoutResultProxy getLayoutResult() {
        return this.layoutResultState.getValue();
    }

    public final l<ImeAction, ab> getOnImeActionPerformed() {
        return this.onImeActionPerformed;
    }

    public final l<ImeAction, Boolean> getOnImeActionPerformedWithResult() {
        return this.onImeActionPerformedWithResult;
    }

    public final l<TextFieldValue, ab> getOnValueChange() {
        return this.onValueChange;
    }

    public final EditProcessor getProcessor() {
        return this.processor;
    }

    public final RecomposeScope getRecomposeScope() {
        return this.recomposeScope;
    }

    /* renamed from: getSelectionBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m3342getSelectionBackgroundColor0d7_KjU() {
        return this.selectionBackgroundColor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSelectionPreviewHighlightRange-d9O1mEE, reason: not valid java name */
    public final long m3343getSelectionPreviewHighlightRanged9O1mEE() {
        return ((TextRange) this.selectionPreviewHighlightRange$delegate.getValue()).m10550unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowCursorHandle() {
        return ((Boolean) this.showCursorHandle$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowFloatingToolbar() {
        return ((Boolean) this.showFloatingToolbar$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowSelectionHandleEnd() {
        return ((Boolean) this.showSelectionHandleEnd$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowSelectionHandleStart() {
        return ((Boolean) this.showSelectionHandleStart$delegate.getValue()).booleanValue();
    }

    public final TextDelegate getTextDelegate() {
        return this.textDelegate;
    }

    public final AnnotatedString getUntransformedText() {
        return this.untransformedText;
    }

    public final boolean hasHighlight() {
        return (TextRange.m10540getCollapsedimpl(m3343getSelectionPreviewHighlightRanged9O1mEE()) && TextRange.m10540getCollapsedimpl(m3340getDeletionPreviewHighlightRanged9O1mEE())) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isInTouchMode() {
        return ((Boolean) this.isInTouchMode$delegate.getValue()).booleanValue();
    }

    public final boolean isLayoutResultStale() {
        return this.isLayoutResultStale;
    }

    public final void setAutofillHighlightOn(boolean z) {
        this.autofillHighlightOn$delegate.setValue(Boolean.valueOf(z));
    }

    /* renamed from: setDeletionPreviewHighlightRange-5zc-tL8, reason: not valid java name */
    public final void m3344setDeletionPreviewHighlightRange5zctL8(long j2) {
        this.deletionPreviewHighlightRange$delegate.setValue(TextRange.m10534boximpl(j2));
    }

    public final void setHandleState(HandleState handleState) {
        this.handleState$delegate.setValue(handleState);
    }

    public final void setHasFocus(boolean z) {
        this.hasFocus$delegate.setValue(Boolean.valueOf(z));
    }

    /* renamed from: setHeightForSingleLineField-0680j_4, reason: not valid java name */
    public void m3345setHeightForSingleLineField0680j_4(float f2) {
        this.heightForSingleLineField$delegate.setValue(Dp.m11162boximpl(f2));
    }

    public final void setInTouchMode(boolean z) {
        this.isInTouchMode$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setInputSession(TextInputSession textInputSession) {
        this.inputSession = textInputSession;
    }

    public final void setJustAutofilled(boolean z) {
        this.justAutofilled$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this._layoutCoordinates = layoutCoordinates;
    }

    public final void setLayoutResult(TextLayoutResultProxy textLayoutResultProxy) {
        this.layoutResultState.setValue(textLayoutResultProxy);
        this.isLayoutResultStale = false;
    }

    /* renamed from: setSelectionBackgroundColor-8_81llA, reason: not valid java name */
    public final void m3346setSelectionBackgroundColor8_81llA(long j2) {
        this.selectionBackgroundColor = j2;
    }

    /* renamed from: setSelectionPreviewHighlightRange-5zc-tL8, reason: not valid java name */
    public final void m3347setSelectionPreviewHighlightRange5zctL8(long j2) {
        this.selectionPreviewHighlightRange$delegate.setValue(TextRange.m10534boximpl(j2));
    }

    public final void setShowCursorHandle(boolean z) {
        this.showCursorHandle$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setShowFloatingToolbar(boolean z) {
        this.showFloatingToolbar$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setShowSelectionHandleEnd(boolean z) {
        this.showSelectionHandleEnd$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setShowSelectionHandleStart(boolean z) {
        this.showSelectionHandleStart$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setTextDelegate(TextDelegate textDelegate) {
        this.textDelegate = textDelegate;
    }

    public final void setUntransformedText(AnnotatedString annotatedString) {
        this.untransformedText = annotatedString;
    }

    /* renamed from: update-fnh65Uc, reason: not valid java name */
    public final void m3348updatefnh65Uc(AnnotatedString annotatedString, AnnotatedString annotatedString2, TextStyle textStyle, boolean z, Density density, FontFamily.Resolver resolver, l<? super TextFieldValue, ab> lVar, KeyboardActions keyboardActions, FocusManager focusManager, long j2) {
        this.onValueChangeOriginal = lVar;
        this.selectionBackgroundColor = j2;
        KeyboardActionRunner keyboardActionRunner = this.keyboardActionRunner;
        keyboardActionRunner.setKeyboardActions(keyboardActions);
        keyboardActionRunner.setFocusManager(focusManager);
        this.untransformedText = annotatedString;
        TextDelegate textDelegateM3384updateTextDelegaterm0N8CA$default = TextDelegateKt.m3384updateTextDelegaterm0N8CA$default(this.textDelegate, annotatedString2, textStyle, density, resolver, z, 0, 0, 0, ac.f47967a, DisplayStrings.DS_ACCIDENT, null);
        if (this.textDelegate != textDelegateM3384updateTextDelegaterm0N8CA$default) {
            this.isLayoutResultStale = true;
        }
        this.textDelegate = textDelegateM3384updateTextDelegaterm0N8CA$default;
    }
}
