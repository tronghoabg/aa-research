package defpackage;

/* loaded from: classes2.dex */
final class grt extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ gru b;
    int c;
    gru d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grt(gru gruVar, afck afckVar) {
        super(afckVar);
        this.b = gruVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
