package j$.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public class DesugarAtomicLong {
    public static long accumulateAndGet(AtomicLong atomicLong, long j, LongBinaryOperator longBinaryOperator) {
        long j2;
        long jApplyAsLong;
        do {
            j2 = atomicLong.get();
            jApplyAsLong = longBinaryOperator.applyAsLong(j2, j);
        } while (!atomicLong.compareAndSet(j2, jApplyAsLong));
        return jApplyAsLong;
    }

    public static long updateAndGet(AtomicLong atomicLong, LongUnaryOperator longUnaryOperator) {
        long j;
        long jApplyAsLong;
        do {
            j = atomicLong.get();
            jApplyAsLong = longUnaryOperator.applyAsLong(j);
        } while (!atomicLong.compareAndSet(j, jApplyAsLong));
        return jApplyAsLong;
    }
}
