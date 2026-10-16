package defpackage;

/* loaded from: classes.dex */
final class alj extends cwe implements cwc, cyg {
    public aiv a;
    public aiu b;
    private aqf c;
    private api d;
    private boolean e;
    private aom f;
    private asf g;
    private amy h;
    private boolean i;
    private aqe j;
    private cwd k;
    private boolean l;
    private aiu m;

    public alj(aqf aqfVar, api apiVar, boolean z, aom aomVar, asf asfVar, amy amyVar, boolean z2, aiu aiuVar) {
        this.c = aqfVar;
        this.d = apiVar;
        this.e = z;
        this.f = aomVar;
        this.g = asfVar;
        this.h = amyVar;
        this.i = z2;
        this.m = aiuVar;
    }

    private final void g() {
        cwd cwdVar = this.k;
        if (cwdVar != null) {
            if (cwdVar.M().A) {
                return;
            }
            W(cwdVar);
            return;
        }
        if (this.i) {
            cjn.p(this, new alg(this, 2));
        }
        aiu aiuVarD = d();
        if (aiuVarD != null) {
            cwd cwdVar2 = aiuVarD.g;
            if (cwdVar2.M().A) {
                return;
            }
            W(cwdVar2);
            this.k = cwdVar2;
        }
    }

    public final boolean b() {
        dlr dlrVar = dlr.a;
        if (this.A) {
            dlrVar = bzi.q(this).s;
        }
        return dlrVar != dlr.b || this.d == api.a;
    }

    public final aiu d() {
        return this.i ? this.b : this.m;
    }

    @Override // defpackage.cfx
    public final void ec() {
        boolean zB = b();
        if (this.l != zB) {
            this.l = zB;
            f(this.c, this.d, this.i, d(), this.e, this.f, this.g, this.h);
        }
    }

    @Override // defpackage.cfx
    public final void er() {
        this.l = b();
        g();
        if (this.j == null) {
            aqe aqeVar = new aqe(this.c, d(), this.f, this.d, this.e, this.l, this.g, this.h);
            W(aqeVar);
            this.j = aqeVar;
        }
    }

    public final void f(aqf aqfVar, api apiVar, boolean z, aiu aiuVar, boolean z2, aom aomVar, asf asfVar, amy amyVar) {
        boolean z3;
        this.c = aqfVar;
        this.d = apiVar;
        boolean z4 = true;
        if (this.i != z) {
            this.i = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (affa.f(this.m, aiuVar)) {
            z4 = false;
        } else {
            this.m = aiuVar;
        }
        if (z3 || (z4 && !z)) {
            cwd cwdVar = this.k;
            if (cwdVar != null) {
                V(cwdVar);
            }
            this.k = null;
            g();
        }
        this.e = z2;
        this.f = aomVar;
        this.g = asfVar;
        this.h = amyVar;
        boolean zB = b();
        this.l = zB;
        aqe aqeVar = this.j;
        if (aqeVar != null) {
            aqeVar.L(aqfVar, apiVar, d(), z2, zB, aomVar, asfVar, amyVar);
        }
    }

    @Override // defpackage.cfx
    public final void q() {
        cwd cwdVar = this.k;
        if (cwdVar != null) {
            V(cwdVar);
        }
    }

    @Override // defpackage.cyg
    public final void r() {
        aiv aivVar = (aiv) bzi.x(this, akx.a);
        if (affa.f(aivVar, this.a)) {
            return;
        }
        this.a = aivVar;
        this.b = null;
        cwd cwdVar = this.k;
        if (cwdVar != null) {
            V(cwdVar);
        }
        this.k = null;
        g();
        aqe aqeVar = this.j;
        if (aqeVar != null) {
            aqeVar.L(this.c, this.d, d(), this.e, this.l, this.f, this.g, this.h);
        }
    }

    @Override // defpackage.cfx
    public final boolean x() {
        return false;
    }
}
