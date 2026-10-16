package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aiqs<T> implements java.util.Iterator<T>, defpackage.afhc {
    private final java.util.Iterator<T> arrayIterator;

    public aiqs(T[] tArr) {
        tArr.getClass();
        this.arrayIterator = defpackage.affz.c(tArr);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.arrayIterator.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        return this.arrayIterator.next();
    }

    @Override // java.util.Iterator
    public java.lang.Void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
