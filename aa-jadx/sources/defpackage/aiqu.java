package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aiqu<T> implements java.util.Iterator<T>, defpackage.afhc {
    private final T element;
    private boolean hasNext = true;

    public aiqu(T t) {
        this.element = t;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!this.hasNext) {
            throw new java.util.NoSuchElementException();
        }
        this.hasNext = false;
        return this.element;
    }

    @Override // java.util.Iterator
    public java.lang.Void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
