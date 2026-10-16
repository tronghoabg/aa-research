package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ind extends defpackage.edd {
    public final long a;
    public final byte b;

    public ind(long j, byte b) {
        this.a = j;
        this.b = b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ind) {
            defpackage.ind indVar = (defpackage.ind) obj;
            if (this.b == indVar.b && this.a == indVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b * 31) + defpackage.a.f(this.a);
    }

    public final java.lang.String toString() {
        int i = 0;
        java.lang.Object[] objArr = {java.lang.Long.valueOf(this.a), java.lang.Byte.valueOf(this.b)};
        java.lang.String[] strArrSplit = "frameMillis;frameType".split(";");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ind[");
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
