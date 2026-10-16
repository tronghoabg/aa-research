package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class smj extends defpackage.smn {
    protected final defpackage.smr a;

    public smj(int i, defpackage.smr smrVar) {
        super(i);
        this.a = smrVar;
    }

    @Override // defpackage.smn
    public final void f(com.google.android.gms.common.api.Status status) {
        try {
            this.a.f(status);
        } catch (java.lang.IllegalStateException e) {
            android.util.Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.smn
    public final void g(java.lang.Exception exc) {
        try {
            this.a.f(new com.google.android.gms.common.api.Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage(), null, null));
        } catch (java.lang.IllegalStateException e) {
            android.util.Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.smn
    public final void h(defpackage.snb snbVar) throws android.os.DeadObjectException {
        try {
            this.a.e(snbVar.b);
        } catch (java.lang.RuntimeException e) {
            g(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.smn
    public final void i(defpackage.rkq rkqVar, boolean z) {
        defpackage.smr smrVar = this.a;
        rkqVar.a.put(smrVar, java.lang.Boolean.valueOf(z));
        smrVar.d(new defpackage.spk(rkqVar, smrVar, 1));
    }
}
