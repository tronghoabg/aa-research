package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bvt implements defpackage.bxw {
    private final defpackage.affc a;
    private defpackage.bvu b;

    public bvt(defpackage.affc affcVar) {
        this.a = affcVar;
    }

    @Override // defpackage.bxw
    public final void dw() {
        this.b = (defpackage.bvu) this.a.invoke(defpackage.bvx.a);
    }

    @Override // defpackage.bxw
    public final void ef() {
        defpackage.bvu bvuVar = this.b;
        if (bvuVar != null) {
            bvuVar.a();
        }
        this.b = null;
    }

    @Override // defpackage.bxw
    public final void ee() {
    }
}
