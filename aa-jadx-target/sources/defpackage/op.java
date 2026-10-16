package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class op {
    public boolean c;
    public final java.util.List b = new java.util.ArrayList();
    public final java.util.concurrent.CopyOnWriteArrayList d = new java.util.concurrent.CopyOnWriteArrayList();

    public op(boolean z) {
        this.c = z;
    }

    public abstract void b();

    public final defpackage.oo e(defpackage.exb exbVar) {
        defpackage.oo ooVar = new defpackage.oo(this, exbVar);
        this.b.add(ooVar);
        return ooVar;
    }

    public final void f(boolean z) {
        this.c = z;
        for (defpackage.oo ooVar : this.b) {
            boolean z2 = false;
            if (ooVar.a && z) {
                z2 = true;
            }
            ooVar.g(z2);
        }
    }

    public void a() {
    }

    public void d() {
    }

    public void c(ny nyVar) {
    }
}
