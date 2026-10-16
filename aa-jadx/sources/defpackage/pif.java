package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pif {
    public final defpackage.pbf a;
    public final android.bluetooth.BluetoothDevice b;

    public pif(defpackage.pbf pbfVar, android.bluetooth.BluetoothDevice bluetoothDevice) {
        this.a = pbfVar;
        this.b = bluetoothDevice;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.pif) {
            defpackage.pif pifVar = (defpackage.pif) obj;
            if (this.a.equals(pifVar.a) && this.b.equals(pifVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final java.lang.String toString() {
        android.bluetooth.BluetoothDevice bluetoothDevice = this.b;
        return "WirelessSetupAndBluetoothDevice{setupInterface=" + java.lang.String.valueOf(this.a) + ", bluetoothDevice=" + bluetoothDevice.toString() + "}";
    }

    public pif() {
        throw null;
    }
}
