package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ab extends com.google.v.dm<ac, ab> implements com.google.v.fj {
    /* synthetic */ ab(byte[] bArr) {
        super(ac.DEFAULT_INSTANCE);
    }

    public final void a() {
        copyOnWrite();
        ((ac) this.instance).setReturnOnlySafetyIncidentFreeAlternatives(true);
    }

    public final void b(pq pqVar) {
        copyOnWrite();
        ((ac) this.instance).setRoutingRequest(pqVar);
    }

    private ab() {
        throw null;
    }
}
