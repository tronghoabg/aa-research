package defpackage;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
final class byv<T> implements ListIterator<T>, afgc {
    private final List a;
    private int b;

    public byv(List list, int i) {
        this.a = list;
        this.b = i;
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        this.a.add(this.b, t);
        this.b++;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        int i = this.b;
        this.b = i + 1;
        return (T) this.a.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final T previous() {
        int i = this.b - 1;
        this.b = i;
        return (T) this.a.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.b - 1;
        this.b = i;
        this.a.remove(i);
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        this.a.set(this.b, t);
    }
}
