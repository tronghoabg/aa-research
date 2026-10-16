package j$.util;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public interface PrimitiveIterator<T, T_CONS> extends java.util.Iterator<T> {
    void forEachRemaining(T_CONS t_cons);

    /* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
    public interface OfInt extends PrimitiveIterator<Integer, IntConsumer> {
        @Override // java.util.Iterator
        void forEachRemaining(Consumer<? super Integer> consumer);

        void forEachRemaining(IntConsumer intConsumer);

        @Override // java.util.Iterator
        Integer next();

        int nextInt();

        /* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
        /* renamed from: j$.util.PrimitiveIterator$OfInt$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$forEachRemaining(OfInt ofInt, IntConsumer intConsumer) {
                intConsumer.getClass();
                while (ofInt.hasNext()) {
                    intConsumer.accept(ofInt.nextInt());
                }
            }
        }
    }

    /* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
    public interface OfLong extends PrimitiveIterator<Long, LongConsumer> {
        @Override // java.util.Iterator
        void forEachRemaining(Consumer<? super Long> consumer);

        void forEachRemaining(LongConsumer longConsumer);

        @Override // java.util.Iterator
        Long next();

        long nextLong();

        /* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
        /* renamed from: j$.util.PrimitiveIterator$OfLong$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$forEachRemaining(OfLong ofLong, LongConsumer longConsumer) {
                longConsumer.getClass();
                while (ofLong.hasNext()) {
                    longConsumer.accept(ofLong.nextLong());
                }
            }
        }
    }
}
