package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class afcs<E> implements java.util.ListIterator<E>, defpackage.afhc {
    private int a;
    private int b = -1;
    private int c;
    private final /* synthetic */ int d;
    private final defpackage.afbu e;

    public afcs(defpackage.afcr afcrVar, int i, int i2) {
        this.d = i2;
        this.e = afcrVar;
        this.a = i;
        this.c = afcrVar.modCount;
    }

    private final void a() {
        if (((defpackage.afct) this.e).modCount != this.c) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    private final void b() {
        if (((defpackage.afcr) this.e).d.modCount != this.c) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        if (this.d != 0) {
            b();
            int i = this.a;
            this.a = i + 1;
            defpackage.afcr afcrVar = (defpackage.afcr) this.e;
            afcrVar.add(i, obj);
            this.b = -1;
            this.c = afcrVar.modCount;
            return;
        }
        a();
        int i2 = this.a;
        this.a = i2 + 1;
        defpackage.afct afctVar = (defpackage.afct) this.e;
        afctVar.add(i2, obj);
        this.b = -1;
        this.c = afctVar.modCount;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.d;
        defpackage.afbu afbuVar = this.e;
        int i2 = this.a;
        if (i != 0) {
            return i2 < ((defpackage.afcr) afbuVar).c;
        }
        return i2 < ((defpackage.afct) afbuVar).b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.d;
        int i2 = this.a;
        if (i != 0) {
            return i2 > 0;
        }
        return i2 > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        if (this.d != 0) {
            b();
            defpackage.afbu afbuVar = this.e;
            int i = this.a;
            defpackage.afcr afcrVar = (defpackage.afcr) afbuVar;
            if (i >= afcrVar.c) {
                throw new java.util.NoSuchElementException();
            }
            this.a = i + 1;
            this.b = i;
            return afcrVar.a[afcrVar.b + i];
        }
        a();
        defpackage.afbu afbuVar2 = this.e;
        int i2 = this.a;
        defpackage.afct afctVar = (defpackage.afct) afbuVar2;
        if (i2 >= afctVar.b) {
            throw new java.util.NoSuchElementException();
        }
        this.a = i2 + 1;
        this.b = i2;
        return afctVar.a[i2];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (this.d == 0) {
            a();
            int i = this.a;
            if (i <= 0) {
                throw new java.util.NoSuchElementException();
            }
            int i2 = i - 1;
            this.a = i2;
            this.b = i2;
            return ((defpackage.afct) this.e).a[i2];
        }
        b();
        int i3 = this.a;
        if (i3 <= 0) {
            throw new java.util.NoSuchElementException();
        }
        int i4 = i3 - 1;
        this.a = i4;
        this.b = i4;
        defpackage.afcr afcrVar = (defpackage.afcr) this.e;
        return afcrVar.a[afcrVar.b + i4];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i = this.d;
        return this.a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        if (this.d != 0) {
            b();
            int i = this.b;
            if (i == -1) {
                throw new java.lang.IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            defpackage.afbu afbuVar = this.e;
            afbuVar.d(i);
            this.a = this.b;
            this.b = -1;
            this.c = ((defpackage.afcr) afbuVar).modCount;
            return;
        }
        a();
        int i2 = this.b;
        if (i2 == -1) {
            throw new java.lang.IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }
        defpackage.afbu afbuVar2 = this.e;
        afbuVar2.d(i2);
        this.a = this.b;
        this.b = -1;
        this.c = ((defpackage.afct) afbuVar2).modCount;
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        if (this.d != 0) {
            b();
            int i = this.b;
            if (i == -1) {
                throw new java.lang.IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            ((defpackage.afcr) this.e).set(i, obj);
            return;
        }
        a();
        int i2 = this.b;
        if (i2 == -1) {
            throw new java.lang.IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
        ((defpackage.afct) this.e).set(i2, obj);
    }

    public afcs(defpackage.afct afctVar, int i, int i2) {
        this.d = i2;
        this.e = afctVar;
        this.a = i;
        this.c = afctVar.modCount;
    }
}
