package j$.util;

import java.util.RandomAccess;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public class DesugarCollections {
    public static <T> java.util.Collection<T> bridge_synchronizedCollection(java.util.Collection<T> collection, Object obj) {
        return new g(collection, obj);
    }

    public static <T> java.util.Set<T> bridge_synchronizedSet(java.util.Set<T> set, Object obj) {
        return new k(set, obj);
    }

    public static <T> java.util.List<T> synchronizedList(java.util.List<T> list) {
        return list instanceof RandomAccess ? new j(list) : new h(list);
    }

    public static <K, V> java.util.Map<K, V> synchronizedMap(java.util.Map<K, V> map) {
        return new i(map);
    }

    public static <T> java.util.Set<T> synchronizedSet(java.util.Set<T> set) {
        return new k(set);
    }

    public static <T> java.util.SortedSet<T> synchronizedSortedSet(java.util.SortedSet<T> sortedSet) {
        return new l(sortedSet);
    }

    public static <T> java.util.Collection<T> unmodifiableCollection(java.util.Collection<? extends T> collection) {
        return new n(collection);
    }

    public static <T> java.util.List<T> unmodifiableList(java.util.List<? extends T> list) {
        return list instanceof RandomAccess ? new u(list) : new p(list);
    }

    public static <K, V> java.util.Map<K, V> unmodifiableMap(java.util.Map<? extends K, ? extends V> map) {
        return new t(map);
    }

    public static <T> java.util.Set<T> unmodifiableSet(java.util.Set<? extends T> set) {
        return new v(set);
    }

    public static <T> java.util.SortedSet<T> unmodifiableSortedSet(java.util.SortedSet<T> sortedSet) {
        return new w(sortedSet);
    }
}
