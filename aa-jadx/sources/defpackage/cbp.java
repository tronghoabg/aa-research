package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cbp<T> extends defpackage.cbn<T> {
    private final java.lang.Object[] c;

    public cbp(java.lang.Object[] objArr, int i, int i2) {
        super(i, i2);
        this.c = objArr;
    }

    @Override // defpackage.cbn, java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object[] objArr = this.c;
        int i = this.a;
        this.a = i + 1;
        return (T) objArr[i];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object[] objArr = this.c;
        int i = this.a - 1;
        this.a = i;
        return (T) objArr[i];
    }
}
