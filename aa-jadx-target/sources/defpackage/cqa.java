package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class cqa extends defpackage.cge implements defpackage.cpz {
    public defpackage.affc a;
    public defpackage.affc b;

    public cqa(defpackage.affc affcVar, defpackage.affc affcVar2) {
        this.a = affcVar;
        this.b = affcVar2;
    }

    @Override // defpackage.cpz
    public final boolean A(android.view.KeyEvent keyEvent) {
        defpackage.affc affcVar = this.a;
        if (affcVar != null) {
            return ((java.lang.Boolean) affcVar.invoke(new cpx(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.cpz
    public final boolean B(android.view.KeyEvent keyEvent) {
        defpackage.affc affcVar = this.b;
        if (affcVar != null) {
            return ((java.lang.Boolean) affcVar.invoke(new cpx(keyEvent))).booleanValue();
        }
        return false;
    }
}
