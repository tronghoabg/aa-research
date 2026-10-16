package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cfg<T> implements java.util.List<T>, defpackage.afhd {
    public int a;
    private final androidx.compose.runtime.snapshots.SnapshotStateList b;
    private final int c;
    private int d;

    public cfg(androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, int i, int i2) {
        this.b = snapshotStateList;
        this.c = i;
        this.d = defpackage.cev.a(snapshotStateList);
        this.a = i2 - i;
    }

    private final void b() {
        if (defpackage.cev.a(this.b) != this.d) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public final java.lang.Object a(int i) {
        b();
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = this.b;
        java.lang.Object objB = snapshotStateList.b(this.c + i);
        this.a--;
        this.d = defpackage.cev.a(snapshotStateList);
        return objB;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        b();
        int i = this.c + this.a;
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = this.b;
        snapshotStateList.add(i, t);
        this.a++;
        this.d = defpackage.cev.a(snapshotStateList);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection<? extends T> collection) {
        b();
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = this.b;
        boolean zAddAll = snapshotStateList.addAll(i + this.c, collection);
        if (zAddAll) {
            this.a += collection.size();
            this.d = defpackage.cev.a(snapshotStateList);
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.a > 0) {
            b();
            androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = this.b;
            int i = this.c;
            snapshotStateList.f(i, this.a + i);
            this.a = 0;
            this.d = defpackage.cev.a(snapshotStateList);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        if ((collection instanceof java.util.Collection) && collection.isEmpty()) {
            return true;
        }
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
        b();
        defpackage.cev.b(i, this.a);
        return (T) this.b.get(this.c + i);
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        b();
        int i = this.c;
        afhz it = defpackage.afqt.m(i, this.a + i).iterator();
        while (it.a) {
            int iA = it.a();
            if (defpackage.afga.f(obj, this.b.get(iA))) {
                return iA - i;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        b();
        int i = this.c;
        for (int i2 = (this.a + i) - 1; i2 >= i; i2--) {
            if (defpackage.afga.f(obj, this.b.get(i2))) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final java.util.ListIterator<T> listIterator(int i) {
        b();
        defpackage.afgt afgtVar = new defpackage.afgt();
        afgtVar.a = i - 1;
        return new defpackage.cff(afgtVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        a(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        int i;
        defpackage.cbl cblVar;
        defpackage.cej cejVarB;
        boolean z;
        b();
        int i2 = this.c;
        int i3 = this.a + i2;
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = this.b;
        int iA = snapshotStateList.a();
        do {
            java.lang.Object obj = defpackage.cev.a;
            synchronized (obj) {
                defpackage.cfe cfeVar = snapshotStateList.a;
                cfeVar.getClass();
                defpackage.cfb cfbVar = (defpackage.cfb) defpackage.cer.e(cfeVar, snapshotStateList);
                i = cfbVar.b;
                cblVar = cfbVar.a;
            }
            cblVar.getClass();
            defpackage.cbr cbrVarJ = cblVar.j();
            cbrVarJ.subList(i2, i3).retainAll(collection);
            defpackage.cbl cblVarC = cbrVarJ.c();
            if (defpackage.afga.f(cblVarC, cblVar)) {
                break;
            }
            defpackage.cfe cfeVar2 = snapshotStateList.a;
            cfeVar2.getClass();
            synchronized (defpackage.cer.b) {
                cejVarB = defpackage.cer.b();
                defpackage.cfb cfbVar2 = (defpackage.cfb) defpackage.cer.j(cfeVar2, snapshotStateList, cejVarB);
                synchronized (obj) {
                    int i4 = cfbVar2.b;
                    if (i4 == i) {
                        cfbVar2.a = cblVarC;
                        cfbVar2.c++;
                        cfbVar2.b = i4 + 1;
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            defpackage.cer.q(cejVarB, snapshotStateList);
        } while (!z);
        int iA2 = iA - snapshotStateList.a();
        if (iA2 > 0) {
            this.d = defpackage.cev.a(this.b);
            this.a -= iA2;
        }
        return iA2 > 0;
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        defpackage.cev.b(i, this.a);
        b();
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = this.b;
        T t2 = (T) snapshotStateList.set(i + this.c, t);
        this.d = defpackage.cev.a(snapshotStateList);
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.a;
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.a) {
            defpackage.bxi.a("fromIndex or toIndex are out of bounds");
        }
        b();
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = this.b;
        int i3 = this.c;
        return new defpackage.cfg(snapshotStateList, i + i3, i2 + i3);
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
    public final /* bridge */ T remove(int i) {
        return (T) a(i);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        b();
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = this.b;
        snapshotStateList.add(this.c + i, t);
        this.a++;
        this.d = defpackage.cev.a(snapshotStateList);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends T> collection) {
        return addAll(this.a, collection);
    }
}
