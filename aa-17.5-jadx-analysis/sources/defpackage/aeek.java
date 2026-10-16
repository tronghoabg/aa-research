package defpackage;

/* loaded from: classes3.dex */
final class aeek extends aefn {
    final /* synthetic */ aeel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeek(aeel aeelVar, int i) {
        super(i);
        this.a = aeelVar;
    }

    @Override // defpackage.aefm
    protected final byte j(int i) {
        aeel aeelVar = this.a;
        return aeelVar.a.l(aeelVar.b + i);
    }

    @Override // defpackage.aefm
    protected final int k() {
        aeel aeelVar = this.a;
        return aeelVar.c - aeelVar.b;
    }

    @Override // defpackage.aefn
    protected final void l(int i, byte b) {
        this.a.p(i, b);
    }

    @Override // defpackage.aefm
    protected final void m(int i) {
        this.a.m(i);
    }

    @Override // defpackage.aefn
    protected final void n(int i, byte b) {
        this.a.n(i, b);
    }
}
