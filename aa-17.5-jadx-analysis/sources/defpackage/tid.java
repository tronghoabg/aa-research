package defpackage;

/* loaded from: classes3.dex */
public final class tid extends afde implements afec {
    final /* synthetic */ tjp a;
    final /* synthetic */ tif b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tid(tjp tjpVar, tif tifVar, afck afckVar) {
        super(1, afckVar);
        this.a = tjpVar;
        this.b = tifVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        tii.a().l().u("Composer is idle");
        if (this.a.f()) {
            tii.a().l().u("Invalidating screen");
            this.b.j();
        }
        return afak.a;
    }

    @Override // defpackage.afec
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new tid(this.a, this.b, (afck) obj).hT(afak.a);
    }
}
