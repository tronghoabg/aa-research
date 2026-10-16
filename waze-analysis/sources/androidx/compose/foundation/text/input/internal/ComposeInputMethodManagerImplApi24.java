package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
class ComposeInputMethodManagerImplApi24 extends ComposeInputMethodManagerImplApi21 {
    public ComposeInputMethodManagerImplApi24(View view) {
        super(view);
    }

    @Override // androidx.compose.foundation.text.input.internal.ComposeInputMethodManagerImplApi21, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void sendKeyEvent(KeyEvent keyEvent) {
        requireImm().dispatchKeyEventFromInputMethod(getView(), keyEvent);
    }
}
