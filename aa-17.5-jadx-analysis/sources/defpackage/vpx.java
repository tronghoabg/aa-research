package defpackage;

/* loaded from: classes.dex */
public abstract class vpx {
    public int a = 1;

    public abstract void g(vky vkyVar);

    public abstract void j(vky vkyVar);

    public final void k(vky vkyVar) {
        if (this.a == 3) {
            return;
        }
        this.a = 3;
        g(vkyVar);
    }

    public final void l(vky vkyVar) {
        if (this.a == 2) {
            return;
        }
        this.a = 2;
        j(vkyVar);
    }
}
