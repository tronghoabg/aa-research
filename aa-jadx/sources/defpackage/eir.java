package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class eir implements java.util.Iterator {
    final /* synthetic */ defpackage.eix a;
    private int b = 0;
    private final int c;

    public eir(defpackage.eix eixVar) {
        this.a = eixVar;
        this.c = eixVar.c();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        int i = this.b;
        if (i >= this.c) {
            throw new java.util.NoSuchElementException();
        }
        this.b = i + 1;
        return java.lang.Byte.valueOf(this.a.b(i));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
