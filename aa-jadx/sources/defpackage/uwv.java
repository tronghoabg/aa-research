package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uwv implements java.io.Serializable {
    public final int a;
    public final int b;

    public uwv(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean a() {
        return this.a > 0 && this.b > 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.uwv) {
            defpackage.uwv uwvVar = (defpackage.uwv) obj;
            if (this.a == uwvVar.a && this.b == uwvVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ ((this.a ^ 1000003) * 1000003);
    }

    public final java.lang.String toString() {
        return "{" + this.a + ", " + this.b + "}";
    }

    public uwv() {
        throw null;
    }
}
