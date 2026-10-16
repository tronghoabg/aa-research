package defpackage;

/* loaded from: classes.dex */
final class akc extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ ake b;
    int c;
    asa d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akc(ake akeVar, afck afckVar) {
        super(afckVar);
        this.b = akeVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
