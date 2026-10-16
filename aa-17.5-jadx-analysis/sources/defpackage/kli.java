package defpackage;

/* loaded from: classes2.dex */
final class kli extends afde implements afeg {
    /* synthetic */ Object a;
    final /* synthetic */ klj b;
    final /* synthetic */ klq c;
    final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kli(klj kljVar, klq klqVar, boolean z, afck afckVar) {
        super(2, afckVar);
        this.b = kljVar;
        this.c = klqVar;
        this.d = z;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        kli kliVar = new kli(this.b, this.c, this.d, afckVar);
        kliVar.a = obj;
        return kliVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        ((eia) this.a).d(this.b.b(this.c), Boolean.valueOf(this.d));
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((kli) b((eia) obj, (afck) obj2)).hT(afak.a);
    }
}
