package defpackage;

/* loaded from: classes.dex */
final class amr extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ amv b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amr(amv amvVar, afck afckVar) {
        super(afckVar);
        this.b = amvVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(null, null, null, this);
    }
}
