package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jyp {
    public boolean a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public jyp(defpackage.jzg jzgVar, defpackage.eqp eqpVar, defpackage.eqp eqpVar2, defpackage.eqg eqgVar) {
        this.c = jzgVar;
        defpackage.eqs eqsVar = new defpackage.eqs();
        this.b = eqsVar;
        defpackage.tcu.e(eqsVar, eqpVar, eqpVar2, new hkb(this, 5)).eM(eqgVar, new defpackage.hlm(this, 8));
    }

    public static defpackage.jyp a() {
        return (defpackage.jyp) defpackage.mkp.a.i(defpackage.jyp.class);
    }

    public final void b(boolean z) {
        ((defpackage.eqp) this.b).m(java.lang.Boolean.valueOf(z));
    }

    public final boolean c() {
        boolean z;
        synchronized (this.b) {
            z = this.a;
        }
        return z;
    }

    public jyp() {
        this.c = new defpackage.jzg();
        this.b = new defpackage.eqs();
    }

    public jyp(java.util.concurrent.Executor executor) {
        executor.getClass();
        this.b = new java.lang.Object();
        this.c = new java.util.ArrayList();
    }
}
