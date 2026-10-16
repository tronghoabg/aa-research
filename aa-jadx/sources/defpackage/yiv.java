package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class yiv implements java.util.Iterator {
    final /* synthetic */ int a;
    final /* synthetic */ java.util.Iterator b;
    private int c;

    public yiv(int i, java.util.Iterator it) {
        this.a = i;
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.a && this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.c++;
        return this.b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.b.remove();
    }
}
