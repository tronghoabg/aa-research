package defpackage;

/* loaded from: classes3.dex */
public final class uir {
    public final xxh a;
    public final xxh b;
    public final xxh c;
    public final xxh d;

    public uir(xxh xxhVar, xxh xxhVar2, xxh xxhVar3, xxh xxhVar4) {
        this.a = xxhVar;
        this.b = xxhVar2;
        this.c = xxhVar3;
        this.d = xxhVar4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uir) {
            uir uirVar = (uir) obj;
            if (this.a.equals(uirVar.a) && this.b.equals(uirVar.b) && this.c.equals(uirVar.c) && this.d.equals(uirVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        return this.d.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        xxh xxhVar = this.d;
        xxh xxhVar2 = this.c;
        xxh xxhVar3 = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(xxhVar3) + ", " + String.valueOf(xxhVar2) + ", " + String.valueOf(xxhVar) + "}";
    }

    public uir() {
        throw null;
    }
}
