package j$.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;

/* loaded from: classes2.dex */
public class DesugarAtomicReference {
    /* JADX WARN: Multi-variable type inference failed */
    public static <V> V getAndUpdate(AtomicReference<V> atomicReference, UnaryOperator<V> unaryOperator) {
        while (true) {
            V v2 = atomicReference.get();
            T tApply = unaryOperator.apply(v2);
            while (!atomicReference.compareAndSet(v2, tApply)) {
                if (atomicReference.get() != v2) {
                    break;
                }
            }
            return v2;
        }
    }
}
