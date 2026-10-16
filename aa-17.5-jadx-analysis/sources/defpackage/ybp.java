package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
abstract class ybp<T> implements Iterator<T> {
    int b;
    int c = -1;
    int d;
    final /* synthetic */ ybq e;

    public ybp(ybq ybqVar) {
        this.e = ybqVar;
        this.b = ybqVar.a.a();
        this.d = ybqVar.a.d;
    }

    private final void b() {
        if (this.e.a.d != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        b();
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T t = (T) a(this.b);
        int i = this.b;
        this.c = i;
        this.b = this.e.a.f(i);
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        b();
        woy.aa(this.c != -1, "no calls to next() since the last call to remove()");
        ybq ybqVar = this.e;
        ybqVar.b -= ybqVar.a.h(this.c);
        this.b--;
        this.c = -1;
        this.d = ybqVar.a.d;
    }
}
