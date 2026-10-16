package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nrr {
    public boolean a;
    public final java.lang.Object b;
    public java.lang.Object c;

    public nrr(byte[] bArr) {
        this.a = false;
        this.c = null;
        this.b = null;
    }

    public static defpackage.nrr a() {
        return (defpackage.nrr) ((defpackage.msh) defpackage.mkp.a.i(defpackage.msh.class)).i().i(defpackage.nrr.class);
    }

    public final void b() {
        if (!this.a) {
            throw new defpackage.lhz("Cannot use this method if service has not been started");
        }
    }

    public final boolean c() {
        return d() || f();
    }

    public final boolean d() {
        b();
        java.lang.Object obj = this.c;
        obj.getClass();
        return ((defpackage.row) obj).a();
    }

    public final boolean e() {
        b();
        java.lang.Object obj = this.c;
        obj.getClass();
        return ((defpackage.row) obj).c();
    }

    public final boolean f() {
        b();
        java.lang.Object obj = this.c;
        obj.getClass();
        return ((defpackage.row) obj).b();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Queue] */
    public final void g(defpackage.swy swyVar) {
        synchronized (this.b) {
            if (this.c == null) {
                this.c = new java.util.ArrayDeque();
            }
            this.c.add(swyVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Queue] */
    public final void h(defpackage.swx swxVar) {
        defpackage.swy swyVar;
        java.lang.Object obj = this.b;
        synchronized (obj) {
            if (this.c != null && !this.a) {
                this.a = true;
                while (true) {
                    synchronized (obj) {
                        swyVar = (defpackage.swy) this.c.poll();
                        if (swyVar == null) {
                            this.a = false;
                            return;
                        }
                    }
                    swyVar.a(swxVar);
                }
            }
        }
    }

    public nrr(com.google.android.gms.car.display.CarDisplayId carDisplayId) {
        this.b = carDisplayId;
    }

    public nrr() {
        this.b = new java.lang.Object();
    }
}
