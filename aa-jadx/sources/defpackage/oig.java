package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oig implements defpackage.oif {
    @Override // defpackage.oif
    public final int a(android.bluetooth.BluetoothDevice bluetoothDevice) {
        return bluetoothDevice.getBatteryLevel();
    }

    @Override // defpackage.oif
    public final byte[] b(android.bluetooth.BluetoothDevice bluetoothDevice) {
        return bluetoothDevice.getMetadata(17);
    }
}
