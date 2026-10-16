package defpackage;

/* loaded from: classes.dex */
final class ehk extends afde implements afeh {
    int a;
    private /* synthetic */ Object b;

    public ehk(afck afckVar) {
        super(3, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        Object obj2 = this.b;
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i != 0) {
            return obj;
        }
        this.b = null;
        this.a = 1;
        egh eghVar = (egh) obj2;
        eghVar.b();
        Object objE = ebh.e(eghVar.a, new egg(eghVar, null), this);
        return objE == afcrVar ? afcrVar : objE;
    }

    @Override // defpackage.afeh
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        ((Boolean) obj2).booleanValue();
        ehk ehkVar = new ehk((afck) obj3);
        ehkVar.b = (egh) obj;
        return ehkVar.hT(afak.a);
    }
}
