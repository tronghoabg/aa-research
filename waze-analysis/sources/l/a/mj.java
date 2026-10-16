package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class mj extends com.google.v.dm<mk, mj> implements com.google.v.fj {
    /* synthetic */ mj(byte[] bArr) {
        super(mk.DEFAULT_INSTANCE);
    }

    public final void a(md mdVar) {
        copyOnWrite();
        ((mk) this.instance).setClientFunction(mdVar);
    }

    public final void b(mp mpVar) {
        copyOnWrite();
        ((mk) this.instance).setConversationInfo(mpVar);
    }

    public final void c(boolean z) {
        copyOnWrite();
        ((mk) this.instance).setSuccess(z);
    }

    private mj() {
        throw null;
    }
}
