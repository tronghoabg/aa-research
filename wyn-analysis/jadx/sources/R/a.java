package R;

import java.util.ListIterator;
import uf.InterfaceC4291a;

/* loaded from: classes.dex */
public abstract class a implements ListIterator, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public int f10007a;

    /* renamed from: b, reason: collision with root package name */
    public int f10008b;

    public a(int i5, int i10) {
        this.f10007a = i5;
        this.f10008b = i10;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f10007a < this.f10008b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f10007a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f10007a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f10007a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
