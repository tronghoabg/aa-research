package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class yht<E> implements Iterator {
    private final Iterator a;
    private boolean b;
    private Object c;

    public yht(Iterator it) {
        it.getClass();
        this.a = it;
    }

    public final Object a() {
        if (!this.b) {
            this.c = this.a.next();
            this.b = true;
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final E next() {
        if (!this.b) {
            return (E) this.a.next();
        }
        E e = (E) this.c;
        this.b = false;
        this.c = null;
        return e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        woy.aa(!this.b, "Can't remove after you've peeked at next");
        this.a.remove();
    }
}
