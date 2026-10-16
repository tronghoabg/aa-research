package defpackage;

/* loaded from: classes3.dex */
final class aego extends aejt {
    final /* synthetic */ aegp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aego(aegp aegpVar, int i) {
        super(i);
        this.a = aegpVar;
    }

    @Override // defpackage.aejs
    protected final int g(int i) {
        aegp aegpVar = this.a;
        return aegpVar.a.m(aegpVar.b + i);
    }

    @Override // defpackage.aejs
    protected final int h() {
        aegp aegpVar = this.a;
        return aegpVar.c - aegpVar.b;
    }

    @Override // defpackage.aejt
    protected final void i(int i, int i2) {
        this.a.q(i, i2);
    }

    @Override // defpackage.aejs
    protected final void j(int i) {
        this.a.n(i);
    }

    @Override // defpackage.aejt
    protected final void k(int i, int i2) {
        this.a.o(i, i2);
    }
}
