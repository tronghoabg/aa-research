package defpackage;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class afbs<E> implements ListIterator<E>, afgc {
    private int a;
    private int b = -1;
    private int c;
    private final /* synthetic */ int d;
    private final afau e;

    public afbs(afbr afbrVar, int i, int i2) {
        this.d = i2;
        this.e = afbrVar;
        this.a = i;
        this.c = afbrVar.modCount;
    }

    private final void a() {
        if (((afbt) this.e).modCount != this.c) {
            throw new ConcurrentModificationException();
        }
    }

    private final void b() {
        if (((afbr) this.e).d.modCount != this.c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        if (this.d != 0) {
            b();
            int i = this.a;
            this.a = i + 1;
            afbr afbrVar = (afbr) this.e;
            afbrVar.add(i, obj);
            this.b = -1;
            this.c = afbrVar.modCount;
            return;
        }
        a();
        int i2 = this.a;
        this.a = i2 + 1;
        afbt afbtVar = (afbt) this.e;
        afbtVar.add(i2, obj);
        this.b = -1;
        this.c = afbtVar.modCount;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.d;
        afau afauVar = this.e;
        int i2 = this.a;
        return i != 0 ? i2 < ((afbr) afauVar).c : i2 < ((afbt) afauVar).b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.d;
        int i2 = this.a;
        return i != 0 ? i2 > 0 : i2 > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (this.d != 0) {
            b();
            afau afauVar = this.e;
            int i = this.a;
            afbr afbrVar = (afbr) afauVar;
            if (i >= afbrVar.c) {
                throw new NoSuchElementException();
            }
            this.a = i + 1;
            this.b = i;
            return afbrVar.a[afbrVar.b + i];
        }
        a();
        afau afauVar2 = this.e;
        int i2 = this.a;
        afbt afbtVar = (afbt) afauVar2;
        if (i2 >= afbtVar.b) {
            throw new NoSuchElementException();
        }
        this.a = i2 + 1;
        this.b = i2;
        return afbtVar.a[i2];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (this.d == 0) {
            a();
            int i = this.a;
            if (i <= 0) {
                throw new NoSuchElementException();
            }
            int i2 = i - 1;
            this.a = i2;
            this.b = i2;
            return ((afbt) this.e).a[i2];
        }
        b();
        int i3 = this.a;
        if (i3 <= 0) {
            throw new NoSuchElementException();
        }
        int i4 = i3 - 1;
        this.a = i4;
        this.b = i4;
        afbr afbrVar = (afbr) this.e;
        return afbrVar.a[afbrVar.b + i4];
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
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            afau afauVar = this.e;
            afauVar.d(i);
            this.a = this.b;
            this.b = -1;
            this.c = ((afbr) afauVar).modCount;
            return;
        }
        a();
        int i2 = this.b;
        if (i2 == -1) {
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }
        afau afauVar2 = this.e;
        afauVar2.d(i2);
        this.a = this.b;
        this.b = -1;
        this.c = ((afbt) afauVar2).modCount;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        if (this.d != 0) {
            b();
            int i = this.b;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            ((afbr) this.e).set(i, obj);
            return;
        }
        a();
        int i2 = this.b;
        if (i2 == -1) {
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
        ((afbt) this.e).set(i2, obj);
    }

    public afbs(afbt afbtVar, int i, int i2) {
        this.d = i2;
        this.e = afbtVar;
        this.a = i;
        this.c = afbtVar.modCount;
    }
}
