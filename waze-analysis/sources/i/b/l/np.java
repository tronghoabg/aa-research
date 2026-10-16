package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class np extends com.google.v.dm<nq, np> implements com.google.v.fj {
    /* synthetic */ np(byte[] bArr) {
        super(nq.DEFAULT_INSTANCE);
    }

    public final void a(oh ohVar) {
        copyOnWrite();
        ((nq) this.instance).addWaypoint(ohVar.build());
    }

    public final void b(long j2) {
        copyOnWrite();
        ((nq) this.instance).setRouteId(j2);
    }

    private np() {
        throw null;
    }
}
