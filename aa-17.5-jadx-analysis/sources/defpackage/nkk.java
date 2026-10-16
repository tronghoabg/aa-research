package defpackage;

/* loaded from: classes2.dex */
final class nkk extends afde implements afeg {
    final /* synthetic */ boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nkk(boolean z, afck afckVar) {
        super(2, afckVar);
        this.a = z;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new nkk(this.a, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        nkl.a.l().y("Using right-facing seat icon: %b", Boolean.valueOf(this.a));
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((nkk) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
