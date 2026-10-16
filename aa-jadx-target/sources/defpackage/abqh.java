package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class abqh<E> extends defpackage.abni<E> implements java.util.RandomAccess, java.io.Serializable {
    public static final java.lang.Object[] a;
    public static final defpackage.abqh b;
    private static final long serialVersionUID = 1;
    private java.lang.Object[] c;
    private int d;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        a = objArr;
        b = new defpackage.abqh(objArr, 0, false);
    }

    abqh() {
        this(a, 0, true);
    }

    private final java.lang.String f(int i) {
        return "Index:" + i + ", Size:" + this.d;
    }

    private final void g(int i) {
        if (i < 0 || i >= this.d) {
            throw new java.lang.IndexOutOfBoundsException(f(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private java.lang.Object writeReplace() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.d);
        for (int i = 0; i < this.d; i++) {
            arrayList.add(this.c[i]);
        }
        return arrayList;
    }

    @Override // defpackage.abni, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        gy();
        if (i < 0 || i > (i2 = this.d)) {
            throw new java.lang.IndexOutOfBoundsException(f(i));
        }
        int i3 = i + 1;
        java.lang.Object[] objArr = this.c;
        int length = objArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[((length * 3) / 2) + 1];
            java.lang.System.arraycopy(objArr, 0, objArr2, 0, i);
            java.lang.System.arraycopy(this.c, i, objArr2, i3, this.d - i);
            this.c = objArr2;
        }
        this.c[i] = e;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.abpj
    public final /* bridge */ /* synthetic */ defpackage.abpj d(int i) {
        if (i >= this.d) {
            return new defpackage.abqh(i == 0 ? a : java.util.Arrays.copyOf(this.c, i), this.d, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    final void e(int i) {
        int length = this.c.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.c = new java.lang.Object[java.lang.Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = ((length * 3) / 2) + 1;
        }
        this.c = java.util.Arrays.copyOf(this.c, length);
    }

    @Override // defpackage.abni, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.List)) {
            return false;
        }
        if (!(obj instanceof java.util.RandomAccess)) {
            return super.equals(obj);
        }
        java.util.List list = (java.util.List) obj;
        int i = this.d;
        if (i != list.size()) {
            return false;
        }
        if (!(obj instanceof defpackage.abqh)) {
            for (int i2 = 0; i2 < i; i2++) {
                if (!this.c[i2].equals(list.get(i2))) {
                    return false;
                }
            }
            return true;
        }
        defpackage.abqh abqhVar = (defpackage.abqh) obj;
        for (int i3 = 0; i3 < i; i3++) {
            if (!this.c[i3].equals(abqhVar.c[i3])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        g(i);
        return (E) this.c[i];
    }

    @Override // defpackage.abni, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.d;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + this.c[i2].hashCode();
        }
        return iHashCode;
    }

    @Override // defpackage.abni, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        gy();
        g(i);
        java.lang.Object[] objArr = this.c;
        E e = (E) objArr[i];
        int i2 = this.d;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return e;
    }

    @Override // defpackage.abni, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        gy();
        g(i);
        java.lang.Object[] objArr = this.c;
        E e2 = (E) objArr[i];
        objArr[i] = e;
        this.modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public abqh(java.lang.Object[] objArr, int i, boolean z) {
        super(z);
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.abni, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        gy();
        int i = this.d;
        java.lang.Object[] objArrCopyOf = this.c;
        int length = objArrCopyOf.length;
        if (i == length) {
            objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, ((length * 3) / 2) + 1);
            this.c = objArrCopyOf;
        }
        int i2 = this.d;
        this.d = i2 + 1;
        objArrCopyOf[i2] = e;
        this.modCount++;
        return true;
    }
}
