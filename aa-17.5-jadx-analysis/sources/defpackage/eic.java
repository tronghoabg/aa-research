package defpackage;

/* loaded from: classes2.dex */
public final class eic extends afde implements afeg {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ afeg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eic(afeg afegVar, afck afckVar) {
        super(2, afckVar);
        this.d = afegVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        eic eicVar = new eic(this.d, afckVar);
        eicVar.c = obj;
        return eicVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        eia eiaVar = (eia) this.c;
        afcr afcrVar = afcr.a;
        if (this.b != 0) {
            Object obj2 = this.a;
            woy.dF(obj);
            return obj2;
        }
        woy.dF(obj);
        eia eiaVar2 = new eia(woy.be(eiaVar.b()), false);
        afeg afegVar = this.d;
        this.c = null;
        this.a = eiaVar2;
        this.b = 1;
        return afegVar.invoke(eiaVar2, this) != afcrVar ? eiaVar2 : afcrVar;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((eic) b((eia) obj, (afck) obj2)).hT(afak.a);
    }
}
