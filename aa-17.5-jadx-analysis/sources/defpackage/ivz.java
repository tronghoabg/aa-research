package defpackage;

/* loaded from: classes2.dex */
final class ivz extends ebj {
    public final int a;
    public final int b;

    public ivz(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ivz) {
            ivz ivzVar = (ivz) obj;
            if (this.a == ivzVar.a && this.b == ivzVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {Integer.valueOf(this.a), Integer.valueOf(this.b)};
        String[] strArrSplit = "x;y".split(";");
        StringBuilder sb = new StringBuilder("ivz[");
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
