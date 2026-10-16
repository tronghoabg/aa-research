package h.m;

import h.ab;
import h.g.b.x;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class i<T> extends j<T> implements Iterator<T>, h.c.e, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    private int f48184a;

    /* renamed from: b, reason: collision with root package name */
    private Object f48185b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator f48186c;

    /* renamed from: d, reason: collision with root package name */
    private h.c.e f48187d;

    private final Throwable d() {
        int i2 = this.f48184a;
        if (i2 == 4) {
            return new NoSuchElementException();
        }
        if (i2 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + i2);
    }

    @Override // h.m.j
    public final Object a(Object obj, h.c.e eVar) {
        this.f48185b = obj;
        this.f48184a = 3;
        this.f48187d = eVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        h.d.b.c(eVar);
        return aVar;
    }

    @Override // h.m.j
    public final Object b(Iterator it, h.c.e eVar) {
        if (!it.hasNext()) {
            return ab.f48028a;
        }
        this.f48186c = it;
        this.f48184a = 2;
        this.f48187d = eVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        h.d.b.c(eVar);
        return aVar;
    }

    public final void c(h.c.e eVar) {
        this.f48187d = eVar;
    }

    @Override // h.c.e
    public final h.c.j getContext() {
        return h.c.k.f48060a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws Throwable {
        while (true) {
            int i2 = this.f48184a;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2 || i2 == 3) {
                        return true;
                    }
                    if (i2 == 4) {
                        return false;
                    }
                    throw d();
                }
                Iterator it = this.f48186c;
                x.c(it);
                if (it.hasNext()) {
                    this.f48184a = 2;
                    return true;
                }
                this.f48186c = null;
            }
            this.f48184a = 5;
            h.c.e eVar = this.f48187d;
            x.c(eVar);
            this.f48187d = null;
            eVar.resumeWith(ab.f48028a);
        }
    }

    @Override // java.util.Iterator
    public final T next() throws Throwable {
        int i2 = this.f48184a;
        if (i2 == 0 || i2 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i2 == 2) {
            this.f48184a = 1;
            Iterator it = this.f48186c;
            x.c(it);
            return (T) it.next();
        }
        if (i2 != 3) {
            throw d();
        }
        this.f48184a = 0;
        T t = (T) this.f48185b;
        this.f48185b = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // h.c.e
    public final void resumeWith(Object obj) {
        e.b.c.b(obj);
        this.f48184a = 4;
    }
}
