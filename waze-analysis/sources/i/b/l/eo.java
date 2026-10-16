package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class eo extends com.google.v.dm<ep, eo> implements com.google.v.fj {
    /* synthetic */ eo(byte[] bArr) {
        super(ep.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((ep) this.instance).setPassword(str);
    }

    public final void b(String str) {
        copyOnWrite();
        ((ep) this.instance).setUsername(str);
    }

    private eo() {
        throw null;
    }
}
