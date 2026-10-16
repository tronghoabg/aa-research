package j$.util.function;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements java.util.function.LongPredicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.util.function.LongPredicate b;
    public final /* synthetic */ java.util.function.LongPredicate c;

    public /* synthetic */ h(java.util.function.LongPredicate longPredicate, java.util.function.LongPredicate longPredicate2, byte b) {
        this.a = b;
        this.b = longPredicate;
        this.c = longPredicate2;
    }

    public final /* synthetic */ java.util.function.LongPredicate and(java.util.function.LongPredicate longPredicate) {
        switch (this.a) {
            case 0:
                break;
        }
        return j$.util.function.LongPredicate$CC.$default$and(this, longPredicate);
    }

    public final /* synthetic */ java.util.function.LongPredicate negate() {
        switch (this.a) {
            case 0:
                break;
        }
        return j$.util.function.LongPredicate$CC.$default$negate(this);
    }

    public final /* synthetic */ java.util.function.LongPredicate or(java.util.function.LongPredicate longPredicate) {
        switch (this.a) {
            case 0:
                break;
        }
        return j$.util.function.LongPredicate$CC.$default$or(this, longPredicate);
    }

    @Override // java.util.function.LongPredicate
    public final boolean test(long j) {
        byte b = this.a;
        java.util.function.LongPredicate longPredicate = this.c;
        java.util.function.LongPredicate longPredicate2 = this.b;
        switch (b) {
            case 0:
                return longPredicate2.test(j) || longPredicate.test(j);
            default:
                return longPredicate2.test(j) && longPredicate.test(j);
        }
    }
}
