package defpackage;

/* loaded from: classes3.dex */
public final class uku {
    public final ukt a;
    public final xxh b;

    public uku(ukt uktVar, xxh xxhVar) {
        this.a = uktVar;
        this.b = xxhVar;
    }

    public static uku a(uko ukoVar, ukt uktVar) {
        return new uku(uktVar, xxh.h(ukoVar));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uku) {
            uku ukuVar = (uku) obj;
            if (this.a.equals(ukuVar.a) && this.b.equals(ukuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        xxh xxhVar = this.b;
        return "{" + this.a.toString() + ", " + xxhVar.toString() + "}";
    }

    public uku() {
        throw null;
    }
}
