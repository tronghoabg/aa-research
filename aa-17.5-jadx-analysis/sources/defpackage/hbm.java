package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class hbm implements afei {
    final /* synthetic */ List a;
    final /* synthetic */ cil b;
    final /* synthetic */ byd c;

    public hbm(List list, byd bydVar, cil cilVar) {
        this.a = list;
        this.c = bydVar;
        this.b = cilVar;
    }

    @Override // defpackage.afei
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        bii biiVar = (bii) obj;
        int iIntValue = ((Number) obj2).intValue();
        bux buxVar = (bux) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        boolean z = true;
        if ((iIntValue2 & 6) == 0) {
            i = (true != buxVar.C(biiVar) ? 2 : 4) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= true != buxVar.A(iIntValue) ? 16 : 32;
        }
        if (buxVar.I((i & 147) != 146, i & 1)) {
            hbp hbpVar = (hbp) this.a.get(iIntValue);
            buxVar.v(1438870015);
            Object objG = buxVar.g();
            Object obj5 = buw.a;
            if (objG == obj5) {
                objG = new bca();
                buxVar.x(objG);
            }
            bca bcaVar = (bca) objG;
            Object objG2 = buxVar.g();
            if (objG2 == obj5) {
                objG2 = bvq.a(afcp.a, buxVar);
                buxVar.x(objG2);
            }
            byd bydVar = this.c;
            aitx aitxVar = (aitx) objG2;
            boolean zC = buxVar.C(bydVar);
            if ((((i & 112) ^ 48) <= 32 || !buxVar.A(iIntValue)) && (i & 48) != 32) {
                z = false;
            }
            boolean zE = zC | z | buxVar.E(hbpVar);
            Object objG3 = buxVar.g();
            if (zE || objG3 == obj5) {
                objG3 = new hbl(iIntValue, hbpVar, bydVar);
                buxVar.x(objG3);
            }
            afdr afdrVar = (afdr) objG3;
            int i2 = hbp.a;
            gcq gcqVar = hbpVar.b;
            gbg gbgVar = hbpVar.c;
            gbg gbgVar2 = hbpVar.d;
            boolean z2 = hbpVar.e;
            hbo hboVar = hbpVar.g;
            afdrVar.getClass();
            hbp hbpVar2 = new hbp(gcqVar, gbgVar, gbgVar2, z2, afdrVar, hboVar);
            cfy cfyVarR = afp.R(cfy.e, bcaVar);
            if (iIntValue == bydVar.e()) {
                cfyVarR = bxc.j(cfyVarR, this.b);
            }
            boolean zE2 = buxVar.E(aitxVar) | buxVar.E(bcaVar);
            Object objG4 = buxVar.g();
            if (zE2 || objG4 == obj5) {
                objG4 = new dah(aitxVar, bcaVar, 12);
                buxVar.x(objG4);
            }
            hbf.b(hbpVar2, bxc.l(cfyVarR, (afec) objG4), null, buxVar, hbp.a);
            buxVar.o();
        } else {
            buxVar.s();
        }
        return afak.a;
    }
}
