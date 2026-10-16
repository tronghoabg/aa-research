package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
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
        android.view.autofill.AutofillManager autofillManagerM = a$.ExternalSyntheticApiModelOutline1.m(this.a.getSystemService(a$.ExternalSyntheticApiModelOutline1.m$1()));
        if (autofillManagerM == null) {
            throw new java.lang.IllegalStateException("Could not locate AutofillManager from context");
        }
        this.b = autofillManagerM;
        return autofillManagerM;
    }

    public final void b(android.view.View view, int i, android.view.autofill.AutofillValue autofillValue) {
        a$.ExternalSyntheticApiModelOutline1.m(a(), view, i, autofillValue);
    }

    public final void c(android.view.View view, int i, boolean z) {
        cgu$.ExternalSyntheticApiModelOutline0.m(a(), view, i, z);
    }
}
