package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class chl extends defpackage.cyc<defpackage.chf> {
    private final defpackage.affc a;

    public chl(defpackage.affc affcVar) {
        this.a = affcVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.chf(new defpackage.chg(), this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.chf chfVar = (defpackage.chf) cgeVar;
        chfVar.a = this.a;
        chfVar.d();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.chl) && this.a == ((defpackage.chl) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
