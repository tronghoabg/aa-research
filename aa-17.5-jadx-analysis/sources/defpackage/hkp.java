package defpackage;

/* loaded from: classes2.dex */
final class hkp implements afeg {
    final /* synthetic */ afeh a;
    final /* synthetic */ doj b;
    final /* synthetic */ cil c;
    final /* synthetic */ cil d;

    public hkp(afeh afehVar, doj dojVar, cil cilVar, cil cilVar2) {
        this.a = afehVar;
        this.b = dojVar;
        this.c = cilVar;
        this.d = cilVar2;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        bux buxVar = (bux) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (buxVar.I(i != 2, iIntValue & 1)) {
            afeh afehVar = this.a;
            if (afehVar == null) {
                buxVar.v(1014109537);
                buxVar.o();
            } else {
                buxVar.v(1279639200);
                doj dojVar = this.b;
                cfv cfvVar = cfy.e;
                Object objG = buxVar.g();
                Object obj3 = buw.a;
                if (objG == obj3) {
                    objG = hkn.a;
                    buxVar.x(objG);
                }
                cfy cfyVarJ = bxc.j(dom.h(cfvVar, dojVar, (afec) objG), this.c);
                cil cilVar = this.d;
                Object objG2 = buxVar.g();
                if (objG2 == obj3) {
                    objG2 = new hko(cilVar, 0);
                    buxVar.x(objG2);
                }
                afehVar.invoke(fxi.j(cfyVarJ, (afec) objG2), buxVar, 0);
                buxVar.o();
            }
        } else {
            buxVar.s();
        }
        return afak.a;
    }
}
