package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final /* synthetic */ class bhm implements afeg {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ bhm(bfh bfhVar, det detVar, asf asfVar, kwp kwpVar, int i) {
        this.e = i;
        this.b = bfhVar;
        this.c = detVar;
        this.d = asfVar;
        this.a = kwpVar;
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [asf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [afeg, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        if (this.e != 0) {
            bux buxVar = (bux) obj;
            int iIntValue = ((Integer) obj2).intValue();
            if (buxVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                Object obj3 = this.c;
                Object obj4 = this.b;
                byte[] bArr = null;
                cjq cjqVar = new cjq(new bee(obj4, obj3, 2, null));
                Object objG = buxVar.g();
                Object obj5 = buw.a;
                if (objG == obj5) {
                    objG = new bes(7);
                    buxVar.x(objG);
                }
                Object obj6 = this.a;
                ?? r10 = this.d;
                AtomicInteger atomicInteger = dds.a;
                cfy cfyVarI = tl.i(cjqVar.a(new ddg(false, (afec) objG)).a(new bfk(new cdt((bfh) obj4, (det) obj3))).a(new akb(r10)), cqq.c);
                boolean zE = buxVar.E(obj4) | buxVar.C(obj3) | buxVar.E(obj6);
                Object objG2 = buxVar.g();
                if (zE || objG2 == obj5) {
                    objG2 = new aiy(obj3, obj6, 11, bArr);
                    buxVar.x(objG2);
                }
                atk.c(cfyVarI.a(new ajm(r10, (afdr) objG2)), buxVar, 0);
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        bux buxVar2 = (bux) obj;
        int iIntValue2 = ((Integer) obj2).intValue();
        int i = iIntValue2 & 3;
        if (buxVar2.I(i != 2, iIntValue2 & 1)) {
            Object obj7 = this.b;
            Object objG3 = buxVar2.g();
            Object obj8 = buw.a;
            if (objG3 == obj8) {
                objG3 = new bgb(obj7, 12);
                buxVar2.x(objG3);
            }
            cfy cfyVarF = tt.f(this.a, (afec) objG3);
            ctp ctpVarB = atk.b(cfl.a, true);
            int iG = a.g(buxVar2.b());
            ccx ccxVarN = buxVar2.N();
            cfy cfyVarJ = bzi.j(buxVar2, cfyVarF);
            afdr afdrVar = cwb.a;
            buxVar2.M();
            buxVar2.w();
            if (buxVar2.G()) {
                buxVar2.j(afdrVar);
            } else {
                buxVar2.y();
            }
            ?? r6 = this.c;
            byq.c(buxVar2, ctpVarB, cwb.e);
            byq.c(buxVar2, ccxVarN, cwb.d);
            byq.c(buxVar2, Integer.valueOf(iG), cwb.f);
            byq.b(buxVar2, cwb.g);
            byq.c(buxVar2, cfyVarJ, cwb.c);
            r6.invoke(buxVar2, 0);
            Object objG4 = buxVar2.g();
            if (objG4 == obj8) {
                objG4 = new beg(obj7, 13);
                buxVar2.x(objG4);
            }
            ((bhl) this.d).c((afdr) objG4, buxVar2, 6);
            buxVar2.n();
        } else {
            buxVar2.s();
        }
        return afak.a;
    }

    public /* synthetic */ bhm(cfy cfyVar, bwq bwqVar, afeg afegVar, bhl bhlVar, int i) {
        this.e = i;
        this.a = cfyVar;
        this.b = bwqVar;
        this.c = afegVar;
        this.d = bhlVar;
    }
}
