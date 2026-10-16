package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ith extends android.telephony.PhoneStateListener {
    final /* synthetic */ defpackage.iti a;

    public ith(defpackage.iti itiVar) {
        this.a = itiVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i, java.lang.String str) {
        java.lang.String str2;
        defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) defpackage.iti.a.f()).ai(1331);
        if (i == 0) {
            str2 = "IDLE";
        } else if (i != 1) {
            str2 = i != 2 ? "UNKNOWN" : "OFFHOOK";
        } else {
            str2 = "RINGING";
        }
        yqjVar.K("Call state change: %s(%d)", str2, i);
        defpackage.iti itiVar = this.a;
        if (i != 0) {
            itiVar.d = true;
            return;
        }
        boolean z = itiVar.d;
        itiVar.d = false;
        if (z) {
            defpackage.itf itfVar = itiVar.c;
            defpackage.yqm yqmVar = defpackage.irf.a;
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1180)).u("Call completed");
            if (!defpackage.sqs.e()) {
                defpackage.irf irfVar = (defpackage.irf) itfVar;
                android.media.AudioManager audioManager = irfVar.o;
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                if (irfVar.p == null) {
                    irfVar.p = java.lang.Integer.valueOf(audioManager.getStreamVolume(3));
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(1152)).K("Setting volume of STREAM_MUSIC from %d to maximum: %d", irfVar.p, streamMaxVolume);
                }
                audioManager.setStreamVolume(3, streamMaxVolume, 0);
            }
            defpackage.irf irfVar2 = (defpackage.irf) itfVar;
            defpackage.ist istVar = irfVar2.e;
            ((defpackage.yqj) defpackage.isw.a.l().ai((char) 1296)).u("Reevaluating state after phone call");
            if (irfVar2.k.get()) {
                defpackage.ird irdVar = irfVar2.m;
                irdVar.getClass();
                java.lang.Runnable runnable = irfVar2.r;
                runnable.getClass();
                irdVar.postDelayed(runnable, 5000L);
            }
        }
    }
}
