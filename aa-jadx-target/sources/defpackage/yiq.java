package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yiq extends defpackage.yfh {
    final /* synthetic */ java.lang.Iterable a;
    final /* synthetic */ int b;

    public yiq(java.lang.Iterable iterable, int i) {
        this.a = iterable;
        this.b = i;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        java.lang.Iterable iterable = this.a;
        if (iterable instanceof java.util.List) {
            java.util.List list = (java.util.List) iterable;
            return list.subList(java.lang.Math.min(list.size(), this.b), list.size()).iterator();
        }
        int i = this.b;
        java.util.Iterator it = iterable.iterator();
        it.getClass();
        defpackage.ysr.aY(i >= 0, "numberToAdvance must be nonnegative");
        for (int i2 = 0; i2 < i && it.hasNext(); i2++) {
            it.next();
        }
        return new defpackage.yip(it);
    }
}
