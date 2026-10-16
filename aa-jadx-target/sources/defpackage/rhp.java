package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rhp {
    private static final defpackage.yqk b = defpackage.omv.n("CAR.BT.HeadsetWrapper");
    public final android.bluetooth.BluetoothHeadset a;

    public rhp(android.bluetooth.BluetoothHeadset bluetoothHeadset) {
        this.a = bluetoothHeadset;
    }

    public final int a(android.bluetooth.BluetoothDevice bluetoothDevice) {
        return this.a.getConnectionState(bluetoothDevice);
    }

    public final boolean b(android.bluetooth.BluetoothDevice bluetoothDevice) {
        return this.a.setConnectionPolicy(bluetoothDevice, 100);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean c(android.bluetooth.BluetoothDevice bluetoothDevice) {
        try {
            return ((java.lang.Boolean) android.bluetooth.BluetoothHeadset.class.getMethod("connect", android.bluetooth.BluetoothDevice.class).invoke(this.a, bluetoothDevice)).booleanValue();
        } catch (java.lang.ReflectiveOperationException e) {
            b.g().p(e).ai(8098).y("Error calling BluetoothHeadset#%s", "connect");
            return false;
        }
    }

    public final void d(android.bluetooth.BluetoothDevice bluetoothDevice) {
        if (android.os.Build.VERSION.SDK_INT > 29) {
            this.a.setConnectionPolicy(bluetoothDevice, 100);
            return;
        }
        try {
            android.bluetooth.BluetoothHeadset.class.getMethod("setPriority", android.bluetooth.BluetoothDevice.class, java.lang.Integer.TYPE).invoke(this.a, bluetoothDevice, 100);
        } catch (java.lang.ReflectiveOperationException e) {
            b.g().p(e).ai(8099).u("Error calling BluetoothHeadset#setPriority");
        }
    }
}
