package defpackage;

/* loaded from: classes2.dex */
public final class hkz implements afeg {
    final /* synthetic */ bwq a;
    final /* synthetic */ afdr b;
    final /* synthetic */ afeg c;
    final /* synthetic */ afeg d;
    final /* synthetic */ dom e;

    public hkz(bwq bwqVar, dom domVar, afdr afdrVar, afeg afegVar, afeg afegVar2) {
        this.a = bwqVar;
        this.e = domVar;
        this.b = afdrVar;
        this.c = afegVar;
        this.d = afegVar2;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        bux buxVar = (bux) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && buxVar.H()) {
            buxVar.s();
        } else {
            this.a.b(afak.a);
            dom domVar = this.e;
            int i = domVar.b;
            domVar.g();
            buxVar.v(710785583);
            ajmd ajmdVarL = domVar.l();
            doj dojVarO = ajmdVarL.O();
            doj dojVarP = ajmdVarL.P();
            cfv cfvVar = cfy.e;
            Object objG = buxVar.g();
            Object obj3 = buw.a;
            if (objG == obj3) {
                objG = hkn.c;
                buxVar.x(objG);
            }
            cfy cfyVarH = dom.h(cfvVar, dojVarO, (afec) objG);
            ctp ctpVarB = atk.b(cfl.a, false);
            int iG = a.g(buxVar.b());
            ccx ccxVarN = buxVar.N();
            cfy cfyVarJ = bzi.j(buxVar, cfyVarH);
            afdr afdrVar = cwb.a;
            buxVar.M();
            buxVar.w();
            if (buxVar.G()) {
                buxVar.j(afdrVar);
            } else {
                buxVar.y();
            }
            afeg afegVar = cwb.e;
            byq.c(buxVar, ctpVarB, afegVar);
            afeg afegVar2 = cwb.d;
            byq.c(buxVar, ccxVarN, afegVar2);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar3 = cwb.f;
            byq.c(buxVar, numValueOf, afegVar3);
            afec afecVar = cwb.g;
            byq.b(buxVar, afecVar);
            afeg afegVar4 = cwb.c;
            byq.c(buxVar, cfyVarJ, afegVar4);
            this.c.invoke(buxVar, 0);
            buxVar.n();
            boolean zC = buxVar.C(dojVarO);
            Object objG2 = buxVar.g();
            if (zC || objG2 == obj3) {
                objG2 = new hko(dojVarO, 4);
                buxVar.x(objG2);
            }
            cfy cfyVarH2 = dom.h(cfvVar, dojVarP, (afec) objG2);
            ctp ctpVarB2 = atk.b(cfl.g, false);
            int iG2 = a.g(buxVar.b());
            ccx ccxVarN2 = buxVar.N();
            cfy cfyVarJ2 = bzi.j(buxVar, cfyVarH2);
            buxVar.M();
            buxVar.w();
            if (buxVar.G()) {
                buxVar.j(afdrVar);
            } else {
                buxVar.y();
            }
            byq.c(buxVar, ctpVarB2, afegVar);
            byq.c(buxVar, ccxVarN2, afegVar2);
            byq.c(buxVar, Integer.valueOf(iG2), afegVar3);
            byq.b(buxVar, afecVar);
            byq.c(buxVar, cfyVarJ2, afegVar4);
            this.d.invoke(buxVar, 0);
            buxVar.n();
            buxVar.o();
            if (domVar.b != i) {
                buxVar.v(1658858795);
                buxVar.r(this.b);
                buxVar.o();
            } else {
                buxVar.v(1659148056);
                buxVar.o();
            }
        }
        return afak.a;
    }
}
