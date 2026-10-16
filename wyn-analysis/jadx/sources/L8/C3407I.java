package l8;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: l8.I, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3407I extends t0 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f40050a;

    /* renamed from: b, reason: collision with root package name */
    public int f40051b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC3409K f40052c;

    public C3407I(AbstractC3409K abstractC3409K, int i5) {
        int size = abstractC3409K.size();
        Fe.e.u(i5, size);
        this.f40050a = size;
        this.f40051b = i5;
        this.f40052c = abstractC3409K;
    }

    public final Object a(int i5) {
        return this.f40052c.get(i5);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f40051b < this.f40050a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f40051b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i5 = this.f40051b;
        this.f40051b = i5 + 1;
        return a(i5);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f40051b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i5 = this.f40051b - 1;
        this.f40051b = i5;
        return a(i5);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f40051b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
