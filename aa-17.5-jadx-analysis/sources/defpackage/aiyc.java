package defpackage;

/* loaded from: classes2.dex */
final class aiyc extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ aiyd b;
    int c;
    aixv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiyc(aiyd aiydVar, afck afckVar) {
        super(afckVar);
        this.b = aiydVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
