package defpackage;

/* loaded from: classes.dex */
final class epc extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ epe b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epc(epe epeVar, afck afckVar) {
        super(afckVar);
        this.b = epeVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
