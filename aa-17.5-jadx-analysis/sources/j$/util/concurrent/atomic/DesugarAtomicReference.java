package j$.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public class DesugarAtomicReference {
    /* JADX WARN: Multi-variable type inference failed */
    public static <V> V getAndUpdate(AtomicReference<V> atomicReference, UnaryOperator<V> unaryOperator) {
        while (true) {
            V v = atomicReference.get();
            T tApply = unaryOperator.apply(v);
            while (!atomicReference.compareAndSet(v, tApply)) {
                if (atomicReference.get() != v) {
                    break;
                }
            }
            return v;
        }
    }
}
