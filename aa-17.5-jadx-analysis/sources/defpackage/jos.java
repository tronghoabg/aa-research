package defpackage;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class jos extends ebj {
    public final jnh a;
    public final rwy b;

    public jos(jnh jnhVar, rwy rwyVar) {
        this.a = jnhVar;
        this.b = rwyVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jos) {
            jos josVar = (jos) obj;
            if (Objects.equals(this.a, josVar.a) && Objects.equals(this.b, josVar.b)) {
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
        String[] strArrSplit = "session;callback".split(";");
        StringBuilder sb = new StringBuilder("jos[");
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
