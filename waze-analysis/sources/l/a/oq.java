package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class oq extends com.google.v.dm<or, oq> implements com.google.v.fj {
    /* synthetic */ oq(byte[] bArr) {
        super(or.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((or) this.instance).setConversationId(str);
    }

    public final void b(String str) {
        copyOnWrite();
        ((or) this.instance).setLanguageLocale(str);
    }

    public final void c(String str) {
        copyOnWrite();
        ((or) this.instance).setMessage(str);
    }

    public final void d(long j2) {
        copyOnWrite();
        ((or) this.instance).setMessageNumber(j2);
    }

    public final void e(os osVar) {
        copyOnWrite();
        ((or) this.instance).setMode(osVar);
    }

    public final void f(String str) {
        copyOnWrite();
        ((or) this.instance).setUgcContextId(str);
    }

    public final void g(yk ykVar) {
        copyOnWrite();
        ((or) this.instance).setUserGender(ykVar);
    }

    private oq() {
        throw null;
    }
}
