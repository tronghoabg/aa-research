package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
final class oqk extends mdd {
    final /* synthetic */ oql a;

    public oqk(oql oqlVar) {
        this.a = oqlVar;
    }

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("BluetoothBroadcastReceiver");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
        if (bluetoothDevice == null || intExtra != 2) {
            return;
        }
        oqq.a(context, yfq.q(bluetoothDevice), new oqj(this.a, 0));
    }
}
