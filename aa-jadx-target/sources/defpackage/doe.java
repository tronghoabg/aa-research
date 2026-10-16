package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class doe {
    public java.lang.Object a;
    public defpackage.doi b;
    public defpackage.dok c = new defpackage.dok();
    private boolean d;

    private final void e() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void a(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        defpackage.dok dokVar = this.c;
        if (dokVar != null) {
            dokVar.c(runnable, executor);
        }
    }

    public final void b(java.lang.Object obj) {
        this.d = true;
        defpackage.doi doiVar = this.b;
        if (doiVar == null || !doiVar.b.e(obj)) {
            return;
        }
        e();
    }

    public final void c() {
        this.d = true;
        defpackage.doi doiVar = this.b;
        if (doiVar == null || !doiVar.b.cancel(true)) {
            return;
        }
        e();
    }

    public final void d(java.lang.Throwable th) {
        this.d = true;
        defpackage.doi doiVar = this.b;
        if (doiVar == null || !doiVar.a(th)) {
            return;
        }
        e();
    }

    protected final void finalize() {
        defpackage.dok dokVar;
        defpackage.doi doiVar = this.b;
        if (doiVar != null && !doiVar.isDone()) {
            doiVar.a(new dof("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.a)))));
        }
        if (this.d || (dokVar = this.c) == null) {
            return;
        }
        dokVar.e(null);
    }
}
