package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class sz extends com.google.v.dm<tb, sz> implements com.google.v.fj {
    /* synthetic */ sz(byte[] bArr) {
        super(tb.DEFAULT_INSTANCE);
    }

    public final void a(bba bbaVar) {
        copyOnWrite();
        ((tb) this.instance).setServerSuggestionRequested(bbaVar);
    }

    public final void b(bgw bgwVar) {
        copyOnWrite();
        ((tb) this.instance).setSuggestionCardClicked(bgwVar);
    }

    public final void c(bgz bgzVar) {
        copyOnWrite();
        ((tb) this.instance).setSuggestionCardDismissed(bgzVar);
    }

    public final void d(bhd bhdVar) {
        copyOnWrite();
        ((tb) this.instance).setSuggestionCardResult(bhdVar);
    }

    public final void e(bhf bhfVar) {
        copyOnWrite();
        ((tb) this.instance).setSuggestionCardRtInfoUpdated(bhfVar);
    }

    public final void f(bhh bhhVar) {
        copyOnWrite();
        ((tb) this.instance).setSuggestionCardShown(bhhVar);
    }

    public final void g(bqu bquVar) {
        copyOnWrite();
        ((tb) this.instance).setWaitForServerSuggestionStarted(bquVar);
    }

    private sz() {
        throw null;
    }
}
