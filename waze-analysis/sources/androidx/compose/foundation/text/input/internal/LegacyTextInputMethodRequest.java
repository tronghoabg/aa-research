package androidx.compose.foundation.text.input.internal;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import h.ab;
import h.f;
import h.g;
import h.g.a.a;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import h.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LegacyTextInputMethodRequest implements PlatformTextInputMethodRequest {
    public static final int $stable = 8;
    private final LegacyCursorAnchorInfoController cursorAnchorInfoController;
    private Rect focusedRect;
    private final InputMethodManager inputMethodManager;
    private LegacyTextFieldState legacyTextFieldState;
    private TextFieldSelectionManager textFieldSelectionManager;
    private final View view;
    private ViewConfiguration viewConfiguration;
    private l<? super List<? extends EditCommand>, ab> onEditCommand = new l() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$$ExternalSyntheticLambda0
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return ab.f48028a;
        }
    };
    private l<? super ImeAction, ab> onImeActionPerformed = new l() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$$ExternalSyntheticLambda1
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return ab.f48028a;
        }
    };
    private TextFieldValue state = new TextFieldValue("", TextRange.Companion.m10551getZerod9O1mEE(), (TextRange) null, 4, (o) null);
    private ImeOptions imeOptions = ImeOptions.Companion.getDefault();
    private List<WeakReference<RecordingInputConnection>> ics = new ArrayList();
    private final f baseInputConnection$delegate = g.b(h.f48132c, new a() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$$ExternalSyntheticLambda2
        @Override // h.g.a.a
        public final Object invoke() {
            return LegacyTextInputMethodRequest.baseInputConnection_delegate$lambda$0(this.f$0);
        }
    });

    public LegacyTextInputMethodRequest(View view, l<? super Matrix, ab> lVar, InputMethodManager inputMethodManager) {
        this.view = view;
        this.inputMethodManager = inputMethodManager;
        this.cursorAnchorInfoController = new LegacyCursorAnchorInfoController(lVar, inputMethodManager);
    }

    static final BaseInputConnection baseInputConnection_delegate$lambda$0(LegacyTextInputMethodRequest legacyTextInputMethodRequest) {
        return new BaseInputConnection(legacyTextInputMethodRequest.view, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection getBaseInputConnection() {
        return (BaseInputConnection) this.baseInputConnection$delegate.getValue();
    }

    private final void restartInputImmediately() {
        this.inputMethodManager.restartInput();
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputMethodRequest
    public RecordingInputConnection createInputConnection(EditorInfo editorInfo) {
        EditorInfo_androidKt.m3525updatepLxbY9I$default(editorInfo, this.state.getText(), this.state.m10831getSelectiond9O1mEE(), this.imeOptions, null, 8, null);
        LegacyPlatformTextInputServiceAdapter_androidKt.updateWithEmojiCompat(editorInfo);
        TextFieldValue textFieldValue = this.state;
        boolean autoCorrect = this.imeOptions.getAutoCorrect();
        RecordingInputConnection recordingInputConnection = new RecordingInputConnection(textFieldValue, new InputEventCallback2() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest.createInputConnection.1
            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public void onConnectionClosed(RecordingInputConnection recordingInputConnection2) {
                int size = LegacyTextInputMethodRequest.this.ics.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (x.n(((WeakReference) LegacyTextInputMethodRequest.this.ics.get(i2)).get(), recordingInputConnection2)) {
                        LegacyTextInputMethodRequest.this.ics.remove(i2);
                        return;
                    }
                }
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public void onEditCommands(List<? extends EditCommand> list) {
                LegacyTextInputMethodRequest.this.onEditCommand.invoke(list);
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            /* renamed from: onImeAction-KlQnJC8 */
            public void mo3551onImeActionKlQnJC8(int i2) {
                LegacyTextInputMethodRequest.this.onImeActionPerformed.invoke(ImeAction.m10714boximpl(i2));
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public void onKeyEvent(KeyEvent keyEvent) {
                LegacyTextInputMethodRequest.this.getBaseInputConnection().sendKeyEvent(keyEvent);
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public void onRequestCursorAnchorInfo(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
                LegacyTextInputMethodRequest.this.cursorAnchorInfoController.requestUpdate(z, z2, z3, z4, z5, z6);
            }
        }, autoCorrect, this.legacyTextFieldState, this.textFieldSelectionManager, this.viewConfiguration);
        this.ics.add(new WeakReference<>(recordingInputConnection));
        return recordingInputConnection;
    }

    public final Rect getFocusedRect$foundation() {
        return this.focusedRect;
    }

    public final TextFieldValue getState() {
        return this.state;
    }

    public final View getView() {
        return this.view;
    }

    public final void notifyFocusedRect(androidx.compose.ui.geometry.Rect rect) {
        Rect rect2;
        this.focusedRect = new Rect(h.h.a.b(rect.getLeft()), h.h.a.b(rect.getTop()), h.h.a.b(rect.getRight()), h.h.a.b(rect.getBottom()));
        if (!this.ics.isEmpty() || (rect2 = this.focusedRect) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new Rect(rect2));
    }

    public final void setFocusedRect$foundation(Rect rect) {
        this.focusedRect = rect;
    }

    public final void startInput(TextFieldValue textFieldValue, LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode, ImeOptions imeOptions, l<? super List<? extends EditCommand>, ab> lVar, l<? super ImeAction, ab> lVar2) {
        this.state = textFieldValue;
        this.imeOptions = imeOptions;
        this.onEditCommand = lVar;
        this.onImeActionPerformed = lVar2;
        this.legacyTextFieldState = legacyPlatformTextInputNode != null ? legacyPlatformTextInputNode.getLegacyTextFieldState() : null;
        this.textFieldSelectionManager = legacyPlatformTextInputNode != null ? legacyPlatformTextInputNode.getTextFieldSelectionManager() : null;
        this.viewConfiguration = legacyPlatformTextInputNode != null ? legacyPlatformTextInputNode.getViewConfiguration() : null;
    }

    public final void updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        boolean z = true;
        if (TextRange.m10539equalsimpl0(this.state.m10831getSelectiond9O1mEE(), textFieldValue2.m10831getSelectiond9O1mEE()) && x.n(this.state.m10830getCompositionMzsxiRA(), textFieldValue2.m10830getCompositionMzsxiRA())) {
            z = false;
        }
        this.state = textFieldValue2;
        int size = this.ics.size();
        for (int i2 = 0; i2 < size; i2++) {
            RecordingInputConnection recordingInputConnection = this.ics.get(i2).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.setTextFieldValue$foundation(textFieldValue2);
            }
        }
        this.cursorAnchorInfoController.invalidate();
        if (x.n(textFieldValue, textFieldValue2)) {
            if (z) {
                InputMethodManager inputMethodManager = this.inputMethodManager;
                int iM10544getMinimpl = TextRange.m10544getMinimpl(textFieldValue2.m10831getSelectiond9O1mEE());
                int iM10543getMaximpl = TextRange.m10543getMaximpl(textFieldValue2.m10831getSelectiond9O1mEE());
                TextRange textRangeM10830getCompositionMzsxiRA = this.state.m10830getCompositionMzsxiRA();
                int iM10544getMinimpl2 = textRangeM10830getCompositionMzsxiRA != null ? TextRange.m10544getMinimpl(textRangeM10830getCompositionMzsxiRA.m10550unboximpl()) : -1;
                TextRange textRangeM10830getCompositionMzsxiRA2 = this.state.m10830getCompositionMzsxiRA();
                inputMethodManager.updateSelection(iM10544getMinimpl, iM10543getMaximpl, iM10544getMinimpl2, textRangeM10830getCompositionMzsxiRA2 != null ? TextRange.m10543getMaximpl(textRangeM10830getCompositionMzsxiRA2.m10550unboximpl()) : -1);
                return;
            }
            return;
        }
        if (textFieldValue != null && (!x.n(textFieldValue.getText(), textFieldValue2.getText()) || (TextRange.m10539equalsimpl0(textFieldValue.m10831getSelectiond9O1mEE(), textFieldValue2.m10831getSelectiond9O1mEE()) && !x.n(textFieldValue.m10830getCompositionMzsxiRA(), textFieldValue2.m10830getCompositionMzsxiRA())))) {
            restartInputImmediately();
            return;
        }
        int size2 = this.ics.size();
        for (int i3 = 0; i3 < size2; i3++) {
            RecordingInputConnection recordingInputConnection2 = this.ics.get(i3).get();
            if (recordingInputConnection2 != null) {
                recordingInputConnection2.updateInputState(this.state, this.inputMethodManager);
            }
        }
    }

    public final void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2) {
        this.cursorAnchorInfoController.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, rect, rect2);
    }
}
