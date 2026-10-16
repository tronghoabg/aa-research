package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
final class oqu extends BroadcastReceiver {
    final /* synthetic */ oqw a;

    public oqu(oqw oqwVar) {
        this.a = oqwVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        oqv oqvVar;
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
        if (intExtra == -1) {
            ((ype) ((ype) oqw.a.h()).ai((char) 6079)).u("Processing BT device update with an invalid state. Ignoring update.");
            return;
        }
        if (bluetoothDevice == null) {
            ((ype) ((ype) oqw.a.h()).ai((char) 6078)).u("Processing BT device update with a null device. Ignoring update.");
            return;
        }
        if (intExtra == 0) {
            oqvVar = oqv.d;
        } else if (intExtra == 1) {
            oqvVar = oqv.b;
        } else if (intExtra == 2) {
            oqvVar = oqv.a;
        } else if (intExtra != 3) {
            ((ype) ((ype) oqw.a.h()).ai((char) 6080)).w("Incoming bluetooth connection state (%d) is not a valid bluetooth profile state. Returning as UNKNOWN.", intExtra);
            oqvVar = oqv.e;
        } else {
            oqvVar = oqv.c;
        }
        this.a.q(new oct(oqvVar));
    }
}
