package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class avz extends com.google.v.dm<awa, avz> implements com.google.v.fj {
    /* synthetic */ avz(byte[] bArr) {
        super(awa.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((awa) this.instance).setAlternativeRouteUuid(str);
    }

    public final void b(vv vvVar) {
        copyOnWrite();
        ((awa) this.instance).setEventsTimeline(vvVar);
    }

    private avz() {
        throw null;
    }
}
