package j$.util.function;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements java.util.function.LongUnaryOperator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.util.function.LongUnaryOperator b;
    public final /* synthetic */ java.util.function.LongUnaryOperator c;

    public /* synthetic */ i(java.util.function.LongUnaryOperator longUnaryOperator, java.util.function.LongUnaryOperator longUnaryOperator2, byte b) {
        this.a = b;
        this.b = longUnaryOperator;
        this.c = longUnaryOperator2;
    }

    public final /* synthetic */ java.util.function.LongUnaryOperator andThen(java.util.function.LongUnaryOperator longUnaryOperator) {
        switch (this.a) {
            case 0:
                break;
        }
        return j$.util.function.LongUnaryOperator$CC.$default$andThen(this, longUnaryOperator);
    }

    @Override // java.util.function.LongUnaryOperator
    public final long applyAsLong(long j) {
        byte b = this.a;
        java.util.function.LongUnaryOperator longUnaryOperator = this.c;
        java.util.function.LongUnaryOperator longUnaryOperator2 = this.b;
        switch (b) {
            case 0:
                return longUnaryOperator.applyAsLong(longUnaryOperator2.applyAsLong(j));
            default:
                return longUnaryOperator2.applyAsLong(longUnaryOperator.applyAsLong(j));
        }
    }

    public final /* synthetic */ java.util.function.LongUnaryOperator compose(java.util.function.LongUnaryOperator longUnaryOperator) {
        switch (this.a) {
            case 0:
                break;
        }
        return j$.util.function.LongUnaryOperator$CC.$default$compose(this, longUnaryOperator);
    }
}
