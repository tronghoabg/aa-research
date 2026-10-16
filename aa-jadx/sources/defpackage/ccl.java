package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ccl<K, V, T> implements java.util.Iterator<T>, defpackage.afhc {
    public java.lang.Object[] a = defpackage.cck.a.b;
    public int b;
    private int c;

    public final java.lang.Object a() {
        return this.a[this.b];
    }

    public final void b() {
        e();
        this.b++;
    }

    public final void c(java.lang.Object[] objArr, int i, int i2) {
        this.a = objArr;
        this.c = i;
        this.b = i2;
    }

    public final boolean d() {
        return this.b < this.c;
    }

    public final boolean e() {
        return this.b < this.a.length;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return d();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
