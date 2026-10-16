package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class csa extends defpackage.cge implements defpackage.crz {
    public defpackage.affc a;

    public csa(defpackage.affc affcVar) {
        this.a = affcVar;
    }

    @Override // defpackage.crz
    public final boolean c(csb csbVar) {
        defpackage.affc affcVar = this.a;
        if (affcVar != null) {
            return ((java.lang.Boolean) affcVar.invoke(csbVar)).booleanValue();
        }
        return false;
    }

    @Override // defpackage.crz
    public final void f() {
    }
}
