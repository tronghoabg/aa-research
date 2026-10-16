package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afdf implements java.util.Comparator, j$.util.Comparator {
    private final /* synthetic */ int c;
    public static final defpackage.afdf b = new defpackage.afdf(1);
    public static final defpackage.afdf a = new defpackage.afdf(0);

    private afdf(int i) {
        this.c = i;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        if (this.c != 0) {
            java.lang.Comparable comparable = (java.lang.Comparable) obj;
            java.lang.Comparable comparable2 = (java.lang.Comparable) obj2;
            comparable.getClass();
            comparable2.getClass();
            return comparable.compareTo(comparable2);
        }
        java.lang.Comparable comparable3 = (java.lang.Comparable) obj;
        java.lang.Comparable comparable4 = (java.lang.Comparable) obj2;
        comparable3.getClass();
        comparable4.getClass();
        return comparable4.compareTo(comparable3);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final java.util.Comparator reversed() {
        return this.c != 0 ? a : b;
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
        return this.c != 0 ? j$.util.Comparator.CC.$default$thenComparing(this, comparator) : j$.util.Comparator.CC.$default$thenComparing(this, comparator);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingDouble(java.util.function.ToDoubleFunction toDoubleFunction) {
        return this.c != 0 ? j$.util.Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction) : j$.util.Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingInt(java.util.function.ToIntFunction toIntFunction) {
        return this.c != 0 ? j$.util.Comparator.CC.$default$thenComparingInt(this, toIntFunction) : j$.util.Comparator.CC.$default$thenComparingInt(this, toIntFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparingLong(java.util.function.ToLongFunction toLongFunction) {
        return this.c != 0 ? j$.util.Comparator.CC.$default$thenComparingLong(this, toLongFunction) : j$.util.Comparator.CC.$default$thenComparingLong(this, toLongFunction);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.function.Function function) {
        return this.c != 0 ? j$.util.Comparator.EL.thenComparing(this, j$.util.Comparator.CC.comparing(function)) : j$.util.Comparator.EL.thenComparing(this, j$.util.Comparator.CC.comparing(function));
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final /* synthetic */ java.util.Comparator thenComparing(java.util.function.Function function, java.util.Comparator comparator) {
        return this.c != 0 ? j$.util.Comparator.EL.thenComparing(this, j$.util.Comparator.CC.comparing(function, comparator)) : j$.util.Comparator.EL.thenComparing(this, j$.util.Comparator.CC.comparing(function, comparator));
    }
}
