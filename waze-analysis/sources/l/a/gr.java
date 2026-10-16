package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class gr extends com.google.v.dm<gs, gr> implements com.google.v.fj {
    /* synthetic */ gr(byte[] bArr) {
        super(gs.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((gs) this.instance).setCategorySuggested(z);
    }

    public final void b(long j2) {
        copyOnWrite();
        ((gs) this.instance).setErrorCode(j2);
    }

    public final void c(boolean z) {
        copyOnWrite();
        ((gs) this.instance).setNd4CAlgoTransparencyLinkShown(z);
    }

    public final void d(boolean z) {
        copyOnWrite();
        ((gs) this.instance).setNewQuery(z);
    }

    public final void e(long j2) {
        copyOnWrite();
        ((gs) this.instance).setNumberOfResults(j2);
    }

    public final void f(long j2) {
        copyOnWrite();
        ((gs) this.instance).setQueryCharactersCount(j2);
    }

    public final void g(bjz bjzVar) {
        copyOnWrite();
        ((gs) this.instance).setTriggeringPlatform(bjzVar);
    }

    public final void h(boolean z) {
        copyOnWrite();
        ((gs) this.instance).setVoiceSearch(z);
    }

    private gr() {
        throw null;
    }
}
