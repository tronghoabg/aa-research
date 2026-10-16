package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class ccf<K, V, T> implements Iterator<T>, afgc {
    public Object[] a = cce.a.b;
    public int b;
    private int c;

    public final Object a() {
        return this.a[this.b];
    }

    public final void b() {
        e();
        this.b++;
    }

    public final void c(Object[] objArr, int i, int i2) {
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
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
