package defpackage;

/* loaded from: classes3.dex */
public final class tqi {
    private final uzc a;
    private final xxh b;
    private final xxh c;

    public tqi(uzc uzcVar, xxh xxhVar, xxh xxhVar2) {
        this.a = uzcVar;
        this.b = xxhVar;
        this.c = xxhVar2;
    }

    public static tqi a(uzc uzcVar, uzc uzcVar2, uzc uzcVar3) {
        return new tqi(uzcVar, xxh.g(uzcVar2), xxh.g(uzcVar3));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tqi) {
            tqi tqiVar = (tqi) obj;
            if (this.a.equals(tqiVar.a) && this.b.equals(tqiVar.b) && this.c.equals(tqiVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        return this.c.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        xxh xxhVar = this.c;
        xxh xxhVar2 = this.b;
        return "{" + this.a.toString() + ", " + xxhVar2.toString() + ", " + xxhVar.toString() + "}";
    }

    public tqi() {
        throw null;
    }
}
