package defpackage;

import j$.time.Instant;
import j$.util.Objects;

/* loaded from: classes2.dex */
final class irs extends ebj {
    public final xkq a;
    public final Instant b;
    public final int c;

    public irs(xkq xkqVar, Instant instant, int i) {
        this.a = xkqVar;
        this.b = instant;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof irs) {
            irs irsVar = (irs) obj;
            if (this.c == irsVar.c && Objects.equals(this.a, irsVar.a) && Objects.equals(this.b, irsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.c * 31) + Objects.hashCode(this.a)) * 31) + Objects.hashCode(this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, Integer.valueOf(this.c)};
        String[] strArrSplit = "mediaStats;timestamp;sessionId".split(";");
        StringBuilder sb = new StringBuilder("irs[");
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
