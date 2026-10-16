package defpackage;

import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.io.Serializable;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
class aetx<K> implements Serializable, Collection<K>, aetv {
    private static final long serialVersionUID = -7046029254386353129L;
    protected final aetv a;

    protected aetx(aetv aetvVar) {
        aetvVar.getClass();
        this.a = aetvVar;
    }

    @Override // java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public final aety iterator() {
        return new aeud(this.a.iterator());
    }

    @Override // java.util.Collection
    public final boolean add(K k) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection<? extends K> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Collection, java.lang.Iterable, j$.lang.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aeus spliterator() {
        return this.a.spliterator();
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        return this.a.containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return this.a.equals(obj);
    }

    @Override // j$.util.Collection, j$.lang.a
    public final void forEach(Consumer<? super K> consumer) {
        Iterable$EL.forEach(this.a, consumer);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // j$.util.Collection
    public final Stream<K> parallelStream() {
        return Collection.EL.parallelStream(this.a);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Collection
    public final boolean removeIf(Predicate<? super K> predicate) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // j$.util.Collection
    public final Stream<K> stream() {
        return Collection.EL.stream(this.a);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.a.toArray();
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.a.toArray(tArr);
    }
}
