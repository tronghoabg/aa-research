package j$.util;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements java.util.Comparator, java.io.Serializable, j$.util.Comparator {
    private static final long serialVersionUID = -7569533591570686392L;
    public final boolean a;
    public final java.util.Comparator b;

    public e(boolean z, java.util.Comparator comparator) {
        this.a = z;
        this.b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        boolean z = this.a;
        if (obj == null) {
            if (obj2 == null) {
                return 0;
            }
            return z ? -1 : 1;
        }
        if (obj2 == null) {
            return z ? 1 : -1;
        }
        java.util.Comparator comparator = this.b;
        if (comparator == null) {
            return 0;
        }
        return comparator.compare(obj, obj2);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final java.util.Comparator reversed() {
        boolean z = !this.a;
        java.util.Comparator comparator = this.b;
        return new j$.util.e(z, comparator == null ? null : j$.util.Comparator.EL.reversed(comparator));
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final java.util.Comparator thenComparing(java.util.Comparator comparator) {
        comparator.getClass();
        java.util.Comparator comparator2 = this.b;
        if (comparator2 != null) {
            comparator = j$.util.Comparator.EL.thenComparing(comparator2, comparator);
        }
        return new j$.util.e(this.a, comparator);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingDouble(java.util.function.ToDoubleFunction toDoubleFunction) {
        return j$.util.Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingInt(java.util.function.ToIntFunction toIntFunction) {
        return j$.util.Comparator.CC.$default$thenComparingInt(this, toIntFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingLong(java.util.function.ToLongFunction toLongFunction) {
        return j$.util.Comparator.CC.$default$thenComparingLong(this, toLongFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.function.Function function, java.util.Comparator comparator) {
        return j$.util.Comparator.EL.thenComparing(this, j$.util.Comparator.CC.comparing(function, comparator));
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.function.Function function) {
        return j$.util.Comparator.EL.thenComparing(this, j$.util.Comparator.CC.comparing(function));
    }
}
