package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cjy extends defpackage.cyc<defpackage.cjz> {
    private final defpackage.affc a;

    public cjy(defpackage.affc affcVar) {
        this.a = affcVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.cjz(this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.cjz cjzVar = (defpackage.cjz) cgeVar;
        cjzVar.a = this.a;
        cjzVar.d();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.cjy) && this.a == ((defpackage.cjy) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
