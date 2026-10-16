package j$.util.function;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements java.util.function.DoubleUnaryOperator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.util.function.DoubleUnaryOperator b;
    public final /* synthetic */ java.util.function.DoubleUnaryOperator c;

    public /* synthetic */ c(java.util.function.DoubleUnaryOperator doubleUnaryOperator, java.util.function.DoubleUnaryOperator doubleUnaryOperator2, byte b) {
        this.a = b;
        this.b = doubleUnaryOperator;
        this.c = doubleUnaryOperator2;
    }

    public final /* synthetic */ java.util.function.DoubleUnaryOperator andThen(java.util.function.DoubleUnaryOperator doubleUnaryOperator) {
        switch (this.a) {
            case 0:
                break;
        }
        return j$.util.function.DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator);
    }

    @Override // java.util.function.DoubleUnaryOperator
    public final double applyAsDouble(double d) {
        byte b = this.a;
        java.util.function.DoubleUnaryOperator doubleUnaryOperator = this.c;
        java.util.function.DoubleUnaryOperator doubleUnaryOperator2 = this.b;
        switch (b) {
            case 0:
                return doubleUnaryOperator2.applyAsDouble(doubleUnaryOperator.applyAsDouble(d));
            default:
                return doubleUnaryOperator.applyAsDouble(doubleUnaryOperator2.applyAsDouble(d));
        }
    }

    public final /* synthetic */ java.util.function.DoubleUnaryOperator compose(java.util.function.DoubleUnaryOperator doubleUnaryOperator) {
        switch (this.a) {
            case 0:
                break;
        }
        return j$.util.function.DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator);
    }
}
