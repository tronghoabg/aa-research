package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.TextFieldKeyInput_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import h.ab;
import h.g.a.a;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidTextFieldKeyEventHandler extends TextFieldKeyEventHandler {
    public static final int $stable = 8;

    @Override // androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler
    /* renamed from: onKeyEvent-8zsqlwg, reason: not valid java name */
    public boolean mo3511onKeyEvent8zsqlwg(KeyEvent keyEvent, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, p<? super KeyCommand, ? super Boolean, ? extends ab> pVar, SoftwareKeyboardController softwareKeyboardController, boolean z, boolean z2, a<Boolean> aVar) {
        if (KeyEventType.m9428equalsimpl0(KeyEvent_androidKt.m9436getTypeZmokQxo(keyEvent), KeyEventType.Companion.m9432getKeyDownCS__XNY()) && keyEvent.isFromSource(257) && (!TextFieldKeyEventHandler_androidKt.m3677isFromSoftKeyboardZmokQxo(keyEvent) || !TextFieldKeyInput_androidKt.m3411isTypedEventZmokQxo(keyEvent))) {
            textFieldSelectionState.setInTouchMode(false);
        }
        return super.mo3511onKeyEvent8zsqlwg(keyEvent, transformedTextFieldState, textLayoutState, textFieldSelectionState, pVar, softwareKeyboardController, z, z2, aVar);
    }
}
