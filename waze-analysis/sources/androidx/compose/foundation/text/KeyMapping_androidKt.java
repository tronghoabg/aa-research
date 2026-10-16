package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class KeyMapping_androidKt {
    private static final KeyMapping platformDefaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMapping_androidKt$platformDefaultKeyMapping$1
        @Override // androidx.compose.foundation.text.KeyMapping
        /* renamed from: map-ZmokQxo */
        public KeyCommand mo3275mapZmokQxo(KeyEvent keyEvent) {
            int iM3320getModifiersZmokQxo = KeyModifiersKt.m3320getModifiersZmokQxo(keyEvent);
            KeyCommand keyCommand = null;
            if (KeyModifiers.m3282equalsimpl0(iM3320getModifiersZmokQxo, KeyModifiers.Companion.m3311getAltShiftAuQ4EfA())) {
                long jM9435getKeyZmokQxo = KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent);
                if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9192getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_LEFT;
                } else if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9193getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                } else if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9194getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_HOME;
                } else if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9189getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_END;
                }
            } else if (KeyModifiers.m3282equalsimpl0(iM3320getModifiersZmokQxo, KeyModifiers.Companion.m3309getAltAuQ4EfA())) {
                long jM9435getKeyZmokQxo2 = KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent);
                if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9192getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_LEFT;
                } else if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9193getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_RIGHT;
                } else if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9194getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.HOME;
                } else if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9189getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.END;
                } else if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9133getBackspaceEK5gGoQ())) {
                    keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                }
            }
            return keyCommand == null ? KeyMappingKt.getDefaultKeyMapping().mo3275mapZmokQxo(keyEvent) : keyCommand;
        }
    };

    public static final KeyMapping getPlatformDefaultKeyMapping() {
        return platformDefaultKeyMapping;
    }
}
