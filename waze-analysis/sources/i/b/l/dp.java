package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class dp extends com.google.v.dm<dq, dp> implements com.google.v.fj {
    /* synthetic */ dp(byte[] bArr) {
        super(dq.DEFAULT_INSTANCE);
    }

    public final void a() {
        copyOnWrite();
        ((dq) this.instance).setGetProfile(true);
    }

    public final void b(String str) {
        copyOnWrite();
        ((dq) this.instance).setPassword(str);
    }

    public final void c(String str) {
        copyOnWrite();
        ((dq) this.instance).setUsername(str);
    }

    private dp() {
        throw null;
    }
}
