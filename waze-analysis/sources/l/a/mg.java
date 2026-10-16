package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class mg extends com.google.v.dm<mi, mg> implements com.google.v.fj {
    /* synthetic */ mg(byte[] bArr) {
        super(mi.DEFAULT_INSTANCE);
    }

    public final void a(mp mpVar) {
        copyOnWrite();
        ((mi) this.instance).setConversationInfo(mpVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((mi) this.instance).setErrorMessage(str);
    }

    public final void c(mh mhVar) {
        copyOnWrite();
        ((mi) this.instance).setErrorReason(mhVar);
    }

    private mg() {
        throw null;
    }
}
