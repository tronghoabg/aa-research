package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class chi extends defpackage.cyc<defpackage.chh> {
    private final defpackage.affc a;

    public chi(defpackage.affc affcVar) {
        this.a = affcVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.chh(this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        ((defpackage.chh) cgeVar).a = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.chi) && this.a == ((defpackage.chi) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
