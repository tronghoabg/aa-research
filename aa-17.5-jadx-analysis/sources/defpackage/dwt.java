package defpackage;

/* loaded from: classes2.dex */
final class dwt extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ dwu b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwt(dwu dwuVar, afck afckVar) {
        super(afckVar);
        this.b = dwuVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
