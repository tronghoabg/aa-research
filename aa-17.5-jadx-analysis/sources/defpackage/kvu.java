package defpackage;

/* loaded from: classes2.dex */
final class kvu extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ kvv b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kvu(kvv kvvVar, afck afckVar) {
        super(afckVar);
        this.b = kvvVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, 0, this);
    }
}
