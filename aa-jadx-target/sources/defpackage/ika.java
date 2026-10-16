package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ika extends defpackage.edd {
    public final long a;
    public final defpackage.ijz b;

    public ika(long j, defpackage.ijz ijzVar) {
        this.a = j;
        this.b = ijzVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ika) {
            defpackage.ika ikaVar = (defpackage.ika) obj;
            if (this.a == ikaVar.a && j$.util.Objects.equals(this.b, ikaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (defpackage.a.f(this.a) * 31) + j$.util.Objects.hashCode(this.b);
    }

    public final java.lang.String toString() {
        int i = 0;
        java.lang.Object[] objArr = {java.lang.Long.valueOf(this.a), this.b};
        java.lang.String[] strArrSplit = "timestampMillis;processInfo".split(";");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ika[");
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
