package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class abrp<E> implements java.util.Iterator<E>, defpackage.afhc {
    private final /* synthetic */ java.util.Iterator a;

    public abrp(java.util.Iterator it) {
        it.getClass();
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final E next() {
        return (E) this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
