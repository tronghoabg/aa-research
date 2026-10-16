package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class awn extends defpackage.avc implements defpackage.cxe {
    public defpackage.affc a;
    public defpackage.awv d;

    public awn(defpackage.affc affcVar) {
        super(defpackage.aww.a);
        this.a = affcVar;
    }

    @Override // defpackage.auy, defpackage.cge
    public final void dz() {
        android.view.View viewG = defpackage.ua.g(this);
        java.util.WeakHashMap weakHashMap = defpackage.awv.a;
        defpackage.awv awvVarY = defpackage.asq.y(viewG);
        awvVarY.b(viewG);
        f((defpackage.awu) this.a.invoke(awvVarY));
        this.d = awvVarY;
        super.dz();
    }

    @Override // defpackage.auy, defpackage.cge
    public final void q() {
        android.view.View viewG = defpackage.ua.g(this);
        defpackage.awv awvVar = this.d;
        if (awvVar != null) {
            awvVar.a(viewG);
        }
        super.q();
    }
}
