package defpackage;

import android.bluetooth.BluetoothDevice;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class phg extends ebj {
    public final BluetoothDevice a;
    public final zgp b;

    public phg(BluetoothDevice bluetoothDevice, zgp zgpVar) {
        this.a = bluetoothDevice;
        this.b = zgpVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof phg) {
            phg phgVar = (phg) obj;
            if (Objects.equals(this.a, phgVar.a) && Objects.equals(this.b, phgVar.b)) {
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
        String[] strArrSplit = "device;future".split(";");
        StringBuilder sb = new StringBuilder("phg[");
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
