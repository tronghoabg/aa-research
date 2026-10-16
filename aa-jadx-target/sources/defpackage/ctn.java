package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ctn implements defpackage.cvm {
    public defpackage.dlz a = defpackage.dlz.b;
    public float b;
    public float c;
    final /* synthetic */ defpackage.ctu d;

    public ctn(defpackage.ctu ctuVar) {
        this.d = ctuVar;
    }

    @Override // defpackage.dlo
    public final float a() {
        return this.b;
    }

    @Override // defpackage.dlu
    public final float b() {
        return this.c;
    }

    @Override // defpackage.dlu
    public final /* synthetic */ float dE(long j) {
        return defpackage.dln.n(this, j);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ float dF(float f) {
        return (f / this.b) + 0.0f;
    }

    @Override // defpackage.dlo
    public final /* synthetic */ float dG(int i) {
        return (i / this.b) + 0.0f;
    }

    @Override // defpackage.dlo
    public final /* synthetic */ float dH(long j) {
        return defpackage.dln.p(this, j);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ float dI(float f) {
        return f * this.b;
    }

    @Override // defpackage.dlo
    public final /* synthetic */ int dM(long j) {
        return java.lang.Math.round(defpackage.dln.p(this, j));
    }

    @Override // defpackage.dlo
    public final /* synthetic */ int dN(float f) {
        return defpackage.dln.q(this, f);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ long dO(long j) {
        return defpackage.dln.r(this, j);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ long dP(long j) {
        return defpackage.dln.s(this, j);
    }

    @Override // defpackage.dlu
    public final /* synthetic */ long dQ(float f) {
        return defpackage.dln.o(this, f);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ long dR(float f) {
        return defpackage.dln.o(this, (f / this.b) + 0.0f);
    }

    @Override // defpackage.cub
    public final /* synthetic */ defpackage.ctz dS(int i, int i2, java.util.Map map, defpackage.affc affcVar) {
        return dT(i, i2, map, null, affcVar);
    }

    @Override // defpackage.cub
    public final defpackage.ctz dT(int i, int i2, java.util.Map map, defpackage.affc affcVar, defpackage.affc affcVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            defpackage.csc.c(defpackage.a.bz(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new defpackage.ctm(i, i2, map, affcVar, this, this.d, affcVar2);
    }

    @Override // defpackage.csz
    public final boolean dU() {
        defpackage.cxl cxlVar = this.d.a;
        return cxlVar.av() == 4 || cxlVar.av() == 2;
    }

    @Override // defpackage.csz
    public final defpackage.dlz p() {
        return this.a;
    }

    @Override // defpackage.cvm
    public final java.util.List r(java.lang.Object obj, defpackage.affg affgVar) {
        defpackage.ctu ctuVar = this.d;
        ctuVar.k();
        defpackage.cxl cxlVar = ctuVar.a;
        int iAv = cxlVar.av();
        if (iAv != 1 && iAv != 3 && iAv != 2 && iAv != 4) {
            defpackage.csc.c("subcompose can only be used inside the measure or layout blocks");
        }
        defpackage.aau aauVar = ctuVar.m;
        java.lang.Object objA = aauVar.a(obj);
        if (objA == null) {
            objA = (defpackage.cxl) ctuVar.n.i(obj);
            if (objA != null) {
                if (ctuVar.j <= 0) {
                    defpackage.csc.c("Check failed.");
                }
                ctuVar.j--;
            } else {
                objA = ctuVar.e(obj);
                if (objA == null) {
                    objA = ctuVar.d(ctuVar.d);
                }
            }
            aauVar.m(obj, objA);
        }
        defpackage.cxl cxlVar2 = (defpackage.cxl) objA;
        if (defpackage.afga.aC(cxlVar.x(), ctuVar.d) != cxlVar2) {
            int iIndexOf = cxlVar.x().indexOf(cxlVar2);
            if (iIndexOf < ctuVar.d) {
                defpackage.csc.b(defpackage.a.bl(obj, "Key \"", "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."));
            }
            int i = ctuVar.d;
            if (i != iIndexOf) {
                ctuVar.o(iIndexOf, i);
            }
        }
        ctuVar.d++;
        ctuVar.n(cxlVar2, obj, false, affgVar);
        return (iAv == 1 || iAv == 3) ? cxlVar2.u() : cxlVar2.t();
    }
}
