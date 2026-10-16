package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class lt {
    public final lu b = new lu();
    public boolean c = false;
    public final int d = 1;

    public abstract int a();

    public int d(int i) {
        return 0;
    }

    public long e(int i) {
        return -1L;
    }

    public abstract mo f(ViewGroup viewGroup, int i);

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

    public abstract void n(mo moVar, int i);

    public final void p(boolean z) {
        if (this.b.f()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.c = z;
    }

    public final void q(ca caVar) {
        this.b.registerObserver(caVar);
    }

    public final void r(ca caVar) {
        this.b.unregisterObserver(caVar);
    }

    public void m(RecyclerView recyclerView) {
    }

    public void o(mo moVar) {
    }
}
