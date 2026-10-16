package defpackage;

import android.media.AudioManager;
import android.telephony.PhoneStateListener;

/* loaded from: classes2.dex */
final class rfv extends PhoneStateListener {
    final /* synthetic */ rfw a;

    public rfv(rfw rfwVar) {
        this.a = rfwVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i, String str) {
        rfw.a.f().ai(7984).w("Call state change: %d", i);
        rfw rfwVar = this.a;
        if (i != 0) {
            rfwVar.d = true;
            return;
        }
        boolean z = rfwVar.d;
        rfwVar.d = false;
        if (z) {
            rft rftVar = rfwVar.c;
            if (!spu.c()) {
                qqt qqtVar = (qqt) rftVar;
                AudioManager audioManager = qqtVar.m;
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                if (qqtVar.n == null) {
                    qqtVar.n = Integer.valueOf(audioManager.getStreamVolume(3));
                    qqt.a.f().ai(7613).K("Setting volume of STREAM_MUSIC from %d to maximum: %d", qqtVar.n, streamMaxVolume);
                }
                audioManager.setStreamVolume(3, streamMaxVolume, 0);
            }
            qqt qqtVar2 = (qqt) rftVar;
            rfp rfpVar = qqtVar2.d;
            rfq.a.d().ai(7958).u("reevaluateStateAfterPhoneCall");
            qqs qqsVar = qqtVar2.k;
            qqsVar.getClass();
            qqsVar.postDelayed(new qjv(rftVar, 11), 5000L);
        }
    }
}
