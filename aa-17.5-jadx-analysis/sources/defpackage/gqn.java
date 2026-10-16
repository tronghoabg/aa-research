package defpackage;

/* loaded from: classes2.dex */
public final class gqn extends afde implements afeg {
    int a;
    private /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqn(afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.c;
        if (i == 0) {
            gqn gqnVar = new gqn(afckVar, 0);
            gqnVar.b = obj;
            return gqnVar;
        }
        if (i == 1) {
            gqn gqnVar2 = new gqn(afckVar, 1, (byte[]) null);
            gqnVar2.b = obj;
            return gqnVar2;
        }
        if (i == 2) {
            gqn gqnVar3 = new gqn(afckVar, 2, (char[]) null);
            gqnVar3.b = obj;
            return gqnVar3;
        }
        if (i != 3) {
            gqn gqnVar4 = new gqn(afckVar, 4, (int[]) null);
            gqnVar4.b = obj;
            return gqnVar4;
        }
        gqn gqnVar5 = new gqn(afckVar, 3, (short[]) null);
        gqnVar5.b = obj;
        return gqnVar5;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        int i = this.c;
        if (i == 0) {
            afcr afcrVar = afcr.a;
            if (this.a != 0) {
                woy.dF(obj);
            } else {
                woy.dF(obj);
                aiyl aiylVar = (aiyl) this.b;
                fwe fweVar = gpy.a;
                fwe fweVar2 = gpy.a;
                this.a = 1;
                if (aiylVar.a(fweVar2, this) == afcrVar) {
                    return afcrVar;
                }
            }
            return afak.a;
        }
        if (i == 1) {
            afcr afcrVar2 = afcr.a;
            if (this.a != 0) {
                woy.dF(obj);
            } else {
                woy.dF(obj);
                aiyl aiylVar2 = (aiyl) this.b;
                fwe fweVar3 = gpy.a;
                hit hitVarD = gut.d(-8355712);
                this.a = 1;
                if (aiylVar2.a(hitVarD, this) == afcrVar2) {
                    return afcrVar2;
                }
            }
            return afak.a;
        }
        if (i == 2) {
            afcr afcrVar3 = afcr.a;
            if (this.a != 0) {
                woy.dF(obj);
            } else {
                woy.dF(obj);
                aiyl aiylVar3 = (aiyl) this.b;
                fwe fweVar4 = gpy.a;
                fwd fwdVar = gpy.c;
                this.a = 1;
                if (aiylVar3.a(fwdVar, this) == afcrVar3) {
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
                sx sxVar = (sx) this.b;
                aezu aezuVar = new aezu(new Object(), new Object());
                this.a = 1;
                if (sxVar.t(aezuVar, this) == afcrVar4) {
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
            aiyl aiylVar4 = (aiyl) this.b;
            fwe fweVar5 = gpy.a;
            gqm gqmVar = gpy.b;
            this.a = 1;
            if (aiylVar4.a(gqmVar, this) == afcrVar5) {
                return afcrVar5;
            }
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.c;
        if (i == 0) {
            return ((gqn) b((aiyl) obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 1) {
            return ((gqn) b((aiyl) obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 2) {
            return ((gqn) b((aiyl) obj, (afck) obj2)).hT(afak.a);
        }
        if (i != 3) {
            return ((gqn) b((sx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((gqn) b((aiyl) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqn(afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqn(afck afckVar, int i, char[] cArr) {
        super(2, afckVar);
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqn(afck afckVar, int i, int[] iArr) {
        super(2, afckVar);
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqn(afck afckVar, int i, short[] sArr) {
        super(2, afckVar);
        this.c = i;
    }
}
