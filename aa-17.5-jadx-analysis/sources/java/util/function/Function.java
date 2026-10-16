package java.util.function;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public interface Function<T, R> {
    /* renamed from: andThen */
    <V> Function<T, V> mo329andThen(Function<? super R, ? extends V> function);

    R apply(T t);
}
