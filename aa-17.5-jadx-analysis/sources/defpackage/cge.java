package defpackage;

import android.view.View;
import android.view.autofill.AutofillId;

/* loaded from: classes.dex */
public final class cge {
    public final View a;
    public AutofillId b;
    public final kgx c;

    public cge(View view, kgx kgxVar) {
        this.a = view;
        this.c = kgxVar;
        view.setImportantForAutofill(1);
        Object obj = new kwp(view.getAutofillId()).a;
        if (obj != null) {
            this.b = a$$ExternalSyntheticApiModelOutline0.m7m(obj);
        } else {
            crt.a("Required value was null.");
            throw new aezp();
        }
    }
}
