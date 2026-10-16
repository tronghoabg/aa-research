package j$.util.function;

import java.util.function.DoubleUnaryOperator;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* renamed from: j$.util.function.DoubleUnaryOperator$-CC, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class DoubleUnaryOperator$CC {
    public static DoubleUnaryOperator $default$andThen(DoubleUnaryOperator doubleUnaryOperator, DoubleUnaryOperator doubleUnaryOperator2) {
        doubleUnaryOperator2.getClass();
        return new c(doubleUnaryOperator, doubleUnaryOperator2, (byte) 1);
    }

    public static DoubleUnaryOperator $default$compose(DoubleUnaryOperator doubleUnaryOperator, DoubleUnaryOperator doubleUnaryOperator2) {
        doubleUnaryOperator2.getClass();
        return new c(doubleUnaryOperator, doubleUnaryOperator2, (byte) 0);
    }
}
