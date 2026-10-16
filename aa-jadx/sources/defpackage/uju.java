package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uju implements java.io.Serializable {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public uju(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.uju) {
            defpackage.uju ujuVar = (defpackage.uju) obj;
            if (this.a == ujuVar.a && this.b == ujuVar.b && this.c == ujuVar.c && this.d == ujuVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d ^ ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003);
    }

    public final java.lang.String toString() {
        return "{" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + "}";
    }

    public uju() {
        throw null;
    }
}
