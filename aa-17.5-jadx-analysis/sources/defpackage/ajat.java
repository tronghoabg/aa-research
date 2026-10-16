package defpackage;

/* loaded from: classes3.dex */
final class ajat extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ ajau b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajat(ajau ajauVar, afck afckVar) {
        super(afckVar);
        this.b = ajauVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
