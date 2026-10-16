package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class abr extends com.google.v.dm<abs, abr> implements com.google.v.fj {
    /* synthetic */ abr(byte[] bArr) {
        super(abs.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((abs) this.instance).setPageUrl(str);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((abs) this.instance).setUrlCount(j2);
    }

    public final void c(String str) {
        copyOnWrite();
        ((abs) this.instance).setWebViewHost(str);
    }

    public final void d(String str) {
        copyOnWrite();
        ((abs) this.instance).setWebViewUsage(str);
    }

    private abr() {
        throw null;
    }
}
