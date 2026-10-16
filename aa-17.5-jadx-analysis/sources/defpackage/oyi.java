package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.auto.wireless.bluetooth.WifiBluetoothReceiver;

/* loaded from: classes2.dex */
public final class oyi extends BroadcastReceiver {
    final /* synthetic */ WifiBluetoothReceiver a;

    public oyi(WifiBluetoothReceiver wifiBluetoothReceiver) {
        this.a = wifiBluetoothReceiver;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!"android.bluetooth.device.action.BOND_STATE_CHANGED".equals(intent.getAction())) {
            ((ype) ((ype) WifiBluetoothReceiver.a.h()).ai(6148)).M("Unexpected action %s, expected: %s", intent.getAction(), "android.bluetooth.device.action.BOND_STATE_CHANGED");
            return;
        }
        BluetoothDevice bluetoothDeviceD = WifiBluetoothReceiver.d(context, intent);
        WifiBluetoothReceiver wifiBluetoothReceiver = this.a;
        synchronized (wifiBluetoothReceiver.e) {
            BluetoothDevice bluetoothDevice = wifiBluetoothReceiver.f;
            if (bluetoothDevice != null && bluetoothDevice.equals(bluetoothDeviceD)) {
                int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", -1);
                if (intExtra == 12 || intExtra == 10) {
                    context.getApplicationContext().unregisterReceiver(this);
                    WifiBluetoothReceiver wifiBluetoothReceiver2 = this.a;
                    synchronized (wifiBluetoothReceiver2.e) {
                        wifiBluetoothReceiver2.f = null;
                    }
                    this.a.c(context, intent);
                    return;
                }
                return;
            }
            ((ype) ((ype) WifiBluetoothReceiver.a.h()).ai(6147)).M("Received bond state change event for unexpected device. Got %s while expecting %s", bluetoothDeviceD, wifiBluetoothReceiver.f);
        }
    }
}
