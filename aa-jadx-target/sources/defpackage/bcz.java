package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bcz {
    public static final defpackage.afau a;

    static {
        defpackage.afce afceVar = defpackage.afce.a;
        a = new defpackage.afau(afceVar, afceVar);
    }

    public static final void a(defpackage.dfb dfbVar, java.util.List list, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1794596951);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(dfbVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        char c = ' ';
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(list) ? 16 : 32;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            int size = list.size();
            int i4 = 0;
            while (i4 < size) {
                defpackage.dfa dfaVar = (defpackage.dfa) list.get(i4);
                defpackage.affh affhVar = (defpackage.affh) dfaVar.a;
                int i5 = dfaVar.b;
                int i6 = dfaVar.c;
                defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
                java.lang.Object objS = bwcVar.S();
                if (objS == defpackage.bvd.a) {
                    objS = defpackage.ato.c;
                    bwcVar.ad(objS);
                }
                defpackage.cty ctyVar = (defpackage.cty) objS;
                defpackage.cgc cgcVar = defpackage.cgf.e;
                int i7 = i4;
                long j = bwcVar.u;
                long j2 = j ^ (j >>> c);
                defpackage.cdd cddVarAh = bwcVar.ah();
                defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgcVar);
                defpackage.afer aferVar = defpackage.cwl.a;
                bveVarC.w();
                if (bwcVar.t) {
                    bveVarC.j(aferVar);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, ctyVar, defpackage.cwl.e);
                defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j2), defpackage.cwl.f);
                bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
                affhVar.invoke(dfbVar.subSequence(i5, i6).b, bveVarC, 0);
                bwcVar.Y(true);
                i4 = i7 + 1;
                c = ' ';
            }
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.agg(dfbVar, list, i, 6);
        }
    }
}
