package defpackage;

/* loaded from: classes.dex */
final class ais extends afda {
    long a;
    /* synthetic */ Object b;
    final /* synthetic */ aiu c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ais(aiu aiuVar, afck afckVar) {
        super(afckVar);
        this.c = aiuVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f(0L, null, this);
    }
}
