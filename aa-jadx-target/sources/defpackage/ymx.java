package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ymx<E> extends defpackage.ygw<E> {
    public static final defpackage.ygw a = new defpackage.ymx(new java.lang.Object[0], 0);
    final transient java.lang.Object[] b;
    public final transient int c;

    public ymx(java.lang.Object[] objArr, int i) {
        this.b = objArr;
        this.c = i;
    }

    @Override // defpackage.ygw, defpackage.ygm
    public final int a(java.lang.Object[] objArr, int i) {
        java.lang.Object[] objArr2 = this.b;
        int i2 = this.c;
        java.lang.System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.ygm
    public final int b() {
        return this.c;
    }

    @Override // defpackage.ygm
    public final int c() {
        return 0;
    }

    @Override // defpackage.ygm
    public final boolean f() {
        return false;
    }

    @Override // defpackage.ygm
    public final java.lang.Object[] g() {
        return this.b;
    }

    @Override // java.util.List
    public final E get(int i) {
        defpackage.ysr.bs(i, this.c);
        E e = (E) this.b[i];
        e.getClass();
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // defpackage.ygw, defpackage.ygm
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
