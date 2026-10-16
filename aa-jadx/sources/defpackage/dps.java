package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class dps implements java.util.Iterator {
    final defpackage.dpt a;
    int b = 0;

    public dps(defpackage.dpt dptVar) {
        this.a = dptVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.d();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        defpackage.dpq dpqVar = (defpackage.dpq) this.a.a.get(this.b);
        this.b++;
        return dpqVar;
    }
}
