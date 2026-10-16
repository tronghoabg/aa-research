package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jkn extends defpackage.edd {
    public final j$.time.Duration a;
    public final j$.time.Duration b;
    public final j$.time.Duration c;

    public jkn(j$.time.Duration duration, j$.time.Duration duration2, j$.time.Duration duration3) {
        this.a = duration;
        this.b = duration2;
        this.c = duration3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.jkn) {
            defpackage.jkn jknVar = (defpackage.jkn) obj;
            if (j$.util.Objects.equals(this.a, jknVar.a) && j$.util.Objects.equals(this.b, jknVar.b) && j$.util.Objects.equals(this.c, jknVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((j$.util.Objects.hashCode(this.a) * 31) + j$.util.Objects.hashCode(this.b)) * 31) + j$.util.Objects.hashCode(this.c);
    }

    public final java.lang.String toString() {
        int i = 0;
        java.lang.Object[] objArr = {this.a, this.b, this.c};
        java.lang.String[] strArrSplit = "encodingTime;ackWaitTime;compositionTime".split(";");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("jkn[");
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
