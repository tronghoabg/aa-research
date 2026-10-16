package defpackage;

import j$.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public final class gir extends afde implements afeg {
    final /* synthetic */ Object a;
    final /* synthetic */ afec b;
    final /* synthetic */ ieb c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gir(ieb iebVar, Object obj, afec afecVar, afck afckVar) {
        super(2, afckVar);
        this.c = iebVar;
        this.a = obj;
        this.b = afecVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        gir girVar = new gir(this.c, this.a, this.b, afckVar);
        girVar.d = obj;
        return girVar;
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        aitx aitxVar = (aitx) this.d;
        ieb iebVar = this.c;
        afec afecVar = this.b;
        Object obj2 = this.a;
        return ConcurrentMap.EL.computeIfAbsent(iebVar.a, obj2, new gjm(new gaz(iebVar, obj2, aitxVar, afecVar, 2), 1));
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((gir) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
