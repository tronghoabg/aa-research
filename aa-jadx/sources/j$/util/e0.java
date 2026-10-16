package j$.util;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public interface e0 extends j$.util.Spliterator.OfPrimitive {
    void forEachRemaining(java.util.function.DoubleConsumer doubleConsumer);

    boolean tryAdvance(java.util.function.DoubleConsumer doubleConsumer);

    @Override // j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
    j$.util.e0 trySplit();
}
