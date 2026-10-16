package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bsv extends defpackage.cyc<defpackage.bsu> {
    private final defpackage.affc a;

    public bsv(defpackage.affc affcVar) {
        this.a = affcVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.bsu(this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.bsu bsuVar = (defpackage.bsu) cgeVar;
        bsuVar.a = this.a;
        defpackage.cjv.r(bsuVar).J();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.bsv) && this.a == ((defpackage.bsv) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
