package defpackage;

import j$.util.Objects;

/* loaded from: classes2.dex */
public final class mhu extends ebj {
    public final String a;
    public final mjt b;

    public mhu(String str, mjt mjtVar) {
        this.a = str;
        this.b = mjtVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mhu) {
            mhu mhuVar = (mhu) obj;
            if (Objects.equals(this.a, mhuVar.a) && Objects.equals(this.b, mhuVar.b)) {
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
        String[] strArrSplit = "packageName;callback".split(";");
        StringBuilder sb = new StringBuilder("mhu[");
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
