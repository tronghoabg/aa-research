package defpackage;

/* loaded from: classes2.dex */
final class npx extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ npy b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npx(npy npyVar, afck afckVar) {
        super(afckVar);
        this.b = npyVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(false, this);
    }
}
