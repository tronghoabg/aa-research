package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class aina<T> implements Iterable<T>, afgc {
    private aina() {
    }

    public abstract T get(int i);

    public abstract int getSize();

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract void set(int i, T t);

    public /* synthetic */ aina(afeu afeuVar) {
        this();
    }
}
