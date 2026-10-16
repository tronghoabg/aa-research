package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nwz extends defpackage.nxa implements defpackage.nxc {
    public static final /* synthetic */ int e = 0;
    private static final defpackage.yqm m = defpackage.yqm.c("GH.HunPresenter");
    public defpackage.noz a;
    public boolean b;
    public boolean c;
    public final defpackage.eqg d;
    private boolean n;
    private java.lang.Runnable o = new defpackage.iri(6);

    public nwz(defpackage.eqg eqgVar) {
        this.d = eqgVar;
    }

    public final void b() {
        if (this.d != null) {
            this.n = true;
            this.a = (defpackage.noz) defpackage.kgu.c(new defpackage.kjf(this, 5), "GH.HunPresenter", defpackage.zbe.SYSTEM_UI_NOTIFICATION, defpackage.zbd.of, true, "Unable to create fragment host for HUN", new java.lang.Object[0]);
        }
    }

    @Override // defpackage.nxa
    protected final void c() {
        if (this.a == null) {
            ((defpackage.yqj) m.l().ai((char) 5521)).u("recycleHost, nothing currently showing");
            this.b = false;
            return;
        }
        android.os.Handler handler = this.h;
        handler.removeCallbacks(this.o);
        defpackage.mta mtaVar = new defpackage.mta(this, 17);
        this.o = mtaVar;
        handler.post(mtaVar);
        this.c = true;
    }

    @Override // defpackage.nxa
    protected final void d() {
        this.b = true;
        c();
    }

    @Override // defpackage.nxc
    public final void e(nww nwwVar) {
        this.k = nwwVar;
        this.n = false;
        k();
    }

    @Override // defpackage.nxa
    protected final boolean f() {
        return this.n;
    }

    @Override // defpackage.nxa
    public final boolean g() {
        return this.c;
    }

    @Override // defpackage.nxa
    protected final boolean h() {
        if (this.a != null) {
            return false;
        }
        b();
        defpackage.nte.c().b().w(this);
        return true;
    }
}
