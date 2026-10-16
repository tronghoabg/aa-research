package defpackage;

import j$.util.Objects;

/* loaded from: classes2.dex */
final class pgl extends ebj {
    public final pag a;
    public final pdo b;

    public pgl(pag pagVar, pdo pdoVar) {
        this.a = pagVar;
        this.b = pdoVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pgl) {
            pgl pglVar = (pgl) obj;
            if (Objects.equals(this.a, pglVar.a) && Objects.equals(this.b, pglVar.b)) {
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
        String[] strArrSplit = "wirelessSetupEvent;wifiIntentionEvent".split(";");
        StringBuilder sb = new StringBuilder("pgl[");
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
