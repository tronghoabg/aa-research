package defpackage;

import j$.util.Objects;

/* loaded from: classes2.dex */
public final class phx extends ebj {
    public final xpr a;
    public final abow b;

    public phx(xpr xprVar, abow abowVar) {
        this.a = xprVar;
        this.b = abowVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof phx) {
            phx phxVar = (phx) obj;
            if (Objects.equals(this.a, phxVar.a) && Objects.equals(this.b, phxVar.b)) {
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
        String[] strArrSplit = "messageType;message".split(";");
        StringBuilder sb = new StringBuilder("phx[");
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
