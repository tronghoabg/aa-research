package j$.util.concurrent.atomic;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public class DesugarAtomicReference {
    /* JADX WARN: Multi-variable type inference failed */
    public static <V> V getAndUpdate(java.util.concurrent.atomic.AtomicReference<V> atomicReference, java.util.function.UnaryOperator<V> unaryOperator) {
        while (true) {
            V v = atomicReference.get();
            T tApply = unaryOperator.apply(v);
            while (!atomicReference.compareAndSet(v, tApply)) {
                if (atomicReference.get() != v) {
                }
            }
            return v;
        }
    }
}
