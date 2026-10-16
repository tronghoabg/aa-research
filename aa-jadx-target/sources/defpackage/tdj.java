package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class tdj<T> implements java.util.List<T>, defpackage.afhd, defpackage.afhc {
    public final java.util.List b;

    public tdj(java.util.List list) {
        list.getClass();
        this.b = list;
    }

    protected abstract void a();

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        boolean zAdd = this.b.add(t);
        a();
        return zAdd;
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection<? extends T> collection) {
        collection.getClass();
        boolean zAddAll = this.b.addAll(i, collection);
        a();
        return zAddAll;
    }

    public final int b() {
        return this.b.size();
    }

    public final java.lang.Object c(int i) {
        java.lang.Object objRemove = this.b.remove(i);
        a();
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.b.clear();
        a();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.b.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        collection.getClass();
        return this.b.containsAll(collection);
    }

    @Override // java.util.List
    public final T get(int i) {
        return (T) this.b.get(i);
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        return this.b.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        return this.b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final java.util.ListIterator<T> listIterator(int i) {
        return new defpackage.tdk(this, this.b.listIterator(i));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        boolean zRemove = this.b.remove(obj);
        a();
        return zRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        boolean zRemoveAll = this.b.removeAll(collection);
        a();
        return zRemoveAll;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        boolean zRetainAll = this.b.retainAll(collection);
        a();
        return zRetainAll;
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        T t2 = (T) this.b.set(i, t);
        a();
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return b();
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        return new tdi(this, this.b.subList(i, i2));
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) defpackage.afft.b(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return defpackage.afft.a(this);
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        this.b.add(i, t);
        a();
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        return (T) c(i);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends T> collection) {
        collection.getClass();
        boolean zAddAll = this.b.addAll(collection);
        a();
        return zAddAll;
    }
}
