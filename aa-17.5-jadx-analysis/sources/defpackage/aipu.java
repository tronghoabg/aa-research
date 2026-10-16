package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class aipu<T> implements Iterator<T>, afgc {
    private final T element;
    private boolean hasNext = true;

    public aipu(T t) {
        this.element = t;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!this.hasNext) {
            throw new NoSuchElementException();
        }
        this.hasNext = false;
        return this.element;
    }

    @Override // java.util.Iterator
    public Void remove() {
        throw new UnsupportedOperationException();
    }
}
