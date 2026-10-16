package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bqt extends com.google.v.dm<bqu, bqt> implements com.google.v.fj {
    /* synthetic */ bqt(byte[] bArr) {
        super(bqu.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((bqu) this.instance).setFreshLocationAvailable(z);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((bqu) this.instance).setLocationTimestampMs(j2);
    }

    public final void c(boolean z) {
        copyOnWrite();
        ((bqu) this.instance).setLoggedIn(z);
    }

    public final void d(boolean z) {
        copyOnWrite();
        ((bqu) this.instance).setNetworkAvailable(z);
    }

    private bqt() {
        throw null;
    }
}
