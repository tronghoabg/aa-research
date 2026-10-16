package defpackage;

/* loaded from: classes2.dex */
final class fly extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ flz b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fly(flz flzVar, afck afckVar) {
        super(afckVar);
        this.b = flzVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
