package defpackage;

import j$.util.Objects;

/* loaded from: classes.dex */
final class qjr extends ebj {
    public final String a;
    public final String b;

    public qjr(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qjr) {
            qjr qjrVar = (qjr) obj;
            if (Objects.equals(this.a, qjrVar.a) && Objects.equals(this.b, qjrVar.b)) {
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
        String[] strArrSplit = "carBluetoothEndpointAddress;startingCarBluetoothAddress".split(";");
        StringBuilder sb = new StringBuilder("qjr[");
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
