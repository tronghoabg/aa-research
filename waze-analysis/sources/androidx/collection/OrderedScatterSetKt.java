package androidx.collection;

import h.g.b.x;
import java.util.Collection;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class OrderedScatterSetKt {
    private static final MutableOrderedScatterSet<Object> EmptyOrderedScatterSet = new MutableOrderedScatterSet<>(0);

    public static final <E> OrderedScatterSet<E> emptyOrderedScatterSet() {
        MutableOrderedScatterSet<Object> mutableOrderedScatterSet = EmptyOrderedScatterSet;
        x.d(mutableOrderedScatterSet, "null cannot be cast to non-null type androidx.collection.OrderedScatterSet<E of androidx.collection.OrderedScatterSetKt.emptyOrderedScatterSet>");
        return mutableOrderedScatterSet;
    }

    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf(E e2, E e3, E e4) {
        MutableOrderedScatterSet<E> mutableOrderedScatterSet = new MutableOrderedScatterSet<>(3);
        mutableOrderedScatterSet.plusAssign((MutableOrderedScatterSet<E>) e2);
        mutableOrderedScatterSet.plusAssign((MutableOrderedScatterSet<E>) e3);
        mutableOrderedScatterSet.plusAssign((MutableOrderedScatterSet<E>) e4);
        return mutableOrderedScatterSet;
    }

    public static final <E> OrderedScatterSet<E> orderedScatterSetOf(E... eArr) {
        x.f(eArr, "elements");
        MutableOrderedScatterSet mutableOrderedScatterSet = new MutableOrderedScatterSet(eArr.length);
        mutableOrderedScatterSet.plusAssign((Object[]) eArr);
        return mutableOrderedScatterSet;
    }

    public static final <E> MutableOrderedScatterSet<E> toMutableOrderedScatterSet(Collection<? extends E> collection) {
        x.f(collection, "<this>");
        MutableOrderedScatterSet<E> mutableOrderedScatterSet = new MutableOrderedScatterSet<>(collection.size());
        mutableOrderedScatterSet.addAll(collection);
        return mutableOrderedScatterSet;
    }

    public static final <E> OrderedScatterSet<E> toOrderedScatterSet(OrderedScatterSet<E> orderedScatterSet) {
        x.f(orderedScatterSet, "<this>");
        return orderedScatterSet.isEmpty() ? emptyOrderedScatterSet() : toMutableOrderedScatterSet(orderedScatterSet);
    }

    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf(E e2) {
        MutableOrderedScatterSet<E> mutableOrderedScatterSet = new MutableOrderedScatterSet<>(1);
        mutableOrderedScatterSet.plusAssign((MutableOrderedScatterSet<E>) e2);
        return mutableOrderedScatterSet;
    }

    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf(E e2, E e3) {
        MutableOrderedScatterSet<E> mutableOrderedScatterSet = new MutableOrderedScatterSet<>(2);
        mutableOrderedScatterSet.plusAssign((MutableOrderedScatterSet<E>) e2);
        mutableOrderedScatterSet.plusAssign((MutableOrderedScatterSet<E>) e3);
        return mutableOrderedScatterSet;
    }

    public static final <E> OrderedScatterSet<E> orderedScatterSetOf(E e2) {
        return mutableOrderedScatterSetOf(e2);
    }

    public static final <E> OrderedScatterSet<E> orderedScatterSetOf(E e2, E e3) {
        return mutableOrderedScatterSetOf(e2, e3);
    }

    public static final <E> OrderedScatterSet<E> orderedScatterSetOf(E e2, E e3, E e4) {
        return mutableOrderedScatterSetOf(e2, e3, e4);
    }

    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf() {
        return new MutableOrderedScatterSet<>(0, 1, null);
    }

    public static final <E> OrderedScatterSet<E> orderedScatterSetOf() {
        MutableOrderedScatterSet<Object> mutableOrderedScatterSet = EmptyOrderedScatterSet;
        x.d(mutableOrderedScatterSet, "null cannot be cast to non-null type androidx.collection.OrderedScatterSet<E of androidx.collection.OrderedScatterSetKt.orderedScatterSetOf>");
        return mutableOrderedScatterSet;
    }

    public static final <E> MutableOrderedScatterSet<E> toMutableOrderedScatterSet(OrderedScatterSet<E> orderedScatterSet) {
        x.f(orderedScatterSet, "<this>");
        MutableOrderedScatterSet<E> mutableOrderedScatterSet = new MutableOrderedScatterSet<>(orderedScatterSet.getSize());
        mutableOrderedScatterSet.addAll(orderedScatterSet);
        return mutableOrderedScatterSet;
    }

    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf(E... eArr) {
        x.f(eArr, "elements");
        MutableOrderedScatterSet<E> mutableOrderedScatterSet = new MutableOrderedScatterSet<>(eArr.length);
        mutableOrderedScatterSet.plusAssign((Object[]) eArr);
        return mutableOrderedScatterSet;
    }

    public static final <E> OrderedScatterSet<E> toOrderedScatterSet(Collection<? extends E> collection) {
        x.f(collection, "<this>");
        return collection.isEmpty() ? emptyOrderedScatterSet() : toMutableOrderedScatterSet(collection);
    }
}
