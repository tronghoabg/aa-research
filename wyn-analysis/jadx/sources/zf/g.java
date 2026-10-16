package zf;

/* loaded from: classes5.dex */
public final class g extends e {

    /* renamed from: d, reason: collision with root package name */
    public static final g f48507d = new g(1, 0, 1);

    public final boolean a(int i5) {
        return this.f48500a <= i5 && i5 <= this.f48501b;
    }

    @Override // zf.e
    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (isEmpty() && ((g) obj).isEmpty()) {
            return true;
        }
        g gVar = (g) obj;
        if (this.f48500a == gVar.f48500a) {
            return this.f48501b == gVar.f48501b;
        }
        return false;
    }

    @Override // zf.e
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f48500a * 31) + this.f48501b;
    }

    @Override // zf.e
    public final boolean isEmpty() {
        return this.f48500a > this.f48501b;
    }

    @Override // zf.e
    public final String toString() {
        return this.f48500a + ".." + this.f48501b;
    }
}
