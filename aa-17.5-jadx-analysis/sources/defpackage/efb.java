package defpackage;

/* loaded from: classes.dex */
final class efb extends afda {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ egz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efb(egz egzVar, afck afckVar) {
        super(afckVar);
        this.c = egzVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
