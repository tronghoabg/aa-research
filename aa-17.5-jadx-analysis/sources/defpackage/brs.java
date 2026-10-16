package defpackage;

/* loaded from: classes2.dex */
public final class brs extends afde implements afeg {
    int a;
    final /* synthetic */ float b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brs(adu aduVar, float f, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.c = aduVar;
        this.b = f;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.d;
        if (i == 0) {
            return new brs((brt) this.c, this.b, afckVar, 0);
        }
        if (i == 1) {
            return new brs((brt) this.c, this.b, afckVar, 1, (byte[]) null);
        }
        if (i == 2) {
            return new brs((adu) this.c, this.b, afckVar, 2);
        }
        Object obj2 = this.c;
        if (i != 3) {
            return new brs((axr) obj2, this.b, afckVar, 4, (byte[]) null);
        }
        return new brs((axr) obj2, this.b, afckVar, 3);
    }

    /* JADX WARN: Type inference failed for: r10v25, types: [aqf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v26, types: [aqf, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        int i = this.d;
        if (i == 0) {
            afcr afcrVar = afcr.a;
            if (this.a == 0) {
                woy.dF(obj);
                brt brtVar = (brt) this.c;
                adu aduVar = brtVar.e;
                if (aduVar != null) {
                    Float f = new Float(this.b);
                    aec aecVar = brtVar.d ? bqu.a : brtVar.c;
                    this.a = 1;
                    obj = adu.k(aduVar, f, aecVar, null, this, 12);
                    if (obj == afcrVar) {
                        return afcrVar;
                    }
                }
                return afak.a;
            }
            woy.dF(obj);
            return afak.a;
        }
        if (i == 1) {
            afcr afcrVar2 = afcr.a;
            if (this.a == 0) {
                woy.dF(obj);
                brt brtVar2 = (brt) this.c;
                adu aduVar2 = brtVar2.f;
                if (aduVar2 != null) {
                    Float f2 = new Float(this.b);
                    aec aecVar2 = brtVar2.d ? bqu.a : brtVar2.c;
                    this.a = 1;
                    obj = adu.k(aduVar2, f2, aecVar2, null, this, 12);
                    if (obj == afcrVar2) {
                        return afcrVar2;
                    }
                }
                return afak.a;
            }
            woy.dF(obj);
            return afak.a;
        }
        if (i == 2) {
            afcr afcrVar3 = afcr.a;
            if (this.a != 0) {
                woy.dF(obj);
            } else {
                woy.dF(obj);
                Object obj2 = this.c;
                float f3 = this.b;
                Float f4 = new Float(f3);
                adu aduVar3 = (adu) obj2;
                aec aecVar3 = ((Number) aduVar3.d()).floatValue() < f3 ? bsc.a : bsc.b;
                this.a = 1;
                if (adu.k(aduVar3, f4, aecVar3, null, this, 12) == afcrVar3) {
                    return afcrVar3;
                }
            }
            return afak.a;
        }
        if (i != 3) {
            afcr afcrVar4 = afcr.a;
            int i2 = this.a;
            woy.dF(obj);
            if (i2 == 0) {
                ?? r10 = this.c;
                float f5 = this.b;
                this.a = 1;
                if (ca.aC(r10, -f5, new aft(1.0f, 1500.0f, null), this) == afcrVar4) {
                    return afcrVar4;
                }
            }
            return afak.a;
        }
        afcr afcrVar5 = afcr.a;
        if (this.a != 0) {
            woy.dF(obj);
        } else {
            woy.dF(obj);
            ?? r102 = this.c;
            float f6 = this.b;
            this.a = 1;
            if (ca.aC(r102, f6, new aft(1.0f, 1500.0f, null), this) == afcrVar5) {
                return afcrVar5;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            return ((brs) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 1) {
            return ((brs) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 2) {
            return ((brs) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i != 3) {
            return ((brs) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((brs) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brs(axr axrVar, float f, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.c = axrVar;
        this.b = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brs(axr axrVar, float f, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.d = i;
        this.c = axrVar;
        this.b = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brs(brt brtVar, float f, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.c = brtVar;
        this.b = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brs(brt brtVar, float f, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.d = i;
        this.c = brtVar;
        this.b = f;
    }
}
