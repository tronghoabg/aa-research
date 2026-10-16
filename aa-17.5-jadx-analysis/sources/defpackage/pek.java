package defpackage;

import android.net.Network;
import j$.util.Objects;

/* loaded from: classes2.dex */
final class pek extends ebj {
    public final Network a;
    public final String b;
    public final int c;

    public pek(Network network, String str, int i) {
        this.a = network;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pek) {
            pek pekVar = (pek) obj;
            if (this.c == pekVar.c && Objects.equals(this.a, pekVar.a) && Objects.equals(this.b, pekVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.c * 31) + Objects.hashCode(this.a)) * 31) + Objects.hashCode(this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, Integer.valueOf(this.c)};
        String[] strArrSplit = "network;ip;port".split(";");
        StringBuilder sb = new StringBuilder("pek[");
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
