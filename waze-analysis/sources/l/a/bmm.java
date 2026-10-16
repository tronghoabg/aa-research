package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bmm extends com.google.v.dm<bmo, bmm> implements com.google.v.fj {
    /* synthetic */ bmm(byte[] bArr) {
        super(bmo.DEFAULT_INSTANCE);
    }

    public final void a(pl plVar) {
        copyOnWrite();
        ((bmo) this.instance).setCustomVoiceInstructionsScreenClicked(plVar);
    }

    public final void b(pn pnVar) {
        copyOnWrite();
        ((bmo) this.instance).setCustomVoiceInstructionsScreenShown(pnVar);
    }

    public final void c(asn asnVar) {
        copyOnWrite();
        ((bmo) this.instance).setPromptAudioPlayed(asnVar);
    }

    public final void d(bcg bcgVar) {
        copyOnWrite();
        ((bmo) this.instance).setShareCustomVoiceDrawerClicked(bcgVar);
    }

    public final void e(bqf bqfVar) {
        copyOnWrite();
        ((bmo) this.instance).setVoiceDirectionsSettingsClicked(bqfVar);
    }

    private bmm() {
        throw null;
    }
}
