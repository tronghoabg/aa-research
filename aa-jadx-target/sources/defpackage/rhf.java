package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rhf {
    private static final defpackage.yqk b = defpackage.omv.n("CAR.BT.AdapterWrapper");
    public final android.bluetooth.BluetoothAdapter a;

    private rhf(android.bluetooth.BluetoothAdapter bluetoothAdapter) {
        this.a = bluetoothAdapter;
    }

    public static defpackage.rhf a(android.content.Context context) {
        android.bluetooth.BluetoothManager bluetoothManager = (android.bluetooth.BluetoothManager) context.getSystemService("bluetooth");
        if (bluetoothManager == null) {
            b.g().ai(8048).u("Cannot get BluetoothManager");
            return null;
        }
        android.bluetooth.BluetoothAdapter adapter = bluetoothManager.getAdapter();
        if (adapter != null) {
            return new defpackage.rhf(adapter);
        }
        b.g().ai(8047).u("Cannot get BluetoothAdapter");
        return null;
    }

    public final defpackage.rhg b(java.lang.String str) {
        android.bluetooth.BluetoothDevice remoteDevice = this.a.getRemoteDevice(str);
        if (remoteDevice != null) {
            return new defpackage.rhg(remoteDevice);
        }
        return null;
    }

    public final java.lang.String c() {
        return this.a.getAddress();
    }

    public final void d(int i, android.bluetooth.BluetoothProfile bluetoothProfile) {
        this.a.closeProfileProxy(i, bluetoothProfile);
    }

    public final boolean e() {
        try {
            return ((java.lang.Boolean) android.bluetooth.BluetoothAdapter.class.getMethod("enableNoAutoConnect", null).invoke(this.a, null)).booleanValue();
        } catch (java.lang.ReflectiveOperationException unused) {
            b.h().ai(8046).u("Error calling BluetoothAdapter#enableNoAutoConnect, falling back to BluetoothAdapter#enable");
            return this.a.enable();
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean f(android.content.Context context, android.bluetooth.BluetoothProfile.ServiceListener serviceListener, int i) {
        return this.a.getProfileProxy(context, serviceListener, i);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final void g() {
        this.a.cancelDiscovery();
    }
}
