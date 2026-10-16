package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class hkq implements afeg {
    final /* synthetic */ bwq a;
    final /* synthetic */ afdr b;
    final /* synthetic */ afeh c;
    final /* synthetic */ cil d;
    final /* synthetic */ hks e;
    final /* synthetic */ afeh f;
    final /* synthetic */ avp g;
    final /* synthetic */ cil h;
    final /* synthetic */ cil i;
    final /* synthetic */ afeh j;
    final /* synthetic */ dom k;

    public hkq(bwq bwqVar, dom domVar, afdr afdrVar, afeh afehVar, cil cilVar, hks hksVar, afeh afehVar2, avp avpVar, cil cilVar2, cil cilVar3, afeh afehVar3) {
        this.a = bwqVar;
        this.k = domVar;
        this.b = afdrVar;
        this.c = afehVar;
        this.d = cilVar;
        this.e = hksVar;
        this.f = afehVar2;
        this.g = avpVar;
        this.h = cilVar2;
        this.i = cilVar3;
        this.j = afehVar3;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        hks hksVar;
        bux buxVar = (bux) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && buxVar.H()) {
            buxVar.s();
        } else {
            this.a.b(afak.a);
            dom domVar = this.k;
            int i = domVar.b;
            domVar.g();
            buxVar.v(1067786695);
            ajmd ajmdVarL = domVar.l();
            doj dojVarO = ajmdVarL.O();
            doj dojVarP = ajmdVarL.P();
            doj dojVarQ = ajmdVarL.Q();
            doj dojVarR = ajmdVarL.R();
            afeh afehVar = this.c;
            if (afehVar == null) {
                buxVar.v(1067771720);
                buxVar.o();
            } else {
                buxVar.v(34444249);
                cfv cfvVar = cfy.e;
                Object objG = buxVar.g();
                Object obj3 = buw.a;
                if (objG == obj3) {
                    objG = ebq.t;
                    buxVar.x(objG);
                }
                cfy cfyVarJ = bxc.j(dom.h(cfvVar, dojVarO, (afec) objG), this.d);
                Object objG2 = buxVar.g();
                if (objG2 == obj3) {
                    gyv gyvVar = new gyv(this.h, 19);
                    buxVar.x(gyvVar);
                    objG2 = gyvVar;
                }
                cfy cfyVarJ2 = fxi.j(cfyVarJ, (afec) objG2);
                Object objG3 = buxVar.g();
                if (objG3 == obj3) {
                    objG3 = hkn.b;
                    buxVar.x(objG3);
                }
                afehVar.invoke(ca.be(bxc.k(cfyVarJ2, (afec) objG3)), buxVar, 0);
                buxVar.o();
            }
            hks hksVar2 = this.e;
            if (hksVar2.c) {
                buxVar.v(1068612410);
                cfv cfvVar2 = cfy.e;
                boolean zC = buxVar.C(afehVar) | buxVar.C(dojVarO);
                Object objG4 = buxVar.g();
                if (zC || objG4 == buw.a) {
                    objG4 = new dah(afehVar, dojVarO, 15);
                    buxVar.x(objG4);
                }
                hksVar = hksVar2;
                xb.a(dom.h(cfvVar2, dojVarR, (afec) objG4), BitmapDescriptorFactory.HUE_RED, 0L, buxVar, 0, 6);
                buxVar.o();
            } else {
                hksVar = hksVar2;
                buxVar.v(1068986239);
                buxVar.o();
            }
            afeh afehVar2 = this.f;
            cfv cfvVar3 = cfy.e;
            boolean zA = buxVar.A(hksVar.ordinal()) | buxVar.C(dojVarR) | buxVar.C(afehVar) | buxVar.C(dojVarO);
            Object objG5 = buxVar.g();
            if (zA || objG5 == buw.a) {
                objG5 = new hkm(hksVar, dojVarR, afehVar, dojVarO);
                buxVar.x(objG5);
            }
            cfy cfyVarG = asl.G(dom.h(cfvVar3, dojVarP, (afec) objG5), this.g);
            cil cilVar = this.h;
            cfy cfyVarJ3 = bxc.j(cfyVarG, cilVar);
            boolean zC2 = buxVar.C(afehVar);
            Object objG6 = buxVar.g();
            if (zC2 || objG6 == buw.a) {
                objG6 = new hko(afehVar, 1);
                buxVar.x(objG6);
            }
            cfy cfyVarK = bxc.k(cfyVarJ3, (afec) objG6);
            Object objG7 = buxVar.g();
            if (objG7 == buw.a) {
                dah dahVar = new dah(this.i, this.d, 16);
                buxVar.x(dahVar);
                objG7 = dahVar;
            }
            afehVar2.invoke(ca.be(fxi.j(cfyVarK, (afec) objG7)), buxVar, 0);
            czz.am(fwg.a.b(fwf.c), bxc.i(-1688052029, true, new hkp(this.j, dojVarQ, this.i, cilVar), buxVar), buxVar, 56);
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
