package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
class adux extends defpackage.admn {
    public final defpackage.admn a;

    public adux(defpackage.admn admnVar) {
        this.a = admnVar;
    }

    @Override // defpackage.adjx
    public final java.lang.String a() {
        return this.a.a();
    }

    @Override // defpackage.admn
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.admn
    public void c() {
        throw null;
    }

    @Override // defpackage.adjx
    public final defpackage.adrq d(defpackage.adng adngVar, defpackage.adjw adjwVar) {
        return this.a.d(adngVar, adjwVar);
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.b("delegate", this.a);
        return xymVarBy.toString();
    }
}
