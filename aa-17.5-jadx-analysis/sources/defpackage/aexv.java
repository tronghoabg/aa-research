package defpackage;

/* loaded from: classes3.dex */
final class aexv extends aeyw {
    final /* synthetic */ aexw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aexv(aexw aexwVar, int i) {
        super(i);
        this.a = aexwVar;
    }

    @Override // defpackage.aeyv
    protected final int j() {
        aexw aexwVar = this.a;
        return aexwVar.c - aexwVar.b;
    }

    @Override // defpackage.aeyv
    protected final short k(int i) {
        aexw aexwVar = this.a;
        return aexwVar.a.l(aexwVar.b + i);
    }

    @Override // defpackage.aeyw
    protected final void l(int i, short s) {
        this.a.o(i, s);
    }

    @Override // defpackage.aeyv
    protected final void m(int i) {
        this.a.m(i);
    }

    @Override // defpackage.aeyw
    protected final void n(int i, short s) {
        this.a.n(i, s);
    }
}
