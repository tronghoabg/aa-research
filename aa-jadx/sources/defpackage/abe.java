package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class abe implements java.util.Iterator, defpackage.afhc {
    final /* synthetic */ defpackage.abb a;
    private int b;

    public abe(defpackage.abb abbVar) {
        this.a = abbVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.c();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i = this.b;
        this.b = i + 1;
        return this.a.e(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
