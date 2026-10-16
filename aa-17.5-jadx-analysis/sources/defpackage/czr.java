package defpackage;

/* loaded from: classes.dex */
final class czr extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ czq b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czr(czq czqVar, afck afckVar) {
        super(afckVar);
        this.b = czqVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.t(null, this);
    }
}
