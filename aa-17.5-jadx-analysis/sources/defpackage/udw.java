package defpackage;

/* loaded from: classes3.dex */
public final class udw {
    public final int a;
    public final int b;

    public udw(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof udw) {
            udw udwVar = (udw) obj;
            if (this.a == udwVar.a && this.b == udwVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + "}";
    }

    public udw() {
        throw null;
    }
}
