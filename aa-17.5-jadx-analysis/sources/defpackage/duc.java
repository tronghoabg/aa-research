package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public class duc {
    public dsx g;
    CharSequence h;
    CharSequence i;
    boolean j = false;

    protected String a() {
        throw null;
    }

    protected void b(Bundle bundle) {
        if (bundle.containsKey("android.summaryText")) {
            this.i = bundle.getCharSequence("android.summaryText");
            this.j = true;
        }
        this.h = bundle.getCharSequence("android.title.big");
    }

    public void c(mko mkoVar) {
        throw null;
    }

    public void e(Bundle bundle) {
        if (this.j) {
            bundle.putCharSequence("android.summaryText", this.i);
        }
        CharSequence charSequence = this.h;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", a());
    }

    public void i() {
    }
}
