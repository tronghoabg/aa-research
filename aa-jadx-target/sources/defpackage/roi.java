package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class roi implements defpackage.qrb {
    final /* synthetic */ defpackage.rfc a;
    final /* synthetic */ defpackage.ror b;

    public roi(defpackage.ror rorVar, defpackage.rfc rfcVar) {
        this.a = rfcVar;
        this.b = rorVar;
    }

    @Override // defpackage.rda
    public final /* synthetic */ void a(int i) {
        if (defpackage.omv.c("CAR.PROJECTION.CAHI", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "%s.onConnected()", this.b.t);
        }
        try {
            defpackage.omv.a = this.a.N("car_force_logging");
        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException | java.lang.SecurityException | defpackage.qst unused) {
        }
        defpackage.rcm.f(this.b.c);
    }

    @Override // defpackage.rda
    public final /* synthetic */ void b() {
        if (defpackage.omv.c("CAR.PROJECTION.CAHI", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.CAHI", null, "%s.onDisconnected()", this.b.t);
        }
        defpackage.ror rorVar = this.b;
        rorVar.c.drainPermits();
        rorVar.a();
    }

    @Override // defpackage.qrb
    public final void c() {
        throw null;
    }
}
