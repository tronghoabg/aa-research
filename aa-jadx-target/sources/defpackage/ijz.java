package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ijz extends defpackage.edd {
    static final defpackage.ijz a = new defpackage.ijz(0, 0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    private final int e;
    private final int f;

    public ijz(int i, int i2, int i3, int i4, int i5) {
        this.b = i;
        this.e = i2;
        this.f = i3;
        this.c = i4;
        this.d = i5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ijz) {
            defpackage.ijz ijzVar = (defpackage.ijz) obj;
            if (this.b == ijzVar.b && this.e == ijzVar.e && this.f == ijzVar.f && this.c == ijzVar.c && this.d == ijzVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.b * 31) + this.e) * 31) + this.f) * 31) + this.c) * 31) + this.d;
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "imp(%d), reason(%d), reason_pid(%d), lru(%d), uid(%d)", java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.e), java.lang.Integer.valueOf(this.f), java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d));
    }
}
