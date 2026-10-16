package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class hbc implements afeg {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ hbc(hbp hbpVar, boolean z, hbg hbgVar, boolean z2, int i) {
        this.e = i;
        this.c = hbpVar;
        this.a = z;
        this.d = hbgVar;
        this.b = z2;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [bwq, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        if (i == 0) {
            bux buxVar = (bux) obj;
            int iIntValue = ((Integer) obj2).intValue();
            if (buxVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                gbg gbgVar = ((hbp) this.c).c;
                if (gbgVar == null || this.a) {
                    buxVar.v(1833165786);
                    buxVar.o();
                } else {
                    boolean z = this.b;
                    Object obj3 = this.d;
                    buxVar.v(1832994728);
                    hbf.a(gbgVar, ((hbg) obj3).a, true ^ z, buxVar, 0);
                    buxVar.o();
                }
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        if (i != 1) {
            bux buxVar2 = (bux) obj;
            int iIntValue2 = ((Integer) obj2).intValue();
            if (buxVar2.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                gbg gbgVar2 = ((hbp) this.c).d;
                if (gbgVar2 == null || this.a) {
                    buxVar2.v(-1560741511);
                    buxVar2.o();
                } else {
                    boolean z2 = this.b;
                    Object obj4 = this.d;
                    buxVar2.v(-1560908725);
                    hbf.a(gbgVar2, ((hbg) obj4).b, !z2, buxVar2, 0);
                    buxVar2.o();
                }
            } else {
                buxVar2.s();
            }
            return afak.a;
        }
        bux buxVar3 = (bux) obj;
        int iIntValue3 = ((Integer) obj2).intValue();
        if (buxVar3.I((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
            if (this.a) {
                buxVar3.v(-709851494);
                asw aswVar = atd.a;
                cfv cfvVar = cfy.e;
                ctp ctpVarA = avv.a(aswVar, cfl.m, buxVar3, 6);
                int iG = a.g(buxVar3.b());
                ccx ccxVarN = buxVar3.N();
                cfy cfyVarJ = bzi.j(buxVar3, cfvVar);
                afdr afdrVar = cwb.a;
                buxVar3.M();
                buxVar3.w();
                if (buxVar3.G()) {
                    buxVar3.j(afdrVar);
                } else {
                    buxVar3.y();
                }
                ?? r4 = this.d;
                byq.c(buxVar3, ctpVarA, cwb.e);
                byq.c(buxVar3, ccxVarN, cwb.d);
                byq.c(buxVar3, Integer.valueOf(iG), cwb.f);
                byq.b(buxVar3, cwb.g);
                byq.c(buxVar3, cfyVarJ, cwb.c);
                gva gvaVar = (gva) r4.a();
                if (gvaVar == null) {
                    buxVar3.v(-159162826);
                } else {
                    buxVar3.v(-282228949);
                    gvq.g(gvaVar, null, buxVar3, 8, 1);
                }
                buxVar3.o();
                buxVar3.n();
                buxVar3.o();
            } else {
                buxVar3.v(-709752511);
                buxVar3.o();
            }
            gmt.a(this.b, bxc.i(573041163, true, new bol(this.c, 12), buxVar3), buxVar3, 48);
        } else {
            buxVar3.s();
        }
        return afak.a;
    }

    public /* synthetic */ hbc(boolean z, boolean z2, bwq bwqVar, gtw gtwVar, int i) {
        this.e = i;
        this.a = z;
        this.b = z2;
        this.d = bwqVar;
        this.c = gtwVar;
    }
}
