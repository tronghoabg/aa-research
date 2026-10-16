package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ccr<E> implements java.util.Iterator<E>, defpackage.afhc {
    public int a;
    private java.lang.Object b;
    private final java.util.Map c;

    public ccr(java.lang.Object obj, java.util.Map map) {
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
            throw new java.util.NoSuchElementException();
        }
        E e = (E) this.b;
        this.a++;
        java.lang.Object obj = this.c.get(e);
        if (obj == null) {
            throw new java.util.ConcurrentModificationException(defpackage.a.bl(e, "Hash code of an element (", ") has changed after it was added to the persistent set."));
        }
        this.b = ((defpackage.bil) obj).b;
        return e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
