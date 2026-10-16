package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yjj implements java.util.ListIterator {
    int a;
    defpackage.yji b;
    defpackage.yji c;
    defpackage.yji d;
    int e;
    final /* synthetic */ defpackage.yjl f;

    public yjj(defpackage.yjl yjlVar, int i) {
        this.f = yjlVar;
        this.e = yjlVar.e;
        int i2 = yjlVar.d;
        defpackage.ysr.bt(i, i2);
        if (i >= i2 / 2) {
            this.d = yjlVar.b;
            this.a = i2;
            while (i < i2) {
                previous();
                i++;
            }
        } else {
            this.b = yjlVar.a;
            while (i > 0) {
                next();
                i--;
            }
        }
        this.c = null;
    }

    private final void c() {
        if (this.f.e != this.e) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.yji next() {
        c();
        defpackage.yji yjiVar = this.b;
        if (yjiVar == null) {
            throw new java.util.NoSuchElementException();
        }
        this.c = yjiVar;
        this.d = yjiVar;
        this.b = yjiVar.a;
        this.a++;
        return this.c;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.yji previous() {
        c();
        defpackage.yji yjiVar = this.d;
        if (yjiVar == null) {
            throw new java.util.NoSuchElementException();
        }
        this.c = yjiVar;
        this.b = yjiVar;
        this.d = yjiVar.b;
        this.a--;
        return this.c;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        c();
        return this.b != null;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        c();
        return this.d != null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        c();
        defpackage.ysr.bk(this.c != null, "no calls to next() since the last call to remove()");
        defpackage.yji yjiVar = this.c;
        if (yjiVar != this.b) {
            this.d = yjiVar.b;
            this.a--;
        } else {
            this.b = yjiVar.a;
        }
        defpackage.yjl yjlVar = this.f;
        yjlVar.e(yjiVar);
        this.c = null;
        this.e = yjlVar.e;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }
}
