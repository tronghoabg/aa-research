package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.apps.auto.wireless.bluetooth.WifiBluetoothReceiver;
import j$.util.OptionalInt;
import java.util.Set;

/* loaded from: classes2.dex */
final class oyk extends BroadcastReceiver {
    final /* synthetic */ BluetoothDevice a;

    public oyk(BluetoothDevice bluetoothDevice) {
        this.a = bluetoothDevice;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Parcelable parcelableExtra = intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        BluetoothDevice bluetoothDevice = this.a;
        if (parcelableExtra.equals(bluetoothDevice)) {
            int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", Integer.MIN_VALUE);
            ((ype) WifiBluetoothReceiver.a.l().ai(6155)).B("Got new bond state %d with previous bond state %d.\nDevice was unbonded at some point, clearing cached credentials.", intExtra, intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", Integer.MIN_VALUE));
            if (!WifiBluetoothReceiver.c.contains(Integer.valueOf(intExtra))) {
                kfl.g().e(yxi.WIRELESS_BT_RECEIVER_ILLEGAL_BOND_STATE_RECEIVED, OptionalInt.of(intExtra));
                return;
            }
            ozf.b().d(bluetoothDevice).c(new kze(intExtra, 4), mki.a.d);
            context.getApplicationContext().unregisterReceiver(this);
            ((Set) WifiBluetoothReceiver.i.v()).remove(bluetoothDevice);
        }
    }
}
