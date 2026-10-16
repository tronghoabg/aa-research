package defpackage;

/* loaded from: classes2.dex */
public final class iwm extends ebj {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public iwm(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof iwm) {
            iwm iwmVar = (iwm) obj;
            if (this.a == iwmVar.a && this.b == iwmVar.b && this.c == iwmVar.c && this.d == iwmVar.d && this.e == iwmVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e)};
        String[] strArrSplit = "displayLeft;displayTop;displayWidth;displayHeight;roiQpOffset".split(";");
        StringBuilder sb = new StringBuilder("iwm[");
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
