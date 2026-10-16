package j$.util;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public interface Spliterator<T> {

    /* JADX INFO: renamed from: j$.util.Spliterator$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
    public final /* synthetic */ class CC {
        public static void $default$forEachRemaining(j$.util.Spliterator spliterator, java.util.function.Consumer consumer) {
            while (spliterator.tryAdvance(consumer)) {
            }
        }

        public static java.util.Comparator $default$getComparator(j$.util.Spliterator spliterator) {
            throw new java.lang.IllegalStateException();
        }

        public static long $default$getExactSizeIfKnown(j$.util.Spliterator spliterator) {
            if ((spliterator.characteristics() & 64) == 0) {
                return -1L;
            }
            return spliterator.estimateSize();
        }

        public static boolean $default$hasCharacteristics(j$.util.Spliterator spliterator, int i) {
            return (spliterator.characteristics() & i) == i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
    public interface OfPrimitive<T, T_CONS, T_SPLITR extends j$.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR>> extends j$.util.Spliterator<T> {

        /* JADX INFO: renamed from: j$.util.Spliterator$OfPrimitive$-CC, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
        public final /* synthetic */ class CC {
            public static void $default$forEachRemaining(j$.util.Spliterator.OfPrimitive ofPrimitive, java.lang.Object obj) {
                while (ofPrimitive.tryAdvance(obj)) {
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

    void forEachRemaining(java.util.function.Consumer<? super T> consumer);

    java.util.Comparator<? super T> getComparator();

    long getExactSizeIfKnown();

    boolean hasCharacteristics(int i);

    boolean tryAdvance(java.util.function.Consumer<? super T> consumer);

    j$.util.Spliterator<T> trySplit();

    /* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
    public interface OfInt extends j$.util.Spliterator.OfPrimitive<java.lang.Integer, java.util.function.IntConsumer, j$.util.Spliterator.OfInt> {
        @Override // j$.util.Spliterator
        void forEachRemaining(java.util.function.Consumer<? super java.lang.Integer> consumer);

        void forEachRemaining(java.util.function.IntConsumer intConsumer);

        @Override // j$.util.Spliterator
        boolean tryAdvance(java.util.function.Consumer<? super java.lang.Integer> consumer);

        boolean tryAdvance(java.util.function.IntConsumer intConsumer);

        @Override // j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
        j$.util.Spliterator.OfInt trySplit();

        /* JADX INFO: renamed from: j$.util.Spliterator$OfInt$-CC, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
        public final /* synthetic */ class CC {
            public static void $default$forEachRemaining(j$.util.Spliterator.OfInt ofInt, java.util.function.IntConsumer intConsumer) {
                while (ofInt.tryAdvance(intConsumer)) {
                }
            }

            public static void a(j$.util.Spliterator.OfInt ofInt, java.util.function.Consumer consumer) {
                if (consumer instanceof java.util.function.IntConsumer) {
                    ofInt.forEachRemaining((java.util.function.IntConsumer) consumer);
                } else {
                    if (j$.util.a1.a) {
                        j$.util.a1.a(ofInt.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                        throw null;
                    }
                    consumer.getClass();
                    ofInt.forEachRemaining((java.util.function.IntConsumer) new j$.util.z(consumer, (byte) 0));
                }
            }

            public static boolean b(j$.util.Spliterator.OfInt ofInt, java.util.function.Consumer consumer) {
                if (consumer instanceof java.util.function.IntConsumer) {
                    return ofInt.tryAdvance((java.util.function.IntConsumer) consumer);
                }
                if (j$.util.a1.a) {
                    j$.util.a1.a(ofInt.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
                    throw null;
                }
                consumer.getClass();
                return ofInt.tryAdvance((java.util.function.IntConsumer) new j$.util.z(consumer, (byte) 0));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
    public interface OfLong extends j$.util.Spliterator.OfPrimitive<java.lang.Long, java.util.function.LongConsumer, j$.util.Spliterator.OfLong> {
        @Override // j$.util.Spliterator
        void forEachRemaining(java.util.function.Consumer<? super java.lang.Long> consumer);

        void forEachRemaining(java.util.function.LongConsumer longConsumer);

        @Override // j$.util.Spliterator
        boolean tryAdvance(java.util.function.Consumer<? super java.lang.Long> consumer);

        boolean tryAdvance(java.util.function.LongConsumer longConsumer);

        @Override // j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
        j$.util.Spliterator.OfLong trySplit();

        /* JADX INFO: renamed from: j$.util.Spliterator$OfLong$-CC, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
        public final /* synthetic */ class CC {
            public static void $default$forEachRemaining(j$.util.Spliterator.OfLong ofLong, java.util.function.LongConsumer longConsumer) {
                while (ofLong.tryAdvance(longConsumer)) {
                }
            }

            public static void a(j$.util.Spliterator.OfLong ofLong, java.util.function.Consumer consumer) {
                if (consumer instanceof java.util.function.LongConsumer) {
                    ofLong.forEachRemaining((java.util.function.LongConsumer) consumer);
                } else {
                    if (j$.util.a1.a) {
                        j$.util.a1.a(ofLong.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                        throw null;
                    }
                    consumer.getClass();
                    ofLong.forEachRemaining((java.util.function.LongConsumer) new j$.util.a0(consumer, (byte) 0));
                }
            }

            public static boolean b(j$.util.Spliterator.OfLong ofLong, java.util.function.Consumer consumer) {
                if (consumer instanceof java.util.function.LongConsumer) {
                    return ofLong.tryAdvance((java.util.function.LongConsumer) consumer);
                }
                if (j$.util.a1.a) {
                    j$.util.a1.a(ofLong.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
                    throw null;
                }
                consumer.getClass();
                return ofLong.tryAdvance((java.util.function.LongConsumer) new j$.util.a0(consumer, (byte) 0));
            }
        }
    }
}
