package ff;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: ff.C, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2642C extends h {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f35405a;

    public C2642C(ArrayList arrayList) {
        this.f35405a = arrayList;
    }

    @Override // ff.h
    public final int a() {
        return this.f35405a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        this.f35405a.add(o.i0(i5, this), obj);
    }

    @Override // ff.h
    public final Object c(int i5) {
        return this.f35405a.remove(o.h0(i5, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f35405a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        return this.f35405a.get(o.h0(i5, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new X.B(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new X.B(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        return this.f35405a.set(o.h0(i5, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i5) {
        return new X.B(this, i5);
    }
}
