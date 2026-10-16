package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class abqm<E> implements Iterator<E>, afgc {
    private final /* synthetic */ Iterator a;

    public abqm(Iterator it) {
        it.getClass();
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final E next() {
        return (E) this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
