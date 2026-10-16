package j$.lang;

/* JADX INFO: renamed from: j$.lang.Iterable$-EL, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Iterable$EL {
    public static void forEach(java.lang.Iterable iterable, java.util.function.Consumer consumer) {
        if (iterable instanceof j$.lang.a) {
            ((j$.lang.a) iterable).forEach(consumer);
            return;
        }
        if (!(iterable instanceof java.util.Collection)) {
            j$.lang.Iterable$CC.$default$forEach(iterable, consumer);
            return;
        }
        consumer.getClass();
        java.util.Iterator it = ((java.util.Collection) iterable).iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }
}
