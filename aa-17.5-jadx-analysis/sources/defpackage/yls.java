package defpackage;

/* loaded from: classes.dex */
public final class yls<E> extends yfq<E> {
    public static final yfq a = new yls(new Object[0], 0);
    final transient Object[] b;
    public final transient int c;

    public yls(Object[] objArr, int i) {
        this.b = objArr;
        this.c = i;
    }

    @Override // defpackage.yfq, defpackage.yfg
    public final int a(Object[] objArr, int i) {
        Object[] objArr2 = this.b;
        int i2 = this.c;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.yfg
    public final int b() {
        return this.c;
    }

    @Override // defpackage.yfg
    public final int c() {
        return 0;
    }

    @Override // defpackage.yfg
    public final boolean f() {
        return false;
    }

    @Override // defpackage.yfg
    public final Object[] g() {
        return this.b;
    }

    @Override // java.util.List
    public final E get(int i) {
        woy.ai(i, this.c);
        E e = (E) this.b[i];
        e.getClass();
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // defpackage.yfq, defpackage.yfg
    public Object writeReplace() {
        return super.writeReplace();
    }
}
