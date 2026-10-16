package u6;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final p f46710c = new p(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f46711a;

    /* renamed from: b, reason: collision with root package name */
    public final int f46712b;

    public p(int i5, int i10) {
        AbstractC4256a.e((i5 == -1 || i5 >= 0) && (i10 == -1 || i10 >= 0));
        this.f46711a = i5;
        this.f46712b = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f46711a == pVar.f46711a && this.f46712b == pVar.f46712b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.f46711a;
        return ((i5 >>> 16) | (i5 << 16)) ^ this.f46712b;
    }

    public final String toString() {
        return this.f46711a + "x" + this.f46712b;
    }
}
