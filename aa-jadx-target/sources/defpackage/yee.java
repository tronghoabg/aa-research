package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class yee implements java.util.Iterator {
    int a;
    int b;
    int c = -1;
    final /* synthetic */ defpackage.yef d;

    public yee(defpackage.yef yefVar) {
        this.d = yefVar;
        this.a = yefVar.b;
        this.b = yefVar.a();
    }

    private final void a() {
        if (this.d.b != this.a) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        a();
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i = this.b;
        this.c = i;
        defpackage.yef yefVar = this.d;
        java.lang.Object objC = yefVar.c(i);
        this.b = yefVar.b(this.b);
        return objC;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        defpackage.ysr.bk(this.c >= 0, "no calls to next() since the last call to remove()");
        this.a += 32;
        int i = this.c;
        defpackage.yef yefVar = this.d;
        yefVar.remove(yefVar.c(i));
        this.b--;
        this.c = -1;
    }
}
