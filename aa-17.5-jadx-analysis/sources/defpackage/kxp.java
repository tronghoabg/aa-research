package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import j$.util.Objects;

/* loaded from: classes2.dex */
final class kxp extends BroadcastReceiver {
    final /* synthetic */ kxr a;

    public kxp(kxr kxrVar) {
        this.a = kxrVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Objects.checkIndex(0, 3);
        if (action == null) {
            return;
        }
        if (action.equals("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED")) {
            switch (intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1)) {
                case 10:
                    ((ype) this.a.a.l().ai(3505)).u("Bluetooth audio disconnected");
                    break;
                case 11:
                    ((ype) this.a.a.l().ai(3506)).u("Bluetooth audio connecting");
                    break;
                case 12:
                    ((ype) this.a.a.l().ai(3507)).u("Bluetooth audio connected");
                    break;
            }
            return;
        }
        if (action.equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
            int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
            if (intExtra == -1) {
                ((ype) this.a.a.l().ai(3508)).u("Bluetooth SCO error");
                return;
            }
            if (intExtra == 0) {
                kxr kxrVar = this.a;
                ((ype) kxrVar.a.l().ai(3509)).u("Bluetooth SCO disconnected");
                AudioManager audioManager = kxrVar.b;
                audioManager.getClass();
                audioManager.setBluetoothScoOn(false);
                return;
            }
            if (intExtra != 1) {
                return;
            }
            kxr kxrVar2 = this.a;
            ((ype) kxrVar2.a.l().ai(3510)).u("Bluetooth SCO connected");
            AudioManager audioManager2 = kxrVar2.b;
            audioManager2.getClass();
            audioManager2.setBluetoothScoOn(true);
        }
    }
}
