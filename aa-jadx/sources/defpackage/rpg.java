package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rpg {
    public final defpackage.qzm a;
    public volatile defpackage.qtr b;
    public java.io.OutputStream c;
    public java.io.InputStream d;
    public final android.os.Handler e;
    public final defpackage.qzo f;
    private final defpackage.xei g;

    public rpg(defpackage.qzm qzmVar, defpackage.xei xeiVar, android.os.Looper looper) throws android.os.RemoteException {
        defpackage.qzo qzoVar = new defpackage.qzo(this);
        this.f = qzoVar;
        this.e = new defpackage.rpf(this, looper);
        if (defpackage.omv.c("CAR.VENDOR", 3)) {
            defpackage.rrx.a("CAR.VENDOR", null, "CarVendorExtensionManager");
        }
        this.a = qzmVar;
        this.g = xeiVar;
        if (!qzmVar.s(qzoVar)) {
            throw new java.lang.IllegalStateException("Service is already being used");
        }
    }

    public final void a(android.os.RemoteException remoteException) throws defpackage.rlo {
        b();
        defpackage.oml.I(remoteException);
    }

    public final void b() {
        if (defpackage.omv.c("CAR.VENDOR", 3)) {
            defpackage.rrx.a("CAR.VENDOR", null, "release");
        }
        try {
            this.a.o(this.f);
        } catch (android.os.RemoteException | java.lang.IllegalStateException unused) {
        }
        ((defpackage.ref) this.g.a).g.i(defpackage.rpg.class, this);
    }
}
