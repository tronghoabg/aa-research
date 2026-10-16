package defpackage;

/* loaded from: classes2.dex */
final class jgk extends ebj {
    public final long a;
    public final byte b;

    public jgk(long j, byte b) {
        this.a = j;
        this.b = b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jgk) {
            jgk jgkVar = (jgk) obj;
            if (this.b == jgkVar.b && this.a == jgkVar.a) {
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
        String[] strArrSplit = "frameTimeNanos;frameType".split(";");
        StringBuilder sb = new StringBuilder("jgk[");
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
