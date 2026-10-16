package defpackage;

import android.bluetooth.BluetoothDevice;

/* loaded from: classes2.dex */
public final class oyv {
    public final BluetoothDevice a;
    public final yfq b;

    public oyv(BluetoothDevice bluetoothDevice, yfq yfqVar) {
        if (bluetoothDevice == null) {
            throw new NullPointerException("Null device");
        }
        this.a = bluetoothDevice;
        this.b = yfqVar;
    }

    public final boolean equals(Object obj) {
        yfq yfqVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof oyv) {
            oyv oyvVar = (oyv) obj;
            if (this.a.equals(oyvVar.a) && ((yfqVar = this.b) != null ? yrm.W(yfqVar, oyvVar.b) : oyvVar.b == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        yfq yfqVar = this.b;
        return (yfqVar == null ? 0 : yfqVar.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        yfq yfqVar = this.b;
        return "DeviceAndUuid{device=" + this.a.toString() + ", uuids=" + String.valueOf(yfqVar) + "}";
    }

    public oyv() {
        throw null;
    }
}
