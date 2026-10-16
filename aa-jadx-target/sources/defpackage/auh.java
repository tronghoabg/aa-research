package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class auh extends defpackage.cge implements defpackage.cxe, defpackage.cyy {
    public float a;
    public int b;

    public auh(int i, float f) {
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.cyy
    public final java.lang.Object ds(java.lang.Object obj) {
        defpackage.aui auiVar = obj instanceof defpackage.aui ? (defpackage.aui) obj : null;
        if (auiVar == null) {
            return obj == null ? new defpackage.aui() : obj;
        }
        return auiVar;
    }

    @Override // defpackage.cxe
    public final defpackage.ctz dt(defpackage.cub cubVar, defpackage.ctx ctxVar, long j) {
        int iD;
        int iB;
        int iA;
        int i;
        if (!defpackage.dlm.h(j) || this.b == 1) {
            iD = defpackage.dlm.d(j);
            iB = defpackage.dlm.b(j);
        } else {
            float fB = defpackage.dlm.b(j) * this.a;
            int iD2 = defpackage.dlm.d(j);
            iD = defpackage.dlm.b(j);
            int iRound = java.lang.Math.round(fB);
            if (iRound >= iD2) {
                iD2 = iRound;
            }
            if (iD2 <= iD) {
                iD = iD2;
            }
            iB = iD;
        }
        if (!defpackage.dlm.g(j) || this.b == 2) {
            int iC = defpackage.dlm.c(j);
            int iA2 = defpackage.dlm.a(j);
            iA = iC;
            i = iA2;
        } else {
            float fA = defpackage.dlm.a(j) * this.a;
            int iC2 = defpackage.dlm.c(j);
            iA = defpackage.dlm.a(j);
            int iRound2 = java.lang.Math.round(fA);
            if (iRound2 >= iC2) {
                iC2 = iRound2;
            }
            if (iC2 <= iA) {
                iA = iC2;
            }
            i = iA;
        }
        defpackage.cux cuxVarV = ctxVar.v(defpackage.dln.d(iD, iB, iA, i));
        return cubVar.dS(cuxVarV.a, cuxVarV.b, defpackage.afcf.a, new defpackage.act(cuxVarV, 20));
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
}
