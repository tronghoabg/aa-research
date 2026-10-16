package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
abstract class ynm<F, T> implements Iterator<T> {
    final Iterator b;

    public ynm(Iterator it) {
        it.getClass();
        this.b = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return (T) a(this.b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.b.remove();
    }
}
