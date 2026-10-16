package defpackage;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class cbn<T> extends cbh<T> implements ListIterator<T>, afgc {
    private final cbl c;
    private int d;
    private cbq e;
    private int f;

    public cbn(cbl cblVar, int i) {
        super(i, cblVar.d);
        this.c = cblVar;
        this.d = cblVar.a();
        this.f = -1;
        f();
    }

    private final void c() {
        if (this.d != this.c.a()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void d() {
        if (this.f == -1) {
            throw new IllegalStateException();
        }
    }

    private final void e() {
        cbl cblVar = this.c;
        this.b = cblVar.d;
        this.d = cblVar.a();
        this.f = -1;
        f();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    private final void f() {
        cbl cblVar = this.c;
        Object[] objArr = cblVar.b;
        if (objArr == null) {
            this.e = null;
            return;
        }
        int i = (cblVar.d - 1) & (-32);
        int iF = afpt.f(this.a, i);
        int i2 = cblVar.a / 5;
        cbq cbqVar = this.e;
        int i3 = i2 + 1;
        if (cbqVar == null) {
            this.e = new cbq(objArr, iF, i, i3);
            return;
        }
        cbqVar.a = iF;
        cbqVar.b = i;
        cbqVar.c = i3;
        if (cbqVar.d.length < i3) {
            cbqVar.d = new Object[i3];
        }
        cbqVar.d[0] = objArr;
        ?? r0 = iF == i ? 1 : 0;
        cbqVar.e = r0;
        cbqVar.c(iF - r0, 1);
    }

    @Override // defpackage.cbh, java.util.ListIterator
    public final void add(T t) {
        c();
        this.c.add(this.a, t);
        this.a++;
        e();
    }

    @Override // defpackage.cbh, java.util.ListIterator, java.util.Iterator
    public final T next() {
        c();
        a();
        int i = this.a;
        int i2 = i + 1;
        this.f = i;
        cbq cbqVar = this.e;
        if (cbqVar == null) {
            Object[] objArr = this.c.c;
            this.a = i2;
            return (T) objArr[i];
        }
        if (cbqVar.hasNext()) {
            this.a = i2;
            return (T) cbqVar.next();
        }
        Object[] objArr2 = this.c.c;
        this.a = i2;
        return (T) objArr2[i - cbqVar.b];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        c();
        b();
        int i = this.a;
        int i2 = i - 1;
        this.f = i2;
        cbq cbqVar = this.e;
        if (cbqVar == null) {
            Object[] objArr = this.c.c;
            this.a = i2;
            return (T) objArr[i2];
        }
        int i3 = cbqVar.b;
        if (i <= i3) {
            this.a = i2;
            return (T) cbqVar.previous();
        }
        Object[] objArr2 = this.c.c;
        this.a = i2;
        return (T) objArr2[i2 - i3];
    }

    @Override // defpackage.cbh, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        c();
        d();
        this.c.d(this.f);
        int i = this.f;
        if (i < this.a) {
            this.a = i;
        }
        e();
    }

    @Override // defpackage.cbh, java.util.ListIterator
    public final void set(T t) {
        c();
        d();
        cbl cblVar = this.c;
        cblVar.set(this.f, t);
        this.d = cblVar.a();
        f();
    }
}
