package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class io extends com.google.v.dm<ip, io> implements com.google.v.fj {
    /* synthetic */ io(byte[] bArr) {
        super(ip.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((ip) this.instance).setAndroidAppCreatedMs(j2);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((ip) this.instance).setCommonCodeInitMs(j2);
    }

    public final void c(long j2) {
        copyOnWrite();
        ((ip) this.instance).setCommonCodeReadyMs(j2);
    }

    public final void d(long j2) {
        copyOnWrite();
        ((ip) this.instance).setCommonCodeStartMs(j2);
    }

    public final void e(long j2) {
        copyOnWrite();
        ((ip) this.instance).setEntryPointMs(j2);
    }

    public final void f(long j2) {
        copyOnWrite();
        ((ip) this.instance).setGpsLocationReceivedMs(j2);
    }

    public final void g(long j2) {
        copyOnWrite();
        ((ip) this.instance).setInfoAroundBubbleShownMs(j2);
    }

    public final void h(long j2) {
        copyOnWrite();
        ((ip) this.instance).setLoginSuccessMs(j2);
    }

    public final void i(long j2) {
        copyOnWrite();
        ((ip) this.instance).setMainScreenVisibleMs(j2);
    }

    public final void j(long j2) {
        copyOnWrite();
        ((ip) this.instance).setMapJamsAlertsReceivedMs(j2);
    }

    public final void k(long j2) {
        copyOnWrite();
        ((ip) this.instance).setMapShownAndReadyMs(j2);
    }

    public final void l(long j2) {
        copyOnWrite();
        ((ip) this.instance).setNetworkConnectedMs(j2);
    }

    public final void m(boolean z) {
        copyOnWrite();
        ((ip) this.instance).setRegularSession(z);
    }

    public final void n(long j2) {
        copyOnWrite();
        ((ip) this.instance).setStartStateReadyMs(j2);
    }

    private io() {
        throw null;
    }
}
