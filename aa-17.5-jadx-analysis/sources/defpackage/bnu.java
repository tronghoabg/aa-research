package defpackage;

/* loaded from: classes2.dex */
final class bnu extends afda {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ bnw c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnu(bnw bnwVar, afck afckVar) {
        super(afckVar);
        this.c = bnwVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
