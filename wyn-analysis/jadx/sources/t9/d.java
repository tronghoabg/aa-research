package t9;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f45945a;

    /* renamed from: b, reason: collision with root package name */
    public final h f45946b;

    public d(int i5, h hVar) {
        this.f45945a = i5;
        this.f45946b = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f45945a == dVar.f45945a && this.f45946b.equals(dVar.f45946b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f45945a ^ 1000003) * 1000003) ^ this.f45946b.hashCode();
    }

    public final String toString() {
        return "Overlay{largestBatchId=" + this.f45945a + ", mutation=" + this.f45946b + "}";
    }
}
