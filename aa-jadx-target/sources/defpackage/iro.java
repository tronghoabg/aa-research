package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iro {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.AUDIO.VSM");
    public final defpackage.irf b;
    public final defpackage.ixh c;
    public defpackage.ixd d;
    public java.lang.Runnable e;
    public volatile boolean g;
    public defpackage.izq i;
    private final defpackage.jfo k;
    private final android.os.Handler j = new android.os.Handler(android.os.Looper.getMainLooper());
    public int f = 0;
    public volatile boolean h = false;

    public iro(defpackage.irf irfVar, defpackage.ixh ixhVar, defpackage.jfo jfoVar) {
        this.k = jfoVar;
        this.b = irfVar;
        this.c = ixhVar;
    }

    public final void a(java.lang.String str) {
        int i;
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            defpackage.yqm yqmVar = a;
            ((defpackage.yqj) yqmVar.l().ai(1244)).R("usageAssistantFocusGains: %d. inVoiceSession: %b carMicOpen: %b", java.lang.Integer.valueOf(this.f), java.lang.Boolean.valueOf(this.g), java.lang.Boolean.valueOf(this.h));
            if (!this.h && (i = this.f) != 1) {
                if (i == 0 && !this.h && this.g) {
                    this.j.postDelayed(this.e, acoc.b());
                    return;
                } else {
                    if (this.f < 0) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 1247)).u("Usage assistant focus gains are negative. Resetting to 0.");
                        this.f = 0;
                        this.j.postDelayed(this.e, acoc.b());
                        return;
                    }
                    return;
                }
            }
            ((defpackage.yqj) yqmVar.l().ai((char) 1245)).u("Removing stop ASR runnable");
            this.j.removeCallbacks(this.e);
            if (this.g) {
                return;
            }
            ((defpackage.yqj) yqmVar.l().ai((char) 1246)).y("Starting ASR for package: %s", str);
            if (str != null) {
                defpackage.jfo jfoVar = this.k;
                defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.AUDIO_FOCUS_REQUEST_GAIN, defpackage.zbd.zz);
                rrvVarH.d(new android.content.ComponentName(str, ""));
                jfoVar.b(rrvVarH.l());
            }
            this.b.p(1);
            this.g = true;
        }
    }
}
