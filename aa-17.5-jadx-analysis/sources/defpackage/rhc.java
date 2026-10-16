package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;

/* loaded from: classes.dex */
final class rhc extends rht {
    final /* synthetic */ rhg a;

    public rhc(rhg rhgVar) {
        this.a = rhgVar;
    }

    @Override // defpackage.rht
    public final void a(Intent intent) {
        ypf ypfVar = rhg.a;
        ypfVar.l().ai(8107).y("HeadsetConnectionStateChangeReceiver#onReceive. intent=%s", intent.getAction());
        rhg rhgVar = this.a;
        if (rhgVar.n != 0) {
            ypfVar.l().ai(8113).u("BluetoothUtil not initialized or being cleaned up");
            return;
        }
        if (!"android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
            ypfVar.g().ai(8112).u("HeadsetConnectionStateChangeReceiver: Wrong intent. This shouldn't happen");
            return;
        }
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (!rhgVar.f(bluetoothDevice)) {
            ypfVar.l().ai(8111).y("HFP connection state changed, but not our device: %s", bluetoothDevice);
            return;
        }
        int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
        if (ypfVar.l().Z()) {
            String string = Integer.toString(intExtra);
            if (intExtra == 0) {
                string = "DISCONNECTED";
            } else if (intExtra == 1) {
                string = "CONNECTING";
            } else if (intExtra == 2) {
                string = "CONNECTED";
            } else if (intExtra == 3) {
                string = "DISCONNECTING";
                intExtra = 3;
            }
            ypfVar.l().ai(8110).y("HeadsetConnectionStateChangeReceiver#onReceive. new state=%s", string);
        }
        if (intExtra != 2) {
            if (intExtra == 0) {
                ypfVar.l().ai(8108).u("Disconnected HFP");
                wyd wydVar = rhgVar.t;
                qrg.a.l().ai(7693).u("onHfpDisconnected");
                qrg qrgVar = (qrg) wydVar.a;
                qrgVar.e.c(rgo.EVENT_HFP_DISCONNECTED);
                qrgVar.m(new qra(3));
                return;
            }
            return;
        }
        ypfVar.l().ai(8109).u("Connected to HFP");
        String str = rhgVar.e;
        if (str != null) {
            rgk rgkVar = rhgVar.d;
            rgkVar.getClass();
            rhgVar.f = rgkVar.b(str);
        } else {
            rhgVar.f = null;
        }
        rgx rgxVar = rhgVar.o;
        if (rgxVar == null) {
            return;
        }
        rgl rglVar = rhgVar.f;
        rglVar.getClass();
        rgxVar.c = rglVar.a;
        wyd wydVar2 = rhgVar.t;
        qrg.a.l().ai(7692).u("onHfpConnected");
        qrg qrgVar2 = (qrg) wydVar2.a;
        qrgVar2.e.c(rgo.EVENT_HFP_CONNECTED);
        qrgVar2.m(new qra(7));
        rxf.l(qrgVar2.n, yxo.NO_HFP);
    }
}
