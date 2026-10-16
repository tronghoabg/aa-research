package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hug {
    public final int a;
    public final int b;

    public hug(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (!defpackage.igg.i(i)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        if (!defpackage.igg.i(i2)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.hug)) {
            return false;
        }
        defpackage.hug hugVar = (defpackage.hug) obj;
        return this.a == hugVar.a && this.b == hugVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ")";
    }
}
