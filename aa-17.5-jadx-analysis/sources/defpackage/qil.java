package defpackage;

import j$.time.Instant;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class qil extends ebj {
    public final Instant a;
    public final String b;

    public qil(Instant instant, String str) {
        this.a = instant;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qil) {
            qil qilVar = (qil) obj;
            if (Objects.equals(this.a, qilVar.a) && Objects.equals(this.b, qilVar.b)) {
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
        String[] strArrSplit = "timestamp;description".split(";");
        StringBuilder sb = new StringBuilder("qil[");
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
