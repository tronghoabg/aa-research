package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class KeyModifiersKt {
    /* renamed from: getModifiers-ZmokQxo, reason: not valid java name */
    public static final int m3320getModifiersZmokQxo(KeyEvent keyEvent) {
        return KeyModifiers.m3279constructorimpl(KeyEvent_androidKt.m9438isAltPressedZmokQxo(keyEvent), KeyEvent_androidKt.m9439isCtrlPressedZmokQxo(keyEvent), KeyEvent_androidKt.m9440isMetaPressedZmokQxo(keyEvent), KeyEvent_androidKt.m9441isShiftPressedZmokQxo(keyEvent));
    }
}
