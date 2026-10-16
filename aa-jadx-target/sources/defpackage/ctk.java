package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ctk implements defpackage.cvm, defpackage.cub {
    final /* synthetic */ defpackage.ctu a;
    private final /* synthetic */ defpackage.ctn b;

    public ctk(defpackage.ctu ctuVar) {
        this.a = ctuVar;
        this.b = ctuVar.f;
    }

    @Override // defpackage.dlo
    public final float a() {
        return this.b.b;
    }

    @Override // defpackage.dlu
    public final float b() {
        return this.b.c;
    }

    @Override // defpackage.dlu
    public final float dE(long j) {
        return defpackage.dln.n(this.b, j);
    }

    @Override // defpackage.dlo
    public final float dF(float f) {
        return (f / this.b.b) + 0.0f;
    }

    @Override // defpackage.dlo
    public final float dG(int i) {
        return (i / this.b.b) + 0.0f;
    }

    @Override // defpackage.dlo
    public final float dH(long j) {
        return defpackage.dln.p(this.b, j);
    }

    @Override // defpackage.dlo
    public final float dI(float f) {
        return f * this.b.b;
    }

    @Override // defpackage.dlo
    public final int dM(long j) {
        return java.lang.Math.round(defpackage.dln.p(this.b, j));
    }

    @Override // defpackage.dlo
    public final int dN(float f) {
        return defpackage.dln.q(this.b, f);
    }

    @Override // defpackage.dlo
    public final long dO(long j) {
        return defpackage.dln.r(this.b, j);
    }

    @Override // defpackage.dlo
    public final long dP(long j) {
        return defpackage.dln.s(this.b, j);
    }

    @Override // defpackage.dlu
    public final long dQ(float f) {
        return defpackage.dln.o(this.b, f);
    }

    @Override // defpackage.dlo
    public final long dR(float f) {
        defpackage.ctn ctnVar = this.b;
        return defpackage.dln.o(ctnVar, (f / ctnVar.b) + 0.0f);
    }

    @Override // defpackage.cub
    public final defpackage.ctz dS(int i, int i2, java.util.Map map, defpackage.affc affcVar) {
        return this.b.dT(i, i2, map, null, affcVar);
    }

    @Override // defpackage.cub
    public final defpackage.ctz dT(int i, int i2, java.util.Map map, defpackage.affc affcVar, defpackage.affc affcVar2) {
        return this.b.dT(i, i2, map, affcVar, affcVar2);
    }

    @Override // defpackage.csz
    public final boolean dU() {
        return this.b.dU();
    }

    @Override // defpackage.csz
    public final defpackage.dlz p() {
        return this.b.a;
    }

    @Override // defpackage.cvm
    public final java.util.List r(java.lang.Object obj, defpackage.affg affgVar) {
        defpackage.ctu ctuVar = this.a;
        defpackage.aau aauVar = ctuVar.m;
        defpackage.cxl cxlVar = (defpackage.cxl) aauVar.a(obj);
        if (cxlVar != null && ctuVar.a.x().indexOf(cxlVar) < ctuVar.d) {
            return cxlVar.u();
        }
        defpackage.bzc bzcVar = ctuVar.h;
        if (bzcVar.b < ctuVar.e) {
            defpackage.csc.b("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        defpackage.cxl cxlVar2 = (defpackage.cxl) aauVar.a(obj);
        int i = bzcVar.b;
        int i2 = ctuVar.e;
        if (i == i2) {
            bzcVar.n(obj);
        } else {
            bzcVar.d(i2, obj);
        }
        ctuVar.e++;
        defpackage.aau aauVar2 = ctuVar.n;
        boolean zF = defpackage.aau.f(aauVar2, obj);
        if (zF || cxlVar2 != null) {
            if (!zF) {
                defpackage.cxl cxlVar3 = ctuVar.a;
                ctuVar.o(cxlVar3.x().indexOf(cxlVar2), cxlVar3.x().size());
                ctuVar.j++;
                aauVar.i(obj);
                aauVar2.m(obj, cxlVar2);
                ctuVar.o.m(obj, ctuVar.a(obj));
                if (cxlVar3.am()) {
                    ctuVar.k();
                }
            }
            defpackage.cxl cxlVar4 = (defpackage.cxl) aauVar2.a(obj);
            defpackage.ctl ctlVar = cxlVar4 != null ? (defpackage.ctl) ctuVar.l.a(cxlVar4) : null;
            if (ctlVar != null && ctlVar.c) {
                ctuVar.n(cxlVar4, obj, false, affgVar);
            }
            if ((ctlVar != null ? ctlVar.h : null) != null) {
                ctuVar.f(ctlVar, true);
            }
        } else {
            ctuVar.m(obj, affgVar, false);
            ctuVar.o.m(obj, ctuVar.a(obj));
        }
        defpackage.cxl cxlVar5 = (defpackage.cxl) aauVar2.a(obj);
        if (cxlVar5 == null) {
            return defpackage.afce.a;
        }
        java.util.List listR = cxlVar5.o().r();
        int size = listR.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((defpackage.cxz) listR.get(i3)).f.b = true;
        }
        return listR;
    }
}
