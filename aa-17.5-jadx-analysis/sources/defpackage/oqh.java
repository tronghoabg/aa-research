package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class oqh implements BluetoothProfile {
    @Override // android.bluetooth.BluetoothProfile
    public final List getConnectedDevices() {
        return new ArrayList();
    }

    @Override // android.bluetooth.BluetoothProfile
    public final int getConnectionState(BluetoothDevice bluetoothDevice) {
        return 0;
    }

    @Override // android.bluetooth.BluetoothProfile
    public final List getDevicesMatchingConnectionStates(int[] iArr) {
        return new ArrayList();
    }
}
