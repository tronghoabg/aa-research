package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class aipo<T> implements Iterator<T> {
    private static final aipo INSTANCE = new aipo();

    private aipo() {
    }

    public static <T> aipo<T> getInstance() {
        return INSTANCE;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new IllegalStateException();
    }
}
