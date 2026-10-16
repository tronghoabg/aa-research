package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zdg implements Serializable {
    public static final zdg a = new zdg(new int[0]);
    public final int[] b;
    public final transient int c;
    public final int d;

    public zdg(int[] iArr, int i, int i2) {
        this.b = iArr;
        this.c = i;
        this.d = i2;
    }

    public final int a(int i) {
        woy.ai(i, b());
        return this.b[this.c + i];
    }

    public final int b() {
        return this.d - this.c;
    }

    public final boolean c() {
        return this.d == this.c;
    }

    public final int[] d() {
        return Arrays.copyOfRange(this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zdg)) {
            return false;
        }
        zdg zdgVar = (zdg) obj;
        if (b() != zdgVar.b()) {
            return false;
        }
        for (int i = 0; i < b(); i++) {
            if (a(i) != zdgVar.a(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.c; i2 < this.d; i2++) {
            i = (i * 31) + this.b[i2];
        }
        return i;
    }

    Object readResolve() {
        return c() ? a : this;
    }

    public final String toString() {
        if (c()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(b() * 5);
        sb.append('[');
        int[] iArr = this.b;
        int i = this.c;
        sb.append(iArr[i]);
        while (true) {
            i++;
            if (i >= this.d) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i]);
        }
    }

    Object writeReplace() {
        return (this.c > 0 || this.d < this.b.length) ? new zdg(d()) : this;
    }

    public zdg(int[] iArr) {
        this(iArr, 0, iArr.length);
    }
}
