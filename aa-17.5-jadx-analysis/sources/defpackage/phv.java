package defpackage;

import j$.util.Objects;

/* loaded from: classes2.dex */
public final class phv extends ebj {
    public final xpr a;

    public phv(xpr xprVar) {
        this.a = xprVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof phv) && Objects.equals(this.a, ((phv) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a};
        String[] strArrSplit = "messageType".split(";");
        StringBuilder sb = new StringBuilder("phv[");
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
