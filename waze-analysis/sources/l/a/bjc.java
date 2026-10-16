package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bjc extends com.google.v.dm<bje, bjc> implements com.google.v.fj {
    /* synthetic */ bjc(byte[] bArr) {
        super(bje.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((bje) this.instance).setAcquisitionTimestampUnixMs(j2);
    }

    public final void b(double d2) {
        copyOnWrite();
        ((bje) this.instance).setAltitudeMeters(d2);
    }

    public final void c(double d2) {
        copyOnWrite();
        ((bje) this.instance).setBearingDegrees(d2);
    }

    public final void d(afx afxVar) {
        copyOnWrite();
        ((bje) this.instance).setCoordinates(afxVar);
    }

    public final void e(double d2) {
        copyOnWrite();
        ((bje) this.instance).setHorizontalAccuracyMeters(d2);
    }

    public final void f(bjd bjdVar) {
        copyOnWrite();
        ((bje) this.instance).setLocationProvider(bjdVar);
    }

    public final void g(double d2) {
        copyOnWrite();
        ((bje) this.instance).setSpeedMetersPerSecond(d2);
    }

    public final void h(long j2) {
        copyOnWrite();
        ((bje) this.instance).setTimeElapsedSinceAcquisitionMs(j2);
    }

    public final void i(double d2) {
        copyOnWrite();
        ((bje) this.instance).setVerticalAccuracyMeters(d2);
    }

    private bjc() {
        throw null;
    }
}
