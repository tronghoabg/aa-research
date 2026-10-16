package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class yjp<T> extends java.util.AbstractList<T> {
    public final java.util.List a;

    public yjp(java.util.List list) {
        list.getClass();
        this.a = list;
    }

    private final int b(int i) {
        int size = size();
        defpackage.ysr.bs(i, size);
        return (size - 1) - i;
    }

    public final int a(int i) {
        int size = size();
        defpackage.ysr.bt(i, size);
        return size - i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, T t) {
        this.a.add(a(i), t);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return (T) this.a.get(b(i));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator<T> listIterator(int i) {
        return new defpackage.yjo(this, this.a.listIterator(a(i)));
    }

    @Override // java.util.AbstractList, java.util.List
    public final T remove(int i) {
        return (T) this.a.remove(b(i));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        subList(i, i2).clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final T set(int i, T t) {
        return (T) this.a.set(b(i), t);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List subList(int i, int i2) {
        defpackage.ysr.bi(i, i2, size());
        return defpackage.ysr.U(this.a.subList(a(i2), a(i)));
    }
}
