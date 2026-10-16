package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class cww implements java.util.ListIterator, defpackage.afhc {
    final /* synthetic */ defpackage.cwy a;
    private int b;
    private final int c;
    private final int d;

    public /* synthetic */ cww(defpackage.cwy cwyVar, int i, int i2) {
        this(cwyVar, 1 == (i2 & 1) ? 0 : i, 0, cwyVar.a());
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.d;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > this.c;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        int i = this.b;
        this.b = i + 1;
        java.lang.Object objC = this.a.b.c(i);
        objC.getClass();
        return (defpackage.cge) objC;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b - this.c;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ java.lang.Object previous() {
        int i = this.b - 1;
        this.b = i;
        java.lang.Object objC = this.a.b.c(i);
        objC.getClass();
        return (defpackage.cge) objC;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return (this.b - this.c) - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public cww(defpackage.cwy cwyVar, int i, int i2, int i3) {
        this.a = cwyVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}
