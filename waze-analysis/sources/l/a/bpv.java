package l.a;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bpv extends com.google.v.dm<bpx, bpv> implements com.google.v.fj {
    /* synthetic */ bpv(byte[] bArr) {
        super(bpx.DEFAULT_INSTANCE);
    }

    public final List a() {
        return DesugarCollections.unmodifiableList(((bpx) this.instance).getAnnouncementChunksList());
    }

    public final void b(ep epVar) {
        copyOnWrite();
        ((bpx) this.instance).addAnnouncementChunks(epVar);
    }

    public final void c(String str) {
        copyOnWrite();
        ((bpx) this.instance).setAlternativeRouteUuid(str);
    }

    public final void d(long j2) {
        copyOnWrite();
        ((bpx) this.instance).setAnnouncementDistanceMetersActual(j2);
    }

    public final void e(long j2) {
        copyOnWrite();
        ((bpx) this.instance).setAnnouncementDistanceMetersPlayed(j2);
    }

    public final void f(long j2) {
        copyOnWrite();
        ((bpx) this.instance).setAnnouncementId(j2);
    }

    public final void g(long j2) {
        copyOnWrite();
        ((bpx) this.instance).setCurrentSpeedKmh(j2);
    }

    public final void h(long j2) {
        copyOnWrite();
        ((bpx) this.instance).setEstimatedDurationMs(j2);
    }

    public final void i(boolean z) {
        copyOnWrite();
        ((bpx) this.instance).setIsLocalAnnouncement(z);
    }

    public final void j(long j2) {
        copyOnWrite();
        ((bpx) this.instance).setRouteSegmentIndex(j2);
    }

    public final void k(bpw bpwVar) {
        copyOnWrite();
        ((bpx) this.instance).setVoiceInstructionsMode(bpwVar);
    }

    private bpv() {
        throw null;
    }
}
