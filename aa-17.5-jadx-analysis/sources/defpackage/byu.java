package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
final class byu<T> implements List<T>, afgd {
    private final List a;
    private final int b;
    private int c;

    public byu(List list, int i, int i2) {
        this.a = list;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        this.a.add(i + this.b, t);
        this.c++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        this.a.addAll(i + this.b, collection);
        int size = collection.size();
        this.c += size;
        return size > 0;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.c - 1;
        int i2 = this.b;
        if (i2 <= i) {
            while (true) {
                this.a.remove(i);
                if (i == i2) {
                    break;
                } else {
                    i--;
                }
            }
        }
        this.c = i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.c;
        for (int i2 = this.b; i2 < i; i2++) {
            if (affa.f(this.a.get(i2), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final T get(int i) {
        byx.a(this, i);
        return (T) this.a.get(i + this.b);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.c;
        int i2 = this.b;
        for (int i3 = i2; i3 < i; i3++) {
            if (affa.f(this.a.get(i3), obj)) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.c == this.b;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new byv(this, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.c - 1;
        int i2 = this.b;
        if (i2 <= i) {
            while (!affa.f(this.a.get(i), obj)) {
                if (i != i2) {
                    i--;
                }
            }
            return i - i2;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new byv(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.c;
        for (int i2 = this.b; i2 < i; i2++) {
            List list = this.a;
            if (affa.f(list.get(i2), obj)) {
                list.remove(i2);
                this.c--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.c;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i != this.c;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.c;
        int i2 = i - 1;
        int i3 = this.b;
        if (i3 <= i2) {
            while (true) {
                List list = this.a;
                if (!collection.contains(list.get(i2))) {
                    list.remove(i2);
                    this.c--;
                }
                if (i2 == i3) {
                    break;
                }
                i2--;
            }
        }
        return i != this.c;
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        byx.a(this, i);
        return (T) this.a.set(i + this.b, t);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.c - this.b;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        byx.b(this, i, i2);
        return new byu(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return afet.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) afet.b(this, tArr);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new byv(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        int i = this.c;
        this.c = i + 1;
        this.a.add(i, t);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        this.a.addAll(this.c, collection);
        int size = collection.size();
        this.c += size;
        return size > 0;
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        byx.a(this, i);
        this.c--;
        return (T) this.a.remove(i + this.b);
    }
}
