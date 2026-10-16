package j$.util.concurrent.atomic;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public class DesugarAtomicLong {
    public static long accumulateAndGet(java.util.concurrent.atomic.AtomicLong atomicLong, long j, java.util.function.LongBinaryOperator longBinaryOperator) {
        long j2;
        long jApplyAsLong;
        do {
            j2 = atomicLong.get();
            jApplyAsLong = longBinaryOperator.applyAsLong(j2, j);
        } while (!atomicLong.compareAndSet(j2, jApplyAsLong));
        return jApplyAsLong;
    }

    public static long updateAndGet(java.util.concurrent.atomic.AtomicLong atomicLong, java.util.function.LongUnaryOperator longUnaryOperator) {
        long j;
        long jApplyAsLong;
        do {
            j = atomicLong.get();
            jApplyAsLong = longUnaryOperator.applyAsLong(j);
        } while (!atomicLong.compareAndSet(j, jApplyAsLong));
        return jApplyAsLong;
    }
}
