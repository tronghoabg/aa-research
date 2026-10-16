package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class jgi extends defpackage.edd {
    public final defpackage.xlr a;
    public final j$.time.Instant b;

    public jgi(defpackage.xlr xlrVar, j$.time.Instant instant) {
        this.a = xlrVar;
        this.b = instant;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.jgi) {
            defpackage.jgi jgiVar = (defpackage.jgi) obj;
            if (j$.util.Objects.equals(this.a, jgiVar.a) && j$.util.Objects.equals(this.b, jgiVar.b)) {
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
        java.lang.String[] strArrSplit = "mediaStats;timestamp".split(";");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("jgi[");
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
