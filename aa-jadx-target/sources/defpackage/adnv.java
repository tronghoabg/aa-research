package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
abstract class adnv extends defpackage.adrq {
    public adnv() {
        super(null);
    }

    @Override // defpackage.adrq
    public void i(java.lang.String str, java.lang.Throwable th) {
        k().i(str, th);
    }

    @Override // defpackage.adrq
    public void j() {
        k().j();
    }

    protected abstract defpackage.adrq k();

    @Override // defpackage.adrq
    public void m(int i) {
        k().m(i);
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.b("delegate", k());
        return xymVarBy.toString();
    }
}
