package defpackage;

import android.view.inputmethod.InputConnection;
import androidx.car.app.model.Alert;

/* loaded from: classes2.dex */
public final class lbd {
    public static final yph a = yph.c("GH.KeyboardBinderWrappr");
    public final int b;
    public boolean c = false;
    final xcv d;

    public lbd(xcv xcvVar, int i) {
        this.d = xcvVar;
        this.b = i;
    }

    public final String a() {
        InputConnection inputConnection;
        CharSequence textBeforeCursor;
        if (this.c) {
            ((ype) ((ype) a.h()).ai((char) 3724)).u("getCurrentString called after being told to detach.");
            return "";
        }
        xcv xcvVar = this.d;
        return (!xcvVar.a(this.b) || (inputConnection = xcvVar.a.c) == null || (textBeforeCursor = inputConnection.getTextBeforeCursor(Alert.DURATION_SHOW_INDEFINITELY, 0)) == null) ? "" : textBeforeCursor.toString();
    }

    public final void b(ajmd ajmdVar) {
        if (this.c) {
            ((ype) ((ype) a.h()).ai((char) 3726)).u("setExternalKeyboardCallback called after being told to detach.");
            return;
        }
        xcv xcvVar = this.d;
        if (xcvVar.a(this.b)) {
            xcw xcwVar = xcvVar.a;
            xcwVar.q = ajmdVar;
            xdc xdcVarF = xcwVar.f();
            if (ajmdVar != null) {
                xcwVar.k = true;
                if (xdcVarF != null) {
                    xdcVarF.b(true);
                    return;
                }
                return;
            }
            if (xcwVar.k) {
                xcwVar.k = false;
                if (xdcVarF != null) {
                    xdcVarF.b(false);
                }
            }
        }
    }
}
