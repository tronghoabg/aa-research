package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class qsk extends defpackage.qrd implements defpackage.eqg, defpackage.esa, defpackage.epu, defpackage.fbm, defpackage.ou, defpackage.duy, defpackage.duz {
    private final defpackage.fbl a;
    private defpackage.erz b;
    private defpackage.erw c;
    private final java.util.concurrent.CopyOnWriteArrayList d;
    public final defpackage.oy f = new defpackage.oy();
    public final defpackage.eqi g;
    public final defpackage.qsj h;
    public final java.util.concurrent.CopyOnWriteArrayList i;
    final defpackage.jyp j;
    public final defpackage.bil k;
    private final java.util.concurrent.CopyOnWriteArrayList l;

    public qsk() {
        defpackage.eqi eqiVar = new defpackage.eqi(this, true);
        this.g = eqiVar;
        defpackage.fbl fblVarH = defpackage.ebq.h(this);
        this.a = fblVarH;
        byte[] bArr = null;
        this.k = new defpackage.bil(new defpackage.qtk(this, 1, null));
        defpackage.qsj qsjVar = new defpackage.qsj(this);
        this.h = qsjVar;
        this.j = new defpackage.jyp(qsjVar);
        this.d = new java.util.concurrent.CopyOnWriteArrayList();
        this.l = new java.util.concurrent.CopyOnWriteArrayList();
        this.i = new java.util.concurrent.CopyOnWriteArrayList();
        eqiVar.c(new defpackage.mga(this, 3));
        eqiVar.c(new defpackage.mga(this, 4));
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            defpackage.rbz.g(android.os.Looper.getMainLooper(), new defpackage.jpa(this, 20, bArr));
        }
        fblVarH.a();
        defpackage.erm.b(this);
    }

    private final void l(defpackage.epw epwVar) {
        defpackage.eqi eqiVar = this.g;
        if (eqiVar instanceof defpackage.eqi) {
            eqiVar.e(epwVar);
        }
    }

    @Override // defpackage.qrd
    public final java.lang.Object E() {
        java.lang.Object objD;
        java.lang.Object obj = this.b;
        if (obj == null && (objD = D()) != null) {
            obj = ((defpackage.nub) objD).a;
        }
        if (obj == null) {
            return null;
        }
        defpackage.nub nubVar = new defpackage.nub();
        nubVar.a = obj;
        return nubVar;
    }

    @Override // defpackage.qrd
    public void G() {
        l(defpackage.epw.ON_DESTROY);
    }

    @Override // defpackage.qrd
    public final void H() {
        java.util.Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((defpackage.dzn) it.next()).a(80);
        }
    }

    @Override // defpackage.qrd
    public void I() {
        l(defpackage.epw.ON_PAUSE);
    }

    @Override // defpackage.qrd
    public void K() {
        l(defpackage.epw.ON_RESUME);
    }

    public final void Q() {
        if (this.b == null) {
            java.lang.Object objD = D();
            if (objD != null) {
                this.b = (defpackage.erz) ((defpackage.nub) objD).a;
            }
            if (this.b == null) {
                this.b = new defpackage.erz();
            }
        }
    }

    public final void R() {
        android.view.View decorView = C().getDecorView();
        decorView.getClass();
        decorView.setTag(2131429869, this);
        android.view.View decorView2 = C().getDecorView();
        decorView2.getClass();
        decorView2.setTag(2131429873, this);
        android.view.View decorView3 = C().getDecorView();
        decorView3.getClass();
        decorView3.setTag(2131429872, this);
        android.view.View decorView4 = C().getDecorView();
        decorView4.getClass();
        decorView4.setTag(2131429871, this);
        android.view.View decorView5 = C().getDecorView();
        decorView5.getClass();
        decorView5.setTag(2131429287, this);
    }

    @Override // defpackage.qrd
    public void a(android.os.Bundle bundle) {
        this.a.b(bundle);
        this.f.c(this);
        l(defpackage.epw.ON_CREATE);
    }

    @Override // defpackage.qrd
    @java.lang.Deprecated
    public void c() {
        this.k.y();
    }

    @Override // defpackage.qrd
    public void d(android.content.res.Configuration configuration) {
        java.util.Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((defpackage.dzn) it.next()).a(configuration);
        }
    }

    @Override // defpackage.qrd
    public void e(android.content.Intent intent) {
        java.util.Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((defpackage.dzn) it.next()).a(intent);
        }
    }

    @Override // defpackage.duy
    public final void fM(defpackage.dzn dznVar) {
        this.d.add(dznVar);
    }

    @Override // defpackage.duz
    public final void fP(defpackage.dzn dznVar) {
        this.l.add(dznVar);
    }

    @Override // defpackage.qrd
    public void g(android.os.Bundle bundle) {
        defpackage.eqi eqiVar = this.g;
        if (eqiVar instanceof defpackage.eqi) {
            eqiVar.f(defpackage.epx.c);
        }
        super.g(bundle);
        this.a.c(bundle);
    }

    @Override // defpackage.epu
    public final defpackage.esi getDefaultViewModelCreationExtras() {
        defpackage.esk eskVar = new defpackage.esk((byte[]) null);
        eskVar.b(defpackage.erm.a, this);
        eskVar.b(defpackage.erm.b, this);
        if (q() != null && q().getExtras() != null) {
            eskVar.b(defpackage.erm.c, q().getExtras());
        }
        return eskVar;
    }

    @Override // defpackage.epu
    public final defpackage.erw getDefaultViewModelProviderFactory() {
        if (this.c == null) {
            this.c = new defpackage.ern(null, this, q() != null ? q().getExtras() : null);
        }
        return this.c;
    }

    @Override // defpackage.eqg
    public final defpackage.epy getLifecycle() {
        return this.g;
    }

    @Override // defpackage.fbm
    public final defpackage.fbk getSavedStateRegistry() {
        return (defpackage.fbk) this.a.b;
    }

    @Override // defpackage.esa
    public final defpackage.erz getViewModelStore() {
        Q();
        return this.b;
    }

    @Override // defpackage.qrd
    public void h() {
        l(defpackage.epw.ON_START);
    }

    @Override // defpackage.qrd
    public void j() {
        l(defpackage.epw.ON_STOP);
    }

    @Override // defpackage.duy
    public final void k(defpackage.dzn dznVar) {
        this.d.remove(dznVar);
    }

    @Override // defpackage.duz
    public final void n(defpackage.dzn dznVar) {
        this.l.remove(dznVar);
    }

    @Override // defpackage.ou
    public final defpackage.bil r() {
        return this.k;
    }

    @Override // defpackage.qrd
    public void v(int i) {
        R();
        this.h.a(C().getDecorView());
        super.v(2131624492);
    }

    public void w(android.view.View view) {
        throw null;
    }
}
