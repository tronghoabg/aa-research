package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yfg extends defpackage.yfh {
    final /* synthetic */ java.lang.Iterable[] a;

    public yfg(java.lang.Iterable[] iterableArr) {
        this.a = iterableArr;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        java.lang.Iterable[] iterableArr = this.a;
        return new defpackage.yix(new defpackage.yff(iterableArr.length, iterableArr));
    }
}
