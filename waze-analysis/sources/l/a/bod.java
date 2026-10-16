package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bod extends com.google.v.dm<bof, bod> implements com.google.v.fj {
    /* synthetic */ bod(byte[] bArr) {
        super(bof.DEFAULT_INSTANCE);
    }

    public final void a(gh ghVar) {
        copyOnWrite();
        ((bof) this.instance).setAuthenticationCompleted(ghVar);
    }

    public final void b(wt wtVar) {
        copyOnWrite();
        ((bof) this.instance).setFirstVehicleTypeSelectionScreenClicked(wtVar);
    }

    public final void c(wv wvVar) {
        copyOnWrite();
        ((bof) this.instance).setFirstVehicleTypeSelectionScreenShown(wvVar);
    }

    public final void d(aok aokVar) {
        copyOnWrite();
        ((bof) this.instance).setOnboardingSummary(aokVar);
    }

    public final void e(bbm bbmVar) {
        copyOnWrite();
        ((bof) this.instance).setSetHomeWorkScreenClicked(bbmVar);
    }

    public final void f(bbo bboVar) {
        copyOnWrite();
        ((bof) this.instance).setSetHomeWorkScreenShown(bboVar);
    }

    private bod() {
        throw null;
    }
}
