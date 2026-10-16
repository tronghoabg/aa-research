package defpackage;

import j$.time.Instant;
import j$.util.Objects;

/* loaded from: classes.dex */
final class jga extends ebj {
    public final xkq a;
    public final Instant b;

    public jga(xkq xkqVar, Instant instant) {
        this.a = xkqVar;
        this.b = instant;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jga) {
            jga jgaVar = (jga) obj;
            if (Objects.equals(this.a, jgaVar.a) && Objects.equals(this.b, jgaVar.b)) {
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
        String[] strArrSplit = "mediaStats;timestamp".split(";");
        StringBuilder sb = new StringBuilder("jga[");
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
