package defpackage;

import j$.util.Objects;

/* loaded from: classes2.dex */
public final class irw extends ebj {
    public final yyq a;
    public final yyq b;

    public irw(yyq yyqVar, yyq yyqVar2) {
        this.a = yyqVar;
        this.b = yyqVar2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof irw) {
            irw irwVar = (irw) obj;
            if (Objects.equals(this.a, irwVar.a) && Objects.equals(this.b, irwVar.b)) {
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
        String[] strArrSplit = "lagHistogram;perceivedLagHistogram".split(";");
        StringBuilder sb = new StringBuilder("irw[");
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
