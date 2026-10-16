package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class yrk implements java.util.Iterator {
    final /* synthetic */ defpackage.yrl a;
    private int b = 0;

    public yrk(defpackage.yrl yrlVar) {
        this.a = yrlVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.a.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        int i = this.b;
        this.b = i + 1;
        defpackage.yrn yrnVar = this.a.a;
        return yrnVar.e(yrnVar.a[i] & 31);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
