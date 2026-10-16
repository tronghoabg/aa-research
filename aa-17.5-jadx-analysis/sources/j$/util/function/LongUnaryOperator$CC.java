package j$.util.function;

import java.util.function.LongUnaryOperator;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* renamed from: j$.util.function.LongUnaryOperator$-CC, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class LongUnaryOperator$CC {
    public static LongUnaryOperator $default$andThen(LongUnaryOperator longUnaryOperator, LongUnaryOperator longUnaryOperator2) {
        longUnaryOperator2.getClass();
        return new i(longUnaryOperator, longUnaryOperator2, (byte) 0);
    }

    public static LongUnaryOperator $default$compose(LongUnaryOperator longUnaryOperator, LongUnaryOperator longUnaryOperator2) {
        longUnaryOperator2.getClass();
        return new i(longUnaryOperator, longUnaryOperator2, (byte) 1);
    }
}
