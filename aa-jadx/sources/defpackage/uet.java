package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uet {
    public final int a;
    public final int b;

    public uet(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.uet) {
            defpackage.uet uetVar = (defpackage.uet) obj;
            if (this.a == uetVar.a && this.b == uetVar.b) {
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

    public uet() {
        throw null;
    }
}
