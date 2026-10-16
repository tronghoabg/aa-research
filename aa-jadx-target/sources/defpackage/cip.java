package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class cip implements defpackage.affv {
    public final /* synthetic */ defpackage.affc a;

    public cip(defpackage.affc affcVar) {
        this.a = affcVar;
    }

    @Override // defpackage.affv
    public final defpackage.afan ed() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof defpackage.cip) && (obj instanceof defpackage.affv)) {
            return defpackage.afga.f(this.a, ((defpackage.affv) obj).ed());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
