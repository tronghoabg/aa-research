package defpackage;

/* loaded from: classes3.dex */
final class ajdv extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ ajdw b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajdv(ajdw ajdwVar, afck afckVar) {
        super(afckVar);
        this.b = ajdwVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(null, null, this);
    }
}
