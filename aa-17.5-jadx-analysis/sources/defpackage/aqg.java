package defpackage;

/* loaded from: classes.dex */
final class aqg extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ aqk b;
    int c;
    affu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqg(aqk aqkVar, afck afckVar) {
        super(afckVar);
        this.b = aqkVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.g(0L, this);
    }
}
