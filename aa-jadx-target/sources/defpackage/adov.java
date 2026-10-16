package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adov implements java.lang.Runnable {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public adov(defpackage.adox adoxVar, defpackage.adow adowVar, java.lang.Runnable runnable, int i) {
        this.d = i;
        this.a = adowVar;
        this.b = runnable;
        this.c = adoxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, xvq] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.d == 0) {
            ((defpackage.adox) this.c).execute(this.a);
        } else {
            if (((xwa) ((defpackage.afgv) this.b).a) != null) {
                throw null;
            }
            ?? r0 = this.a;
            ?? r2 = this.c;
            defpackage.nrr nrrVarF = defpackage.xuy.f();
            defpackage.xvq xvqVarG = defpackage.xuy.g(nrrVarF, r0);
            try {
                r2.run();
                defpackage.xuy.g(nrrVarF, xvqVarG);
            } catch (java.lang.Throwable th) {
                try {
                    xuu.a(th);
                    throw th;
                } catch (java.lang.Throwable th2) {
                    defpackage.xuy.g(nrrVarF, xvqVarG);
                    throw th2;
                }
            }
        }
    }

    public final java.lang.String toString() {
        if (this.d == 0) {
            return java.lang.String.valueOf(this.b.toString()).concat("(scheduled in SynchronizationContext)");
        }
        return "propagating=[" + this.c + "]";
    }

    public adov(defpackage.afgv afgvVar, defpackage.xvq xvqVar, java.lang.Runnable runnable, int i) {
        this.d = i;
        this.b = afgvVar;
        this.a = xvqVar;
        this.c = runnable;
    }
}
