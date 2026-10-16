package h.a.a;

import h.g.b.x;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c<E> implements ListIterator<E>, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    private int f47928a;

    /* renamed from: b, reason: collision with root package name */
    private int f47929b;

    /* renamed from: c, reason: collision with root package name */
    private int f47930c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f47931d;

    /* renamed from: e, reason: collision with root package name */
    private final h.a.o f47932e;

    public c(b bVar, int i2, int i3) {
        this.f47931d = i3;
        x.f(bVar, "list");
        this.f47932e = bVar;
        this.f47928a = i2;
        this.f47929b = -1;
        this.f47930c = bVar.modCount;
    }

    private final void a() {
        if (((d) this.f47932e).modCount != this.f47930c) {
            throw new ConcurrentModificationException();
        }
    }

    private final void b() {
        if (((b) this.f47932e).f47927e.modCount != this.f47930c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        if (this.f47931d != 0) {
            b();
            int i2 = this.f47928a;
            this.f47928a = i2 + 1;
            b bVar = (b) this.f47932e;
            bVar.add(i2, obj);
            this.f47929b = -1;
            this.f47930c = bVar.modCount;
            return;
        }
        a();
        int i3 = this.f47928a;
        this.f47928a = i3 + 1;
        d dVar = (d) this.f47932e;
        dVar.add(i3, obj);
        this.f47929b = -1;
        this.f47930c = dVar.modCount;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f47931d;
        int i3 = this.f47928a;
        h.a.o oVar = this.f47932e;
        return i2 != 0 ? i3 < ((b) oVar).f47925c : i3 < ((d) oVar).f47936d;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i2 = this.f47931d;
        int i3 = this.f47928a;
        return i2 != 0 ? i3 > 0 : i3 > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (this.f47931d != 0) {
            b();
            int i2 = this.f47928a;
            b bVar = (b) this.f47932e;
            if (i2 >= bVar.f47925c) {
                throw new NoSuchElementException();
            }
            this.f47928a = i2 + 1;
            this.f47929b = i2;
            return bVar.f47923a[bVar.f47924b + i2];
        }
        a();
        int i3 = this.f47928a;
        d dVar = (d) this.f47932e;
        if (i3 >= dVar.f47936d) {
            throw new NoSuchElementException();
        }
        this.f47928a = i3 + 1;
        this.f47929b = i3;
        return dVar.f47935c[this.f47929b];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f47928a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (this.f47931d == 0) {
            a();
            int i2 = this.f47928a;
            if (i2 <= 0) {
                throw new NoSuchElementException();
            }
            int i3 = i2 - 1;
            this.f47928a = i3;
            this.f47929b = i3;
            return ((d) this.f47932e).f47935c[this.f47929b];
        }
        b();
        int i4 = this.f47928a;
        if (i4 <= 0) {
            throw new NoSuchElementException();
        }
        int i5 = i4 - 1;
        this.f47928a = i5;
        this.f47929b = i5;
        b bVar = (b) this.f47932e;
        return bVar.f47923a[bVar.f47924b + i5];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i2 = this.f47931d;
        return this.f47928a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        if (this.f47931d != 0) {
            b();
            int i2 = this.f47929b;
            if (i2 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            h.a.o oVar = this.f47932e;
            oVar.remove(i2);
            this.f47928a = this.f47929b;
            this.f47929b = -1;
            this.f47930c = ((b) oVar).modCount;
            return;
        }
        a();
        int i3 = this.f47929b;
        if (i3 == -1) {
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }
        h.a.o oVar2 = this.f47932e;
        oVar2.remove(i3);
        this.f47928a = this.f47929b;
        this.f47929b = -1;
        this.f47930c = ((d) oVar2).modCount;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        if (this.f47931d != 0) {
            b();
            int i2 = this.f47929b;
            if (i2 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            ((b) this.f47932e).set(i2, obj);
            return;
        }
        a();
        int i3 = this.f47929b;
        if (i3 == -1) {
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
        ((d) this.f47932e).set(i3, obj);
    }

    public c(d dVar, int i2, int i3) {
        this.f47931d = i3;
        x.f(dVar, "list");
        this.f47932e = dVar;
        this.f47928a = i2;
        this.f47929b = -1;
        this.f47930c = dVar.modCount;
    }
}
