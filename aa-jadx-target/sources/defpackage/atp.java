package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class atp {
    private static final defpackage.aau b = e(true);
    private static final defpackage.aau c = e(false);
    private static final defpackage.cty a = defpackage.ato.a;

    public static final defpackage.atm a(defpackage.ctx ctxVar) {
        java.lang.Object objG = ctxVar.g();
        if (objG instanceof defpackage.atm) {
            return (defpackage.atm) objG;
        }
        return null;
    }

    public static final defpackage.cty b(defpackage.cfu cfuVar, boolean z) {
        defpackage.cty ctyVar = (defpackage.cty) (z ? b : c).a(cfuVar);
        return ctyVar == null ? new defpackage.atq(cfuVar, z) : ctyVar;
    }

    public static final void c(defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-211209833);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 0;
        if (bveVarC.I((i2 & 3) != 2, i2 & 1)) {
            defpackage.cty ctyVar = a;
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            long j = bwcVar.u;
            long j2 = j ^ (j >>> 32);
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVar);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVar, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j2), defpackage.cwl.f);
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.atn(cgfVar, i, i4);
        }
    }

    public static final void d(defpackage.cuw cuwVar, defpackage.cux cuxVar, defpackage.ctx ctxVar, defpackage.dlz dlzVar, int i, int i2, defpackage.cfu cfuVar) {
        defpackage.cfu cfuVar2;
        defpackage.atm atmVarA = a(ctxVar);
        cuwVar.s(cuxVar, ((atmVarA == null || (cfuVar2 = atmVarA.a) == null) ? cfuVar : cfuVar2).a((((long) cuxVar.a) << 32) | (((long) cuxVar.b) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), dlzVar), 0.0f);
    }

    private static final defpackage.aau e(boolean z) {
        defpackage.aau aauVar = new defpackage.aau(9);
        defpackage.cfu cfuVar = defpackage.cfs.a;
        aauVar.m(cfuVar, new defpackage.atq(cfuVar, z));
        defpackage.cfu cfuVar2 = defpackage.cfs.b;
        aauVar.m(cfuVar2, new defpackage.atq(cfuVar2, z));
        defpackage.cfu cfuVar3 = defpackage.cfs.c;
        aauVar.m(cfuVar3, new defpackage.atq(cfuVar3, z));
        defpackage.cfu cfuVar4 = defpackage.cfs.d;
        aauVar.m(cfuVar4, new defpackage.atq(cfuVar4, z));
        defpackage.cfu cfuVar5 = defpackage.cfs.e;
        aauVar.m(cfuVar5, new defpackage.atq(cfuVar5, z));
        defpackage.cfu cfuVar6 = defpackage.cfs.f;
        aauVar.m(cfuVar6, new defpackage.atq(cfuVar6, z));
        defpackage.cfu cfuVar7 = defpackage.cfs.g;
        aauVar.m(cfuVar7, new defpackage.atq(cfuVar7, z));
        defpackage.cfu cfuVar8 = defpackage.cfs.h;
        aauVar.m(cfuVar8, new defpackage.atq(cfuVar8, z));
        defpackage.cfu cfuVar9 = defpackage.cfs.i;
        aauVar.m(cfuVar9, new defpackage.atq(cfuVar9, z));
        return aauVar;
    }
}
