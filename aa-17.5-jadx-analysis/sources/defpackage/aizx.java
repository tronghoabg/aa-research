package defpackage;

/* loaded from: classes2.dex */
public final class aizx extends afde implements afeg {
    /* synthetic */ Object a;

    public aizx(afck afckVar) {
        super(2, afckVar);
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        aizx aizxVar = new aizx(afckVar);
        aizxVar.a = obj;
        return aizxVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        return Boolean.valueOf(((aizs) this.a) != aizs.a);
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aizx) b((aizs) obj, (afck) obj2)).hT(afak.a);
    }
}
