package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class cbn<E> implements java.util.ListIterator<E>, defpackage.afhc {
    public int a;
    public int b;

    public cbn(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final void a() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public void add(E e) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
