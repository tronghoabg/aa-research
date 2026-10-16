package defpackage;

/* JADX INFO: loaded from: classes.dex */
abstract class adtv implements java.lang.Runnable {
    private final defpackage.adkr a;

    protected adtv(defpackage.adkr adkrVar) {
        this.a = adkrVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.adkr adkrVarA = this.a.a();
        try {
            a();
        } finally {
            this.a.f(adkrVarA);
        }
    }
}
