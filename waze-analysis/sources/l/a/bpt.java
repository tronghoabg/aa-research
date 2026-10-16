package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bpt extends com.google.v.dm<bpu, bpt> implements com.google.v.fj {
    /* synthetic */ bpt(byte[] bArr) {
        super(bpu.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((bpu) this.instance).setActualDurationMs(j2);
    }

    public final void b(String str) {
        copyOnWrite();
        ((bpu) this.instance).setAlternativeRouteUuid(str);
    }

    public final void c(long j2) {
        copyOnWrite();
        ((bpu) this.instance).setAnnouncementId(j2);
    }

    public final void d(long j2) {
        copyOnWrite();
        ((bpu) this.instance).setDistanceFromManeuverMeters(j2);
    }

    private bpt() {
        throw null;
    }
}
