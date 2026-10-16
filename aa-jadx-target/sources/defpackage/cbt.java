package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cbt<T> extends defpackage.cbn<T> implements java.util.ListIterator<T>, defpackage.afhc {
    private final defpackage.cbr c;
    private int d;
    private defpackage.cbw e;
    private int f;

    public cbt(defpackage.cbr cbrVar, int i) {
        super(i, cbrVar.d);
        this.c = cbrVar;
        this.d = cbrVar.a();
        this.f = -1;
        f();
    }

    private final void c() {
        if (this.d != this.c.a()) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    private final void d() {
        if (this.f == -1) {
            throw new java.lang.IllegalStateException();
        }
    }

    private final void e() {
        defpackage.cbr cbrVar = this.c;
        this.b = cbrVar.d;
        this.d = cbrVar.a();
        this.f = -1;
        f();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    private final void f() {
        defpackage.cbr cbrVar = this.c;
        java.lang.Object[] objArr = cbrVar.b;
        if (objArr == null) {
            this.e = null;
            return;
        }
        int i = (cbrVar.d - 1) & (-32);
        int iF = defpackage.afqt.f(this.a, i);
        int i2 = cbrVar.a / 5;
        defpackage.cbw cbwVar = this.e;
        int i3 = i2 + 1;
        if (cbwVar == null) {
            this.e = new defpackage.cbw(objArr, iF, i, i3);
            return;
        }
        cbwVar.a = iF;
        cbwVar.b = i;
        cbwVar.c = i3;
        if (cbwVar.d.length < i3) {
            cbwVar.d = new java.lang.Object[i3];
        }
        cbwVar.d[0] = objArr;
        ?? r0 = iF == i ? 1 : 0;
        cbwVar.e = r0;
        cbwVar.c(iF - r0, 1);
    }

    @Override // defpackage.cbn, java.util.ListIterator
    public final void add(T t) {
        c();
        this.c.add(this.a, t);
        this.a++;
        e();
    }

    @Override // defpackage.cbn, java.util.ListIterator, java.util.Iterator
    public final T next() {
        c();
        a();
        int i = this.a;
        int i2 = i + 1;
        this.f = i;
        defpackage.cbw cbwVar = this.e;
        if (cbwVar == null) {
            java.lang.Object[] objArr = this.c.c;
            this.a = i2;
            return (T) objArr[i];
        }
        if (cbwVar.hasNext()) {
            this.a = i2;
            return (T) cbwVar.next();
        }
        java.lang.Object[] objArr2 = this.c.c;
        this.a = i2;
        return (T) objArr2[i - cbwVar.b];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        c();
        b();
        int i = this.a;
        int i2 = i - 1;
        this.f = i2;
        defpackage.cbw cbwVar = this.e;
        if (cbwVar == null) {
            java.lang.Object[] objArr = this.c.c;
            this.a = i2;
            return (T) objArr[i2];
        }
        int i3 = cbwVar.b;
        if (i <= i3) {
            this.a = i2;
            return (T) cbwVar.previous();
        }
        java.lang.Object[] objArr2 = this.c.c;
        this.a = i2;
        return (T) objArr2[i2 - i3];
    }

    @Override // defpackage.cbn, java.util.ListIterator, java.util.Iterator
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

    @Override // defpackage.cbn, java.util.ListIterator
    public final void set(T t) {
        c();
        d();
        defpackage.cbr cbrVar = this.c;
        cbrVar.set(this.f, t);
        this.d = cbrVar.a();
        f();
    }
}
