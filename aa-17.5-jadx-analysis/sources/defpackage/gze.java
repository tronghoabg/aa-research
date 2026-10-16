package defpackage;

/* loaded from: classes2.dex */
final class gze extends afde implements afeh {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;

    public gze(afck afckVar) {
        super(3, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        return new gzg((gzi) this.a, this.b);
    }

    @Override // defpackage.afeh
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        gze gzeVar = new gze((afck) obj3);
        gzeVar.a = (gzi) obj;
        gzeVar.b = zBooleanValue;
        return gzeVar.hT(afak.a);
    }
}
