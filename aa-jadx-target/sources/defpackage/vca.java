package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class vca extends defpackage.adrq {
    public final java.lang.Object a;
    public defpackage.vbz b;
    public boolean c;
    public final defpackage.vwp d;

    public vca(defpackage.vwp vwpVar) {
        super(null);
        this.a = new java.lang.Object();
        this.c = false;
        this.d = vwpVar;
        if (defpackage.ysr.bw("application/grpc")) {
            return;
        }
        vwpVar.k = "application/grpc";
    }

    @Override // defpackage.adrq
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.adkb aU() {
        synchronized (this.a) {
            if (this.b != null) {
                return new defpackage.adkb();
            }
            defpackage.vbz vbzVar = new defpackage.vbz(this.d);
            this.b = vbzVar;
            return vbzVar;
        }
    }
}
