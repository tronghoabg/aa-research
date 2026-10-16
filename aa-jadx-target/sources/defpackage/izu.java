package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class izu extends defpackage.edd {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final j$.util.Optional d;

    public izu(boolean z, boolean z2, int i, j$.util.Optional optional) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = optional;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.izu) {
            defpackage.izu izuVar = (defpackage.izu) obj;
            if (this.a == izuVar.a && this.b == izuVar.b && this.c == izuVar.c && j$.util.Objects.equals(this.d, izuVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((defpackage.a.e(this.a) * 31) + defpackage.a.e(this.b)) * 31) + this.c) * 31) + j$.util.Objects.hashCode(this.d);
    }

    public final java.lang.String toString() {
        int i = 0;
        java.lang.Object[] objArr = {java.lang.Boolean.valueOf(this.a), java.lang.Boolean.valueOf(this.b), java.lang.Integer.valueOf(this.c), this.d};
        java.lang.String[] strArrSplit = "isEncrypted;isMediaPayload;callbackId;maxUnackedDuration".split(";");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("izu[");
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

    public izu(boolean z, boolean z2, int i) {
        this(z, z2, i, j$.util.Optional.empty());
    }
}
