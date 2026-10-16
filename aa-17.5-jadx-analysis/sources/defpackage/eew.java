package defpackage;

/* loaded from: classes2.dex */
public final class eew extends afde implements afec {
    int a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eew(afec afecVar, afck afckVar, int i) {
        super(1, afckVar);
        this.c = i;
        this.b = afecVar;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [eet, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [afec, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        int i = this.c;
        if (i == 0) {
            afcr afcrVar = afcr.a;
            if (this.a != 0) {
                woy.dF(obj);
            } else {
                woy.dF(obj);
                ?? r5 = this.b;
                this.a = 1;
                if (r5.a() == afcrVar) {
                    return afcrVar;
                }
            }
            return afak.a;
        }
        if (i == 1) {
            afcr afcrVar2 = afcr.a;
            if (this.a != 0) {
                woy.dF(obj);
                return obj;
            }
            woy.dF(obj);
            ?? r52 = this.b;
            this.a = 1;
            Object objAj = czz.aj(r52, this);
            return objAj == afcrVar2 ? afcrVar2 : objAj;
        }
        if (i == 2) {
            afcr afcrVar3 = afcr.a;
            if (this.a != 0) {
                woy.dF(obj);
                return obj;
            }
            woy.dF(obj);
            ?? r53 = this.b;
            this.a = 1;
            Object objInvoke = r53.invoke(this);
            return objInvoke == afcrVar3 ? afcrVar3 : objInvoke;
        }
        if (i == 3) {
            afcr afcrVar4 = afcr.a;
            if (this.a != 0) {
                woy.dF(obj);
                return obj;
            }
            woy.dF(obj);
            egp egpVarC = ((egd) this.b).c();
            this.a = 1;
            Object objA = egpVarC.a(this);
            return objA == afcrVar4 ? afcrVar4 : objA;
        }
        if (i == 4) {
            afcr afcrVar5 = afcr.a;
            if (this.a != 0) {
                woy.dF(obj);
                return obj;
            }
            woy.dF(obj);
            egl eglVarK = ((egd) this.b).k();
            this.a = 1;
            Object objB = eglVarK.b(new ehk(null), this);
            return objB == afcrVar5 ? afcrVar5 : objB;
        }
        if (i != 5) {
            afcr afcrVar6 = afcr.a;
            int i2 = this.a;
            woy.dF(obj);
            if (i2 == 0) {
                Object obj2 = this.b;
                this.a = 1;
                if (((npe) obj2).b(0, this) == afcrVar6) {
                    return afcrVar6;
                }
            }
            return afak.a;
        }
        afcr afcrVar7 = afcr.a;
        if (this.a != 0) {
            woy.dF(obj);
        } else {
            woy.dF(obj);
            Object obj3 = this.b;
            this.a = 1;
            if (((npe) obj3).b(0, this) == afcrVar7) {
                return afcrVar7;
            }
        }
        return afak.a;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [eet, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [afec, java.lang.Object] */
    @Override // defpackage.afec
    public final /* synthetic */ Object invoke(Object obj) {
        int i = this.c;
        if (i == 0) {
            return new eew((eet) this.b, (afck) obj, 0).hT(afak.a);
        }
        if (i == 1) {
            return new eew((afec) this.b, (afck) obj, 1).hT(afak.a);
        }
        if (i == 2) {
            return new eew((afec) this.b, (afck) obj, 2, (byte[]) null).hT(afak.a);
        }
        if (i == 3) {
            return new eew((egd) this.b, (afck) obj, 3).hT(afak.a);
        }
        if (i == 4) {
            return new eew((egd) this.b, (afck) obj, 4, (byte[]) null).hT(afak.a);
        }
        if (i != 5) {
            return new eew((npe) this.b, (afck) obj, 6, (byte[]) null).hT(afak.a);
        }
        return new eew((npe) this.b, (afck) obj, 5).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eew(afec afecVar, afck afckVar, int i, byte[] bArr) {
        super(1, afckVar);
        this.c = i;
        this.b = afecVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eew(eet eetVar, afck afckVar, int i) {
        super(1, afckVar);
        this.c = i;
        this.b = eetVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eew(egd egdVar, afck afckVar, int i) {
        super(1, afckVar);
        this.c = i;
        this.b = egdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eew(egd egdVar, afck afckVar, int i, byte[] bArr) {
        super(1, afckVar);
        this.c = i;
        this.b = egdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eew(npe npeVar, afck afckVar, int i) {
        super(1, afckVar);
        this.c = i;
        this.b = npeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eew(npe npeVar, afck afckVar, int i, byte[] bArr) {
        super(1, afckVar);
        this.c = i;
        this.b = npeVar;
    }
}
