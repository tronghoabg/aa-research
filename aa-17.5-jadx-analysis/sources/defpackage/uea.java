package defpackage;

/* loaded from: classes3.dex */
final class uea {
    public final int a;
    public final int b;
    public final xxh c;
    public final abnr d;

    public uea(abnr abnrVar, int i, int i2, xxh xxhVar) {
        this.d = abnrVar;
        this.a = i;
        this.b = i2;
        this.c = xxhVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uea) {
            uea ueaVar = (uea) obj;
            if (this.d.equals(ueaVar.d) && this.a == ueaVar.a && this.b == ueaVar.b && this.c.equals(ueaVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() ^ 1000003;
        xxh xxhVar = this.c;
        return ((this.b ^ (((iHashCode * 1000003) ^ this.a) * 1000003)) * 1000003) ^ xxhVar.hashCode();
    }

    public final String toString() {
        xxh xxhVar = this.c;
        return "{" + this.d.toString() + ", " + this.a + ", " + this.b + ", " + String.valueOf(xxhVar) + "}";
    }

    public uea() {
        throw null;
    }
}
