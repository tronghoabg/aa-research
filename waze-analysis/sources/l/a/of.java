package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class of extends com.google.v.dm<oi, of> implements com.google.v.fj {
    /* synthetic */ of(byte[] bArr) {
        super(oi.DEFAULT_INSTANCE);
    }

    public final os a() {
        return ((oi) this.instance).getMode();
    }

    public final void b(oe oeVar) {
        copyOnWrite();
        ((oi) this.instance).setAlertInfo(oeVar);
    }

    public final void c(String str) {
        copyOnWrite();
        ((oi) this.instance).setConversationId(str);
    }

    public final void d(boolean z) {
        copyOnWrite();
        ((oi) this.instance).setFailedToInitiateConversation(z);
    }

    public final void e(og ogVar) {
        copyOnWrite();
        ((oi) this.instance).setFailureReason(ogVar);
    }

    public final void f(os osVar) {
        copyOnWrite();
        ((oi) this.instance).setMode(osVar);
    }

    public final void g(boolean z) {
        copyOnWrite();
        ((oi) this.instance).setSuccess(z);
    }

    public final void h(String str) {
        copyOnWrite();
        ((oi) this.instance).setUgcContextId(str);
    }

    private of() {
        throw null;
    }
}
