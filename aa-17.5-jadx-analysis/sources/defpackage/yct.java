package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class yct<T> implements Iterator<T> {
    int b;
    int c;
    int d = -1;
    final /* synthetic */ ycx e;

    public yct(ycx ycxVar) {
        this.e = ycxVar;
        this.b = ycxVar.e;
        this.c = ycxVar.c();
    }

    private final void b() {
        if (this.e.e != this.b) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c >= 0;
    }

    @Override // java.util.Iterator
    public final T next() {
        b();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.c;
        this.d = i;
        T t = (T) a(i);
        this.c = this.e.d(this.c);
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        b();
        woy.aa(this.d >= 0, "no calls to next() since the last call to remove()");
        this.b += 32;
        int i = this.d;
        ycx ycxVar = this.e;
        ycxVar.remove(ycxVar.g(i));
        this.c = ycxVar.a(this.c, this.d);
        this.d = -1;
    }
}
