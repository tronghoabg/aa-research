package defpackage;

/* loaded from: classes2.dex */
final class aiya extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ aiyb b;
    int c;
    ajbc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiya(aiyb aiybVar, afck afckVar) {
        super(afckVar);
        this.b = aiybVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.hR(null, this);
    }
}
