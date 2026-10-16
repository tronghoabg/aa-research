package l8;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import k8.InterfaceC3202k;

/* loaded from: classes4.dex */
public class o0 extends AbstractCollection implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final Set f40150a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3202k f40151b;

    public o0(Set set, InterfaceC3202k interfaceC3202k) {
        this.f40150a = set;
        this.f40151b = interfaceC3202k;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Fe.e.q(this.f40151b.apply(obj));
        return this.f40150a.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Fe.e.q(this.f40151b.apply(it.next()));
        }
        return this.f40150a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f40150a;
        boolean z2 = set instanceof RandomAccess;
        InterfaceC3202k interfaceC3202k = this.f40151b;
        if (!z2 || !(set instanceof List)) {
            Iterator it = set.iterator();
            interfaceC3202k.getClass();
            while (it.hasNext()) {
                if (interfaceC3202k.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        interfaceC3202k.getClass();
        int i5 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            Object obj = list.get(i10);
            if (!interfaceC3202k.apply(obj)) {
                if (i10 > i5) {
                    try {
                        list.set(i5, obj);
                    } catch (IllegalArgumentException unused) {
                        AbstractC3437s.q(list, interfaceC3202k, i5, i10);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        AbstractC3437s.q(list, interfaceC3202k, i5, i10);
                        return;
                    }
                }
                i5++;
            }
        }
        list.subList(i5, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        Set set = this.f40150a;
        set.getClass();
        try {
            zContains = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f40151b.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return AbstractC3437s.g(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC3437s.k(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f40150a.iterator();
        InterfaceC3202k interfaceC3202k = this.f40151b;
        Fe.e.t(interfaceC3202k, "predicate");
        int i5 = 0;
        while (true) {
            if (!it.hasNext()) {
                i5 = -1;
                break;
            }
            if (interfaceC3202k.apply(it.next())) {
                break;
            }
            i5++;
        }
        return true ^ (i5 != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f40150a.iterator();
        it.getClass();
        InterfaceC3202k interfaceC3202k = this.f40151b;
        interfaceC3202k.getClass();
        return new C3416S(it, interfaceC3202k);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f40150a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f40150a.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f40151b.apply(next) && collection.contains(next)) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f40150a.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f40151b.apply(next) && !collection.contains(next)) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f40150a.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            if (this.f40151b.apply(it.next())) {
                i5++;
            }
        }
        return i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            AbstractC3419a abstractC3419a = (AbstractC3419a) it;
            if (!abstractC3419a.hasNext()) {
                return arrayList.toArray();
            }
            arrayList.add(abstractC3419a.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            AbstractC3419a abstractC3419a = (AbstractC3419a) it;
            if (abstractC3419a.hasNext()) {
                arrayList.add(abstractC3419a.next());
            } else {
                return arrayList.toArray(objArr);
            }
        }
    }
}
