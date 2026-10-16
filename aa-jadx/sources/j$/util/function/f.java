package j$.util.function;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements java.util.function.IntPredicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.util.function.IntPredicate b;
    public final /* synthetic */ java.util.function.IntPredicate c;

    public /* synthetic */ f(java.util.function.IntPredicate intPredicate, java.util.function.IntPredicate intPredicate2, byte b) {
        this.a = b;
        this.b = intPredicate;
        this.c = intPredicate2;
    }

    public final /* synthetic */ java.util.function.IntPredicate and(java.util.function.IntPredicate intPredicate) {
        switch (this.a) {
            case 0:
                break;
        }
        return j$.util.function.IntPredicate$CC.$default$and(this, intPredicate);
    }

    public final /* synthetic */ java.util.function.IntPredicate negate() {
        switch (this.a) {
            case 0:
                break;
        }
        return j$.util.function.IntPredicate$CC.$default$negate(this);
    }

    public final /* synthetic */ java.util.function.IntPredicate or(java.util.function.IntPredicate intPredicate) {
        switch (this.a) {
            case 0:
                break;
        }
        return j$.util.function.IntPredicate$CC.$default$or(this, intPredicate);
    }

    @Override // java.util.function.IntPredicate
    public final boolean test(int i) {
        byte b = this.a;
        java.util.function.IntPredicate intPredicate = this.c;
        java.util.function.IntPredicate intPredicate2 = this.b;
        switch (b) {
            case 0:
                return intPredicate2.test(i) || intPredicate.test(i);
            default:
                return intPredicate2.test(i) && intPredicate.test(i);
        }
    }
}
