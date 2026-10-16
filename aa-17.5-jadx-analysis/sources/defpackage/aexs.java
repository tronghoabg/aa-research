package defpackage;

/* loaded from: classes3.dex */
final class aexs extends aezh {
    final aeyx a;

    public aexs(aeyx aeyxVar) {
        super(0);
        this.a = aeyxVar;
    }

    @Override // defpackage.aezh
    protected final int a() {
        return this.a.size();
    }

    @Override // defpackage.aezf
    protected final /* bridge */ /* synthetic */ aeze b(int i, int i2) {
        return new aexs(this.a, i, i2);
    }

    @Override // defpackage.aezf
    protected final short c(int i) {
        return this.a.l(i);
    }

    public aexs(aeyx aeyxVar, int i, int i2) {
        super(i, i2);
        this.a = aeyxVar;
    }
}
