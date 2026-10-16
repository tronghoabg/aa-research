package j$.util;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public interface PrimitiveIterator<T, T_CONS> extends java.util.Iterator<T> {
    void forEachRemaining(T_CONS t_cons);

    /* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
    public interface OfInt extends j$.util.PrimitiveIterator<java.lang.Integer, java.util.function.IntConsumer> {
        @Override // java.util.Iterator
        void forEachRemaining(java.util.function.Consumer<? super java.lang.Integer> consumer);

        void forEachRemaining(java.util.function.IntConsumer intConsumer);

        @Override // java.util.Iterator
        java.lang.Integer next();

        int nextInt();

        /* JADX INFO: renamed from: j$.util.PrimitiveIterator$OfInt$-CC, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
        public final /* synthetic */ class CC {
            public static void $default$forEachRemaining(j$.util.PrimitiveIterator.OfInt ofInt, java.util.function.IntConsumer intConsumer) {
                intConsumer.getClass();
                while (ofInt.hasNext()) {
                    intConsumer.accept(ofInt.nextInt());
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
    public interface OfLong extends j$.util.PrimitiveIterator<java.lang.Long, java.util.function.LongConsumer> {
        @Override // java.util.Iterator
        void forEachRemaining(java.util.function.Consumer<? super java.lang.Long> consumer);

        void forEachRemaining(java.util.function.LongConsumer longConsumer);

        @Override // java.util.Iterator
        java.lang.Long next();

        long nextLong();

        /* JADX INFO: renamed from: j$.util.PrimitiveIterator$OfLong$-CC, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
        public final /* synthetic */ class CC {
            public static void $default$forEachRemaining(j$.util.PrimitiveIterator.OfLong ofLong, java.util.function.LongConsumer longConsumer) {
                longConsumer.getClass();
                while (ofLong.hasNext()) {
                    longConsumer.accept(ofLong.nextLong());
                }
            }
        }
    }
}
