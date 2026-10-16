package defpackage;

/* loaded from: classes2.dex */
final class bnv extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ bnw b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnv(bnw bnwVar, afck afckVar) {
        super(afckVar);
        this.b = bnwVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
