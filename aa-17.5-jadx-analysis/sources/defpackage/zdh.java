package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zdh implements Serializable {
    public static final zdh a = new zdh(new long[0]);
    public final int b;
    private final long[] c;

    public zdh(long[] jArr, int i) {
        this.c = jArr;
        this.b = i;
    }

    public final long a(int i) {
        woy.ai(i, this.b);
        return this.c[i];
    }

    public final boolean b() {
        return this.b == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zdh)) {
            return false;
        }
        zdh zdhVar = (zdh) obj;
        int i = this.b;
        if (i != zdhVar.b) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (a(i2) != zdhVar.a(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iG = 1;
        for (int i = 0; i < this.b; i++) {
            iG = (iG * 31) + a.g(this.c[i]);
        }
        return iG;
    }

    Object readResolve() {
        return b() ? a : this;
    }

    public final String toString() {
        if (b()) {
            return "[]";
        }
        int i = this.b;
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        long[] jArr = this.c;
        sb.append(jArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(jArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    Object writeReplace() {
        long[] jArr = this.c;
        int i = this.b;
        return i < jArr.length ? new zdh(Arrays.copyOfRange(jArr, 0, i)) : this;
    }

    public zdh(long[] jArr) {
        this(jArr, jArr.length);
    }
}
