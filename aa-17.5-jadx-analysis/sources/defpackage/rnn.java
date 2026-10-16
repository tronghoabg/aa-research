package defpackage;

/* loaded from: classes.dex */
final class rnn implements qqf {
    final /* synthetic */ reh a;
    final /* synthetic */ rnw b;

    public rnn(rnw rnwVar, reh rehVar) {
        this.a = rehVar;
        this.b = rnwVar;
    }

    @Override // defpackage.rcf
    public final /* synthetic */ void a(int i) {
        if (omc.c("CAR.PROJECTION.CAHI", 3)) {
            rrd.d(3, "CAR.PROJECTION.CAHI", null, "%s.onConnected()", this.b.t);
        }
        try {
            omc.a = this.a.N("car_force_logging");
        } catch (IllegalArgumentException | IllegalStateException | SecurityException | qrz unused) {
        }
        rbr.f(this.b.c);
    }

    @Override // defpackage.rcf
    public final /* synthetic */ void b() {
        if (omc.c("CAR.PROJECTION.CAHI", 3)) {
            rrd.d(3, "CAR.PROJECTION.CAHI", null, "%s.onDisconnected()", this.b.t);
        }
        rnw rnwVar = this.b;
        rnwVar.c.drainPermits();
        rnwVar.a();
    }

    @Override // defpackage.qqf
    public final void c() {
        throw null;
    }
}
