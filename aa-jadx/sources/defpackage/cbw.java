package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cbw<E> extends defpackage.cbn<E> {
    public int c;
    public java.lang.Object[] d;
    public boolean e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public cbw(java.lang.Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
        java.lang.Object[] objArr2 = new java.lang.Object[i3];
        this.d = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.e = r5;
        objArr2[0] = objArr;
        c(i - r5, 1);
    }

    private final java.lang.Object d() {
        int i = this.a & 31;
        java.lang.Object obj = this.d[this.c - 1];
        obj.getClass();
        return ((java.lang.Object[]) obj)[i];
    }

    private final void e(int i) {
        int i2;
        int i3 = 0;
        while (true) {
            i2 = this.a;
            if (((i2 >> i3) & 31) != i) {
                break;
            } else {
                i3 += 5;
            }
        }
        if (i3 > 0) {
            c(i2, ((this.c - 1) - (i3 / 5)) + 1);
        }
    }

    public final void c(int i, int i2) {
        int i3 = (this.c - i2) * 5;
        while (i2 < this.c) {
            java.lang.Object[] objArr = this.d;
            java.lang.Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((java.lang.Object[]) obj)[(i >> i3) & 31];
            i3 -= 5;
            i2++;
        }
    }

    @Override // defpackage.cbn, java.util.ListIterator, java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        E e = (E) d();
        int i = this.a + 1;
        this.a = i;
        if (i == this.b) {
            this.e = true;
            return e;
        }
        e(0);
        return e;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        this.a--;
        if (this.e) {
            this.e = false;
            return (E) d();
        }
        e(31);
        return (E) d();
    }
}
