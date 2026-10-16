package defpackage;

/* loaded from: classes2.dex */
final class opb implements afeh {
    final /* synthetic */ opm a;
    final /* synthetic */ boolean b;
    final /* synthetic */ afec c;
    final /* synthetic */ String d;
    final /* synthetic */ afec e;
    final /* synthetic */ kwp f;

    public opb(opm opmVar, boolean z, kwp kwpVar, afec afecVar, String str, afec afecVar2) {
        this.a = opmVar;
        this.b = z;
        this.f = kwpVar;
        this.c = afecVar;
        this.d = str;
        this.e = afecVar2;
    }

    @Override // defpackage.afeh
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        bux buxVar = (bux) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ats) obj).getClass();
        int i = iIntValue & 17;
        if (buxVar.I(i != 16, iIntValue & 1)) {
            opm opmVar = this.a;
            boolean z = this.b;
            kwp kwpVar = this.f;
            afec afecVar = this.c;
            String str = this.d;
            afec afecVar2 = this.e;
            cfv cfvVar = cfy.e;
            ctp ctpVarA = atp.a(atd.c, cfl.j, buxVar, 0);
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
            byq.c(buxVar, ctpVarA, cwb.e);
            byq.c(buxVar, ccxVarN, cwb.d);
            byq.c(buxVar, Integer.valueOf(iG), cwb.f);
            byq.b(buxVar, cwb.g);
            byq.c(buxVar, cfyVarJ, cwb.c);
            ats atsVar = ats.a;
            boolean zE = buxVar.E(kwpVar) | buxVar.C(afecVar) | buxVar.D(z) | buxVar.C(str);
            Object objG = buxVar.g();
            if (zE || objG == buw.a) {
                objG = new opa(kwpVar, afecVar, z, str);
                buxVar.x(objG);
            }
            mva.E(opmVar, z, (afdr) objG, buxVar, 8);
            ca.P(atsVar, z, null, acl.p(null, 15), acl.u(null, 15), null, bxc.i(1131308533, true, new ndv(opmVar, afecVar2, 3), buxVar), buxVar, 1600518, 18);
            buxVar.n();
        } else {
            buxVar.s();
        }
        return afak.a;
    }
}
