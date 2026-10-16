package defpackage;

/* loaded from: classes.dex */
public final class imw extends ebj {
    public final long a;
    public final byte b;

    public imw(long j, byte b) {
        this.a = j;
        this.b = b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof imw) {
            imw imwVar = (imw) obj;
            if (this.b == imwVar.b && this.a == imwVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b * 31) + a.g(this.a);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {Long.valueOf(this.a), Byte.valueOf(this.b)};
        String[] strArrSplit = "frameMillis;frameType".split(";");
        StringBuilder sb = new StringBuilder("imw[");
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
