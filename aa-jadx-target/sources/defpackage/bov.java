package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bov extends defpackage.cge implements defpackage.cwm, defpackage.cxe {
    private java.util.Map a;

    @Override // defpackage.cxe
    public final defpackage.ctz dt(defpackage.cub cubVar, defpackage.ctx ctxVar, long j) {
        float f = ((defpackage.dlr) defpackage.cjv.y(this, defpackage.bok.c)).a;
        if (f < 0.0f) {
            f = 0.0f;
        }
        defpackage.cux cuxVarV = ctxVar.v(j);
        boolean z = this.A && !java.lang.Float.isNaN(f) && defpackage.dlr.a(f, 0.0f) > 0;
        int iDN = !java.lang.Float.isNaN(f) ? cubVar.dN(f) : 0;
        int iMax = z ? java.lang.Math.max(cuxVarV.a, iDN) : cuxVarV.a;
        int iMax2 = z ? java.lang.Math.max(cuxVarV.b, iDN) : cuxVarV.b;
        if (z) {
            java.util.Map linkedHashMap = this.a;
            if (linkedHashMap == null) {
                linkedHashMap = new java.util.LinkedHashMap(2);
                this.a = linkedHashMap;
            }
            defpackage.cvp cvpVar = defpackage.bok.b;
            int iRound = java.lang.Math.round((iDN - cuxVarV.a) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(cvpVar, java.lang.Integer.valueOf(iRound));
            defpackage.csu csuVar = defpackage.bok.a;
            int iRound2 = java.lang.Math.round((iDN - cuxVarV.b) / 2.0f);
            linkedHashMap.put(csuVar, java.lang.Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        java.util.Map map = this.a;
        if (map == null) {
            map = defpackage.afcf.a;
        }
        return cubVar.dS(iMax, iMax2, map, new defpackage.avb(iMax, cuxVarV, iMax2, 3));
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int h(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ua.b(this, cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int i(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ua.c(this, cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int j(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ua.d(this, cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int k(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ua.e(this, cszVar, csyVar, i);
    }
}
