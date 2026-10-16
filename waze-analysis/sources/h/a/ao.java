package h.a;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ao<T> extends o<T> {

    /* renamed from: a, reason: collision with root package name */
    private final List f47980a;

    public ao(List list) {
        h.g.b.x.f(list, "delegate");
        this.f47980a = list;
    }

    @Override // h.a.o, java.util.AbstractList, java.util.List
    public final void add(int i2, T t) {
        this.f47980a.add(i.C(this, i2), t);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f47980a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i2) {
        return (T) this.f47980a.get(i.A(this, i2));
    }

    @Override // h.a.o
    public final int getSize() {
        return this.f47980a.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int i2) {
        return new an(this, i2);
    }

    @Override // h.a.o
    public final T removeAt(int i2) {
        return (T) this.f47980a.remove(i.A(this, i2));
    }

    @Override // h.a.o, java.util.AbstractList, java.util.List
    public final T set(int i2, T t) {
        return (T) this.f47980a.set(i.A(this, i2), t);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator() {
        return listIterator(0);
    }
}
