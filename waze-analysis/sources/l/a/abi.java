package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class abi extends com.google.v.dm<abj, abi> implements com.google.v.fj {
    /* synthetic */ abi(byte[] bArr) {
        super(abj.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((abj) this.instance).setCurrentAppSizeBytes(j2);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((abj) this.instance).setCurrentCacheSizeBytes(j2);
    }

    public final void c(long j2) {
        copyOnWrite();
        ((abj) this.instance).setCurrentDataSizeBytes(j2);
    }

    public final void d(long j2) {
        copyOnWrite();
        ((abj) this.instance).setCurrentJvmHeapAllocatedBytes(j2);
    }

    public final void e(long j2) {
        copyOnWrite();
        ((abj) this.instance).setCurrentJvmHeapSizeBytes(j2);
    }

    public final void f(long j2) {
        copyOnWrite();
        ((abj) this.instance).setNativeHeapAllocatedBytes(j2);
    }

    public final void g(long j2) {
        copyOnWrite();
        ((abj) this.instance).setNativeHeapSizeBytes(j2);
    }

    public final void h(long j2) {
        copyOnWrite();
        ((abj) this.instance).setTotalForegroundSeconds(j2);
    }

    public final void i(long j2) {
        copyOnWrite();
        ((abj) this.instance).setTotalReceivedBytes(j2);
    }

    public final void j(long j2) {
        copyOnWrite();
        ((abj) this.instance).setTotalSentBytes(j2);
    }

    public final void k(long j2) {
        copyOnWrite();
        ((abj) this.instance).setTotalUptimeSeconds(j2);
    }

    private abi() {
        throw null;
    }
}
