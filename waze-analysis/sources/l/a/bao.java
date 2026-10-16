package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bao extends com.google.v.dm<bas, bao> implements com.google.v.fj {
    /* synthetic */ bao(byte[] bArr) {
        super(bas.DEFAULT_INSTANCE);
    }

    public final void a(ban banVar) {
        copyOnWrite();
        ((bas) this.instance).setApi(banVar);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((bas) this.instance).setAppCheckTokenGenerationLatencyMs(j2);
    }

    public final void c(long j2) {
        copyOnWrite();
        ((bas) this.instance).setClientQueueLatencyMs(j2);
    }

    public final void d(long j2) {
        copyOnWrite();
        ((bas) this.instance).setErrorCode(j2);
    }

    public final void e(String str) {
        copyOnWrite();
        ((bas) this.instance).setFailureReason(str);
    }

    public final void f(bap bapVar) {
        copyOnWrite();
        ((bas) this.instance).setFailureReasonSource(bapVar);
    }

    public final void g(long j2) {
        copyOnWrite();
        ((bas) this.instance).setLatencyMs(j2);
    }

    public final void h(baq baqVar) {
        copyOnWrite();
        ((bas) this.instance).setQualityOfService(baqVar);
    }

    public final void i(bar barVar) {
        copyOnWrite();
        ((bas) this.instance).setRequestQueue(barVar);
    }

    public final void j(long j2) {
        copyOnWrite();
        ((bas) this.instance).setRequestSizeBytes(j2);
    }

    public final void k(long j2) {
        copyOnWrite();
        ((bas) this.instance).setResponseSizeBytes(j2);
    }

    public final void l(long j2) {
        copyOnWrite();
        ((bas) this.instance).setRetries(j2);
    }

    public final void m(long j2) {
        copyOnWrite();
        ((bas) this.instance).setRoundtripLatencyMs(j2);
    }

    public final void n(long j2) {
        copyOnWrite();
        ((bas) this.instance).setServerProcessingLatencyMs(j2);
    }

    public final void o(boolean z) {
        copyOnWrite();
        ((bas) this.instance).setSuccess(z);
    }

    private bao() {
        throw null;
    }
}
