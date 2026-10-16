package defpackage;

import j$.util.Objects;

/* loaded from: classes2.dex */
public final class pfw extends ebj implements pfx {
    public final ozy a;
    public final boolean b;

    public pfw(ozy ozyVar, boolean z) {
        this.a = ozyVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pfw) {
            pfw pfwVar = (pfw) obj;
            if (this.b == pfwVar.b && Objects.equals(this.a, pfwVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (a.f(this.b) * 31) + Objects.hashCode(this.a);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, Boolean.valueOf(this.b)};
        String[] strArrSplit = "wifiConfiguration;shouldPersist".split(";");
        StringBuilder sb = new StringBuilder("pfw[");
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
