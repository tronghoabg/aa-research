package defpackage;

/* loaded from: classes.dex */
abstract class admu extends adqq {
    public admu() {
        super(null, null);
    }

    @Override // defpackage.adqq
    public void i(String str, Throwable th) {
        k().i(str, th);
    }

    @Override // defpackage.adqq
    public void j() {
        k().j();
    }

    protected abstract adqq k();

    @Override // defpackage.adqq
    public void m(int i) {
        k().m(i);
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("delegate", k());
        return xxgVarAo.toString();
    }
}
