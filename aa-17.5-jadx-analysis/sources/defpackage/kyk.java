package defpackage;

import android.os.Build;
import com.google.android.apps.auto.components.demand.audio.GhMicrophoneContentProvider;

@Deprecated
/* loaded from: classes.dex */
public final class kyk {
    public static final yph a = yph.c("GH.Assistant.CarMsngr");
    public final laf b;
    public volatile boolean c;
    public volatile int d;
    public sab e;
    public final qry f = new kyj(this);
    public roe g;

    public kyk(laf lafVar) {
        this.b = lafVar;
    }

    private final void c(boolean z) throws IllegalStateException, kxc, IllegalArgumentException {
        ((ype) ((ype) a.f()).ai((char) 3554)).y("reportVoiceSessionChangeToCar voiceSessionStarted: %b", Boolean.valueOf(z));
        if (this.g == null) {
            throw new kxc(ywj.CAR_MESSAGE_MANAGER_UNINITIALIZED);
        }
        if (!this.c) {
            try {
                roe roeVar = this.g;
                roeVar.getClass();
                roeVar.b(0);
                this.c = true;
            } catch (qrz e) {
                ((ype) ((ype) a.g()).ai((char) 3549)).y("%s", "Error messaging GCore Car api.");
                throw new kxc("Error messaging GCore Car api.", ywj.CONFIGURE_CAR_API_FAILED, e);
            }
        }
        try {
            roe roeVar2 = this.g;
            roeVar2.getClass();
            roeVar2.c(0, true != z ? 2 : 1);
        } catch (Exception e2) {
            ((ype) ((ype) ((ype) a.g()).p(e2)).ai((char) 3555)).y("%s", "Could not report voice session change to Car API.");
            throw new kxc("Could not report voice session change to Car API.", ywj.REPORT_VOICE_SESSION_CHANGE_TO_CAR_FAILED, e2);
        }
    }

    public final void a() throws kxc {
        try {
            if (Build.VERSION.SDK_INT < 30) {
                c(false);
            }
            GhMicrophoneContentProvider.a().b();
        } finally {
            this.b.c();
        }
    }

    public final void b() throws IllegalStateException, kxc, IllegalArgumentException {
        if (Build.VERSION.SDK_INT < 30) {
            c(true);
        }
        laf lafVar = this.b;
        wer.c();
        kgq.d(new kyi(lafVar, 2), "GH.AgsaAudioDiagnostics", yzz.ASSISTANT_AUDIO_DIAGNOSTICS, yzy.ty, "Cannot access car", new Object[0]);
    }
}
