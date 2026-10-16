package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bzi implements java.util.Iterator, defpackage.afhc {
    private final defpackage.bzm a;
    private final int b;
    private int c;
    private final int d;

    public bzi(defpackage.bzm bzmVar, int i, int i2) {
        this.a = bzmVar;
        this.b = i2;
        this.c = i;
        this.d = bzmVar.g;
        if (bzmVar.f) {
            defpackage.bzo.f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        defpackage.bzm bzmVar = this.a;
        int i = bzmVar.g;
        int i2 = this.d;
        if (i != i2) {
            defpackage.bzo.f();
        }
        int i3 = this.c;
        this.c = bzmVar.a[(i3 * 5) + 3] + i3;
        return new defpackage.bzn(bzmVar, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
