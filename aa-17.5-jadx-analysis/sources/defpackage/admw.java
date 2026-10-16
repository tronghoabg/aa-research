package defpackage;

/* loaded from: classes3.dex */
public abstract class admw extends adng {
    public abstract adng c();

    @Override // defpackage.adng
    public void d(adnq adnqVar, admc admcVar) {
        c().d(adnqVar, admcVar);
    }

    @Override // defpackage.adng
    public void e(admc admcVar) {
        throw null;
    }

    @Override // defpackage.adng
    public void f() {
        throw null;
    }

    @Override // defpackage.adng
    public final adis g() {
        return c().g();
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("delegate", c());
        return xxgVarAo.toString();
    }
}
