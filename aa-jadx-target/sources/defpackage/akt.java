package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class akt extends defpackage.cge implements defpackage.cwv, defpackage.cwu, defpackage.czc, defpackage.cyp {
    private defpackage.dly B;
    public defpackage.affc a;
    public defpackage.affc b;
    public defpackage.alf i;
    public android.view.View j;
    public defpackage.dlo k;
    public aiyk n;
    public defpackage.alg o;
    private defpackage.bys p;
    public float c = Float.NaN;
    public boolean d = true;
    public long e = 9205357640488583168L;
    public float f = Float.NaN;
    public float g = Float.NaN;
    public boolean h = true;
    public final defpackage.bwx l = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.bxv.b);
    public long m = 9205357640488583168L;

    public akt(defpackage.affc affcVar, defpackage.affc affcVar2, defpackage.alf alfVar) {
        this.a = affcVar;
        this.b = affcVar2;
        this.i = alfVar;
    }

    private final long i() {
        if (this.p == null) {
            defpackage.nz nzVar = new defpackage.nz(this, 17);
            defpackage.lam lamVar = defpackage.byp.a;
            this.p = new defpackage.bvr(nzVar, null);
        }
        defpackage.bys bysVar = this.p;
        if (bysVar != null) {
            return ((defpackage.cji) bysVar.a()).a;
        }
        return 9205357640488583168L;
    }

    private final void j() {
        defpackage.dlo dloVar;
        defpackage.alg algVar = this.o;
        if (algVar == null || (dloVar = this.k) == null || defpackage.dly.d(algVar.a(), this.B)) {
            return;
        }
        defpackage.affc affcVar = this.b;
        if (affcVar != null) {
            affcVar.invoke(new defpackage.dlt(dloVar.dO(defpackage.dlv.f(algVar.a()))));
        }
        this.B = new defpackage.dly(algVar.a());
    }

    @Override // defpackage.cwu
    public final void b(defpackage.cxn cxnVar) {
        cxnVar.q();
        aiyk aiykVar = this.n;
        if (aiykVar != null) {
            aiykVar.j(defpackage.afbk.a);
        }
    }

    @Override // defpackage.cwv
    public final void dA(defpackage.ctc ctcVar) {
        this.l.b(ctcVar);
    }

    @Override // defpackage.cge
    public final void dz() {
        r();
        this.n = defpackage.afqt.q(0, 0, 7);
        ahoc.d(N(), (defpackage.afdo) null, 4, new defpackage.adh(this, (defpackage.afdk) null, 8), 1);
    }

    public final void f() {
        defpackage.alg algVar = this.o;
        if (algVar != null) {
            algVar.b();
        }
        android.view.View viewG = this.j;
        if (viewG == null) {
            viewG = defpackage.ua.g(this);
        }
        android.view.View view = viewG;
        this.j = view;
        defpackage.dlo dloVarU = this.k;
        if (dloVarU == null) {
            dloVarU = defpackage.cjv.u(this);
        }
        defpackage.dlo dloVar = dloVarU;
        this.k = dloVar;
        this.o = this.i.b(view, this.d, this.e, this.f, this.g, this.h, dloVar, this.c);
        j();
    }

    @Override // defpackage.czc
    public final void g(defpackage.dek dekVar) {
        dekVar.a(defpackage.aku.a, new defpackage.nz(this, 16));
    }

    public final void h() {
        defpackage.dlo dloVarU = this.k;
        if (dloVarU == null) {
            dloVarU = defpackage.cjv.u(this);
            this.k = dloVarU;
        }
        long j = ((defpackage.cji) this.a.invoke(dloVarU)).a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & i()) == 9205357640488583168L) {
            this.m = 9205357640488583168L;
            defpackage.alg algVar = this.o;
            if (algVar != null) {
                algVar.b();
                return;
            }
            return;
        }
        this.m = defpackage.a.ah(i(), j);
        if (this.o == null) {
            f();
        }
        defpackage.alg algVar2 = this.o;
        if (algVar2 != null) {
            algVar2.c(this.m, this.c);
        }
        j();
    }

    @Override // defpackage.cge
    public final void q() {
        defpackage.alg algVar = this.o;
        if (algVar != null) {
            algVar.b();
        }
        this.o = null;
    }

    @Override // defpackage.cyp
    public final void r() {
        defpackage.dai.z(this, new defpackage.nz(this, 15));
    }

    @Override // defpackage.czc
    public final /* synthetic */ boolean y() {
        return false;
    }

    @Override // defpackage.czc
    public final /* synthetic */ boolean z() {
        return true;
    }

    @Override // defpackage.czc
    public final /* synthetic */ void D() {
    }

    @Override // defpackage.cwu
    public final /* synthetic */ void a() {
    }
}
