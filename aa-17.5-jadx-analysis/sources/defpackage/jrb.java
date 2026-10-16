package defpackage;

import j$.util.Objects;
import java.util.List;

/* loaded from: classes2.dex */
public final class jrb extends ebj {
    public final long a;
    public final List b;

    public jrb(long j, List list) {
        this.a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jrb) {
            jrb jrbVar = (jrb) obj;
            if (this.a == jrbVar.a && Objects.equals(this.b, jrbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (a.g(this.a) * 31) + Objects.hashCode(this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {Long.valueOf(this.a), this.b};
        String[] strArrSplit = "postTime;insights".split(";");
        StringBuilder sb = new StringBuilder("jrb[");
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
