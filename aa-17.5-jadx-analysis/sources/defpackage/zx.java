package defpackage;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class zx<T> implements ListIterator<T>, afgc {
    private final List a;
    private int b;

    public zx(List list, int i) {
        this.a = list;
        this.b = i - 1;
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        int i = this.b + 1;
        this.b = i;
        this.a.add(i, t);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.size() + (-1);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        int i = this.b + 1;
        this.b = i;
        return (T) this.a.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b + 1;
    }

    @Override // java.util.ListIterator
    public final T previous() {
        int i = this.b;
        this.b = i - 1;
        return (T) this.a.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.a.remove(this.b);
        this.b--;
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        this.a.set(this.b, t);
    }
}
