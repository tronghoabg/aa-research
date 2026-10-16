package s9;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f45365a;

    /* renamed from: b, reason: collision with root package name */
    public final b f45366b;

    public c(long j8, b bVar) {
        this.f45365a = j8;
        if (bVar == null) {
            throw new NullPointerException("Null offset");
        }
        this.f45366b = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f45365a == cVar.f45365a && this.f45366b.equals(cVar.f45366b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f45365a;
        return ((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f45366b.hashCode();
    }

    public final String toString() {
        return "IndexState{sequenceNumber=" + this.f45365a + ", offset=" + this.f45366b + "}";
    }
}
