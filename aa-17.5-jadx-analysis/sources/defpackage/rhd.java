package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Build;

/* loaded from: classes.dex */
final class rhd extends rht {
    final /* synthetic */ rhg a;

    public rhd(rhg rhgVar) {
        this.a = rhgVar;
    }

    @Override // defpackage.rht
    public final void a(Intent intent) {
        Object parcelableExtra;
        rhg.a.f().ai(8114).y("Received intent %s for key missing receiver", intent);
        if (Build.VERSION.SDK_INT >= 34) {
            parcelableExtra = intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE", BluetoothDevice.class);
        } else {
            parcelableExtra = intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (!BluetoothDevice.class.isInstance(parcelableExtra)) {
                parcelableExtra = null;
            }
        }
        rhg rhgVar = this.a;
        BluetoothDevice bluetoothDevice = (BluetoothDevice) parcelableExtra;
        bluetoothDevice.getClass();
        if (rhgVar.f(bluetoothDevice)) {
            rhgVar.i(rhf.BLUETOOTH_UNPAIR_KEY_MISSING);
            abortBroadcast();
        }
    }
}
