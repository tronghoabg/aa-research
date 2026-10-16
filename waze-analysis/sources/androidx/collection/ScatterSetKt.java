package androidx.collection;

import h.g.b.x;
import java.util.Collection;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ScatterSetKt {
    private static final MutableScatterSet<Object> EmptyScatterSet = new MutableScatterSet<>(0);

    public static final <E> ScatterSet<E> emptyScatterSet() {
        MutableScatterSet<Object> mutableScatterSet = EmptyScatterSet;
        x.d(mutableScatterSet, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        return mutableScatterSet;
    }

    public static final <E> MutableScatterSet<E> mutableScatterSetOf(E e2, E e3, E e4) {
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(3);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e2);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e3);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e4);
        return mutableScatterSet;
    }

    public static final <E> ScatterSet<E> scatterSetOf(E... eArr) {
        x.f(eArr, "elements");
        MutableScatterSet mutableScatterSet = new MutableScatterSet(eArr.length);
        mutableScatterSet.plusAssign((Object[]) eArr);
        return mutableScatterSet;
    }

    public static final <E> MutableScatterSet<E> toMutableScatterSet(Collection<? extends E> collection) {
        x.f(collection, "<this>");
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(collection.size());
        mutableScatterSet.addAll(collection);
        return mutableScatterSet;
    }

    public static final <E> ScatterSet<E> toScatterSet(ScatterSet<E> scatterSet) {
        x.f(scatterSet, "<this>");
        return scatterSet.isEmpty() ? emptyScatterSet() : toMutableScatterSet(scatterSet);
    }

    public static final <E> MutableScatterSet<E> mutableScatterSetOf(E e2) {
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(1);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e2);
        return mutableScatterSet;
    }

    public static final <E> MutableScatterSet<E> mutableScatterSetOf(E e2, E e3) {
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(2);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e2);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e3);
        return mutableScatterSet;
    }

    public static final <E> ScatterSet<E> scatterSetOf(E e2) {
        return mutableScatterSetOf(e2);
    }

    public static final <E> ScatterSet<E> scatterSetOf(E e2, E e3) {
        return mutableScatterSetOf(e2, e3);
    }

    public static final <E> ScatterSet<E> scatterSetOf(E e2, E e3, E e4) {
        return mutableScatterSetOf(e2, e3, e4);
    }

    public static final <E> MutableScatterSet<E> mutableScatterSetOf() {
        return new MutableScatterSet<>(0, 1, null);
    }

    public static final <E> ScatterSet<E> scatterSetOf() {
        MutableScatterSet<Object> mutableScatterSet = EmptyScatterSet;
        x.d(mutableScatterSet, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.scatterSetOf>");
        return mutableScatterSet;
    }

    public static final <E> MutableScatterSet<E> toMutableScatterSet(ScatterSet<E> scatterSet) {
        x.f(scatterSet, "<this>");
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(scatterSet.getSize());
        mutableScatterSet.addAll(scatterSet);
        return mutableScatterSet;
    }

    public static final <E> MutableScatterSet<E> mutableScatterSetOf(E... eArr) {
        x.f(eArr, "elements");
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(eArr.length);
        mutableScatterSet.plusAssign((Object[]) eArr);
        return mutableScatterSet;
    }

    public static final <E> ScatterSet<E> toScatterSet(Collection<? extends E> collection) {
        x.f(collection, "<this>");
        return collection.isEmpty() ? emptyScatterSet() : toMutableScatterSet(collection);
    }
}
