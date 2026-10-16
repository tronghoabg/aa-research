package defpackage;

import j$.util.Objects;

/* loaded from: classes2.dex */
final class jrc extends ebj {
    public final jra a;
    public final long b;

    public jrc(jra jraVar, long j) {
        this.a = jraVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jrc) {
            jrc jrcVar = (jrc) obj;
            if (this.b == jrcVar.b && Objects.equals(this.a, jrcVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (a.g(this.b) * 31) + Objects.hashCode(this.a);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, Long.valueOf(this.b)};
        String[] strArrSplit = "key;postTime".split(";");
        StringBuilder sb = new StringBuilder("jrc[");
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
