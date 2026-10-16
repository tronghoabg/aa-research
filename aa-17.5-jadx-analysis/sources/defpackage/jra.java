package defpackage;

import j$.util.Objects;

/* loaded from: classes2.dex */
public final class jra extends ebj {
    private final String a;
    private final int b;

    public jra(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        return q(obj);
    }

    public final int hashCode() {
        return (this.b * 31) + Objects.hashCode(this.a);
    }

    public final /* synthetic */ boolean q(Object obj) {
        if (!(obj instanceof jra)) {
            return false;
        }
        jra jraVar = (jra) obj;
        return this.b == jraVar.b && Objects.equals(this.a, jraVar.a);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, Integer.valueOf(this.b)};
        String[] strArrSplit = "packageName;sbnId".split(";");
        StringBuilder sb = new StringBuilder("jra[");
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
