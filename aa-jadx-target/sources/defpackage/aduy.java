package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
class aduy extends defpackage.adns {
    public final defpackage.adns b;

    public aduy(defpackage.adns adnsVar) {
        this.b = adnsVar;
    }

    @Override // defpackage.adns
    public final java.lang.String a() {
        return this.b.a();
    }

    @Override // defpackage.adns
    public final void b() {
        this.b.b();
    }

    @Override // defpackage.adns
    public void c() {
        throw null;
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.b("delegate", this.b);
        return xymVarBy.toString();
    }
}
