package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zem implements java.io.Serializable {
    public static final defpackage.zem a = new defpackage.zem(new int[0]);
    public final int[] b;
    public final transient int c;
    public final int d;

    public zem(int[] iArr, int i, int i2) {
        this.b = iArr;
        this.c = i;
        this.d = i2;
    }

    public final int a(int i) {
        defpackage.ysr.bs(i, b());
        return this.b[this.c + i];
    }

    public final int b() {
        return this.d - this.c;
    }

    public final boolean c() {
        return this.d == this.c;
    }

    public final int[] d() {
        return java.util.Arrays.copyOfRange(this.b, this.c, this.d);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.zem)) {
            return false;
        }
        defpackage.zem zemVar = (defpackage.zem) obj;
        if (b() != zemVar.b()) {
            return false;
        }
        for (int i = 0; i < b(); i++) {
            if (a(i) != zemVar.a(i)) {
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

    java.lang.Object readResolve() {
        return c() ? a : this;
    }

    public final java.lang.String toString() {
        if (c()) {
            return "[]";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(b() * 5);
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

    java.lang.Object writeReplace() {
        return (this.c > 0 || this.d < this.b.length) ? new defpackage.zem(d()) : this;
    }

    public zem(int[] iArr) {
        this(iArr, 0, iArr.length);
    }
}
