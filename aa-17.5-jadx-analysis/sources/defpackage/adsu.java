package defpackage;

/* loaded from: classes.dex */
abstract class adsu implements Runnable {
    private final adjq a;

    protected adsu(adjq adjqVar) {
        this.a = adjqVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        adjq adjqVarA = this.a.a();
        try {
            a();
        } finally {
            this.a.f(adjqVarA);
        }
    }
}
