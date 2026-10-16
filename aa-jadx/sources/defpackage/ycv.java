package defpackage;

/* JADX INFO: loaded from: classes3.dex */
abstract class ycv<T> implements java.util.Iterator<T> {
    int b;
    int c = -1;
    int d;
    final /* synthetic */ defpackage.ycw e;

    public ycv(defpackage.ycw ycwVar) {
        this.e = ycwVar;
        this.b = ycwVar.a.a();
        this.d = ycwVar.a.d;
    }

    private final void b() {
        if (this.e.a.d != this.d) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public abstract java.lang.Object a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        b();
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
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
        defpackage.ysr.bk(this.c != -1, "no calls to next() since the last call to remove()");
        defpackage.ycw ycwVar = this.e;
        ycwVar.b -= (long) ycwVar.a.h(this.c);
        this.b--;
        this.c = -1;
        this.d = ycwVar.a.d;
    }
}
