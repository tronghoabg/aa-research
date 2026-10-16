package defpackage;

import android.content.ComponentName;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class irg {
    public static final yph a = yph.c("CAR.AUDIO.VSM");
    public final iqw b;
    public final iwz c;
    public iwv d;
    public Runnable e;
    public volatile boolean g;
    public izj i;
    private final jfg k;
    private final Handler j = new Handler(Looper.getMainLooper());
    public int f = 0;
    public volatile boolean h = false;

    public irg(iqw iqwVar, iwz iwzVar, jfg jfgVar) {
        this.k = jfgVar;
        this.b = iqwVar;
        this.c = iwzVar;
    }

    public final void a(String str) {
        int i;
        if (Build.VERSION.SDK_INT >= 30) {
            yph yphVar = a;
            ((ype) yphVar.l().ai(1244)).R("usageAssistantFocusGains: %d. inVoiceSession: %b carMicOpen: %b", Integer.valueOf(this.f), Boolean.valueOf(this.g), Boolean.valueOf(this.h));
            if (!this.h && (i = this.f) != 1) {
                if (i == 0 && !this.h && this.g) {
                    this.j.postDelayed(this.e, acna.b());
                    return;
                } else {
                    if (this.f < 0) {
                        ((ype) ((ype) yphVar.h()).ai((char) 1247)).u("Usage assistant focus gains are negative. Resetting to 0.");
                        this.f = 0;
                        this.j.postDelayed(this.e, acna.b());
                        return;
                    }
                    return;
                }
            }
            ((ype) yphVar.l().ai((char) 1245)).u("Removing stop ASR runnable");
            this.j.removeCallbacks(this.e);
            if (this.g) {
                return;
            }
            ((ype) yphVar.l().ai((char) 1246)).y("Starting ASR for package: %s", str);
            if (str != null) {
                jfg jfgVar = this.k;
                rrb rrbVarH = rrc.h(yxy.CAR_SERVICE, yzz.AUDIO_FOCUS_REQUEST_GAIN, yzy.zv);
                rrbVarH.d(new ComponentName(str, ""));
                jfgVar.b(rrbVarH.l());
            }
            this.b.p(1);
            this.g = true;
        }
    }
}
