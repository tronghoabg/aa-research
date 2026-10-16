package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yjk implements java.util.ListIterator {
    final java.lang.Object a;
    int b;
    defpackage.yji c;
    defpackage.yji d;
    defpackage.yji e;
    final /* synthetic */ defpackage.yjl f;

    public yjk(defpackage.yjl yjlVar, java.lang.Object obj, int i) {
        this.f = yjlVar;
        defpackage.yjh yjhVar = (defpackage.yjh) yjlVar.c.get(obj);
        int i2 = yjhVar == null ? 0 : yjhVar.a;
        defpackage.ysr.bt(i, i2);
        if (i >= i2 / 2) {
            this.e = (defpackage.yji) (yjhVar == null ? null : yjhVar.c);
            this.b = i2;
            while (i < i2) {
                previous();
                i++;
            }
        } else {
            this.c = (defpackage.yji) (yjhVar == null ? null : yjhVar.b);
            while (i > 0) {
                next();
                i--;
            }
        }
        this.a = obj;
        this.d = null;
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        this.e = this.f.a(this.a, obj, this.c);
        this.b++;
        this.d = null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.c != null;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.e != null;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        defpackage.yji yjiVar = this.c;
        if (yjiVar == null) {
            throw new java.util.NoSuchElementException();
        }
        this.d = yjiVar;
        this.e = yjiVar;
        this.c = yjiVar.c;
        this.b++;
        return this.d.getValue();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        defpackage.yji yjiVar = this.e;
        if (yjiVar == null) {
            throw new java.util.NoSuchElementException();
        }
        this.d = yjiVar;
        this.c = yjiVar;
        this.e = yjiVar.d;
        this.b--;
        return this.d.getValue();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        defpackage.ysr.bk(this.d != null, "no calls to next() since the last call to remove()");
        defpackage.yji yjiVar = this.d;
        if (yjiVar != this.c) {
            this.e = yjiVar.d;
            this.b--;
        } else {
            this.c = yjiVar.c;
        }
        this.f.e(yjiVar);
        this.d = null;
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        defpackage.ysr.bj(this.d != null);
        this.d.setValue(obj);
    }

    public yjk(defpackage.yjl yjlVar, java.lang.Object obj) {
        this.f = yjlVar;
        this.a = obj;
        defpackage.yjh yjhVar = (defpackage.yjh) yjlVar.c.get(obj);
        this.c = (defpackage.yji) (yjhVar == null ? null : yjhVar.b);
    }
}
