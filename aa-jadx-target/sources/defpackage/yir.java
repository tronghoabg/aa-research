package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yir extends defpackage.yfh {
    final /* synthetic */ java.lang.Iterable a;
    final /* synthetic */ int b;

    public yir(java.lang.Iterable iterable, int i) {
        this.a = iterable;
        this.b = i;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        java.util.Iterator it = this.a.iterator();
        it.getClass();
        int i = this.b;
        defpackage.ysr.aY(i >= 0, "limit is negative");
        return new defpackage.yiv(i, it);
    }
}
