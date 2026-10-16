package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class aips<T> implements Iterator<T>, afgc {
    private final Iterator<T> arrayIterator;

    public aips(T[] tArr) {
        tArr.getClass();
        this.arrayIterator = afez.d(tArr);
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
    public Void remove() {
        throw new UnsupportedOperationException();
    }
}
