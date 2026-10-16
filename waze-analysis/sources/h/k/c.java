package h.k;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    private final double f48143a;

    /* renamed from: b, reason: collision with root package name */
    private final double f48144b;

    public c(double d2, double d3) {
        this.f48143a = d2;
        this.f48144b = d3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.k.e
    public final /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        double dDoubleValue = ((Number) comparable).doubleValue();
        return dDoubleValue >= this.f48143a && dDoubleValue <= this.f48144b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.k.e
    public final /* bridge */ /* synthetic */ boolean b(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).doubleValue() <= ((Number) comparable2).doubleValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (isEmpty() && ((c) obj).isEmpty()) {
                return true;
            }
            c cVar = (c) obj;
            return this.f48143a == cVar.f48143a && this.f48144b == cVar.f48144b;
        }
        return false;
    }

    @Override // h.k.f
    public final /* bridge */ /* synthetic */ Comparable getEndInclusive() {
        return Double.valueOf(this.f48144b);
    }

    @Override // h.k.f
    public final /* bridge */ /* synthetic */ Comparable getStart() {
        return Double.valueOf(this.f48143a);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (a.a.e(this.f48143a) * 31) + a.a.e(this.f48144b);
    }

    @Override // h.k.e, h.k.f
    public final boolean isEmpty() {
        return this.f48143a > this.f48144b;
    }

    public final String toString() {
        return this.f48143a + ".." + this.f48144b;
    }
}
