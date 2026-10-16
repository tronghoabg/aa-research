package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class adnw extends defpackage.adrq {
    public final defpackage.adrq f;

    protected adnw(defpackage.adrq adrqVar) {
        super(null);
        this.f = adrqVar;
    }

    @Override // defpackage.adrq
    public void aV(defpackage.adnd adndVar) {
        this.f.aV(adndVar);
    }

    @Override // defpackage.adrq
    public void g(java.lang.Object obj) {
        this.f.g(obj);
    }

    @Override // defpackage.adrq
    public final void h() {
        this.f.h();
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.b("delegate", this.f);
        return xymVarBy.toString();
    }
}
