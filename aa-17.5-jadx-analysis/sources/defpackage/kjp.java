package defpackage;

/* loaded from: classes2.dex */
final class kjp extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ kjq b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjp(kjq kjqVar, afck afckVar) {
        super(afckVar);
        this.b = kjqVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objH = kjq.h(this.b, null, null, this);
        return objH == afcr.a ? objH : new aezw(objH);
    }
}
