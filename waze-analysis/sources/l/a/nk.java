package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class nk extends com.google.v.dm<nl, nk> implements com.google.v.fj {
    /* synthetic */ nk(byte[] bArr) {
        super(nl.DEFAULT_INSTANCE);
    }

    public final void a(mp mpVar) {
        copyOnWrite();
        ((nl) this.instance).setConversationInfo(mpVar);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((nl) this.instance).setSuccess(z);
    }

    private nk() {
        throw null;
    }
}
