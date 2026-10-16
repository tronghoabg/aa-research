package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class oo extends com.google.v.dm<op, oo> implements com.google.v.fj {
    /* synthetic */ oo(byte[] bArr) {
        super(op.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((op) this.instance).setConversationId(str);
    }

    public final void b(String str) {
        copyOnWrite();
        ((op) this.instance).setLanguageLocale(str);
    }

    public final void c(String str) {
        copyOnWrite();
        ((op) this.instance).setMessage(str);
    }

    public final void d(long j2) {
        copyOnWrite();
        ((op) this.instance).setMessageNumber(j2);
    }

    public final void e(os osVar) {
        copyOnWrite();
        ((op) this.instance).setMode(osVar);
    }

    public final void f(String str) {
        copyOnWrite();
        ((op) this.instance).setUgcContextId(str);
    }

    public final void g(yk ykVar) {
        copyOnWrite();
        ((op) this.instance).setUserGender(ykVar);
    }

    private oo() {
        throw null;
    }
}
