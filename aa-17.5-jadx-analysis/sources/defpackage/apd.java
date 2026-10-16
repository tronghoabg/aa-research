package defpackage;

/* loaded from: classes.dex */
final class apd extends afda {
    /* synthetic */ Object a;
    final /* synthetic */ ape b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apd(ape apeVar, afck afckVar) {
        super(afckVar);
        this.b = apeVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.m(null, this);
    }
}
