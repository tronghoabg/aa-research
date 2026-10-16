package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class eo extends com.google.v.dm<ep, eo> implements eq {
    /* synthetic */ eo(byte[] bArr) {
        super(ep.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((ep) this.instance).setFileUri(str);
    }

    public final void b(String str) {
        copyOnWrite();
        ((ep) this.instance).setPromptType(str);
    }

    public final void c(String str) {
        copyOnWrite();
        ((ep) this.instance).setText(str);
    }

    private eo() {
        throw null;
    }
}
