package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class thd extends defpackage.edd {
    public final defpackage.tgs a;
    public final j$.time.Duration b;

    public thd(defpackage.tgs tgsVar, j$.time.Duration duration) {
        this.a = tgsVar;
        this.b = duration;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.thd) {
            defpackage.thd thdVar = (defpackage.thd) obj;
            if (j$.util.Objects.equals(this.a, thdVar.a) && j$.util.Objects.equals(this.b, thdVar.b)) {
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
        java.lang.String[] strArrSplit = "state;startTime".split(";");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("thd[");
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
