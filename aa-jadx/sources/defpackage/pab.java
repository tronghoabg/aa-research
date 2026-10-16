package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pab {
    static final /* synthetic */ defpackage.afja[] a = {new defpackage.afgn(defpackage.pab.class, "instance", "getInstance()Lcom/google/android/apps/auto/wireless/datastore/WifiDataStore;", 0)};
    public static final /* synthetic */ int b = 0;

    public static final java.lang.String a(android.bluetooth.BluetoothDevice bluetoothDevice) {
        java.lang.String address = bluetoothDevice.getAddress();
        if (android.bluetooth.BluetoothAdapter.checkBluetoothAddress(address)) {
            address.getClass();
            return address;
        }
        java.util.Objects.toString(bluetoothDevice);
        throw new java.lang.IllegalArgumentException("Invalid Bluetooth Device provided ".concat(bluetoothDevice.toString()));
    }
}
