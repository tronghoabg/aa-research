package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class vqt {
    public int a = 1;

    public abstract void g(defpackage.vlu vluVar);

    public abstract void j(defpackage.vlu vluVar);

    public final void k(defpackage.vlu vluVar) {
        if (this.a == 3) {
            return;
        }
        this.a = 3;
        g(vluVar);
    }

    public final void l(defpackage.vlu vluVar) {
        if (this.a == 2) {
            return;
        }
        this.a = 2;
        j(vluVar);
    }
}
