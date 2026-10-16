package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dbz {
    public final defpackage.dby a;
    public final defpackage.cdo b;
    public boolean c;
    private defpackage.buv d;

    public dbz() {
        defpackage.dby dbyVar = new defpackage.dby(new defpackage.cdm());
        this.a = dbyVar;
        this.b = dbyVar;
    }

    public final void a(defpackage.buv buvVar) {
        defpackage.buv buvVar2 = this.d;
        if (buvVar2 != null) {
            buvVar2.a();
        }
        this.d = buvVar;
    }

    public final void b(defpackage.dcy dcyVar) {
        defpackage.buv buvVarB;
        if (this.a.b()) {
            try {
                buvVarB = dcyVar.a.b(new defpackage.cwg(this, 7));
            } catch (java.util.concurrent.CancellationException unused) {
                this.a.a();
                buvVarB = null;
            }
            a(buvVarB);
        }
    }
}
