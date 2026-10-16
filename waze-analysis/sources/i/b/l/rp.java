package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class rp extends com.google.v.dm<rq, rp> implements com.google.v.fj {
    /* synthetic */ rp(byte[] bArr) {
        super(rq.DEFAULT_INSTANCE);
    }

    public final void a(int i2) {
        copyOnWrite();
        ((rq) this.instance).setMinPassengers(i2);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((rq) this.instance).setNormalRouteAltId(j2);
    }

    private rp() {
        throw null;
    }
}
