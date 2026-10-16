package j$.util.function;

import java.util.function.DoubleUnaryOperator;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements DoubleUnaryOperator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ DoubleUnaryOperator b;
    public final /* synthetic */ DoubleUnaryOperator c;

    public /* synthetic */ c(DoubleUnaryOperator doubleUnaryOperator, DoubleUnaryOperator doubleUnaryOperator2, byte b) {
        this.a = b;
        this.b = doubleUnaryOperator;
        this.c = doubleUnaryOperator2;
    }

    public final /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator) {
        switch (this.a) {
        }
        return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator);
    }

    @Override // java.util.function.DoubleUnaryOperator
    public final double applyAsDouble(double d) {
        byte b = this.a;
        DoubleUnaryOperator doubleUnaryOperator = this.c;
        DoubleUnaryOperator doubleUnaryOperator2 = this.b;
        switch (b) {
            case 0:
                return doubleUnaryOperator2.applyAsDouble(doubleUnaryOperator.applyAsDouble(d));
            default:
                return doubleUnaryOperator.applyAsDouble(doubleUnaryOperator2.applyAsDouble(d));
        }
    }

    public final /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator) {
        switch (this.a) {
        }
        return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator);
    }
}
