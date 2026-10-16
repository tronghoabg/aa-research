package defpackage;

import j$.util.Objects;

/* loaded from: classes2.dex */
public final class jqz extends ebj {
    public final String a;
    public final String b;
    private final jqy c;

    public jqz(String str, String str2, jqy jqyVar) {
        this.a = str;
        this.b = str2;
        this.c = jqyVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jqz) {
            jqz jqzVar = (jqz) obj;
            if (Objects.equals(this.a, jqzVar.a) && Objects.equals(this.b, jqzVar.b) && Objects.equals(this.c, jqzVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((Objects.hashCode(this.a) * 31) + Objects.hashCode(this.b)) * 31) + Objects.hashCode(this.c);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b, this.c};
        String[] strArrSplit = "data;label;action".split(";");
        StringBuilder sb = new StringBuilder("jqz[");
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
