package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;

/* loaded from: classes.dex */
final class rgy extends rht {
    final /* synthetic */ rhg a;

    public rgy(rhg rhgVar) {
        this.a = rhgVar;
    }

    @Override // defpackage.rht
    public final void a(Intent intent) {
        ypf ypfVar = rhg.a;
        ypfVar.l().ai(8084).y("A2dpStateChangeReceiver#onReceive. intent=%s", intent.getAction());
        if ("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1);
            int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
            ypfVar.h().ai(8092).B("A2DP playing state change, old:%d new:%d", intExtra, intExtra2);
            rhg rhgVar = this.a;
            if (intExtra2 == 10) {
                wyd wydVar = rhgVar.t;
                qrg.a.h().ai(7686).u("A2DP playing while in projection. Trying disabling");
                ((qrg) wydVar.a).m.b();
                return;
            }
            return;
        }
        rhg rhgVar2 = this.a;
        if (rhgVar2.n != 0) {
            ypfVar.l().ai(8091).u("BluetoothUtil not initialized or being cleaned up");
            return;
        }
        if (!"android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
            ypfVar.g().ai(8090).u("A2dpStateChangeReceiver: Wrong intent. This shouldn't happen");
            return;
        }
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (!rhgVar2.f(bluetoothDevice)) {
            ypfVar.l().ai(8089).y("A2dp connection state changed, but not our device: %s", bluetoothDevice);
            return;
        }
        int intExtra3 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
        if (ypfVar.l().Z()) {
            String string = Integer.toString(intExtra3);
            if (intExtra3 == 0) {
                string = "DISCONNECTED";
            } else if (intExtra3 == 1) {
                string = "CONNECTING";
            } else if (intExtra3 == 2) {
                string = "CONNECTED";
            } else if (intExtra3 == 3) {
                string = "DISCONNECTING";
                intExtra3 = 3;
            }
            ypfVar.l().ai(8088).y("A2dpStateChangeReceiver#onReceive. new state=%s", string);
        }
        if (intExtra3 == 2) {
            ypfVar.l().ai(8087).u("Connected to A2DP");
            wyd wydVar2 = rhgVar2.t;
            qrg.a.l().ai(7685).u("onA2dpConnected");
            ((qrg) wydVar2.a).m.b();
            return;
        }
        if (intExtra3 == 1) {
            ypfVar.l().ai(8086).u("Connecting to A2DP");
            ((qrg) rhgVar2.t.a).m.a();
        } else if (intExtra3 == 0) {
            ypfVar.l().ai(8085).u("A2DP disconnected");
        }
    }
}
