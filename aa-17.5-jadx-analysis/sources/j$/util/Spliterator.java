package j$.util;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public interface Spliterator<T> {

    /* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
    /* renamed from: j$.util.Spliterator$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$forEachRemaining(Spliterator spliterator, Consumer consumer) {
            while (spliterator.tryAdvance(consumer)) {
            }
        }

        public static java.util.Comparator $default$getComparator(Spliterator spliterator) {
            throw new IllegalStateException();
        }

        public static long $default$getExactSizeIfKnown(Spliterator spliterator) {
            if ((spliterator.characteristics() & 64) == 0) {
                return -1L;
            }
            return spliterator.estimateSize();
        }

        public static boolean $default$hasCharacteristics(Spliterator spliterator, int i) {
            return (spliterator.characteristics() & i) == i;
        }
    }

    /* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
    public interface OfPrimitive<T, T_CONS, T_SPLITR extends OfPrimitive<T, T_CONS, T_SPLITR>> extends Spliterator<T> {

        /* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
        /* renamed from: j$.util.Spliterator$OfPrimitive$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$forEachRemaining(OfPrimitive ofPrimitive, Object obj) {
                while (ofPrimitive.tryAdvance((OfPrimitive) obj)) {
                }
            }
        }

        void forEachRemaining(T_CONS t_cons);

        boolean tryAdvance(T_CONS t_cons);

        @Override // j$.util.Spliterator
        T_SPLITR trySplit();
    }

    int characteristics();

    long estimateSize();

    void forEachRemaining(Consumer<? super T> consumer);

    java.util.Comparator<? super T> getComparator();

    long getExactSizeIfKnown();

    boolean hasCharacteristics(int i);

    boolean tryAdvance(Consumer<? super T> consumer);

    Spliterator<T> trySplit();

    /* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
    public interface OfInt extends OfPrimitive<Integer, IntConsumer, OfInt> {
        @Override // j$.util.Spliterator
        void forEachRemaining(Consumer<? super Integer> consumer);

        void forEachRemaining(IntConsumer intConsumer);

        @Override // j$.util.Spliterator
        boolean tryAdvance(Consumer<? super Integer> consumer);

        boolean tryAdvance(IntConsumer intConsumer);

        @Override // j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
        OfInt trySplit();

        /* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
        /* renamed from: j$.util.Spliterator$OfInt$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$forEachRemaining(OfInt ofInt, IntConsumer intConsumer) {
                while (ofInt.tryAdvance(intConsumer)) {
                }
            }

            public static void a(OfInt ofInt, Consumer consumer) {
                if (consumer instanceof IntConsumer) {
                    ofInt.forEachRemaining((IntConsumer) consumer);
                } else {
                    if (a1.a) {
                        a1.a(ofInt.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                        throw null;
                    }
                    consumer.getClass();
                    ofInt.forEachRemaining((IntConsumer) new z(consumer, (byte) 0));
                }
            }

            public static boolean b(OfInt ofInt, Consumer consumer) {
                if (consumer instanceof IntConsumer) {
                    return ofInt.tryAdvance((IntConsumer) consumer);
                }
                if (a1.a) {
                    a1.a(ofInt.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
                    throw null;
                }
                consumer.getClass();
                return ofInt.tryAdvance((IntConsumer) new z(consumer, (byte) 0));
            }
        }
    }

    /* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
    public interface OfLong extends OfPrimitive<Long, LongConsumer, OfLong> {
        @Override // j$.util.Spliterator
        void forEachRemaining(Consumer<? super Long> consumer);

        void forEachRemaining(LongConsumer longConsumer);

        @Override // j$.util.Spliterator
        boolean tryAdvance(Consumer<? super Long> consumer);

        boolean tryAdvance(LongConsumer longConsumer);

        @Override // j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
        OfLong trySplit();

        /* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
        /* renamed from: j$.util.Spliterator$OfLong$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$forEachRemaining(OfLong ofLong, LongConsumer longConsumer) {
                while (ofLong.tryAdvance(longConsumer)) {
                }
            }

            public static void a(OfLong ofLong, Consumer consumer) {
                if (consumer instanceof LongConsumer) {
                    ofLong.forEachRemaining((LongConsumer) consumer);
                } else {
                    if (a1.a) {
                        a1.a(ofLong.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                        throw null;
                    }
                    consumer.getClass();
                    ofLong.forEachRemaining((LongConsumer) new a0(consumer, (byte) 0));
                }
            }

            public static boolean b(OfLong ofLong, Consumer consumer) {
                if (consumer instanceof LongConsumer) {
                    return ofLong.tryAdvance((LongConsumer) consumer);
                }
                if (a1.a) {
                    a1.a(ofLong.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
                    throw null;
                }
                consumer.getClass();
                return ofLong.tryAdvance((LongConsumer) new a0(consumer, (byte) 0));
            }
        }
    }
}
