package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class tcl<T> implements Iterator<T>, afgc {
    private final Iterator a;

    public tcl(Iterator it) {
        it.getClass();
        this.a = it;
    }

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        return (T) this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
        a();
    }
}
