package defpackage;

/* loaded from: classes.dex */
final class rdg implements rcf {
    final /* synthetic */ rdj a;

    public rdg(rdj rdjVar) {
        this.a = rdjVar;
    }

    @Override // defpackage.rcf
    public final void a(int i) {
        if (omc.c("CAR.CLIENT", 3)) {
            boolean z = rrd.a;
            rrd.d(3, "CAR.CLIENT", null, "localCarConnectionListener received onCarConnected()", new Object[0]);
        }
        this.a.e.set(null, true);
    }

    @Override // defpackage.rcf
    public final void b() {
        if (omc.c("CAR.CLIENT", 3)) {
            rrd.a("CAR.CLIENT", null, "localCarConnectionListener received onCarDisconnected()");
        }
        this.a.I();
    }
}
