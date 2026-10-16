package defpackage;

import android.bluetooth.BluetoothDevice;

/* loaded from: classes2.dex */
public final class ohm implements ohl {
    @Override // defpackage.ohl
    public final int a(BluetoothDevice bluetoothDevice) {
        return bluetoothDevice.getBatteryLevel();
    }

    @Override // defpackage.ohl
    public final byte[] b(BluetoothDevice bluetoothDevice) {
        return bluetoothDevice.getMetadata(17);
    }
}
