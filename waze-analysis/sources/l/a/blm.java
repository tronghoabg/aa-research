package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class blm extends com.google.v.dm<bln, blm> implements com.google.v.fj {
    /* synthetic */ blm(byte[] bArr) {
        super(bln.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((bln) this.instance).addAllClosuresSegmentIds(iterable);
    }

    public final void b(Iterable iterable) {
        copyOnWrite();
        ((bln) this.instance).addAllTripOverviewRoutes(iterable);
    }

    public final void c(boolean z) {
        copyOnWrite();
        ((bln) this.instance).setAffectedByClosures(z);
    }

    public final void d(boolean z) {
        copyOnWrite();
        ((bln) this.instance).setAffectedByPolygonEvent(z);
    }

    public final void e(long j2) {
        copyOnWrite();
        ((bln) this.instance).setNumberOfClosuresPins(j2);
    }

    private blm() {
        throw null;
    }
}
