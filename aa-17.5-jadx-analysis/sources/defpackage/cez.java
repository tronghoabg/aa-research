package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class cez<T> implements List<T>, afgd {
    public int a;
    private final SnapshotStateList b;
    private final int c;
    private int d;

    public cez(SnapshotStateList snapshotStateList, int i, int i2) {
        this.b = snapshotStateList;
        this.c = i;
        this.d = ceo.a(snapshotStateList);
        this.a = i2 - i;
    }

    private final void b() {
        if (ceo.a(this.b) != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    public final Object a(int i) {
        b();
        SnapshotStateList snapshotStateList = this.b;
        Object objB = snapshotStateList.b(this.c + i);
        this.a--;
        this.d = ceo.a(snapshotStateList);
        return objB;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        b();
        int i = this.c + this.a;
        SnapshotStateList snapshotStateList = this.b;
        snapshotStateList.add(i, t);
        this.a++;
        this.d = ceo.a(snapshotStateList);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        b();
        SnapshotStateList snapshotStateList = this.b;
        boolean zAddAll = snapshotStateList.addAll(i + this.c, collection);
        if (zAddAll) {
            this.a += collection.size();
            this.d = ceo.a(snapshotStateList);
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.a > 0) {
            b();
            SnapshotStateList snapshotStateList = this.b;
            int i = this.c;
            snapshotStateList.f(i, this.a + i);
            this.a = 0;
            this.d = ceo.a(snapshotStateList);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
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
        b();
        ceo.b(i, this.a);
        return (T) this.b.get(this.c + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        int i = this.c;
        afbk it = afpt.m(i, this.a + i).iterator();
        while (((afgz) it).a) {
            int iA = it.a();
            if (affa.f(obj, this.b.get(iA))) {
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
    public final Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        int i = this.c;
        for (int i2 = (this.a + i) - 1; i2 >= i; i2--) {
            if (affa.f(obj, this.b.get(i2))) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        b();
        afft afftVar = new afft();
        afftVar.a = i - 1;
        return new cey(afftVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        a(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
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
    public final boolean retainAll(Collection collection) {
        int i;
        cbf cbfVar;
        cec cecVarB;
        boolean z;
        b();
        int i2 = this.c;
        int i3 = this.a + i2;
        SnapshotStateList snapshotStateList = this.b;
        int iA = snapshotStateList.a();
        do {
            Object obj = ceo.a;
            synchronized (obj) {
                cex cexVar = snapshotStateList.a;
                cexVar.getClass();
                ceu ceuVar = (ceu) cek.e(cexVar, snapshotStateList);
                i = ceuVar.b;
                cbfVar = ceuVar.a;
            }
            cbfVar.getClass();
            cbl cblVarJ = cbfVar.j();
            cblVarJ.subList(i2, i3).retainAll(collection);
            cbf cbfVarC = cblVarJ.c();
            if (affa.f(cbfVarC, cbfVar)) {
                break;
            }
            cex cexVar2 = snapshotStateList.a;
            cexVar2.getClass();
            synchronized (cek.b) {
                cecVarB = cek.b();
                ceu ceuVar2 = (ceu) cek.j(cexVar2, snapshotStateList, cecVarB);
                synchronized (obj) {
                    int i4 = ceuVar2.b;
                    if (i4 == i) {
                        ceuVar2.a = cbfVarC;
                        ceuVar2.c++;
                        ceuVar2.b = i4 + 1;
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            cek.q(cecVarB, snapshotStateList);
        } while (!z);
        int iA2 = iA - snapshotStateList.a();
        if (iA2 > 0) {
            this.d = ceo.a(this.b);
            this.a -= iA2;
        }
        return iA2 > 0;
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        ceo.b(i, this.a);
        b();
        SnapshotStateList snapshotStateList = this.b;
        T t2 = (T) snapshotStateList.set(i + this.c, t);
        this.d = ceo.a(snapshotStateList);
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.a;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.a) {
            bxc.a("fromIndex or toIndex are out of bounds");
        }
        b();
        SnapshotStateList snapshotStateList = this.b;
        int i3 = this.c;
        return new cez(snapshotStateList, i + i3, i2 + i3);
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
    public final /* bridge */ T remove(int i) {
        return (T) a(i);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        b();
        SnapshotStateList snapshotStateList = this.b;
        snapshotStateList.add(this.c + i, t);
        this.a++;
        this.d = ceo.a(snapshotStateList);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        return addAll(this.a, collection);
    }
}
