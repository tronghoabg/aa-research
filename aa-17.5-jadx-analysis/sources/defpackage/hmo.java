package defpackage;

/* loaded from: classes2.dex */
final class hmo extends afde implements afeg {
    final /* synthetic */ boolean a;
    final /* synthetic */ cil b;
    final /* synthetic */ boolean c;
    final /* synthetic */ cil d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmo(boolean z, cil cilVar, boolean z2, cil cilVar2, afck afckVar) {
        super(2, afckVar);
        this.a = z;
        this.b = cilVar;
        this.c = z2;
        this.d = cilVar2;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new hmo(this.a, this.b, this.c, this.d, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        if (this.a) {
            this.b.a(7);
        } else if (this.c) {
            this.d.a(7);
        }
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((hmo) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
