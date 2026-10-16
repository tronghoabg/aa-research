package h.k;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    private final float f48145a;

    /* renamed from: b, reason: collision with root package name */
    private final float f48146b;

    public d(float f2, float f3) {
        this.f48145a = f2;
        this.f48146b = f3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.k.e
    public final /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        float fFloatValue = ((Number) comparable).floatValue();
        return fFloatValue >= this.f48145a && fFloatValue <= this.f48146b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.k.e
    public final /* bridge */ /* synthetic */ boolean b(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            if (isEmpty() && ((d) obj).isEmpty()) {
                return true;
            }
            d dVar = (d) obj;
            return this.f48145a == dVar.f48145a && this.f48146b == dVar.f48146b;
        }
        return false;
    }

    @Override // h.k.f
    public final /* bridge */ /* synthetic */ Comparable getEndInclusive() {
        return Float.valueOf(this.f48146b);
    }

    @Override // h.k.f
    public final /* bridge */ /* synthetic */ Comparable getStart() {
        return Float.valueOf(this.f48145a);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.floatToIntBits(this.f48145a) * 31) + Float.floatToIntBits(this.f48146b);
    }

    @Override // h.k.e, h.k.f
    public final boolean isEmpty() {
        return this.f48145a > this.f48146b;
    }

    public final String toString() {
        return this.f48145a + ".." + this.f48146b;
    }
}
