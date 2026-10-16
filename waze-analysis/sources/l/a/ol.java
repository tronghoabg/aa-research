package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ol extends com.google.v.dm<on, ol> implements com.google.v.fj {
    /* synthetic */ ol(byte[] bArr) {
        super(on.DEFAULT_INSTANCE);
    }

    public final void a(om omVar) {
        copyOnWrite();
        ((on) this.instance).setComponentType(omVar);
    }

    public final void b() {
        copyOnWrite();
        ((on) this.instance).setIsTtsLanguageSupported(false);
    }

    public final void c(String str) {
        copyOnWrite();
        ((on) this.instance).setTtsExpectedLanguage(str);
    }

    public final void d(String str) {
        copyOnWrite();
        ((on) this.instance).setWazeAppLanguage(str);
    }

    public final void e(String str) {
        copyOnWrite();
        ((on) this.instance).setWazeVoiceGuidanceLanguage(str);
    }

    private ol() {
        throw null;
    }
}
