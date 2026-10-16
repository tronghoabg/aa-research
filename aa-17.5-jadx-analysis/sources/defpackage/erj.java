package defpackage;

/* loaded from: classes2.dex */
public final class erj implements Runnable {
    private final eqc a;
    private final epr b;
    private boolean c;

    public erj(eqc eqcVar, epr eprVar) {
        eprVar.getClass();
        this.a = eqcVar;
        this.b = eprVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            return;
        }
        this.a.e(this.b);
        this.c = true;
    }
}
