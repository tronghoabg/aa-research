package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cbs<T> extends defpackage.cbn<T> {
    private final java.lang.Object[] c;
    private final defpackage.cbw d;

    public cbs(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.c = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.d = new defpackage.cbw(objArr, defpackage.afqt.f(i, i4), i4, i3);
    }

    @Override // defpackage.cbn, java.util.ListIterator, java.util.Iterator
    public final T next() {
        a();
        defpackage.cbw cbwVar = this.d;
        if (cbwVar.hasNext()) {
            this.a++;
            return (T) cbwVar.next();
        }
        java.lang.Object[] objArr = this.c;
        int i = this.a;
        this.a = i + 1;
        return (T) objArr[i - cbwVar.b];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        b();
        int i = this.a;
        int i2 = i - 1;
        defpackage.cbw cbwVar = this.d;
        int i3 = cbwVar.b;
        if (i <= i3) {
            this.a = i2;
            return (T) cbwVar.previous();
        }
        java.lang.Object[] objArr = this.c;
        this.a = i2;
        return (T) objArr[i2 - i3];
    }
}
