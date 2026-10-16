package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class oze {
    static final /* synthetic */ afia[] a = {new affn(oze.class, "instance", "getInstance()Lcom/google/android/apps/auto/wireless/datastore/WifiDataStore;", 0)};
    public static final /* synthetic */ int b = 0;

    public static final String a(BluetoothDevice bluetoothDevice) {
        String address = bluetoothDevice.getAddress();
        if (BluetoothAdapter.checkBluetoothAddress(address)) {
            address.getClass();
            return address;
        }
        Objects.toString(bluetoothDevice);
        throw new IllegalArgumentException("Invalid Bluetooth Device provided ".concat(bluetoothDevice.toString()));
    }
}
