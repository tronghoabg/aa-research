package X;

import gf.C2754a;
import gf.C2755b;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import t0.C4060h;
import uf.InterfaceC4291a;

/* loaded from: classes.dex */
public final class v implements ListIterator, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15761a;

    /* renamed from: b, reason: collision with root package name */
    public int f15762b;

    /* renamed from: c, reason: collision with root package name */
    public int f15763c;

    /* renamed from: d, reason: collision with root package name */
    public int f15764d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f15765e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(C4060h c4060h, int i5, int i10) {
        this(c4060h, (i10 & 1) != 0 ? 0 : i5, 0, c4060h.f45479d);
        this.f15761a = 3;
    }

    public void a() {
        if (((AbstractList) ((C2754a) this.f15765e).f35881e).modCount != this.f15764d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f15761a) {
            case 0:
                d();
                int i5 = this.f15762b + 1;
                p pVar = (p) this.f15765e;
                pVar.add(i5, obj);
                this.f15763c = -1;
                this.f15762b++;
                this.f15764d = pVar.d();
                return;
            case 1:
                a();
                int i10 = this.f15762b;
                this.f15762b = i10 + 1;
                C2754a c2754a = (C2754a) this.f15765e;
                c2754a.add(i10, obj);
                this.f15763c = -1;
                this.f15764d = ((AbstractList) c2754a).modCount;
                return;
            case 2:
                c();
                int i11 = this.f15762b;
                this.f15762b = i11 + 1;
                C2755b c2755b = (C2755b) this.f15765e;
                c2755b.add(i11, obj);
                this.f15763c = -1;
                this.f15764d = ((AbstractList) c2755b).modCount;
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public void c() {
        if (((AbstractList) ((C2755b) this.f15765e)).modCount != this.f15764d) {
            throw new ConcurrentModificationException();
        }
    }

    public void d() {
        if (((p) this.f15765e).d() != this.f15764d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f15761a) {
            case 0:
                return this.f15762b < ((p) this.f15765e).size() - 1;
            case 1:
                return this.f15762b < ((C2754a) this.f15765e).f35879c;
            case 2:
                return this.f15762b < ((C2755b) this.f15765e).f35884b;
            default:
                return this.f15762b < this.f15764d;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f15761a) {
            case 0:
                if (this.f15762b >= 0) {
                }
                break;
            case 1:
                if (this.f15762b > 0) {
                }
                break;
            case 2:
                if (this.f15762b > 0) {
                }
                break;
            default:
                if (this.f15762b > this.f15763c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f15761a) {
            case 0:
                d();
                int i5 = this.f15762b + 1;
                this.f15763c = i5;
                p pVar = (p) this.f15765e;
                q.a(i5, pVar.size());
                Object obj = pVar.get(i5);
                this.f15762b = i5;
                return obj;
            case 1:
                a();
                int i10 = this.f15762b;
                C2754a c2754a = (C2754a) this.f15765e;
                if (i10 >= c2754a.f35879c) {
                    throw new NoSuchElementException();
                }
                this.f15762b = i10 + 1;
                this.f15763c = i10;
                return c2754a.f35877a[c2754a.f35878b + i10];
            case 2:
                c();
                int i11 = this.f15762b;
                C2755b c2755b = (C2755b) this.f15765e;
                if (i11 >= c2755b.f35884b) {
                    throw new NoSuchElementException();
                }
                this.f15762b = i11 + 1;
                this.f15763c = i11;
                return c2755b.f35883a[i11];
            default:
                Object[] objArr = ((C4060h) this.f15765e).f45476a;
                int i12 = this.f15762b;
                this.f15762b = i12 + 1;
                return objArr[i12];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f15761a) {
            case 0:
                return this.f15762b + 1;
            case 1:
                return this.f15762b;
            case 2:
                return this.f15762b;
            default:
                return this.f15762b - this.f15763c;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f15761a) {
            case 0:
                d();
                int i5 = this.f15762b;
                p pVar = (p) this.f15765e;
                q.a(i5, pVar.size());
                int i10 = this.f15762b;
                this.f15763c = i10;
                this.f15762b--;
                return pVar.get(i10);
            case 1:
                a();
                int i11 = this.f15762b;
                if (i11 <= 0) {
                    throw new NoSuchElementException();
                }
                int i12 = i11 - 1;
                this.f15762b = i12;
                this.f15763c = i12;
                C2754a c2754a = (C2754a) this.f15765e;
                return c2754a.f35877a[c2754a.f35878b + i12];
            case 2:
                c();
                int i13 = this.f15762b;
                if (i13 <= 0) {
                    throw new NoSuchElementException();
                }
                int i14 = i13 - 1;
                this.f15762b = i14;
                this.f15763c = i14;
                return ((C2755b) this.f15765e).f35883a[i14];
            default:
                Object[] objArr = ((C4060h) this.f15765e).f45476a;
                int i15 = this.f15762b - 1;
                this.f15762b = i15;
                return objArr[i15];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f15761a) {
            case 0:
                return this.f15762b;
            case 1:
                return this.f15762b - 1;
            case 2:
                return this.f15762b - 1;
            default:
                return (this.f15762b - this.f15763c) - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f15761a) {
            case 0:
                d();
                int i5 = this.f15762b;
                p pVar = (p) this.f15765e;
                pVar.remove(i5);
                this.f15762b--;
                this.f15763c = -1;
                this.f15764d = pVar.d();
                return;
            case 1:
                a();
                int i10 = this.f15763c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                C2754a c2754a = (C2754a) this.f15765e;
                c2754a.c(i10);
                this.f15762b = this.f15763c;
                this.f15763c = -1;
                this.f15764d = ((AbstractList) c2754a).modCount;
                return;
            case 2:
                c();
                int i11 = this.f15763c;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                C2755b c2755b = (C2755b) this.f15765e;
                c2755b.c(i11);
                this.f15762b = this.f15763c;
                this.f15763c = -1;
                this.f15764d = ((AbstractList) c2755b).modCount;
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f15761a) {
            case 0:
                d();
                int i5 = this.f15763c;
                if (i5 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                p pVar = (p) this.f15765e;
                pVar.set(i5, obj);
                this.f15764d = pVar.d();
                return;
            case 1:
                a();
                int i10 = this.f15763c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C2754a) this.f15765e).set(i10, obj);
                return;
            case 2:
                c();
                int i11 = this.f15763c;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C2755b) this.f15765e).set(i11, obj);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public v(C4060h c4060h, int i5, int i10, int i11) {
        this.f15761a = 3;
        this.f15765e = c4060h;
        this.f15762b = i5;
        this.f15763c = i10;
        this.f15764d = i11;
    }

    public v(C2755b c2755b, int i5) {
        this.f15761a = 2;
        this.f15765e = c2755b;
        this.f15762b = i5;
        this.f15763c = -1;
        this.f15764d = ((AbstractList) c2755b).modCount;
    }

    public v(p pVar, int i5) {
        this.f15761a = 0;
        this.f15765e = pVar;
        this.f15762b = i5 - 1;
        this.f15763c = -1;
        this.f15764d = pVar.d();
    }

    public v(C2754a c2754a, int i5) {
        this.f15761a = 1;
        this.f15765e = c2754a;
        this.f15762b = i5;
        this.f15763c = -1;
        this.f15764d = ((AbstractList) c2754a).modCount;
    }
}
