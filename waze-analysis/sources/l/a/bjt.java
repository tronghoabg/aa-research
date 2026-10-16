package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bjt extends com.google.v.dm<bju, bjt> implements com.google.v.fj {
    /* synthetic */ bjt(byte[] bArr) {
        super(bju.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((bju) this.instance).addAllTrafficPillAlerts(iterable);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((bju) this.instance).setDurationSeconds(j2);
    }

    private bjt() {
        throw null;
    }
}
