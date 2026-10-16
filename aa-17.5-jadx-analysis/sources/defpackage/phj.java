package defpackage;

import android.bluetooth.BluetoothDevice;

/* loaded from: classes2.dex */
public final class phj {
    public final pai a;
    public final BluetoothDevice b;

    public phj(pai paiVar, BluetoothDevice bluetoothDevice) {
        this.a = paiVar;
        this.b = bluetoothDevice;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof phj) {
            phj phjVar = (phj) obj;
            if (this.a.equals(phjVar.a) && this.b.equals(phjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        BluetoothDevice bluetoothDevice = this.b;
        return "WirelessSetupAndBluetoothDevice{setupInterface=" + String.valueOf(this.a) + ", bluetoothDevice=" + bluetoothDevice.toString() + "}";
    }

    public phj() {
        throw null;
    }
}
