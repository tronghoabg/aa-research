package androidx.compose.foundation.text;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DeadKeyCombiner {
    public static final int $stable = 8;
    private Integer deadKeyCode;

    /* renamed from: consume-ZmokQxo, reason: not valid java name */
    public final Integer m3272consumeZmokQxo(KeyEvent keyEvent) {
        int iM9437getUtf16CodePointZmokQxo = KeyEvent_androidKt.m9437getUtf16CodePointZmokQxo(keyEvent);
        if ((Integer.MIN_VALUE & iM9437getUtf16CodePointZmokQxo) != 0) {
            this.deadKeyCode = Integer.valueOf(iM9437getUtf16CodePointZmokQxo & Integer.MAX_VALUE);
            return null;
        }
        Integer num = this.deadKeyCode;
        if (num == null) {
            return Integer.valueOf(iM9437getUtf16CodePointZmokQxo);
        }
        this.deadKeyCode = null;
        Integer numValueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), iM9437getUtf16CodePointZmokQxo));
        Integer num2 = numValueOf.intValue() != 0 ? numValueOf : null;
        if (num2 != null) {
            iM9437getUtf16CodePointZmokQxo = num2.intValue();
        }
        return Integer.valueOf(iM9437getUtf16CodePointZmokQxo);
    }
}
