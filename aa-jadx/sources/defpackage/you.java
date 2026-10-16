package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class you<E> extends defpackage.yot<E> implements java.util.ListIterator<E> {
    private final int a;
    private int b;

    public you(int i, int i2) {
        defpackage.ysr.bt(i2, i);
        this.a = i;
        this.b = i2;
    }

    public abstract java.lang.Object a(int i);

    @Override // java.util.ListIterator
    @java.lang.Deprecated
    public final void add(E e) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i = this.b;
        this.b = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        int i = this.b - 1;
        this.b = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator
    @java.lang.Deprecated
    public final void set(E e) {
        throw new java.lang.UnsupportedOperationException();
    }
}
