package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class duj {
    public defpackage.dte g;
    java.lang.CharSequence h;
    java.lang.CharSequence i;
    boolean j = false;

    protected java.lang.String a() {
        throw null;
    }

    protected void b(android.os.Bundle bundle) {
        if (bundle.containsKey("android.summaryText")) {
            this.i = bundle.getCharSequence("android.summaryText");
            this.j = true;
        }
        this.h = bundle.getCharSequence("android.title.big");
    }

    public void c(defpackage.mku mkuVar) {
        throw null;
    }

    public void e(android.os.Bundle bundle) {
        if (this.j) {
            bundle.putCharSequence("android.summaryText", this.i);
        }
        java.lang.CharSequence charSequence = this.h;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", a());
    }

    public void i() {
    }
}
