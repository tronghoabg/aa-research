package defpackage;

import android.media.AudioManager;
import android.telephony.PhoneStateListener;

/* loaded from: classes.dex */
final class isz extends PhoneStateListener {
    final /* synthetic */ ita a;

    public isz(ita itaVar) {
        this.a = itaVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i, String str) {
        ((ype) ((ype) ita.a.f()).ai(1331)).K("Call state change: %s(%d)", i != 0 ? i != 1 ? i != 2 ? "UNKNOWN" : "OFFHOOK" : "RINGING" : "IDLE", i);
        ita itaVar = this.a;
        if (i != 0) {
            itaVar.d = true;
            return;
        }
        boolean z = itaVar.d;
        itaVar.d = false;
        if (z) {
            isx isxVar = itaVar.c;
            yph yphVar = iqw.a;
            ((ype) ((ype) yphVar.f()).ai((char) 1180)).u("Call completed");
            if (!spu.c()) {
                iqw iqwVar = (iqw) isxVar;
                AudioManager audioManager = iqwVar.o;
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                if (iqwVar.p == null) {
                    iqwVar.p = Integer.valueOf(audioManager.getStreamVolume(3));
                    ((ype) ((ype) yphVar.f()).ai(1152)).K("Setting volume of STREAM_MUSIC from %d to maximum: %d", iqwVar.p, streamMaxVolume);
                }
                audioManager.setStreamVolume(3, streamMaxVolume, 0);
            }
            iqw iqwVar2 = (iqw) isxVar;
            isl islVar = iqwVar2.e;
            ((ype) iso.a.l().ai((char) 1296)).u("Reevaluating state after phone call");
            if (iqwVar2.k.get()) {
                iqv iqvVar = iqwVar2.m;
                iqvVar.getClass();
                Runnable runnable = iqwVar2.r;
                runnable.getClass();
                iqvVar.postDelayed(runnable, 5000L);
            }
        }
    }
}
