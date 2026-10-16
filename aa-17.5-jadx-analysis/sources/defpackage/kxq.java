package defpackage;

import android.bluetooth.BluetoothDevice;
import j$.util.Objects;

/* loaded from: classes2.dex */
final class kxq extends ebj {
    public final BluetoothDevice a;
    public final kxw b;

    public kxq(BluetoothDevice bluetoothDevice, kxw kxwVar) {
        this.a = bluetoothDevice;
        this.b = kxwVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kxq) {
            kxq kxqVar = (kxq) obj;
            if (Objects.equals(this.a, kxqVar.a) && Objects.equals(this.b, kxqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return a.V(this.a, this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b};
        String[] strArrSplit = "bluetoothDevice;audioDevice".split(";");
        StringBuilder sb = new StringBuilder("kxq[");
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
