package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class qkn extends defpackage.edd {
    public final java.lang.String a;
    public final java.lang.String b;

    public qkn(java.lang.String str, java.lang.String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.qkn) {
            defpackage.qkn qknVar = (defpackage.qkn) obj;
            if (j$.util.Objects.equals(this.a, qknVar.a) && j$.util.Objects.equals(this.b, qknVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return defpackage.a.U(this.a, this.b);
    }

    public final java.lang.String toString() {
        int i = 0;
        java.lang.Object[] objArr = {this.a, this.b};
        java.lang.String[] strArrSplit = "carBluetoothEndpointAddress;startingCarBluetoothAddress".split(";");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("qkn[");
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
