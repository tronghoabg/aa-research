package defpackage;

import j$.util.Objects;

/* loaded from: classes2.dex */
public final class pgk extends ebj {
    public final zgp a;
    public final pfu b;

    public pgk(zgp zgpVar, pfu pfuVar) {
        this.a = zgpVar;
        this.b = pfuVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pgk) {
            pgk pgkVar = (pgk) obj;
            if (Objects.equals(this.a, pgkVar.a) && Objects.equals(this.b, pgkVar.b)) {
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
        String[] strArrSplit = "task;scope".split(";");
        StringBuilder sb = new StringBuilder("pgk[");
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
