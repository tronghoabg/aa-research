package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aaaf {
    public boolean a;
    protected final defpackage.aaag b;

    public aaaf(defpackage.aaag aaagVar) {
        this.b = aaagVar;
    }

    public final void a(defpackage.aaak aaakVar) {
        if (!this.a) {
            throw new java.lang.IllegalStateException("Gesture already inactive: ".concat(java.lang.String.valueOf(getClass().getName())));
        }
        this.a = false;
        b(aaakVar);
    }

    protected abstract void b(defpackage.aaak aaakVar);

    protected abstract boolean c(defpackage.aaak aaakVar);

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    protected abstract boolean g(defpackage.aaak aaakVar);

    protected abstract int h(long j, java.util.LinkedList linkedList, java.util.List list);
}
