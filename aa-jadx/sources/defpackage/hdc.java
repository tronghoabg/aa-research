package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hdc {
    public int a;
    public int b;

    public hdc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.hdc)) {
            return false;
        }
        defpackage.hdc hdcVar = (defpackage.hdc) obj;
        return this.a == hdcVar.a && this.b == hdcVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "VisibleRange(lowerInclusive=" + this.a + ", upperExclusive=" + this.b + ")";
    }
}
