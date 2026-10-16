package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class guy implements afeg {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ guy(bok bokVar, boolean z, avx avxVar, afeg afegVar, int i) {
        this.e = i;
        this.b = bokVar;
        this.a = z;
        this.c = avxVar;
        this.d = afegVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [ckv, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        long jS;
        cct cctVarI;
        cct cctVar;
        int i = this.e;
        int i2 = 1;
        if (i == 0) {
            bux buxVar = (bux) obj;
            int iIntValue = ((Integer) obj2).intValue();
            if (buxVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                Object obj3 = this.d;
                boolean z = this.a;
                Object obj4 = this.c;
                guz guzVar = (guz) ((gjt) this.b).c;
                gui.e(guzVar.g, guzVar.h, null, (gab) obj4, z, bxc.i(2083625470, true, new gsl(obj3, 7), buxVar), buxVar, 200704);
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        int i3 = 3;
        if (i == 1) {
            bux buxVar2 = (bux) obj;
            int iIntValue2 = ((Integer) obj2).intValue();
            int i4 = iIntValue2 & 3;
            int i5 = iIntValue2 & 1;
            float f = bon.a;
            if (buxVar2.I(i4 != 2, i5)) {
                boolean z2 = this.a;
                Object obj5 = this.b;
                buxVar2.v(-864297175);
                buxVar2.o();
                czz.am(bnm.a.b(new cjv(z2 ? ((bok) obj5).a : ((bok) obj5).b)), bxc.i(-893579015, true, new bmc(this.c, this.d, i3), buxVar2), buxVar2, 56);
                buxVar2.v(-863079991);
                buxVar2.o();
            } else {
                buxVar2.s();
            }
            return afak.a;
        }
        bux buxVar3 = (bux) obj;
        int iIntValue3 = ((Integer) obj2).intValue();
        if (buxVar3.I((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
            boolean z3 = this.a;
            Object obj6 = this.b;
            Object obj7 = this.d;
            cct cctVarI2 = bxc.i(-631954605, true, new nyr(z3, obj7, i2), buxVar3);
            nwr nwrVar = (nwr) obj7;
            CharSequence charSequence = nwrVar.e;
            charSequence.getClass();
            afdr afdrVar = null;
            Object[] objArr = 0;
            if (charSequence.length() == 0) {
                buxVar3.v(1585554288);
                buxVar3.o();
                cctVarI = null;
            } else {
                buxVar3.v(1585622581);
                if (obj6 == null) {
                    buxVar3.v(1585711365);
                    jS = kfn.i(buxVar3).S();
                    buxVar3.o();
                } else {
                    buxVar3.v(1585805171);
                    jS = ((cjv) buxVar3.f(bnm.a)).a;
                    buxVar3.o();
                }
                cctVarI = bxc.i(1924399908, true, new bne(obj7, jS, i3), buxVar3);
                buxVar3.o();
            }
            int i6 = 9;
            if (nwrVar.k == null && nwrVar.l == null && nwrVar.j == null) {
                buxVar3.v(1586409392);
                buxVar3.o();
                cctVar = null;
            } else {
                buxVar3.v(1586522573);
                cct cctVarI3 = bxc.i(15284132, true, new mxw(obj7, obj6, i6, objArr == true ? 1 : 0), buxVar3);
                buxVar3.o();
                cctVar = cctVarI3;
            }
            if (nwrVar.c) {
                buxVar3.v(1588565783);
                boolean zE = buxVar3.E(obj7);
                Object objG = buxVar3.g();
                if (zE || objG == buw.a) {
                    objG = new npz(obj7, 16);
                    buxVar3.x(objG);
                }
                afdrVar = (afdr) objG;
                buxVar3.o();
            } else {
                buxVar3.v(1588918160);
                buxVar3.o();
            }
            cfy cfyVarD = das.d(cfy.e, "content_tag");
            boolean zD = buxVar3.D(z3);
            Object objG2 = buxVar3.g();
            if (zD || objG2 == buw.a) {
                objG2 = new jtp(z3, i6);
                buxVar3.x(objG2);
            }
            mcd.f(cctVarI2, cctVarI, cctVar, afdrVar, bxc.k(cfyVarD, (afec) objG2), nwrVar.t, this.c, buxVar3, 6, 0);
        } else {
            buxVar3.s();
        }
        return afak.a;
    }

    public /* synthetic */ guy(gjt gjtVar, gab gabVar, boolean z, afeg afegVar, int i) {
        this.e = i;
        this.b = gjtVar;
        this.c = gabVar;
        this.a = z;
        this.d = afegVar;
    }

    public /* synthetic */ guy(nwr nwrVar, cjv cjvVar, boolean z, bcm bcmVar, int i) {
        this.e = i;
        this.d = nwrVar;
        this.b = cjvVar;
        this.a = z;
        this.c = bcmVar;
    }
}
