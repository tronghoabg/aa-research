package j$.util;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public class DesugarCollections {
    public static <T> java.util.Collection<T> bridge_synchronizedCollection(java.util.Collection<T> collection, java.lang.Object obj) {
        return new j$.util.g(collection, obj);
    }

    public static <T> java.util.Set<T> bridge_synchronizedSet(java.util.Set<T> set, java.lang.Object obj) {
        return new j$.util.k(set, obj);
    }

    public static <T> java.util.List<T> synchronizedList(java.util.List<T> list) {
        return list instanceof java.util.RandomAccess ? new j$.util.j(list) : new j$.util.h(list);
    }

    public static <K, V> java.util.Map<K, V> synchronizedMap(java.util.Map<K, V> map) {
        return new j$.util.i(map);
    }

    public static <T> java.util.Set<T> synchronizedSet(java.util.Set<T> set) {
        return new j$.util.k(set);
    }

    public static <T> java.util.SortedSet<T> synchronizedSortedSet(java.util.SortedSet<T> sortedSet) {
        return new j$.util.l(sortedSet);
    }

    public static <T> java.util.Collection<T> unmodifiableCollection(java.util.Collection<? extends T> collection) {
        return new j$.util.n(collection);
    }

    public static <T> java.util.List<T> unmodifiableList(java.util.List<? extends T> list) {
        return list instanceof java.util.RandomAccess ? new j$.util.u(list) : new j$.util.p(list);
    }

    public static <K, V> java.util.Map<K, V> unmodifiableMap(java.util.Map<? extends K, ? extends V> map) {
        return new j$.util.t(map);
    }

    public static <T> java.util.Set<T> unmodifiableSet(java.util.Set<? extends T> set) {
        return new j$.util.v(set);
    }

    public static <T> java.util.SortedSet<T> unmodifiableSortedSet(java.util.SortedSet<T> sortedSet) {
        return new j$.util.w(sortedSet);
    }
}
