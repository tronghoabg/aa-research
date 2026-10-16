package defpackage;

/* loaded from: classes2.dex */
final class klg extends afde implements afeg {
    /* synthetic */ Object a;
    final /* synthetic */ klj b;
    final /* synthetic */ klq c;
    final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klg(klj kljVar, klq klqVar, float f, afck afckVar) {
        super(2, afckVar);
        this.b = kljVar;
        this.c = klqVar;
        this.d = f;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        klg klgVar = new klg(this.b, this.c, this.d, afckVar);
        klgVar.a = obj;
        return klgVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        ((eia) this.a).d(this.b.a(this.c), new Float(this.d));
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((klg) b((eia) obj, (afck) obj2)).hT(afak.a);
    }
}
