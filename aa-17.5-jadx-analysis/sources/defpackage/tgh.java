package defpackage;

import j$.time.Duration;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class tgh extends ebj {
    public final tfw a;
    public final Duration b;

    public tgh(tfw tfwVar, Duration duration) {
        this.a = tfwVar;
        this.b = duration;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tgh) {
            tgh tghVar = (tgh) obj;
            if (Objects.equals(this.a, tghVar.a) && Objects.equals(this.b, tghVar.b)) {
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
        String[] strArrSplit = "state;startTime".split(";");
        StringBuilder sb = new StringBuilder("tgh[");
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
