package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class atq implements defpackage.cty {
    public final defpackage.cfu a;
    private final boolean b;

    public atq(defpackage.cfu cfuVar, boolean z) {
        this.a = cfuVar;
        this.b = z;
    }

    @Override // defpackage.cty
    public final /* synthetic */ int a(defpackage.csz cszVar, java.util.List list, int i) {
        return defpackage.tw.q(this, cszVar, list, i);
    }

    @Override // defpackage.cty
    public final /* synthetic */ int b(defpackage.csz cszVar, java.util.List list, int i) {
        return defpackage.tw.r(this, cszVar, list, i);
    }

    @Override // defpackage.cty
    public final /* synthetic */ int c(defpackage.csz cszVar, java.util.List list, int i) {
        return defpackage.tw.s(this, cszVar, list, i);
    }

    @Override // defpackage.cty
    public final /* synthetic */ int d(defpackage.csz cszVar, java.util.List list, int i) {
        return defpackage.tw.t(this, cszVar, list, i);
    }

    @Override // defpackage.cty
    public final defpackage.ctz e(defpackage.cub cubVar, java.util.List list, long j) {
        defpackage.cux cuxVarV;
        int iMax;
        int iMax2;
        if (list.isEmpty()) {
            return cubVar.dS(defpackage.dlm.d(j), defpackage.dlm.c(j), defpackage.afcf.a, new defpackage.ajg(19));
        }
        long j2 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            defpackage.ctx ctxVar = (defpackage.ctx) list.get(0);
            defpackage.atm atmVarA = defpackage.atp.a(ctxVar);
            if (atmVarA == null || !atmVarA.b) {
                cuxVarV = ctxVar.v(j2);
                iMax = java.lang.Math.max(defpackage.dlm.d(j), cuxVarV.a);
                iMax2 = java.lang.Math.max(defpackage.dlm.c(j), cuxVarV.b);
            } else {
                iMax = defpackage.dlm.d(j);
                iMax2 = defpackage.dlm.c(j);
                cuxVarV = ctxVar.v(defpackage.dln.m(defpackage.dlm.d(j), defpackage.dlm.c(j)));
            }
            int i = iMax2;
            defpackage.cux cuxVar = cuxVarV;
            int i2 = iMax;
            return cubVar.dS(i2, i, defpackage.afcf.a, new defpackage.atv(cuxVar, ctxVar, cubVar, i2, i, this, 1));
        }
        defpackage.cux[] cuxVarArr = new defpackage.cux[list.size()];
        defpackage.afgt afgtVar = new defpackage.afgt();
        afgtVar.a = defpackage.dlm.d(j);
        defpackage.afgt afgtVar2 = new defpackage.afgt();
        afgtVar2.a = defpackage.dlm.c(j);
        int size = list.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            defpackage.ctx ctxVar2 = (defpackage.ctx) list.get(i3);
            defpackage.atm atmVarA2 = defpackage.atp.a(ctxVar2);
            if (atmVarA2 == null || !atmVarA2.b) {
                defpackage.cux cuxVarV2 = ctxVar2.v(j2);
                cuxVarArr[i3] = cuxVarV2;
                afgtVar.a = java.lang.Math.max(afgtVar.a, cuxVarV2.a);
                afgtVar2.a = java.lang.Math.max(afgtVar2.a, cuxVarV2.b);
            } else {
                z = true;
            }
        }
        if (z) {
            int i4 = afgtVar.a;
            int i5 = i4 != Integer.MAX_VALUE ? i4 : 0;
            int i6 = afgtVar2.a;
            long jD = defpackage.dln.d(i5, i4, i6 != Integer.MAX_VALUE ? i6 : 0, i6);
            int size2 = list.size();
            for (int i7 = 0; i7 < size2; i7++) {
                defpackage.ctx ctxVar3 = (defpackage.ctx) list.get(i7);
                defpackage.atm atmVarA3 = defpackage.atp.a(ctxVar3);
                if (atmVarA3 != null && atmVarA3.b) {
                    cuxVarArr[i7] = ctxVar3.v(jD);
                }
            }
        }
        return cubVar.dS(afgtVar.a, afgtVar2.a, defpackage.afcf.a, new defpackage.nns(cuxVarArr, list, cubVar, afgtVar, afgtVar2, this, 1));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.atq)) {
            return false;
        }
        defpackage.atq atqVar = (defpackage.atq) obj;
        return defpackage.afga.f(this.a, atqVar.a) && this.b == atqVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ")";
    }
}
