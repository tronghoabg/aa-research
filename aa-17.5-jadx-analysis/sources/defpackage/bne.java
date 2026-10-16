package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class bne implements afeh {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bne(long j, bym bymVar, int i) {
        this.c = i;
        this.a = j;
        this.b = bymVar;
    }

    @Override // defpackage.afeh
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.c;
        cct cctVarI = null;
        if (i == 0) {
            bux buxVar = (bux) obj2;
            ((Integer) obj3).intValue();
            float f = bnf.a;
            Object obj4 = this.b;
            if (obj4 != null) {
                long j = this.a;
                buxVar.v(-1219075416);
                cctVarI = bxc.i(-566924201, true, new bnc(j, obj4, 1), buxVar);
                buxVar.o();
            } else {
                buxVar.v(-1218883371);
                buxVar.o();
            }
            bym bymVarB = bnf.b(cctVarI, buxVar);
            cfn cfnVar = cfl.e;
            cfv cfvVar = cfy.e;
            ctp ctpVarB = atk.b(cfnVar, false);
            int iG = a.g(buxVar.b());
            ccx ccxVarN = buxVar.N();
            cfy cfyVarJ = bzi.j(buxVar, cfvVar);
            afdr afdrVar = cwb.a;
            buxVar.M();
            buxVar.w();
            if (buxVar.G()) {
                buxVar.j(afdrVar);
            } else {
                buxVar.y();
            }
            byq.c(buxVar, ctpVarB, cwb.e);
            byq.c(buxVar, ccxVarN, cwb.d);
            byq.c(buxVar, Integer.valueOf(iG), cwb.f);
            byq.b(buxVar, cwb.g);
            byq.c(buxVar, cfyVarJ, cwb.c);
            afeg afegVar = (afeg) bymVarB.a();
            if (afegVar == null) {
                buxVar.v(-657207800);
            } else {
                buxVar.v(671536409);
                afegVar.invoke(buxVar, 0);
            }
            buxVar.o();
            buxVar.n();
            return afak.a;
        }
        if (i != 1) {
            if (i == 2) {
                bux buxVar2 = (bux) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((abu) obj).getClass();
                int i2 = iIntValue & 17;
                if (buxVar2.I(i2 != 16, iIntValue & 1)) {
                    jur.b(bxc.i(509410027, true, new bnc(this.a, this.b, 3), buxVar2), buxVar2, 6);
                } else {
                    buxVar2.s();
                }
                return afak.a;
            }
            mcd mcdVar = (mcd) obj;
            bux buxVar3 = (bux) obj2;
            int iIntValue2 = ((Integer) obj3).intValue();
            mcdVar.getClass();
            if ((iIntValue2 & 6) == 0) {
                iIntValue2 |= true == ((iIntValue2 & 8) == 0 ? buxVar3.C(mcdVar) : buxVar3.E(mcdVar)) ? 4 : 2;
            }
            if (buxVar3.I((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                long j2 = this.a;
                nwr nwrVar = (nwr) this.b;
                mcdVar.c(nwrVar.e.toString(), null, nwrVar.f, j2, buxVar3, (iIntValue2 << 12) & 57344, 2);
            } else {
                buxVar3.s();
            }
            return afak.a;
        }
        bux buxVar4 = (bux) obj2;
        ((Integer) obj3).intValue();
        float f2 = bnf.a;
        Object obj5 = this.b;
        if (obj5 != null) {
            long j3 = this.a;
            buxVar4.v(1575370973);
            cctVarI = bxc.i(-237350650, true, new bnc(j3, obj5, 0), buxVar4);
            buxVar4.o();
        } else {
            buxVar4.v(1575598419);
            buxVar4.o();
        }
        bym bymVarB2 = bnf.b(cctVarI, buxVar4);
        cfn cfnVar2 = cfl.e;
        cfv cfvVar2 = cfy.e;
        ctp ctpVarB2 = atk.b(cfnVar2, false);
        int iG2 = a.g(buxVar4.b());
        ccx ccxVarN2 = buxVar4.N();
        cfy cfyVarJ2 = bzi.j(buxVar4, cfvVar2);
        afdr afdrVar2 = cwb.a;
        buxVar4.M();
        buxVar4.w();
        if (buxVar4.G()) {
            buxVar4.j(afdrVar2);
        } else {
            buxVar4.y();
        }
        byq.c(buxVar4, ctpVarB2, cwb.e);
        byq.c(buxVar4, ccxVarN2, cwb.d);
        byq.c(buxVar4, Integer.valueOf(iG2), cwb.f);
        byq.b(buxVar4, cwb.g);
        byq.c(buxVar4, cfyVarJ2, cwb.c);
        afeg afegVar2 = (afeg) bymVarB2.a();
        if (afegVar2 == null) {
            buxVar4.v(2094511935);
        } else {
            buxVar4.v(1037396226);
            afegVar2.invoke(buxVar4, 0);
        }
        buxVar4.o();
        buxVar4.n();
        return afak.a;
    }

    public /* synthetic */ bne(Object obj, long j, int i) {
        this.c = i;
        this.b = obj;
        this.a = j;
    }
}
