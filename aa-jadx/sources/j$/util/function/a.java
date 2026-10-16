package j$.util.function;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements java.util.function.BiPredicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.util.function.BiPredicate b;
    public final /* synthetic */ java.util.function.BiPredicate c;

    public /* synthetic */ a(java.util.function.BiPredicate biPredicate, java.util.function.BiPredicate biPredicate2, byte b) {
        this.a = b;
        this.b = biPredicate;
        this.c = biPredicate2;
    }

    public final /* synthetic */ java.util.function.BiPredicate and(java.util.function.BiPredicate biPredicate) {
        switch (this.a) {
            case 0:
                break;
        }
        return j$.util.function.BiPredicate$CC.$default$and(this, biPredicate);
    }

    public final /* synthetic */ java.util.function.BiPredicate negate() {
        switch (this.a) {
            case 0:
                break;
        }
        return j$.util.function.BiPredicate$CC.$default$negate(this);
    }

    public final /* synthetic */ java.util.function.BiPredicate or(java.util.function.BiPredicate biPredicate) {
        switch (this.a) {
            case 0:
                break;
        }
        return j$.util.function.BiPredicate$CC.$default$or(this, biPredicate);
    }

    @Override // java.util.function.BiPredicate
    public final boolean test(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.a;
        java.util.function.BiPredicate biPredicate = this.c;
        java.util.function.BiPredicate biPredicate2 = this.b;
        switch (b) {
            case 0:
                return biPredicate2.test(obj, obj2) || biPredicate.test(obj, obj2);
            default:
                return biPredicate2.test(obj, obj2) && biPredicate.test(obj, obj2);
        }
    }
}
