package defpackage;

/* loaded from: classes.dex */
public final class dgc {
    public final int a;
    public final int b;
    public final boolean c;

    public dgc(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgc)) {
            return false;
        }
        dgc dgcVar = (dgc) obj;
        return this.a == dgcVar.a && this.b == dgcVar.b && this.c == dgcVar.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + a.f(this.c);
    }

    public final String toString() {
        return "BidiRun(start=" + this.a + ", end=" + this.b + ", isRtl=" + this.c + ")";
    }
}
