package defpackage;

/* loaded from: classes2.dex */
final class dyq extends afda {
    boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ dyr c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyq(dyr dyrVar, afck afckVar) {
        super(afckVar);
        this.c = dyrVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(false, this);
    }
}
