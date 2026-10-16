package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class yee<T> extends yel implements Iterator<T> {
    protected yee() {
    }

    protected abstract Iterator a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return a().hasNext();
    }

    public T next() {
        return (T) a().next();
    }

    public void remove() {
        a().remove();
    }
}
