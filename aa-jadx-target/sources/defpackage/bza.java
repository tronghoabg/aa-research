package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bza<T> implements java.util.List<T>, defpackage.afhd {
    private final java.util.List a;
    private final int b;
    private int c;

    public bza(java.util.List list, int i, int i2) {
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
    public final boolean addAll(int i, java.util.Collection<? extends T> collection) {
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
    public final boolean contains(java.lang.Object obj) {
        int i = this.c;
        for (int i2 = this.b; i2 < i; i2++) {
            if (defpackage.afga.f(this.a.get(i2), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final T get(int i) {
        defpackage.bzd.a(this, i);
        return (T) this.a.get(i + this.b);
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        int i = this.c;
        int i2 = this.b;
        for (int i3 = i2; i3 < i; i3++) {
            if (defpackage.afga.f(this.a.get(i3), obj)) {
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
    public final java.util.Iterator<T> iterator() {
        return new defpackage.bzb(this, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        int i = this.c - 1;
        int i2 = this.b;
        if (i2 <= i) {
            while (!defpackage.afga.f(this.a.get(i), obj)) {
                if (i != i2) {
                    i--;
                }
            }
            return i - i2;
        }
        return -1;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return new defpackage.bzb(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        int i = this.c;
        for (int i2 = this.b; i2 < i; i2++) {
            java.util.List list = this.a;
            if (defpackage.afga.f(list.get(i2), obj)) {
                list.remove(i2);
                this.c--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        int i = this.c;
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i != this.c;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        int i = this.c;
        int i2 = i - 1;
        int i3 = this.b;
        if (i3 <= i2) {
            while (true) {
                java.util.List list = this.a;
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
        defpackage.bzd.a(this, i);
        return (T) this.a.set(i + this.b, t);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.c - this.b;
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        defpackage.bzd.b(this, i, i2);
        return new defpackage.bza(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return defpackage.afft.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) defpackage.afft.b(this, tArr);
    }

    @Override // java.util.List
    public final java.util.ListIterator<T> listIterator(int i) {
        return new defpackage.bzb(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        int i = this.c;
        this.c = i + 1;
        this.a.add(i, t);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends T> collection) {
        this.a.addAll(this.c, collection);
        int size = collection.size();
        this.c += size;
        return size > 0;
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        defpackage.bzd.a(this, i);
        T t = (T) this.a.remove(i + this.b);
        this.c--;
        return t;
    }
}
