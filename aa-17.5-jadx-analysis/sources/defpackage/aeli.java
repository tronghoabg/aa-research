package defpackage;

/* loaded from: classes3.dex */
final class aeli extends aepo {
    final /* synthetic */ aelj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeli(aelj aeljVar, int i) {
        super(i);
        this.a = aeljVar;
    }

    @Override // defpackage.aepn
    protected final int g() {
        aelj aeljVar = this.a;
        return aeljVar.c - aeljVar.b;
    }

    @Override // defpackage.aepn
    protected final long h(int i) {
        aelj aeljVar = this.a;
        return aeljVar.a.m(aeljVar.b + i);
    }

    @Override // defpackage.aepo
    protected final void i(int i, long j) {
        this.a.q(i, j);
    }

    @Override // defpackage.aepn
    protected final void j(int i) {
        this.a.n(i);
    }

    @Override // defpackage.aepo
    protected final void k(int i, long j) {
        this.a.o(i, j);
    }
}
