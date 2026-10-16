package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aty extends defpackage.cyc<defpackage.atz> {
    private final defpackage.affc a;

    public aty(defpackage.affc affcVar) {
        this.a = affcVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.atz(this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.atz atzVar = (defpackage.atz) cgeVar;
        defpackage.affc affcVar = atzVar.a;
        defpackage.affc affcVar2 = this.a;
        if (affcVar2 != affcVar) {
            atzVar.a = affcVar2;
            atzVar.d();
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.aty) && ((defpackage.aty) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
