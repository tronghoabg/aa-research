package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class nxa implements defpackage.nst {
    public static final defpackage.yqm f = defpackage.yqm.c("GH.HunPresenterBase");
    public static final defpackage.nwi g = new defpackage.nwi();
    private boolean b;
    public boolean i;
    public nww k;
    protected final android.os.Handler h = new android.os.Handler();
    private java.lang.Runnable a = new defpackage.iri(7);
    public defpackage.nxh j = defpackage.nxh.a;
    public final defpackage.eqs l = new defpackage.eqs(null);

    @Override // defpackage.nst
    public final void a(defpackage.qsh qshVar, defpackage.ntb ntbVar) {
        if (!f()) {
            c();
        } else {
            ((defpackage.yqj) f.l().ai((char) 5522)).u("onLayoutChanged, removing HUN when it has attached");
            this.b = true;
        }
    }

    protected abstract void c();

    protected abstract void d();

    protected abstract boolean f();

    public boolean g() {
        throw null;
    }

    protected abstract boolean h();

    public final void i() {
        nww nwwVar;
        if (!defpackage.ler.c().fY() || (nwwVar = this.k) == null) {
            return;
        }
        nwwVar.b(this.j);
        nwwVar.d.getClass();
        android.view.View view = nwwVar.b;
        view.setAlpha(0.0f);
        defpackage.lem.a();
        view.animate().alpha(1.0f);
    }

    final void j(defpackage.nxh nxhVar) {
        java.lang.String str = nxhVar.b;
        this.j = nxhVar;
        if (true == defpackage.nxh.a.equals(nxhVar)) {
            str = null;
        }
        this.l.m(str);
        k();
    }

    public final void k() {
        defpackage.yqm yqmVar = f;
        ((defpackage.yqj) yqmVar.l().ai(5525)).R("update viewTearingDown=%b view=%s model=%s", java.lang.Boolean.valueOf(this.i), this.k, this.j);
        if (f()) {
            ((defpackage.yqj) yqmVar.l().ai((char) 5536)).u("waiting for host to finish initialization");
            return;
        }
        if (this.b) {
            ((defpackage.yqj) yqmVar.l().ai((char) 5535)).u("Removing host due to layout change");
            c();
            if (defpackage.acyc.U()) {
                this.b = false;
                return;
            }
            return;
        }
        if (this.i) {
            ((defpackage.yqj) yqmVar.l().ai((char) 5534)).u("waiting for view animate out to complete");
            return;
        }
        defpackage.nxh nxhVar = defpackage.nxh.a;
        if (nxhVar.equals(this.j)) {
            nww nwwVar = this.k;
            if (nwwVar == null || nxhVar.equals(nwwVar.c)) {
                defpackage.ysr.bj(!f());
                d();
                return;
            } else {
                this.i = true;
                this.j = nxhVar;
                this.k.a(new defpackage.mta(this, 18));
                return;
            }
        }
        if (h()) {
            ((defpackage.yqj) yqmVar.l().ai((char) 5532)).u("Host not initialized.");
            return;
        }
        nww nwwVar2 = this.k;
        nwwVar2.getClass();
        defpackage.nxh nxhVar2 = nwwVar2.c;
        if (this.j.equals(nxhVar2)) {
            return;
        }
        if (g()) {
            ((defpackage.yqj) yqmVar.l().ai((char) 5530)).u("waiting for host recycle to complete");
            return;
        }
        defpackage.nxh nxhVar3 = this.j;
        if (nxhVar3.b.equals(nxhVar2.b)) {
            this.k.b(nxhVar3);
        } else {
            android.os.Handler handler = this.h;
            handler.removeCallbacks(this.a);
            this.a = new defpackage.mta(nxhVar3, 20);
            if (nxhVar3.u != 2) {
                handler.postDelayed(this.a, defpackage.acyc.h());
            }
            if (nxhVar.equals(nxhVar2)) {
                i();
            } else {
                this.k.a(new defpackage.mta(this, 19));
            }
        }
        defpackage.mcl.C(this.j, defpackage.zbd.nW);
    }
}
