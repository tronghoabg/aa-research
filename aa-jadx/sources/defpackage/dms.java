package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class dms extends defpackage.cyc<defpackage.dmt> {
    private final defpackage.affc a;

    public dms(defpackage.affc affcVar) {
        this.a = affcVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.dmt(this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.dmt dmtVar = (defpackage.dmt) cgeVar;
        defpackage.affc affcVar = this.a;
        dmtVar.a = affcVar;
        if (dmtVar.A) {
            affcVar.invoke(dmtVar.b);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.dms) && this.a == ((defpackage.dms) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
