package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ekv<E> extends defpackage.ein<E> implements java.util.RandomAccess {
    public static final defpackage.ekv a;
    private static final java.lang.Object[] c;
    public java.lang.Object[] b;
    private int d;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        c = objArr;
        a = new defpackage.ekv(objArr, 0, false);
    }

    ekv() {
        this(c, 0, true);
    }

    private final java.lang.String e(int i) {
        return "Index:" + i + ", Size:" + this.d;
    }

    private final void f(int i) {
        if (i < 0 || i >= this.d) {
            throw new java.lang.IndexOutOfBoundsException(e(i));
        }
    }

    @Override // defpackage.ein, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.d)) {
            throw new java.lang.IndexOutOfBoundsException(e(i));
        }
        int i3 = i + 1;
        java.lang.Object[] objArr = this.b;
        int length = objArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[java.lang.Math.max(((length * 3) / 2) + 1, 10)];
            java.lang.System.arraycopy(this.b, 0, objArr2, 0, i);
            java.lang.System.arraycopy(this.b, i, objArr2, i3, this.d - i);
            this.b = objArr2;
        }
        this.b[i] = e;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.eju
    public final /* bridge */ /* synthetic */ defpackage.eju d(int i) {
        if (i >= this.d) {
            return new defpackage.ekv(i == 0 ? c : java.util.Arrays.copyOf(this.b, i), this.d, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        f(i);
        return (E) this.b[i];
    }

    @Override // defpackage.ein, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        a();
        f(i);
        java.lang.Object[] objArr = this.b;
        E e = (E) objArr[i];
        int i2 = this.d;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return e;
    }

    @Override // defpackage.ein, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        a();
        f(i);
        java.lang.Object[] objArr = this.b;
        E e2 = (E) objArr[i];
        objArr[i] = e;
        this.modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    private ekv(java.lang.Object[] objArr, int i, boolean z) {
        super(z);
        this.b = objArr;
        this.d = i;
    }

    @Override // defpackage.ein, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        a();
        int i = this.d;
        java.lang.Object[] objArrCopyOf = this.b;
        int length = objArrCopyOf.length;
        if (i == length) {
            objArrCopyOf = java.util.Arrays.copyOf(this.b, java.lang.Math.max(((length * 3) / 2) + 1, 10));
            this.b = objArrCopyOf;
        }
        int i2 = this.d;
        this.d = i2 + 1;
        objArrCopyOf[i2] = e;
        this.modCount++;
        return true;
    }
}
