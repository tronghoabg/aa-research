package defpackage;

import j$.time.Duration;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class jkg extends ebj {
    public final Duration a;
    public final Duration b;
    public final Duration c;

    public jkg(Duration duration, Duration duration2, Duration duration3) {
        this.a = duration;
        this.b = duration2;
        this.c = duration3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jkg) {
            jkg jkgVar = (jkg) obj;
            if (Objects.equals(this.a, jkgVar.a) && Objects.equals(this.b, jkgVar.b) && Objects.equals(this.c, jkgVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((Objects.hashCode(this.a) * 31) + Objects.hashCode(this.b)) * 31) + Objects.hashCode(this.c);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, this.c};
        String[] strArrSplit = "encodingTime;ackWaitTime;compositionTime".split(";");
        StringBuilder sb = new StringBuilder("jkg[");
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
