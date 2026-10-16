package defpackage;

/* loaded from: classes2.dex */
public final class hdz {
    public static final void a(hea heaVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        bux buxVarC = buxVar.c(-10637059);
        if ((i & 6) == 0) {
            i2 = i | (true != ((i & 8) == 0 ? buxVarC.C(heaVar) : buxVarC.E(heaVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            boolean zA = ((hjo) buxVarC.f(hjp.a)).a(hjn.b, hjm.a);
            cfy cfyVarR = awd.r(cfyVar);
            ctp ctpVarA = avv.a(atd.a, cfl.n, buxVarC, 48);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarR);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            afeg afegVar = cwb.e;
            byq.c(buxVarC, ctpVarA, afegVar);
            afeg afegVar2 = cwb.d;
            byq.c(buxVarC, ccxVarAh, afegVar2);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar3 = cwb.f;
            byq.c(buxVarC, numValueOf, afegVar3);
            afec afecVar = cwb.g;
            byq.b(buxVarC, afecVar);
            afeg afegVar4 = cwb.c;
            byq.c(buxVarC, cfyVarJ, afegVar4);
            avy avyVar = avy.a;
            cfv cfvVar = cfy.e;
            cfy cfyVarB = avyVar.b(cfvVar, 1.0f, !zA);
            ctp ctpVarA2 = atp.a(atd.c, cfl.j, buxVarC, 0);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarB);
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA2, afegVar);
            byq.c(buxVarC, ccxVarAh2, afegVar2);
            byq.c(buxVarC, Integer.valueOf(iG2), afegVar3);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ2, afegVar4);
            gez gezVarV = fwl.v(null, null, null, false, heaVar.a.a, buxVarC, 0, 31);
            deu deuVar = gezVarV.a;
            deuVar.getClass();
            brp.c(deuVar, null, gux.c(buxVarC).C(), 0L, null, 0L, null, null, 0L, 2, false, 1, 0, gezVarV.b, null, czz.av(buxVarC).m, buxVarC, 0, 24960, 176122);
            buxVarC = buxVarC;
            gcq gcqVar = heaVar.b;
            if (gcqVar == null) {
                buxVarC.v(-1945886152);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-1945886151);
                fzc.g(gcqVar, null, 1, 0, gux.c(buxVarC).v(), czz.av(buxVarC).i, 0L, null, 0, 0, null, null, null, false, false, buxVarC, 392, 0, 64458);
                buxVarC = buxVarC;
                bvvVar.Y(false);
            }
            bvvVar.Y(true);
            gab gabVar = heaVar.c;
            if (gabVar != null) {
                buxVarC.v(-1449195380);
                hir hirVar = gux.e(buxVarC).c;
                asl.A(awd.m(cfvVar, 24.0f), buxVarC);
                hdq.a(new hds(gabVar, hdr.d), null, buxVarC, 8, 2);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-1449021439);
                bvvVar.Y(false);
            }
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new hcx(heaVar, cfyVar, i, 16);
        }
    }

    public static final cfy b(cfy cfyVar, hga hgaVar) {
        cfyVar.getClass();
        cfy cfyVarA = crh.a(cfyVar, afak.a, new hgj(hgaVar.g, 0));
        return cfyVarA == null ? cfyVar : cfyVarA;
    }
}
