package defpackage;

/* loaded from: classes2.dex */
final class pfg extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ pfh b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfg(pfh pfhVar, afck afckVar) {
        super(afckVar);
        this.b = pfhVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, this);
    }
}
