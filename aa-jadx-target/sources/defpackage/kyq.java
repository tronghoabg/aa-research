package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@java.lang.Deprecated
public final class kyq {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.Assistant.CarMsngr");
    public final defpackage.lak b;
    public volatile boolean c;
    public volatile int d;
    public defpackage.sax e;
    public final defpackage.qss f = new defpackage.kyp(this);
    public defpackage.roz g;

    public kyq(defpackage.lak lakVar) {
        this.b = lakVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    private final void c(boolean z) throws rlo, defpackage.kxj {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3557)).y("reportVoiceSessionChangeToCar voiceSessionStarted: %b", java.lang.Boolean.valueOf(z));
        if (this.g == null) {
            throw new defpackage.kxj(defpackage.yxo.CAR_MESSAGE_MANAGER_UNINITIALIZED);
        }
        if (!this.c) {
            try {
                defpackage.roz rozVar = this.g;
                rozVar.getClass();
                rozVar.b(0);
                this.c = true;
            } catch (defpackage.qst e) {
                ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 3552)).y("%s", "Error messaging GCore Car api.");
                throw new defpackage.kxj("Error messaging GCore Car api.", defpackage.yxo.CONFIGURE_CAR_API_FAILED, e);
            }
        }
        try {
            defpackage.roz rozVar2 = this.g;
            rozVar2.getClass();
            rozVar2.c(0, true != z ? 2 : 1);
        } catch (java.lang.Exception e2) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e2)).ai((char) 3558)).y("%s", "Could not report voice session change to Car API.");
            throw new defpackage.kxj("Could not report voice session change to Car API.", defpackage.yxo.REPORT_VOICE_SESSION_CHANGE_TO_CAR_FAILED, e2);
        }
    }

    public final void a() throws defpackage.kxj {
        try {
            if (android.os.Build.VERSION.SDK_INT < 30) {
                c(false);
            }
            com.google.android.apps.auto.components.demand.audio.GhMicrophoneContentProvider.a().b();
        } finally {
            this.b.c();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final void b() throws wfo, rlo, defpackage.kxj {
        if (android.os.Build.VERSION.SDK_INT < 30) {
            c(true);
        }
        defpackage.lak lakVar = this.b;
        defpackage.wfp.c();
        defpackage.kgu.d(new defpackage.kyo(lakVar, 2), "GH.AgsaAudioDiagnostics", defpackage.zbe.ASSISTANT_AUDIO_DIAGNOSTICS, defpackage.zbd.tC, "Cannot access car", new java.lang.Object[0]);
    }
}
