package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class agn extends com.google.v.dm<agp, agn> implements com.google.v.fj {
    /* synthetic */ agn(byte[] bArr) {
        super(agp.DEFAULT_INSTANCE);
    }

    public final void a(agk agkVar) {
        copyOnWrite();
        ((agp) this.instance).addLocationsDetails(agkVar.build());
    }

    public final void b(long j2) {
        copyOnWrite();
        ((agp) this.instance).setLocationDistanceMeters(j2);
    }

    public final void c(ago agoVar) {
        copyOnWrite();
        ((agp) this.instance).setLocationIssueType(agoVar);
    }

    public final void d(long j2) {
        copyOnWrite();
        ((agp) this.instance).setStaleDurationMs(j2);
    }

    public final void e(long j2) {
        copyOnWrite();
        ((agp) this.instance).setTimeDifferenceMs(j2);
    }

    private agn() {
        throw null;
    }
}
