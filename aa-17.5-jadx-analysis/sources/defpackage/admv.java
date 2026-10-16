package defpackage;

/* loaded from: classes.dex */
public class admv extends adqq {
    public final adqq f;

    protected admv(adqq adqqVar) {
        super(null, null);
        this.f = adqqVar;
    }

    @Override // defpackage.adqq
    public void be(admc admcVar) {
        this.f.be(admcVar);
    }

    @Override // defpackage.adqq
    public void g(Object obj) {
        this.f.g(obj);
    }

    @Override // defpackage.adqq
    public final void h() {
        this.f.h();
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("delegate", this.f);
        return xxgVarAo.toString();
    }
}
