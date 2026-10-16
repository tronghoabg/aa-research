package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aju extends com.google.v.dm<ajv, aju> implements com.google.v.fj {
    /* synthetic */ aju(byte[] bArr) {
        super(ajv.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((ajv) this.instance).setBackButtonAvailable(z);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((ajv) this.instance).setCloseButtonAvailable(z);
    }

    public final void c(boolean z) {
        copyOnWrite();
        ((ajv) this.instance).setShareButtonAvailable(z);
    }

    private aju() {
        throw null;
    }
}
