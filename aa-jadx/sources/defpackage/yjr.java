package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yjr<F, T> extends java.util.AbstractList<T> implements java.util.RandomAccess, java.io.Serializable {
    private static final long serialVersionUID = 0;
    final java.util.List a;
    final defpackage.xyd b;

    public yjr(java.util.List list, defpackage.xyd xydVar) {
        list.getClass();
        this.a = list;
        this.b = xydVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return (T) this.b.a(this.a.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator<T> listIterator(int i) {
        return new defpackage.yjq(this, this.a.listIterator(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final T remove(int i) {
        return (T) this.b.a(this.a.remove(i));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        this.a.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
