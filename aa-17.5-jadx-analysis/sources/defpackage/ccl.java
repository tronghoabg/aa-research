package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class ccl<E> implements Iterator<E>, afgc {
    public int a;
    private Object b;
    private final Map c;

    public ccl(Object obj, Map map) {
        this.b = obj;
        this.c = map;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.c.size();
    }

    @Override // java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E e = (E) this.b;
        this.a++;
        Object obj = this.c.get(e);
        if (obj == null) {
            throw new ConcurrentModificationException(a.bm(e, "Hash code of an element (", ") has changed after it was added to the persistent set."));
        }
        this.b = ((bii) obj).b;
        return e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
