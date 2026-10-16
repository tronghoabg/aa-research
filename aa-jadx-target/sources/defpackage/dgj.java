package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dgj {
    public final int a;
    public final int b;
    public final boolean c;

    public dgj(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dgj)) {
            return false;
        }
        defpackage.dgj dgjVar = (defpackage.dgj) obj;
        return this.a == dgjVar.a && this.b == dgjVar.b && this.c == dgjVar.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + defpackage.a.e(this.c);
    }

    public final java.lang.String toString() {
        return "BidiRun(start=" + this.a + ", end=" + this.b + ", isRtl=" + this.c + ")";
    }
}
