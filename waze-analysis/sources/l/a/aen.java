package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aen extends com.google.v.dm<aep, aen> implements com.google.v.fj {
    /* synthetic */ aen(byte[] bArr) {
        super(aep.DEFAULT_INSTANCE);
    }

    public final void a(adj adjVar) {
        copyOnWrite();
        ((aep) this.instance).setInsightActivity(adjVar);
    }

    public final void b(ads adsVar) {
        copyOnWrite();
        ((aep) this.instance).setInsightChanged(adsVar);
    }

    public final void c(aeq aeqVar) {
        copyOnWrite();
        ((aep) this.instance).setInsightSegmentLifecycle(aeqVar.build());
    }

    private aen() {
        throw null;
    }
}
