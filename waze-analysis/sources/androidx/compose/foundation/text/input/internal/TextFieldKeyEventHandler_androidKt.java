package androidx.compose.foundation.text.input.internal;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.Key_androidKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldKeyEventHandler_androidKt {
    public static final TextFieldKeyEventHandler createTextFieldKeyEventHandler() {
        return new AndroidTextFieldKeyEventHandler();
    }

    /* renamed from: isFromHardwareSource-ZmokQxo, reason: not valid java name */
    public static final boolean m3676isFromHardwareSourceZmokQxo(KeyEvent keyEvent) {
        InputDevice device = keyEvent.getDevice();
        return (device == null || device.isVirtual() || device.getKeyboardType() != 2 || (keyEvent.getFlags() & 2) == 2) ? false : true;
    }

    /* renamed from: isFromSoftKeyboard-ZmokQxo, reason: not valid java name */
    public static final boolean m3677isFromSoftKeyboardZmokQxo(KeyEvent keyEvent) {
        return (keyEvent.getFlags() & 2) == 2;
    }

    /* renamed from: isKeyCode-YhN2O0w, reason: not valid java name */
    private static final boolean m3678isKeyCodeYhN2O0w(KeyEvent keyEvent, int i2) {
        return Key_androidKt.m9442getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent)) == i2;
    }
}
