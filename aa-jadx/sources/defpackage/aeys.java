package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aeys extends defpackage.afah {
    final defpackage.aezx a;

    public aeys(defpackage.aezx aezxVar) {
        super(0);
        this.a = aezxVar;
    }

    @Override // defpackage.afah
    protected final int a() {
        return this.a.size();
    }

    @Override // defpackage.afaf
    protected final /* bridge */ /* synthetic */ defpackage.afae b(int i, int i2) {
        return new defpackage.aeys(this.a, i, i2);
    }

    @Override // defpackage.afaf
    protected final short c(int i) {
        return this.a.l(i);
    }

    public aeys(defpackage.aezx aezxVar, int i, int i2) {
        super(i, i2);
        this.a = aezxVar;
    }
}
