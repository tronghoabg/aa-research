package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ygc implements java.util.Iterator {
    final /* synthetic */ defpackage.ygd a;
    private int b;
    private int c;
    private int d;
    private int e;

    public ygc(defpackage.ygd ygdVar) {
        this.a = ygdVar;
        defpackage.yge ygeVar = ygdVar.b;
        this.b = ygeVar.e;
        this.c = -1;
        this.d = ygeVar.d;
        this.e = ygeVar.c;
    }

    private final void a() {
        if (this.a.b.d != this.d) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.b != -2 && this.e > 0;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        defpackage.ygd ygdVar = this.a;
        java.lang.Object objA = ygdVar.a(this.b);
        int i = this.b;
        this.c = i;
        this.b = ygdVar.b.f[i];
        this.e--;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        defpackage.ysr.bk(this.c != -1, "no calls to next() since the last call to remove()");
        int i = this.c;
        defpackage.yge ygeVar = this.a.b;
        ygeVar.g(i, defpackage.ysr.aA(ygeVar.a[i]));
        if (this.b == ygeVar.c) {
            this.b = this.c;
        }
        this.c = -1;
        this.d = ygeVar.d;
    }
}
