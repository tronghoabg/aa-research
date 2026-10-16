package P;

import Fe.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC3339j;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4293c;

/* loaded from: classes.dex */
public final class b implements List, InterfaceC4293c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8965a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8966b;

    /* renamed from: c, reason: collision with root package name */
    public int f8967c;

    public b(int i5, int i10, List list) {
        this.f8965a = list;
        this.f8966b = i5;
        this.f8967c = i10;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i5 = this.f8967c;
        this.f8967c = i5 + 1;
        this.f8965a.add(i5, obj);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i5, Collection collection) {
        this.f8965a.addAll(i5 + this.f8966b, collection);
        this.f8967c = collection.size() + this.f8967c;
        return collection.size() > 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i5 = this.f8967c - 1;
        int i10 = this.f8966b;
        if (i10 <= i5) {
            while (true) {
                this.f8965a.remove(i5);
                if (i5 == i10) {
                    break;
                } else {
                    i5--;
                }
            }
        }
        this.f8967c = i10;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i5 = this.f8967c;
        for (int i10 = this.f8966b; i10 < i5; i10++) {
            if (AbstractC3340k.a(this.f8965a.get(i10), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object get(int i5) {
        g.j(i5, this);
        return this.f8965a.get(i5 + this.f8966b);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i5 = this.f8967c;
        int i10 = this.f8966b;
        for (int i11 = i10; i11 < i5; i11++) {
            if (AbstractC3340k.a(this.f8965a.get(i11), obj)) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f8967c == this.f8966b;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new c(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i5 = this.f8967c - 1;
        int i10 = this.f8966b;
        if (i10 > i5) {
            return -1;
        }
        while (!AbstractC3340k.a(this.f8965a.get(i5), obj)) {
            if (i5 == i10) {
                return -1;
            }
            i5--;
        }
        return i5 - i10;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new c(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i5 = this.f8967c;
        for (int i10 = this.f8966b; i10 < i5; i10++) {
            ?? r22 = this.f8965a;
            if (AbstractC3340k.a(r22.get(i10), obj)) {
                r22.remove(i10);
                this.f8967c--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i5 = this.f8967c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i5 != this.f8967c;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i5 = this.f8967c;
        int i10 = i5 - 1;
        int i11 = this.f8966b;
        if (i11 <= i10) {
            while (true) {
                ?? r32 = this.f8965a;
                if (!collection.contains(r32.get(i10))) {
                    r32.remove(i10);
                    this.f8967c--;
                }
                if (i10 == i11) {
                    break;
                }
                i10--;
            }
        }
        return i5 != this.f8967c;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i5, Object obj) {
        g.j(i5, this);
        return this.f8965a.set(i5 + this.f8966b, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f8967c - this.f8966b;
    }

    @Override // java.util.List
    public final List subList(int i5, int i10) {
        g.k(i5, i10, this);
        return new b(i5, i10, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC3339j.b(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i5, Object obj) {
        this.f8965a.add(i5 + this.f8966b, obj);
        this.f8967c++;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i5) {
        return new c(i5, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC3339j.c(this, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f8965a.addAll(this.f8967c, collection);
        this.f8967c = collection.size() + this.f8967c;
        return collection.size() > 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i5) {
        g.j(i5, this);
        this.f8967c--;
        return this.f8965a.remove(i5 + this.f8966b);
    }
}
