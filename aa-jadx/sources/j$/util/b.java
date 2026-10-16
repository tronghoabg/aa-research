package j$.util;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements java.util.Comparator, java.io.Serializable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ b(byte b, java.lang.Object obj) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.a;
        java.lang.Object obj3 = this.b;
        switch (b) {
            case 0:
                java.util.function.ToIntFunction toIntFunction = (java.util.function.ToIntFunction) obj3;
                return java.lang.Integer.compare(toIntFunction.applyAsInt(obj), toIntFunction.applyAsInt(obj2));
            case 1:
                java.util.function.ToDoubleFunction toDoubleFunction = (java.util.function.ToDoubleFunction) obj3;
                return java.lang.Double.compare(toDoubleFunction.applyAsDouble(obj), toDoubleFunction.applyAsDouble(obj2));
            case 2:
                java.util.function.Function function = (java.util.function.Function) obj3;
                return ((java.lang.Comparable) function.apply(obj)).compareTo(function.apply(obj2));
            default:
                java.util.function.ToLongFunction toLongFunction = (java.util.function.ToLongFunction) obj3;
                return java.lang.Long.compare(toLongFunction.applyAsLong(obj), toLongFunction.applyAsLong(obj2));
        }
    }
}
