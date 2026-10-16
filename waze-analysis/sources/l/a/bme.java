package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bme extends com.google.v.dm<bmg, bme> implements com.google.v.fj {
    /* synthetic */ bme(byte[] bArr) {
        super(bmg.DEFAULT_INSTANCE);
    }

    public final void a(bmf bmfVar) {
        copyOnWrite();
        ((bmg) this.instance).setDownloadRequestResult(bmfVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((bmg) this.instance).setErrorDescription(str);
    }

    public final void c(String str) {
        copyOnWrite();
        ((bmg) this.instance).setParsedText(str);
    }

    public final void d(String str) {
        copyOnWrite();
        ((bmg) this.instance).setUrl(str);
    }

    public final void e(String str) {
        copyOnWrite();
        ((bmg) this.instance).setVoiceId(str);
    }

    private bme() {
        throw null;
    }
}
