package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cjz extends defpackage.cge implements defpackage.cxe, defpackage.czc {
    public defpackage.affc a;

    public cjz(defpackage.affc affcVar) {
        this.a = affcVar;
    }

    public final void d() {
        defpackage.dai.F(this, this.a);
    }

    @Override // defpackage.cxe
    public final defpackage.ctz dt(defpackage.cub cubVar, defpackage.ctx ctxVar, long j) {
        defpackage.cux cuxVarV = ctxVar.v(j);
        return cubVar.dS(cuxVarV.a, cuxVarV.b, defpackage.afcf.a, new defpackage.beh(cuxVarV, this, 16));
    }

    @Override // defpackage.czc
    public final void g(defpackage.dek dekVar) {
        defpackage.cld cldVar;
        boolean z;
        defpackage.cyl cylVarS = defpackage.cjv.s(this, 2);
        if (cylVarS.E) {
            cldVar = cylVarS.A;
            z = cylVarS.D;
        } else {
            defpackage.cla claVar = defpackage.cjv.a;
            if (claVar == null) {
                defpackage.cjv.a = new defpackage.cla();
            } else {
                claVar.n();
            }
            defpackage.cla claVar2 = defpackage.cjv.a;
            claVar2.getClass();
            claVar2.t = cylVarS.t.r;
            claVar2.r = defpackage.dlv.f(cylVarS.c);
            defpackage.cej cejVar = (defpackage.cej) defpackage.cer.i.j();
            defpackage.affc affcVarI = cejVar != null ? cejVar.i() : null;
            defpackage.cej cejVarH = defpackage.bzd.h(cejVar);
            try {
                this.a.invoke(claVar2);
                defpackage.bzd.k(cejVar, cejVarH, affcVarI);
                cldVar = claVar2.o;
                z = claVar2.p;
            } catch (java.lang.Throwable th) {
                defpackage.bzd.k(cejVar, cejVarH, affcVarI);
                throw th;
            }
        }
        if (z) {
            dekVar.a(defpackage.def.U, cldVar);
        }
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int h(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ud.c(new defpackage.cxd(this), cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int i(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ud.d(new defpackage.cxd(this), cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int j(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ud.e(new defpackage.cxd(this), cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int k(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ud.f(new defpackage.cxd(this), cszVar, csyVar, i);
    }

    public final java.lang.String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.a + ")";
    }

    @Override // defpackage.cge
    public final boolean x() {
        return false;
    }

    @Override // defpackage.czc
    public final /* synthetic */ boolean y() {
        return false;
    }

    @Override // defpackage.czc
    public final boolean z() {
        return false;
    }

    @Override // defpackage.czc
    public final /* synthetic */ void D() {
    }
}
