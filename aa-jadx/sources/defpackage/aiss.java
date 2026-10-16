package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aiss implements java.util.Iterator, defpackage.afhc {
    final /* synthetic */ java.lang.Object a;
    private boolean b = true;

    public aiss(java.lang.Object obj) {
        this.a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!this.b) {
            throw new java.util.NoSuchElementException();
        }
        this.b = false;
        return this.a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
