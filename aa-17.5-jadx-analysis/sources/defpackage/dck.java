package defpackage;

/* loaded from: classes.dex */
final class dck extends afde implements afeg {
    int a;
    final /* synthetic */ affv b;
    final /* synthetic */ bxn c;
    final /* synthetic */ eqa d;
    final /* synthetic */ dcl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dck(affv affvVar, bxn bxnVar, eqa eqaVar, dcl dclVar, afck afckVar) {
        super(2, afckVar);
        this.b = affvVar;
        this.c = bxnVar;
        this.d = eqaVar;
        this.e = dclVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new dck(this.b, this.c, this.d, this.e, afckVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [afak, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        try {
            if (this.a != 0) {
                woy.dF(obj);
            } else {
                woy.dF(obj);
                dbt dbtVar = (dbt) this.b.a;
                if (dbtVar != null) {
                    dbtVar.b = ahni.b(this.c.j);
                }
                bxn bxnVar = this.c;
                this.a = 1;
                if (bxnVar.y(this) == afcrVar) {
                    return afcrVar;
                }
            }
            eqa eqaVar = this.d;
            eqaVar.getLifecycle().d(this.e);
            this = afak.a;
            return this;
        } catch (Throwable th) {
            eqa eqaVar2 = this.d;
            eqaVar2.getLifecycle().d(this.e);
            throw th;
        }
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((dck) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
