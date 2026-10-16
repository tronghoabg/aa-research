package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class yfi<E> extends defpackage.yfr implements java.util.Collection<E> {
    protected yfi() {
    }

    protected abstract java.util.Collection a();

    public boolean add(E e) {
        return a().add(e);
    }

    public boolean addAll(java.util.Collection<? extends E> collection) {
        return a().addAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        a().clear();
    }

    @Override // java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return a().contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        return a().containsAll(collection);
    }

    public final boolean e(java.lang.Object obj) {
        return defpackage.ysr.ae(iterator(), obj);
    }

    protected final java.lang.Object[] f() {
        return toArray(new java.lang.Object[size()]);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
        return a().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object obj) {
        return a().remove(obj);
    }

    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        return a().removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        return a().retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return a().size();
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
        return a().toArray();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) a().toArray(tArr);
    }
}
