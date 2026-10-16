package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ysu implements java.util.Iterator {
    final /* synthetic */ defpackage.ysv a;
    private int b = 0;

    public ysu(defpackage.ysv ysvVar) {
        this.a = ysvVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.size();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i = this.b;
        defpackage.ysv ysvVar = this.a;
        if (i >= ysvVar.size()) {
            throw new java.util.NoSuchElementException();
        }
        defpackage.ysw yswVar = ysvVar.b;
        java.lang.Object obj = yswVar.b[ysvVar.b() + i];
        this.b = i + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
