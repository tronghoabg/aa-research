package defpackage;

/* loaded from: classes2.dex */
final class fae extends afde implements afec {
    int a;
    final /* synthetic */ faf b;
    final /* synthetic */ ezk c;
    final /* synthetic */ afeg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fae(faf fafVar, ezk ezkVar, afeg afegVar, afck afckVar) {
        super(1, afckVar);
        this.b = fafVar;
        this.c = ezkVar;
        this.d = afegVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i != 0) {
            return obj;
        }
        faf fafVar = this.b;
        ezk ezkVar = this.c;
        afeg afegVar = this.d;
        this.a = 1;
        Object objC = fafVar.c(ezkVar, afegVar, this);
        return objC == afcrVar ? afcrVar : objC;
    }

    @Override // defpackage.afec
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new fae(this.b, this.c, this.d, (afck) obj).hT(afak.a);
    }
}
