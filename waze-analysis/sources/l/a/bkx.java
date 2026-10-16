package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bkx extends com.google.v.dm<bkz, bkx> implements com.google.v.fj {
    /* synthetic */ bkx(byte[] bArr) {
        super(bkz.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((bkz) this.instance).setConnectedToNetwork(z);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((bkz) this.instance).setEntryPointEnabled(z);
    }

    public final void c(String str) {
        copyOnWrite();
        ((bkz) this.instance).setErrorDescription(str);
    }

    public final void d(boolean z) {
        copyOnWrite();
        ((bkz) this.instance).setLoggedIn(z);
    }

    public final void e(bky bkyVar) {
        copyOnWrite();
        ((bkz) this.instance).setSource(bkyVar);
    }

    private bkx() {
        throw null;
    }
}
