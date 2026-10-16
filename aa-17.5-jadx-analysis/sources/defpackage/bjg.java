package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class bjg extends cfx implements cwu, cwk, cyu {
    public deu a;
    public dfw b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public afec g;
    public bjf h;
    public wci i;
    private afec j;
    private List k;
    private afec l;
    private biy m;
    private Map n;
    private biu o;
    private afec p;

    public bjg(deu deuVar, dfw dfwVar, wci wciVar, afec afecVar, int i, boolean z, int i2, int i3, List list, afec afecVar2, biy biyVar, afec afecVar3) {
        this.a = deuVar;
        this.b = dfwVar;
        this.i = wciVar;
        this.j = afecVar;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.k = list;
        this.l = afecVar2;
        this.m = biyVar;
        this.g = afecVar3;
    }

    private final biu t(dlg dlgVar) {
        biu biuVar;
        bjf bjfVar = this.h;
        if (bjfVar != null && bjfVar.c && (biuVar = bjfVar.d) != null) {
            biuVar.h(dlgVar);
            return biuVar;
        }
        biu biuVarD = d();
        biuVarD.h(dlgVar);
        return biuVarD;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0170  */
    @Override // defpackage.cwk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.cxd r20) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjg.b(cxd):void");
    }

    public final biu d() {
        biu biuVar = this.o;
        if (biuVar == null) {
            biu biuVar2 = new biu(this.a, this.b, this.i, this.c, this.d, this.e, this.f, this.k);
            this.o = biuVar2;
            biuVar = biuVar2;
        }
        biuVar.getClass();
        return biuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    @Override // defpackage.cwu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ctq el(defpackage.cts r10, defpackage.cto r11, long r12) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjg.el(cts, cto, long):ctq");
    }

    public final void f() {
        this.h = null;
    }

    @Override // defpackage.cyu
    public final void g(dec decVar) {
        afec bgbVar = this.p;
        if (bgbVar == null) {
            bgbVar = new bgb(this, 19);
            this.p = bgbVar;
        }
        deu deuVar = this.a;
        deb debVar = ddx.D;
        List listSingletonList = Collections.singletonList(deuVar);
        listSingletonList.getClass();
        decVar.a(debVar, listSingletonList);
        bjf bjfVar = this.h;
        if (bjfVar != null) {
            decVar.a(ddx.E, bjfVar.b);
            decVar.a(ddx.F, Boolean.valueOf(bjfVar.c));
        }
        decVar.a(ddq.l, new ddf(null, new bgb(this, 20)));
        decVar.a(ddq.m, new ddf(null, new bji(this, 1)));
        decVar.a(ddq.n, new ddf(null, new bih(this, 8)));
        decVar.a(ddq.a, new ddf(null, bgbVar));
    }

    @Override // defpackage.cwu
    public final int h(csq csqVar, csp cspVar, int i) {
        return t(csqVar).a(i, csqVar.p());
    }

    @Override // defpackage.cwu
    public final int i(csq csqVar, csp cspVar, int i) {
        return Math.round((float) Math.ceil(t(csqVar).d(csqVar.p()).a()));
    }

    @Override // defpackage.cwu
    public final int j(csq csqVar, csp cspVar, int i) {
        return t(csqVar).a(i, csqVar.p());
    }

    @Override // defpackage.cwu
    public final int k(csq csqVar, csp cspVar, int i) {
        return Math.round((float) Math.ceil(t(csqVar).d(csqVar.p()).b()));
    }

    public final void l(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            d().i(this.a, this.b, this.i, this.c, this.d, this.e, this.f, this.k);
        }
        if (this.A) {
            if (z2 || (z && this.p != null)) {
                bzi.q(this).J();
            }
            if (z2 || z3 || z4) {
                bzi.q(this).I();
                cjn.w(this);
            }
            if (z) {
                cjn.w(this);
            }
        }
    }

    public final void m() {
        bzi.q(this).J();
        bzi.q(this).I();
        cjn.w(this);
    }

    public final boolean n(afec afecVar, afec afecVar2, biy biyVar, afec afecVar3) {
        boolean z;
        if (this.j != afecVar) {
            this.j = afecVar;
            z = true;
        } else {
            z = false;
        }
        if (this.l != afecVar2) {
            this.l = afecVar2;
            z = true;
        }
        if (!affa.f(this.m, biyVar)) {
            this.m = biyVar;
            z = true;
        }
        if (this.g == afecVar3) {
            return z;
        }
        this.g = afecVar3;
        return true;
    }

    public final boolean o(deu deuVar) {
        boolean zF = affa.f(this.a.b, deuVar.b);
        boolean zF2 = affa.f(this.a.a, deuVar.a);
        boolean z = true;
        if (zF && zF2) {
            z = false;
        }
        if (z) {
            this.a = deuVar;
        }
        if (!zF) {
            f();
        }
        return z;
    }

    public final boolean r(dfw dfwVar) {
        return !dfwVar.t(this.b);
    }

    public final boolean s(dfw dfwVar, List list, int i, int i2, boolean z, wci wciVar, int i3) {
        boolean z2 = !this.b.u(dfwVar);
        this.b = dfwVar;
        if (!affa.f(this.k, list)) {
            this.k = list;
            z2 = true;
        }
        if (this.f != i) {
            this.f = i;
            z2 = true;
        }
        if (this.e != i2) {
            this.e = i2;
            z2 = true;
        }
        if (this.d != z) {
            this.d = z;
            z2 = true;
        }
        if (!affa.f(this.i, wciVar)) {
            this.i = wciVar;
            z2 = true;
        }
        if (this.c == i3) {
            return z2;
        }
        this.c = i3;
        return true;
    }

    @Override // defpackage.cfx
    public final boolean x() {
        return false;
    }

    @Override // defpackage.cyu
    public final /* synthetic */ boolean y() {
        return false;
    }

    @Override // defpackage.cyu
    public final /* synthetic */ boolean z() {
        return true;
    }

    @Override // defpackage.cyu
    public final /* synthetic */ void D() {
    }

    @Override // defpackage.cwk
    public final /* synthetic */ void a() {
    }
}
