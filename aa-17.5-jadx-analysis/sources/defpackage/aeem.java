package defpackage;

/* loaded from: classes3.dex */
final class aeem extends aegc {
    final aefo a;

    public aeem(aefo aefoVar) {
        super(0);
        this.a = aefoVar;
    }

    @Override // defpackage.aega
    protected final byte a(int i) {
        return this.a.l(i);
    }

    @Override // defpackage.aegc
    protected final int b() {
        return this.a.size();
    }

    @Override // defpackage.aega
    protected final /* bridge */ /* synthetic */ aefz c(int i, int i2) {
        return new aeem(this.a, i, i2);
    }

    public aeem(aefo aefoVar, int i, int i2) {
        super(i, i2);
        this.a = aefoVar;
    }
}
