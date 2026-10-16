package defpackage;

/* JADX INFO: loaded from: classes3.dex */
class aeux<K> implements java.io.Serializable, j$.util.Collection<K>, defpackage.aeuv {
    private static final long serialVersionUID = -7046029254386353129L;
    protected final defpackage.aeuv a;

    protected aeux(defpackage.aeuv aeuvVar) {
        aeuvVar.getClass();
        this.a = aeuvVar;
    }

    @Override // java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: a */
    public final defpackage.aeuy iterator() {
        return new defpackage.aevd(this.a.iterator());
    }

    @Override // java.util.Collection
    public final boolean add(K k) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection<? extends K> collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // j$.util.Collection, java.lang.Iterable, j$.lang.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.aevs spliterator() {
        return this.a.spliterator();
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        return this.a.containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        return this.a.equals(obj);
    }

    @Override // j$.util.Collection, j$.lang.a
    public final void forEach(java.util.function.Consumer<? super K> consumer) {
        j$.lang.Iterable$EL.forEach(this.a, consumer);
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
    public final j$.util.stream.Stream<K> parallelStream() {
        return j$.util.Collection.EL.parallelStream(this.a);
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // j$.util.Collection
    public final boolean removeIf(java.util.function.Predicate<? super K> predicate) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // j$.util.Collection
    public final j$.util.stream.Stream<K> stream() {
        return j$.util.Collection.EL.stream(this.a);
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        return this.a.toArray();
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }

    @Override // j$.util.Collection
    public final /* synthetic */ java.lang.Object[] toArray(java.util.function.IntFunction intFunction) {
        return toArray((java.lang.Object[]) intFunction.apply(0));
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.a.toArray(tArr);
    }
}
