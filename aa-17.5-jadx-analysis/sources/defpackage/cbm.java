package defpackage;

/* loaded from: classes.dex */
public final class cbm<T> extends cbh<T> {
    private final Object[] c;
    private final cbq d;

    public cbm(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.c = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.d = new cbq(objArr, afpt.f(i, i4), i4, i3);
    }

    @Override // defpackage.cbh, java.util.ListIterator, java.util.Iterator
    public final T next() {
        a();
        cbq cbqVar = this.d;
        if (cbqVar.hasNext()) {
            this.a++;
            return (T) cbqVar.next();
        }
        Object[] objArr = this.c;
        int i = this.a;
        this.a = i + 1;
        return (T) objArr[i - cbqVar.b];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        b();
        int i = this.a;
        int i2 = i - 1;
        cbq cbqVar = this.d;
        int i3 = cbqVar.b;
        if (i <= i3) {
            this.a = i2;
            return (T) cbqVar.previous();
        }
        Object[] objArr = this.c;
        this.a = i2;
        return (T) objArr[i2 - i3];
    }
}
