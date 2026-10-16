package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aak extends com.google.v.dm<aam, aak> implements com.google.v.fj {
    /* synthetic */ aak(byte[] bArr) {
        super(aam.DEFAULT_INSTANCE);
    }

    public final void a(zt ztVar) {
        copyOnWrite();
        ((aam) this.instance).setGoogleAssistantCombinedOnboardingLegalScreenClicked(ztVar);
    }

    public final void b(zv zvVar) {
        copyOnWrite();
        ((aam) this.instance).setGoogleAssistantCombinedOnboardingLegalScreenShown(zvVar);
    }

    public final void c(aaa aaaVar) {
        copyOnWrite();
        ((aam) this.instance).setGoogleAssistantFinished(aaaVar);
    }

    public final void d(aac aacVar) {
        copyOnWrite();
        ((aam) this.instance).setGoogleAssistantInitiated(aacVar);
    }

    private aak() {
        throw null;
    }
}
