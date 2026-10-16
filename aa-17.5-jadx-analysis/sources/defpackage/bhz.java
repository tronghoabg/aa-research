package defpackage;

/* loaded from: classes.dex */
public final class bhz extends afde implements afeg {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhz(afec afecVar, bia biaVar, bik bikVar, afck afckVar, int i) {
        super(2, afckVar);
        this.f = i;
        this.b = afecVar;
        this.c = biaVar;
        this.d = bikVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [afec, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        if (this.f != 0) {
            bhz bhzVar = new bhz((afeg) this.b, (aol) this.c, (api) this.d, afckVar, 1);
            bhzVar.e = obj;
            return bhzVar;
        }
        bhz bhzVar2 = new bhz((afec) this.b, (bia) this.c, (bik) this.d, afckVar, 0);
        bhzVar2.e = obj;
        return bhzVar2;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [afec, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        if (this.f != 0) {
            afcr afcrVar = afcr.a;
            int i = this.a;
            woy.dF(obj);
            if (i == 0) {
                ajmd ajmdVar = (ajmd) this.e;
                ?? r2 = this.b;
                acg acgVar = new acg(ajmdVar, this.c, this.d, 3);
                this.a = 1;
                if (r2.invoke(acgVar, this) == afcrVar) {
                    return afcrVar;
                }
            }
            return afak.a;
        }
        afcr afcrVar2 = afcr.a;
        if (this.a == 0) {
            woy.dF(obj);
            bhy bhyVar = new bhy((dac) this.e, this.b, (bia) this.c, (bik) this.d, null);
            this.a = 1;
            if (ahni.a(bhyVar, this) == afcrVar2) {
                return afcrVar2;
            }
        } else {
            woy.dF(obj);
        }
        throw new aezp();
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.f != 0) {
            return ((bhz) b((ajmd) obj, (afck) obj2)).hT(afak.a);
        }
        return ((bhz) b((dac) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhz(afeg afegVar, aol aolVar, api apiVar, afck afckVar, int i) {
        super(2, afckVar);
        this.f = i;
        this.b = afegVar;
        this.c = aolVar;
        this.d = apiVar;
    }
}
