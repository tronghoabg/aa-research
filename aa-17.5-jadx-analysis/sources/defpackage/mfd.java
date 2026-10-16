package defpackage;

import j$.util.Objects;

/* loaded from: classes2.dex */
public final class mfd extends ebj {
    public final String a;
    private final int b = 953608361;

    public mfd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mfd) {
            mfd mfdVar = (mfd) obj;
            int i = mfdVar.b;
            if (Objects.equals(this.a, mfdVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a) - 502911881;
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, 953608361};
        String[] strArrSplit = "text;notificationId".split(";");
        StringBuilder sb = new StringBuilder("mfd[");
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
