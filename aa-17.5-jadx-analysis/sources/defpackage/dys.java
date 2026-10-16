package defpackage;

/* loaded from: classes2.dex */
public final class dys extends afde implements afeg {
    int a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dys(int i, afec afecVar, afck afckVar, int i2) {
        super(2, afckVar);
        this.d = i2;
        this.b = i;
        this.c = afecVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [afec, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.d;
        if (i == 0) {
            return new dys((dyt) this.c, this.b, afckVar, 0);
        }
        if (i == 1) {
            return new dys((bsm) this.c, this.b, afckVar, 1);
        }
        if (i == 2) {
            return new dys(this.b, (afec) this.c, afckVar, 2);
        }
        return new dys((bbt) this.c, this.b, afckVar, 3);
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [afec, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        int i = this.d;
        if (i == 0) {
            afcr afcrVar = afcr.a;
            if (this.a != 0) {
                woy.dF(obj);
            } else {
                woy.dF(obj);
                Object obj2 = this.c;
                Integer num = new Integer(this.b);
                this.a = 1;
                if (((dyt) obj2).e.invoke(num, this) == afcrVar) {
                    return afcrVar;
                }
            }
            return afak.a;
        }
        if (i != 1) {
            if (i != 2) {
                afcr afcrVar2 = afcr.a;
                int i2 = this.a;
                woy.dF(obj);
                if (i2 == 0) {
                    Object obj3 = this.c;
                    int i3 = this.b;
                    this.a = 1;
                    if (((bbt) obj3).y(i3, new aft(1.0f, 1500.0f, null), this) == afcrVar2) {
                        return afcrVar2;
                    }
                }
                return afak.a;
            }
            afcr afcrVar3 = afcr.a;
            if (this.a != 0) {
                woy.dF(obj);
            } else {
                woy.dF(obj);
                int i4 = this.b;
                this.a = 1;
                if (aiow.c(i4, this) == afcrVar3) {
                    return afcrVar3;
                }
            }
            this.c.invoke(true);
            return afak.a;
        }
        afcr afcrVar4 = afcr.a;
        if (this.a != 0) {
            woy.dF(obj);
        } else {
            woy.dF(obj);
            Object obj4 = this.c;
            float fE = ((bsm) obj4).j.e();
            adu aduVarA = adv.a(fE);
            float f = 1.0f + fE;
            Float f2 = new Float(fE);
            Float f3 = new Float(f);
            ?? r7 = aduVarA.g.b;
            aei aeiVar = (aei) r7.invoke(f2);
            if (aeiVar == null) {
                aeiVar = aduVarA.c;
            }
            aei aeiVar2 = (aei) r7.invoke(f3);
            if (aeiVar2 == null) {
                aeiVar2 = aduVarA.d;
            }
            int iB = aeiVar.b();
            for (int i5 = 0; i5 < iB; i5++) {
                if (aeiVar.a(i5) > aeiVar2.a(i5)) {
                    afp.b("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + aeiVar + " is greater than upper bound " + aeiVar2 + " on index " + i5);
                }
            }
            aduVarA.e = aeiVar;
            aduVarA.f = aeiVar2;
            if (!aduVarA.j()) {
                Object objB = aduVarA.b(aduVarA.d());
                if (!affa.f(objB, aduVarA.d())) {
                    aduVarA.b.c(objB);
                }
            }
            Float f4 = new Float(f);
            afc afcVarG = ca.G(ca.F(this.b, 0, aev.d, 2), 1, 4);
            bml bmlVar = new bml(obj4, 14);
            this.a = 1;
            if (adu.k(aduVarA, f4, afcVarG, bmlVar, this, 4) == afcrVar4) {
                return afcrVar4;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            return ((dys) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 1) {
            return ((dys) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i != 2) {
            return ((dys) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((dys) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dys(bbt bbtVar, int i, afck afckVar, int i2) {
        super(2, afckVar);
        this.d = i2;
        this.c = bbtVar;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dys(bsm bsmVar, int i, afck afckVar, int i2) {
        super(2, afckVar);
        this.d = i2;
        this.c = bsmVar;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dys(dyt dytVar, int i, afck afckVar, int i2) {
        super(2, afckVar);
        this.d = i2;
        this.c = dytVar;
        this.b = i;
    }
}
