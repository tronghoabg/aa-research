package defpackage;

import android.util.Pair;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.projection.gearhead.R;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class xcx extends xcs {
    private static final Pattern o = Pattern.compile("[0-9*#+.]*");

    private static final boolean l(String str) {
        return o.matcher(str).matches();
    }

    @Override // defpackage.xcs
    protected final int a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (l((String) pair.second)) {
                this.c.commitText((CharSequence) pair.second, 1);
                return ((String) pair.second).length();
            }
        }
        return -1;
    }

    @Override // defpackage.xcs
    protected final xdy c() {
        EditorInfo editorInfo = this.f;
        int i = editorInfo.extras != null ? new int[]{1, 2}[editorInfo.extras.getInt("dialpad_type", 0)] : 1;
        if (i != 0) {
            return new xdy(this.b, i + (-1) != 1 ? R.xml.rotary_keyboard_layout_dialpad : R.xml.rotary_keyboard_layout_dialpad_no_actions, this.g, editorInfo);
        }
        throw null;
    }

    @Override // defpackage.xcs
    public final void e(int i, int i2) {
        KeyEvent keyEvent = new KeyEvent(0, i);
        InputConnection inputConnection = this.c;
        inputConnection.sendKeyEvent(keyEvent);
        if (i == -5) {
            inputConnection.deleteSurroundingText(1, 0);
        } else if (i2 == 0) {
            String strValueOf = String.valueOf((char) i);
            if (l(strValueOf)) {
                inputConnection.commitText(strValueOf, 1);
            }
        }
    }

    @Override // defpackage.xcs
    public final void f(int i, boolean z) {
        if (z) {
            this.d.f();
        }
        this.c.sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // defpackage.xcs
    public final boolean k() {
        return false;
    }
}
