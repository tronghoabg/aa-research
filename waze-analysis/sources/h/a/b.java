package h.a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class b<T> implements Iterator<T>, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    private int f48000a;

    /* renamed from: b, reason: collision with root package name */
    private Object f48001b;

    private final boolean d() {
        this.f48000a = 3;
        a();
        return this.f48000a == 1;
    }

    protected abstract void a();

    protected final void b() {
        this.f48000a = 2;
    }

    protected final void c(Object obj) {
        this.f48001b = obj;
        this.f48000a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f48000a;
        if (i2 == 0) {
            return d();
        }
        if (i2 == 1) {
            return true;
        }
        if (i2 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final T next() {
        int i2 = this.f48000a;
        if (i2 != 1 && (i2 == 2 || !d())) {
            throw new NoSuchElementException();
        }
        this.f48000a = 0;
        return (T) this.f48001b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
