package j$.util;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public interface Iterator<E> {

    /* JADX INFO: renamed from: j$.util.Iterator$-EL, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
    public final /* synthetic */ class EL {
        public static void forEachRemaining(java.util.Iterator it, java.util.function.Consumer consumer) {
            if (it instanceof j$.util.Iterator) {
                ((j$.util.Iterator) it).forEachRemaining(consumer);
                return;
            }
            consumer.getClass();
            while (it.hasNext()) {
                consumer.accept(it.next());
            }
        }
    }

    void forEachRemaining(java.util.function.Consumer<? super E> consumer);
}
