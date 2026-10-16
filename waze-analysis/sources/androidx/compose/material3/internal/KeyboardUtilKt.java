package androidx.compose.material3.internal;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class KeyboardUtilKt {
    /* renamed from: isShiftTab-ZmokQxo, reason: not valid java name */
    public static final boolean m6277isShiftTabZmokQxo(KeyEvent keyEvent) {
        return KeyEvent_androidKt.m9441isShiftPressedZmokQxo(keyEvent) && KeyEventType.m9428equalsimpl0(KeyEvent_androidKt.m9436getTypeZmokQxo(keyEvent), KeyEventType.Companion.m9432getKeyDownCS__XNY()) && Key.m9115equalsimpl0(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent), Key.Companion.m9363getTabEK5gGoQ());
    }

    /* renamed from: isTab-ZmokQxo, reason: not valid java name */
    public static final boolean m6278isTabZmokQxo(KeyEvent keyEvent) {
        return !KeyEvent_androidKt.m9441isShiftPressedZmokQxo(keyEvent) && KeyEventType.m9428equalsimpl0(KeyEvent_androidKt.m9436getTypeZmokQxo(keyEvent), KeyEventType.Companion.m9432getKeyDownCS__XNY()) && Key.m9115equalsimpl0(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent), Key.Companion.m9363getTabEK5gGoQ());
    }
}
