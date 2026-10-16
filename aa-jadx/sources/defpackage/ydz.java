package defpackage;

/* JADX INFO: loaded from: classes.dex */
abstract class ydz<T> implements java.util.Iterator<T> {
    int b;
    int c;
    int d = -1;
    final /* synthetic */ defpackage.yed e;

    public ydz(defpackage.yed yedVar) {
        this.e = yedVar;
        this.b = yedVar.e;
        this.c = yedVar.c();
    }

    private final void b() {
        if (this.e.e != this.b) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public abstract java.lang.Object a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c >= 0;
    }

    @Override // java.util.Iterator
    public final T next() {
        b();
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
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
        defpackage.ysr.bk(this.d >= 0, "no calls to next() since the last call to remove()");
        this.b += 32;
        int i = this.d;
        defpackage.yed yedVar = this.e;
        yedVar.remove(yedVar.g(i));
        this.c = yedVar.a(this.c, this.d);
        this.d = -1;
    }
}
