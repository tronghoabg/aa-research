package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class abqq implements java.util.Iterator {
    final /* synthetic */ defpackage.abqs a;
    private int b = -1;

    public abqq(defpackage.abqs abqsVar) {
        this.a = abqsVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        defpackage.abqs abqsVar = this.a;
        abqsVar.c();
        return this.b + 1 < abqsVar.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        defpackage.abqs abqsVar = this.a;
        abqsVar.c();
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object[] objArr = abqsVar.a;
        int i = this.b + 1;
        this.b = i;
        return (defpackage.abqp) objArr[i];
    }
}
