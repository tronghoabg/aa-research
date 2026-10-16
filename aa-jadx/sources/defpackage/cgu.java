package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cgu {
    private final android.content.Context a;
    private android.view.autofill.AutofillManager b;

    public cgu(android.content.Context context) {
        this.a = context;
    }

    public final android.view.autofill.AutofillManager a() {
        android.view.autofill.AutofillManager autofillManager = this.b;
        if (autofillManager != null) {
            return autofillManager;
        }
        android.view.autofill.AutofillManager autofillManagerM16m = defpackage.a$$ExternalSyntheticApiModelOutline1.m16m(this.a.getSystemService(defpackage.a$$ExternalSyntheticApiModelOutline1.m27m$1()));
        if (autofillManagerM16m == null) {
            throw new java.lang.IllegalStateException("Could not locate AutofillManager from context");
        }
        this.b = autofillManagerM16m;
        return autofillManagerM16m;
    }

    public final void b(android.view.View view, int i, android.view.autofill.AutofillValue autofillValue) {
        a().notifyValueChanged(view, i, autofillValue);
    }

    public final void c(android.view.View view, int i, boolean z) {
        a().notifyViewVisibilityChanged(view, i, z);
    }
}
