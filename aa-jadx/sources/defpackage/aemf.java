package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aemf extends defpackage.aerh {
    final defpackage.aeqs a;

    public aemf(defpackage.aeqs aeqsVar) {
        super(0);
        this.a = aeqsVar;
    }

    @Override // defpackage.aerh
    protected final int a() {
        return this.a.size();
    }

    @Override // defpackage.aere
    protected final long b(int i) {
        return this.a.m(i);
    }

    @Override // defpackage.aere
    protected final /* bridge */ /* synthetic */ defpackage.aerd c(int i, int i2) {
        return new defpackage.aemf(this.a, i, i2);
    }

    public aemf(defpackage.aeqs aeqsVar, int i, int i2) {
        super(i, i2);
        this.a = aeqsVar;
    }
}
