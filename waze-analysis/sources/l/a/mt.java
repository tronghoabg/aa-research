package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class mt extends com.google.v.dm<mv, mt> implements com.google.v.fj {
    /* synthetic */ mt(byte[] bArr) {
        super(mv.DEFAULT_INSTANCE);
    }

    public final void a(mp mpVar) {
        copyOnWrite();
        ((mv) this.instance).setConversationInfo(mpVar);
    }

    public final void b(md mdVar) {
        copyOnWrite();
        ((mv) this.instance).setFunctionResponse(mdVar);
    }

    public final void c(mu muVar) {
        copyOnWrite();
        ((mv) this.instance).setResponseType(muVar);
    }

    private mt() {
        throw null;
    }
}
