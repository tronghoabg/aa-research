package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class nlu implements afeh {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ nlu(kts ktsVar, boolean z, boolean z2, int i) {
        this.d = i;
        this.c = ktsVar;
        this.a = z;
        this.b = z2;
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [hcb, java.lang.Object] */
    @Override // defpackage.afeh
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        if (this.d == 0) {
            String str = (String) obj;
            bux buxVar = (bux) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            str.getClass();
            if ((iIntValue & 6) == 0) {
                iIntValue |= true != buxVar.C(str) ? 2 : 4;
            }
            if (buxVar.I((iIntValue & 19) != 18, iIntValue & 1)) {
                boolean z = this.a;
                Object obj4 = this.c;
                obj4.getClass();
                if (z) {
                    kts ktsVar = (kts) obj4;
                    j = this.b ? ktsVar.r : ktsVar.p;
                } else {
                    j = ((kts) obj4).q;
                }
                lws.x(str, null, j, buxVar, iIntValue & 14);
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        bux buxVar2 = (bux) obj2;
        int iIntValue2 = ((Integer) obj3).intValue();
        ((bii) obj).getClass();
        if (buxVar2.I((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
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
            boolean z2 = this.a;
            byq.c(buxVar2, ctpVarA, cwb.e);
            byq.c(buxVar2, ccxVarN, cwb.d);
            byq.c(buxVar2, Integer.valueOf(iG), cwb.f);
            byq.b(buxVar2, cwb.g);
            byq.c(buxVar2, cfyVarJ, cwb.c);
            if (z2) {
                buxVar2.v(-25282591);
                asl.A(awd.d(cfvVar, gux.e(buxVar2).b.g), buxVar2);
                buxVar2.o();
            } else {
                buxVar2.v(-25209555);
                buxVar2.o();
            }
            if (this.b) {
                ?? r6 = this.c;
                buxVar2.v(-25177315);
                cfy cfyVarR = awd.r(cfvVar);
                if (r6.b() != null) {
                    buxVar2.v(-25090050);
                    hju hjuVarB = r6.b();
                    hjuVarB.getClass();
                    gvq.g(hjuVarB, cfyVarR, buxVar2, 48, 0);
                    buxVar2.o();
                } else if (r6.a() != null) {
                    buxVar2.v(-24976714);
                    gfa gfaVarA = r6.a();
                    gfaVarA.getClass();
                    hbz.a(new hca(gfaVarA), cfyVarR, buxVar2, 56);
                    buxVar2.o();
                } else {
                    buxVar2.v(-24831603);
                    buxVar2.o();
                }
                buxVar2.o();
            } else {
                buxVar2.v(-24823667);
                buxVar2.o();
            }
            buxVar2.n();
        } else {
            buxVar2.s();
        }
        return afak.a;
    }

    public /* synthetic */ nlu(boolean z, boolean z2, hcb hcbVar, int i) {
        this.d = i;
        this.a = z;
        this.b = z2;
        this.c = hcbVar;
    }
}
