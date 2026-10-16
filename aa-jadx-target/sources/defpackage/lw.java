package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class lw {
    public final defpackage.lx b = new defpackage.lx();
    public boolean c = false;
    public final int d = 1;

    public abstract int a();

    public int d(int i) {
        return 0;
    }

    public long e(int i) {
        return -1L;
    }

    public abstract defpackage.mr f(android.view.ViewGroup viewGroup, int i);

    public final void g() {
        this.b.a();
    }

    public final void h(int i) {
        this.b.c(i, 1, null);
    }

    public final void i(int i, int i2) {
        this.b.b(i, i2);
    }

    public final void j(int i, int i2) {
        this.b.c(i, i2, null);
    }

    public final void k(int i, int i2) {
        this.b.d(i, i2);
    }

    public final void l(int i, int i2) {
        this.b.e(i, i2);
    }

    public abstract void n(defpackage.mr mrVar, int i);

    public final void p(boolean z) {
        if (this.b.f()) {
            throw new java.lang.IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.c = z;
    }

    public final void q(defpackage.ca caVar) {
        this.b.registerObserver(caVar);
    }

    public final void r(defpackage.ca caVar) {
        this.b.unregisterObserver(caVar);
    }

    public void m(android.support.v7.widget.RecyclerView recyclerView) {
    }

    public void o(defpackage.mr mrVar) {
    }
}
