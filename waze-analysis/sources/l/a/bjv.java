package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bjv extends com.google.v.dm<bjw, bjv> implements com.google.v.fj {
    /* synthetic */ bjv(byte[] bArr) {
        super(bjw.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((bjw) this.instance).addAllTrafficPillAlerts(iterable);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((bjw) this.instance).setDurationSeconds(j2);
    }

    public final void c(boolean z) {
        copyOnWrite();
        ((bjw) this.instance).setVisible(z);
    }

    private bjv() {
        throw null;
    }
}
