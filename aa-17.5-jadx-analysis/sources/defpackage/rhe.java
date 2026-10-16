package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;

/* loaded from: classes.dex */
final class rhe extends rht {
    final /* synthetic */ rhg a;

    public rhe(rhg rhgVar) {
        this.a = rhgVar;
    }

    @Override // defpackage.rht
    public final void a(Intent intent) {
        ypf ypfVar = rhg.a;
        ypfVar.l().ai(8115).y("PairingRequestReceiver#onReceive: intent=%s", intent.getAction());
        rhg rhgVar = this.a;
        if (rhgVar.n != 0) {
            ypfVar.l().ai(8120).u("BluetoothUtil not initialized or being cleaned up");
            return;
        }
        if (!"android.bluetooth.device.action.PAIRING_REQUEST".equals(intent.getAction())) {
            ypfVar.g().ai(8119).u("PairingRequestReceiver: Wrong intent. This shouldn't happen");
            return;
        }
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (!rhgVar.f(bluetoothDevice)) {
            ypfVar.g().ai(8118).y("Wrong device is being paired: %s", bluetoothDevice);
            return;
        }
        int intExtra = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_VARIANT", Integer.MIN_VALUE);
        if (intExtra == Integer.MIN_VALUE) {
            ypfVar.g().ai(8117).u("Wrong Bluetooth pairing method");
            return;
        }
        int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_KEY", Integer.MIN_VALUE);
        ypfVar.l().ai(8116).B("PairingRequestReceiver#onReceive: pairing method=%d, pairing key=%d", intExtra, intExtra2);
        rhgVar.p = intExtra;
        rhgVar.q = intExtra2;
        rbe.h(new ral(rhgVar, 14));
        abortBroadcast();
    }
}
