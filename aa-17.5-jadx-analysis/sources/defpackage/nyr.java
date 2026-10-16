package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class nyr implements afeh {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ nyr(boolean z, Object obj, int i) {
        this.c = i;
        this.a = z;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [bym, java.lang.Object] */
    @Override // defpackage.afeh
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        cfy cfyVarT;
        if (this.c != 0) {
            lxw lxwVar = (lxw) obj;
            bux buxVar = (bux) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            lxwVar.getClass();
            if ((iIntValue & 6) == 0) {
                iIntValue |= true != ((iIntValue & 8) == 0 ? buxVar.C(lxwVar) : buxVar.E(lxwVar)) ? 2 : 4;
            }
            if (buxVar.I((iIntValue & 19) != 18, iIntValue & 1)) {
                Object obj4 = this.b;
                int i = (iIntValue << 15) & 458752;
                if (this.a) {
                    buxVar.v(-1717934111);
                    nwr nwrVar = (nwr) obj4;
                    lxwVar.f(nwrVar.d.toString(), null, nwrVar.s, null, buxVar, i);
                    buxVar.o();
                } else {
                    buxVar.v(-1717724210);
                    nwr nwrVar2 = (nwr) obj4;
                    lxwVar.e(nwrVar2.d.toString(), null, nwrVar2.s, null, null, buxVar, i, 26);
                    buxVar.o();
                }
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        bux buxVar2 = (bux) obj2;
        int iIntValue2 = ((Integer) obj3).intValue();
        int i2 = nyx.a;
        ((abu) obj).getClass();
        int i3 = iIntValue2 & 17;
        if (buxVar2.I(i3 != 16, iIntValue2 & 1)) {
            cfv cfvVar = cfy.e;
            ctp ctpVarA = atp.a(atd.c, cfl.j, buxVar2, 0);
            int iG = a.g(buxVar2.b());
            ccx ccxVarN = buxVar2.N();
            cfy cfyVarJ = bzi.j(buxVar2, cfvVar);
            afdr afdrVar = cwb.a;
            buxVar2.M();
            buxVar2.w();
            if (buxVar2.G()) {
                buxVar2.j(afdrVar);
            } else {
                buxVar2.y();
            }
            boolean z = this.a;
            afeg afegVar = cwb.e;
            byq.c(buxVar2, ctpVarA, afegVar);
            afeg afegVar2 = cwb.d;
            byq.c(buxVar2, ccxVarN, afegVar2);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar3 = cwb.f;
            byq.c(buxVar2, numValueOf, afegVar3);
            afec afecVar = cwb.g;
            byq.b(buxVar2, afecVar);
            afeg afegVar4 = cwb.c;
            byq.c(buxVar2, cfyVarJ, afegVar4);
            cfy cfyVarV = awd.v(cfvVar, false, 3);
            if (z) {
                ksc kscVar = nlw.a;
                cfyVarT = awd.d(cfyVarV, 24.0f);
            } else {
                cfyVarT = awd.t(cfyVarV, null, 3);
            }
            ctp ctpVarA2 = avv.a(atd.e, cfl.m, buxVar2, 54);
            int iG2 = a.g(buxVar2.b());
            ccx ccxVarN2 = buxVar2.N();
            cfy cfyVarJ2 = bzi.j(buxVar2, cfyVarT);
            buxVar2.M();
            buxVar2.w();
            if (buxVar2.G()) {
                buxVar2.j(afdrVar);
            } else {
                buxVar2.y();
            }
            ?? r0 = this.b;
            byq.c(buxVar2, ctpVarA2, afegVar);
            byq.c(buxVar2, ccxVarN2, afegVar2);
            byq.c(buxVar2, Integer.valueOf(iG2), afegVar3);
            byq.b(buxVar2, afecVar);
            byq.c(buxVar2, cfyVarJ2, afegVar4);
            oag oagVar = oag.a;
            ksc kscVar2 = nlw.a;
            oagVar.d(das.d(awd.d(cfvVar, 24.0f), "clock"), czz.av(buxVar2).f, ((Boolean) r0.a()).booleanValue(), true, z, false, buxVar2, 1575936, 32);
            buxVar2.n();
            buxVar2.n();
        } else {
            buxVar2.s();
        }
        return afak.a;
    }
}
