package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class vu extends com.google.v.dm<vv, vu> implements com.google.v.fj {
    /* synthetic */ vu(byte[] bArr) {
        super(vv.DEFAULT_INSTANCE);
    }

    public final void a(bim bimVar) {
        copyOnWrite();
        ((vv) this.instance).addTimelineAlerts(bimVar);
    }

    public final void b(biq biqVar) {
        copyOnWrite();
        ((vv) this.instance).addTimelineTrafficIncidents(biqVar);
    }

    private vu() {
        throw null;
    }
}
