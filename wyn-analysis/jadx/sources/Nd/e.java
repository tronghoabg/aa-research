package Nd;

import Af.y;
import ff.o;
import ff.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3339j;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4296f;

/* loaded from: classes5.dex */
public final class e implements Set, InterfaceC4296f {

    /* renamed from: a, reason: collision with root package name */
    public final Set f8660a;

    /* renamed from: b, reason: collision with root package name */
    public final tf.l f8661b;

    /* renamed from: c, reason: collision with root package name */
    public final tf.l f8662c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8663d;

    public e(Set delegate, tf.l lVar, tf.l lVar2) {
        AbstractC3340k.e(delegate, "delegate");
        this.f8660a = delegate;
        this.f8661b = lVar;
        this.f8662c = lVar2;
        this.f8663d = delegate.size();
    }

    public final ArrayList a(Collection collection) {
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(p.a0(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f8662c.invoke(it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f8660a.add(this.f8662c.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        AbstractC3340k.e(elements, "elements");
        return this.f8660a.addAll(a(elements));
    }

    public final ArrayList c(Collection collection) {
        AbstractC3340k.e(collection, "<this>");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(p.a0(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f8661b.invoke(it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f8660a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8660a.contains(this.f8662c.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC3340k.e(elements, "elements");
        return this.f8660a.containsAll(a(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Set)) {
            return false;
        }
        ArrayList arrayListC = c(this.f8660a);
        return ((Set) obj).containsAll(arrayListC) && arrayListC.containsAll((Collection) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f8660a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f8660a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new y(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f8660a.remove(this.f8662c.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection elements) {
        AbstractC3340k.e(elements, "elements");
        return this.f8660a.removeAll(o.X0(a(elements)));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        AbstractC3340k.e(elements, "elements");
        return this.f8660a.retainAll(o.X0(a(elements)));
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f8663d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC3339j.b(this);
    }

    public final String toString() {
        return c(this.f8660a).toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC3340k.e(array, "array");
        return AbstractC3339j.c(this, array);
    }
}
