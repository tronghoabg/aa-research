package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class KeyMappingKt {
    private static final KeyMapping defaultKeyMapping;

    static {
        final KeyMapping keyMappingM3276commonKeyMappingVSD1kLU = m3276commonKeyMappingVSD1kLU(KeyModifiers.Companion.m3312getCtrlAuQ4EfA());
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1$1
            /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public androidx.compose.foundation.text.KeyCommand mo3275mapZmokQxo(android.view.KeyEvent r8) {
                /*
                    Method dump skipped, instructions count: 592
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1$1.mo3275mapZmokQxo(android.view.KeyEvent):androidx.compose.foundation.text.KeyCommand");
            }
        };
    }

    /* renamed from: commonKeyMapping-VSD1kLU, reason: not valid java name */
    public static final KeyMapping m3276commonKeyMappingVSD1kLU(final int i2) {
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$commonKeyMapping$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo3275mapZmokQxo(KeyEvent keyEvent) {
                int iM3320getModifiersZmokQxo = KeyModifiersKt.m3320getModifiersZmokQxo(keyEvent);
                int iM3318getShiftAuQ4EfA = KeyModifiers.Companion.m3318getShiftAuQ4EfA();
                int i3 = i2;
                if (KeyModifiers.m3282equalsimpl0(iM3320getModifiersZmokQxo, KeyModifiers.m3295plus1uj4btU(i3, iM3318getShiftAuQ4EfA))) {
                    if (Key.m9115equalsimpl0(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent), Key.Companion.m9413getZEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    return null;
                }
                if (KeyModifiers.m3282equalsimpl0(iM3320getModifiersZmokQxo, i3)) {
                    long jM9435getKeyZmokQxo = KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent);
                    if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9170getCEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9234getInsertEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9301getNumPadInsertEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9402getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9410getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9120getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9411getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9413getZEK5gGoQ())) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                }
                if (KeyModifiers.m3282equalsimpl0(iM3320getModifiersZmokQxo, KeyModifiers.Companion.m3318getShiftAuQ4EfA())) {
                    long jM9435getKeyZmokQxo2 = KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent);
                    if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9192getDirectionLeftEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9294getNumPadDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9193getDirectionRightEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9295getNumPadDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9194getDirectionUpEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9296getNumPadDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9189getDirectionDownEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9293getNumPadDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9315getPageUpEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9307getNumPadPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9314getPageDownEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9306getNumPadPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9268getMoveHomeEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9304getNumPadMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9267getMoveEndEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9303getNumPadMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9234getInsertEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo2, Key.Companion.m9301getNumPadInsertEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                if (!KeyModifiers.m3282equalsimpl0(iM3320getModifiersZmokQxo, KeyModifiers.Companion.m3317getNoneAuQ4EfA())) {
                    return null;
                }
                long jM9435getKeyZmokQxo3 = KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent);
                if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9192getDirectionLeftEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9294getNumPadDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9193getDirectionRightEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9295getNumPadDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9194getDirectionUpEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9296getNumPadDirectionUpEK5gGoQ())) {
                    return KeyCommand.UP;
                }
                if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9189getDirectionDownEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9293getNumPadDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9188getDirectionCenterEK5gGoQ())) {
                    return KeyCommand.CENTER;
                }
                if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9315getPageUpEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9307getNumPadPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9314getPageDownEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9306getNumPadPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9268getMoveHomeEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9304getNumPadMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9267getMoveEndEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9303getNumPadMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9202getEnterEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9299getNumPadEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9133getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9187getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9317getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9185getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9182getCopyEK5gGoQ())) {
                    return KeyCommand.COPY;
                }
                if (Key.m9115equalsimpl0(jM9435getKeyZmokQxo3, Key.Companion.m9363getTabEK5gGoQ())) {
                    return KeyCommand.TAB;
                }
                return null;
            }
        };
    }

    public static final KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }
}
