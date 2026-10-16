package androidx.compose.foundation.text;

import android.view.InputDevice;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.key.Key_androidKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldFocusModifier_androidKt {
    public static final Modifier interceptDPadAndMoveFocus(Modifier modifier, final LegacyTextFieldState legacyTextFieldState, final FocusManager focusManager) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new l<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus.1
            @Override // h.g.a.l
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m3400invokeZmokQxo(keyEvent.m9424unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m3400invokeZmokQxo(android.view.KeyEvent keyEvent) {
                InputDevice device = keyEvent.getDevice();
                boolean zMo7869moveFocus3ESFkO8 = false;
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent.getSource() == 33554433) && KeyEventType.m9428equalsimpl0(KeyEvent_androidKt.m9436getTypeZmokQxo(keyEvent), KeyEventType.Companion.m9432getKeyDownCS__XNY()) && keyEvent.getSource() != 257)) {
                    if (TextFieldFocusModifier_androidKt.m3399isKeyCodeYhN2O0w(keyEvent, 19)) {
                        zMo7869moveFocus3ESFkO8 = focusManager.mo7869moveFocus3ESFkO8(FocusDirection.Companion.m7866getUpdhqQ8s());
                    } else if (TextFieldFocusModifier_androidKt.m3399isKeyCodeYhN2O0w(keyEvent, 20)) {
                        zMo7869moveFocus3ESFkO8 = focusManager.mo7869moveFocus3ESFkO8(FocusDirection.Companion.m7859getDowndhqQ8s());
                    } else if (TextFieldFocusModifier_androidKt.m3399isKeyCodeYhN2O0w(keyEvent, 21)) {
                        zMo7869moveFocus3ESFkO8 = focusManager.mo7869moveFocus3ESFkO8(FocusDirection.Companion.m7862getLeftdhqQ8s());
                    } else if (TextFieldFocusModifier_androidKt.m3399isKeyCodeYhN2O0w(keyEvent, 22)) {
                        zMo7869moveFocus3ESFkO8 = focusManager.mo7869moveFocus3ESFkO8(FocusDirection.Companion.m7865getRightdhqQ8s());
                    } else if (TextFieldFocusModifier_androidKt.m3399isKeyCodeYhN2O0w(keyEvent, 23)) {
                        SoftwareKeyboardController keyboardController = legacyTextFieldState.getKeyboardController();
                        zMo7869moveFocus3ESFkO8 = true;
                        if (keyboardController != null) {
                            keyboardController.show();
                        }
                    }
                }
                return Boolean.valueOf(zMo7869moveFocus3ESFkO8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isKeyCode-YhN2O0w, reason: not valid java name */
    public static final boolean m3399isKeyCodeYhN2O0w(android.view.KeyEvent keyEvent, int i2) {
        return Key_androidKt.m9442getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent)) == i2;
    }
}
