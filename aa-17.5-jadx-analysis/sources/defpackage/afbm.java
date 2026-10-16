package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public final class afbm<T> extends afau<T> {
    public final List a;

    public afbm(List list) {
        this.a = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, T t) {
        this.a.add(woy.bx(this, i), t);
    }

    @Override // defpackage.afau
    public final int b() {
        return this.a.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.afau
    public final Object d(int i) {
        return this.a.remove(woy.bw(this, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return (T) this.a.get(woy.bw(this, i));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new afbn(this, 0, 1);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new afbn(this, 0, 1);
    }

    @Override // java.util.AbstractList, java.util.List
    public final T set(int i, T t) {
        return (T) this.a.set(woy.bw(this, i), t);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new afbn(this, i, 1);
    }
}
