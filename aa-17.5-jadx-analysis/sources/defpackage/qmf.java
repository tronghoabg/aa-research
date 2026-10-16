package defpackage;

/* loaded from: classes2.dex */
public abstract class qmf extends qme {
    private boolean a;

    protected qmf(qmh qmhVar) {
        super(qmhVar);
    }

    protected abstract void b();

    public final void s() {
        if (!u()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void t() {
        b();
        this.a = true;
    }

    public final boolean u() {
        return this.a;
    }
}
