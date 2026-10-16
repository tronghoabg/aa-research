package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class mz extends com.google.v.dm<nb, mz> implements com.google.v.fj {
    /* synthetic */ mz(byte[] bArr) {
        super(nb.DEFAULT_INSTANCE);
    }

    public final void a(fx fxVar) {
        copyOnWrite();
        ((nb) this.instance).setAudio(fxVar);
    }

    public final void b(mp mpVar) {
        copyOnWrite();
        ((nb) this.instance).setConversationInfo(mpVar);
    }

    public final void c() {
        copyOnWrite();
        ((nb) this.instance).setData("");
    }

    public final void d(uw uwVar) {
        copyOnWrite();
        ((nb) this.instance).setEndConversation(uwVar);
    }

    public final void e(md mdVar) {
        copyOnWrite();
        ((nb) this.instance).setFunctionCall(mdVar);
    }

    public final void f(String str) {
        copyOnWrite();
        ((nb) this.instance).setText(str);
    }

    private mz() {
        throw null;
    }
}
