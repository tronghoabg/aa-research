package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mca implements defpackage.lhn {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.NlsEventManager");
    public final defpackage.mbk c;
    private boolean h;
    public final java.lang.Object b = new java.lang.Object();
    public final java.util.Map d = new java.util.HashMap();
    public final java.util.Set e = new java.util.HashSet();
    final mbr f = new defpackage.qjq(this, 1);
    final mbn g = new defpackage.mbz(this);

    public mca(defpackage.mbk mbkVar) {
        this.c = mbkVar;
    }

    public static defpackage.mca a() {
        return (defpackage.mca) defpackage.mkp.a.i(defpackage.mca.class);
    }

    public final defpackage.ygw b() {
        defpackage.ygw ygwVarO;
        synchronized (this.b) {
            ygwVarO = defpackage.ygw.o(this.d.values());
        }
        return ygwVarO;
    }

    @Override // defpackage.lhn
    public final void d() {
        if (!this.h) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 4735)).u("Can't stop if not started");
            return;
        }
        this.c.b(3);
        if (defpackage.acvk.c()) {
            defpackage.mce.b().m(this.f);
        } else {
            defpackage.mce.b().l(this.g);
        }
        synchronized (this.b) {
            this.d.clear();
        }
        this.h = false;
    }

    public final void e(defpackage.dzn dznVar) {
        defpackage.wfp.e(new defpackage.mbx(this, dznVar, 0));
    }

    @Override // defpackage.lhn
    public final void eQ() {
        this.c.b(1);
        if (defpackage.acvk.c()) {
            defpackage.mce.b().k(this.f);
        } else {
            defpackage.mce.b().j(this.g);
        }
        this.h = true;
    }

    public final void f(defpackage.lxy lxyVar) {
        synchronized (this.b) {
            this.e.add(lxyVar);
        }
    }

    public final void g(defpackage.lxy lxyVar) {
        synchronized (this.b) {
            this.e.remove(lxyVar);
        }
    }
}
