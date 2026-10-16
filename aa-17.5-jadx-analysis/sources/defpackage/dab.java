package defpackage;

/* loaded from: classes2.dex */
final class dab extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ dac b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dab(dac dacVar, afck afckVar) {
        super(afckVar);
        this.b = dacVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
