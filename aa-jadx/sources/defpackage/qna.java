package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qna extends defpackage.qmz {
    private boolean a;

    protected qna(defpackage.qnc qncVar) {
        super(qncVar);
    }

    protected abstract void b();

    public final void s() {
        if (!u()) {
            throw new java.lang.IllegalStateException("Not initialized");
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
