package java.util.function;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public interface Consumer<T> {
    void accept(T t);

    java.util.function.Consumer<T> andThen(java.util.function.Consumer<? super T> consumer);
}
