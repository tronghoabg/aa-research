package defpackage;

/* loaded from: classes2.dex */
final class fql extends afda {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ fqm c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fql(fqm fqmVar, afck afckVar) {
        super(afckVar);
        this.c = fqmVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
