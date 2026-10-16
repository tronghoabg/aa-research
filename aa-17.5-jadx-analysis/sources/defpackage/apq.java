package defpackage;

/* loaded from: classes.dex */
public final class apq extends afde implements afeg {
    final /* synthetic */ affs a;
    final /* synthetic */ float b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apq(affs affsVar, float f, afck afckVar) {
        super(2, afckVar);
        this.a = affsVar;
        this.b = f;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        apq apqVar = new apq(this.a, this.b, afckVar);
        apqVar.c = obj;
        return apqVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        this.a.a = ((apr) this.c).a(this.b);
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((apq) b((apr) obj, (afck) obj2)).hT(afak.a);
    }
}
