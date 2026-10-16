package defpackage;

/* loaded from: classes.dex */
public final class opu extends afde implements afeg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public opu(affq affqVar, afck afckVar, int i) {
        super(2, afckVar);
        this.b = i;
        this.a = affqVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [bym, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.b;
        if (i == 0) {
            return new opu((opv) this.a, afckVar, 0);
        }
        if (i == 1) {
            return new opu((bym) this.a, afckVar, 1);
        }
        if (i == 2) {
            return new opu((tbs) this.a, afckVar, 2);
        }
        Object obj2 = this.a;
        return i != 3 ? new opu((tlo) obj2, afckVar, 4) : new opu((affq) obj2, afckVar, 3);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [bym, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        int i = this.b;
        if (i == 0) {
            woy.dF(obj);
            ((opv) this.a).a();
            return afak.a;
        }
        if (i == 1) {
            woy.dF(obj);
            ?? r2 = this.a;
            nim nimVarA = nim.a();
            yph yphVar = nhm.a;
            nimVarA.k(((Boolean) r2.a()).booleanValue());
            return afak.a;
        }
        if (i == 2) {
            woy.dF(obj);
            ((tbs) this.a).u();
            return afak.a;
        }
        if (i != 3) {
            woy.dF(obj);
            ((qw) this.a).j();
            return afak.a;
        }
        woy.dF(obj);
        ((affq) this.a).a = false;
        byx.m();
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.b;
        if (i == 0) {
            return ((opu) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 1) {
            return ((opu) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 2) {
            return ((opu) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i != 3) {
            return ((opu) b((wb) obj, (afck) obj2)).hT(afak.a);
        }
        return ((opu) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public opu(bym bymVar, afck afckVar, int i) {
        super(2, afckVar);
        this.b = i;
        this.a = bymVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public opu(opv opvVar, afck afckVar, int i) {
        super(2, afckVar);
        this.b = i;
        this.a = opvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public opu(tbs tbsVar, afck afckVar, int i) {
        super(2, afckVar);
        this.b = i;
        this.a = tbsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public opu(tlo tloVar, afck afckVar, int i) {
        super(2, afckVar);
        this.b = i;
        this.a = tloVar;
    }
}
