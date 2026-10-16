package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class hjg implements afeg {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ hjg(cfy cfyVar, afdr afdrVar, oqc oqcVar, afec afecVar, bym bymVar, bwq bwqVar, int i) {
        this.g = i;
        this.e = cfyVar;
        this.d = afdrVar;
        this.b = oqcVar;
        this.f = afecVar;
        this.c = bymVar;
        this.a = bwqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v12, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13, types: [afdr, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        cfm cfmVar;
        boolean z;
        hky hkyVar;
        cfv cfvVar;
        atc atcVar;
        afeg afegVar;
        afec afecVar;
        afeg afegVar2;
        afdr afdrVar;
        afeg afegVar3;
        Object obj3;
        afeg afegVar4;
        int i = this.g;
        int i2 = 2;
        if (i == 0) {
            bux buxVar = (bux) obj;
            int iIntValue = ((Integer) obj2).intValue();
            int i3 = iIntValue & 3;
            if (buxVar.I(i3 != 2, iIntValue & 1)) {
                Object obj4 = this.f;
                Object obj5 = this.e;
                czz.an(new bxe[]{hji.b.b(this.a), hji.c.b(this.b), hji.d.b(this.c), hji.e.b(this.d), hji.a.b(obj5)}, bxc.i(1012242263, true, new gsl(obj4, 18), buxVar), buxVar, 48);
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        if (i == 1) {
            bux buxVar2 = (bux) obj;
            int iIntValue2 = ((Integer) obj2).intValue();
            int i4 = iIntValue2 & 3;
            if (buxVar2.I(i4 != 2, iIntValue2 & 1)) {
                Object obj6 = this.f;
                Object obj7 = this.b;
                Object obj8 = this.e;
                Object obj9 = this.d;
                cfy cfyVarK = cfy.e;
                gfy gfyVar = (gfy) obj9;
                cfy cfyVarB = gfyVar.b(cfyVarK);
                cfyVarB.getClass();
                obj8.getClass();
                cfy cfyVarBe = ca.be(bxc.j(cfyVarB, (cil) obj8));
                int iOrdinal = ((gvl) obj6).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1 || iOrdinal == 2) {
                        cfyVarK = fxi.k(cfyVarK, null, (cil) obj7, null, null);
                    } else {
                        if (iOrdinal != 3 && iOrdinal != 4) {
                            throw new aezs();
                        }
                        cfyVarK = fxi.k(cfyVarK, null, null, null, (cil) obj7);
                    }
                }
                ?? r2 = this.c;
                ?? r0 = this.a;
                cfy cfyVarA = cfyVarBe.a(cfyVarK);
                if (((ggk) buxVar2.f(ggo.a)).m() && (gfyVar.d() instanceof gfx)) {
                    buxVar2.v(-2066721666);
                    hju hjuVarD = gfyVar.d();
                    if (hjuVarD == null) {
                        buxVar2.v(-2066721667);
                    } else {
                        buxVar2.v(903162884);
                        gvq.g(hjuVarD, r0.a(cfyVarA).a(r2), buxVar2, 0, 0);
                    }
                    buxVar2.o();
                    buxVar2.o();
                } else {
                    buxVar2.v(-2066619924);
                    cfy cfyVarA2 = r0.a(r2);
                    ctp ctpVarB = atk.b(cfl.a, false);
                    int iG = a.g(buxVar2.b());
                    ccx ccxVarN = buxVar2.N();
                    cfy cfyVarJ = bzi.j(buxVar2, cfyVarA2);
                    afdr afdrVar2 = cwb.a;
                    buxVar2.M();
                    buxVar2.w();
                    if (buxVar2.G()) {
                        buxVar2.j(afdrVar2);
                    } else {
                        buxVar2.y();
                    }
                    byq.c(buxVar2, ctpVarB, cwb.e);
                    byq.c(buxVar2, ccxVarN, cwb.d);
                    byq.c(buxVar2, Integer.valueOf(iG), cwb.f);
                    byq.b(buxVar2, cwb.g);
                    byq.c(buxVar2, cfyVarJ, cwb.c);
                    hju hjuVarD2 = gfyVar.d();
                    if (hjuVarD2 == null) {
                        buxVar2.v(-640263669);
                    } else {
                        buxVar2.v(810630326);
                        gvq.g(hjuVarD2, cfyVarA, buxVar2, 0, 0);
                    }
                    buxVar2.o();
                    buxVar2.n();
                    buxVar2.o();
                }
            } else {
                buxVar2.s();
            }
            return afak.a;
        }
        if (i != 2) {
            bux buxVar3 = (bux) obj;
            int iIntValue3 = ((Integer) obj2).intValue();
            if (buxVar3.I((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                tl.c(awd.c(this.e, 1.0f), null, null, null, null, 0, czz.at(buxVar3).F, 0L, null, bxc.i(1082669797, true, new oon((afdr) this.d, (oqc) this.b, (afec) this.f, (bym) this.c, (bwq) this.a, 0), buxVar3), buxVar3, 805306368, 446);
            } else {
                buxVar3.s();
            }
            return afak.a;
        }
        bux buxVar4 = (bux) obj;
        int iIntValue4 = ((Integer) obj2).intValue();
        if (buxVar4.I((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
            hkx hkxVar = (hkx) this.d;
            boolean z2 = hkxVar.e;
            cfy cfyVarU = z2 ? this.a : awd.u(cfy.e, null, 3);
            cfm cfmVar2 = cfl.k;
            atc atcVar2 = atd.c;
            ctp ctpVarA = atp.a(atcVar2, cfmVar2, buxVar4, 48);
            int iG2 = a.g(buxVar4.b());
            ccx ccxVarN2 = buxVar4.N();
            cfy cfyVarJ2 = bzi.j(buxVar4, cfyVarU);
            afdr afdrVar3 = cwb.a;
            buxVar4.M();
            buxVar4.w();
            if (buxVar4.G()) {
                buxVar4.j(afdrVar3);
            } else {
                buxVar4.y();
            }
            Object obj10 = this.e;
            Object obj11 = this.c;
            Object obj12 = this.f;
            afeg afegVar5 = cwb.e;
            byq.c(buxVar4, ctpVarA, afegVar5);
            afeg afegVar6 = cwb.d;
            byq.c(buxVar4, ccxVarN2, afegVar6);
            Integer numValueOf = Integer.valueOf(iG2);
            afeg afegVar7 = cwb.f;
            byq.c(buxVar4, numValueOf, afegVar7);
            afec afecVar2 = cwb.g;
            byq.b(buxVar4, afecVar2);
            afeg afegVar8 = cwb.c;
            byq.c(buxVar4, cfyVarJ2, afegVar8);
            boolean z3 = hkxVar.f;
            cfv cfvVar2 = cfy.e;
            cfvVar2.getClass();
            obj11.getClass();
            obj10.getClass();
            cfy cfyVarJ3 = fxi.j(bxc.j(cfvVar2, (cil) obj11), new hku(obj10, i2));
            hky hkyVar2 = (hky) obj12;
            hju hjuVar = hkyVar2.a;
            if (hjuVar == null) {
                buxVar4.v(-1977359669);
                buxVar4.o();
                cfmVar = cfmVar2;
                z = z3;
                hkyVar = hkyVar2;
                cfvVar = cfvVar2;
                atcVar = atcVar2;
                afegVar = afegVar6;
                afecVar = afecVar2;
                afegVar2 = afegVar7;
                afdrVar = afdrVar3;
                afegVar3 = afegVar8;
                obj3 = obj10;
                afegVar4 = afegVar5;
            } else {
                buxVar4.v(-1977359668);
                gvq.g(hjuVar, cfyVarJ3, buxVar4, 0, 0);
                if (z3) {
                    buxVar4.v(-1801056652);
                    cfmVar = cfmVar2;
                    hkyVar = hkyVar2;
                    cfvVar = cfvVar2;
                    afdrVar = afdrVar3;
                    atcVar = atcVar2;
                    z = z3;
                    afegVar = afegVar6;
                    afegVar2 = afegVar7;
                    afegVar3 = afegVar8;
                    afecVar = afecVar2;
                    obj3 = obj10;
                    afegVar4 = afegVar5;
                    xb.a(null, BitmapDescriptorFactory.HUE_RED, 0L, buxVar4, 0, 7);
                    buxVar4.o();
                } else {
                    cfmVar = cfmVar2;
                    z = z3;
                    hkyVar = hkyVar2;
                    cfvVar = cfvVar2;
                    atcVar = atcVar2;
                    afegVar = afegVar6;
                    afecVar = afecVar2;
                    afegVar2 = afegVar7;
                    afdrVar = afdrVar3;
                    afegVar3 = afegVar8;
                    obj3 = obj10;
                    afegVar4 = afegVar5;
                    buxVar4.v(-1801024939);
                    buxVar4.o();
                }
                buxVar4.o();
            }
            cfy cfyVarJ4 = fxi.j(ca.bf(bxc.j(hkw.a(cfvVar, z2), (cil) obj3), false, null), new hku(obj11, 0));
            ctp ctpVarA2 = atp.a(atcVar, cfmVar, buxVar4, 48);
            int iG3 = a.g(buxVar4.b());
            ccx ccxVarN3 = buxVar4.N();
            cfy cfyVarJ5 = bzi.j(buxVar4, cfyVarJ4);
            buxVar4.M();
            buxVar4.w();
            if (buxVar4.G()) {
                buxVar4.j(afdrVar);
            } else {
                buxVar4.y();
            }
            Object obj13 = this.b;
            byq.c(buxVar4, ctpVarA2, afegVar4);
            byq.c(buxVar4, ccxVarN3, afegVar);
            byq.c(buxVar4, Integer.valueOf(iG3), afegVar2);
            byq.b(buxVar4, afecVar);
            byq.c(buxVar4, cfyVarJ5, afegVar3);
            hky hkyVar3 = hkyVar;
            cil cilVar = (cil) obj13;
            hkw.b(hkw.a(ats.b(cfvVar, 1.0f, z2), z2), hkxVar, hkyVar3.b, cilVar, buxVar4, 3072);
            hkw.c(hkyVar3.c, z, asl.G(cfvVar, hkxVar.d), cilVar, buxVar4, 3072);
            buxVar4.n();
            buxVar4.n();
        } else {
            buxVar4.s();
        }
        return afak.a;
    }

    public /* synthetic */ hjg(gfy gfyVar, cil cilVar, cil cilVar2, gvl gvlVar, cfy cfyVar, cfy cfyVar2, int i) {
        this.g = i;
        this.d = gfyVar;
        this.e = cilVar;
        this.b = cilVar2;
        this.f = gvlVar;
        this.a = cfyVar;
        this.c = cfyVar2;
    }

    public /* synthetic */ hjg(hiu hiuVar, hje hjeVar, hix hixVar, hjf hjfVar, hja hjaVar, afeg afegVar, int i) {
        this.g = i;
        this.a = hiuVar;
        this.b = hjeVar;
        this.c = hixVar;
        this.d = hjfVar;
        this.e = hjaVar;
        this.f = afegVar;
    }

    public /* synthetic */ hjg(hkx hkxVar, cfy cfyVar, hky hkyVar, cil cilVar, cil cilVar2, cil cilVar3, int i) {
        this.g = i;
        this.d = hkxVar;
        this.a = cfyVar;
        this.f = hkyVar;
        this.c = cilVar;
        this.e = cilVar2;
        this.b = cilVar3;
    }
}
