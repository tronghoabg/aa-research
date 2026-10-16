package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aefm extends defpackage.aehc {
    final defpackage.aego a;

    public aefm(defpackage.aego aegoVar) {
        super(0);
        this.a = aegoVar;
    }

    @Override // defpackage.aeha
    protected final byte a(int i) {
        return this.a.l(i);
    }

    @Override // defpackage.aehc
    protected final int b() {
        return this.a.size();
    }

    @Override // defpackage.aeha
    protected final /* bridge */ /* synthetic */ defpackage.aegz c(int i, int i2) {
        return new defpackage.aefm(this.a, i, i2);
    }

    public aefm(defpackage.aego aegoVar, int i, int i2) {
        super(i, i2);
        this.a = aegoVar;
    }
}
