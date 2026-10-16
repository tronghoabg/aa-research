package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class byz<T> implements java.util.List<T>, defpackage.afhd {
    private final /* synthetic */ int a;
    private final java.lang.Object b;

    public byz(java.lang.Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.List
    public final void add(int i, java.lang.Object obj) {
        int i2 = this.a;
        java.lang.Object obj2 = this.b;
        if (i2 == 0) {
            ((defpackage.bzc) obj2).f(i, obj);
            return;
        }
        if (i < 0 || i > ((defpackage.aan) obj2).b) {
            ((defpackage.aan) obj2).n(i);
        }
        defpackage.aan aanVar = (defpackage.aan) obj2;
        int i3 = aanVar.b + 1;
        java.lang.Object[] objArr = aanVar.a;
        if (objArr.length < i3) {
            aanVar.m(i3, objArr);
        }
        java.lang.Object[] objArr2 = aanVar.a;
        int i4 = aanVar.b;
        if (i != i4) {
            defpackage.afga.ck(objArr2, objArr2, i + 1, i, i4);
        }
        objArr2[i] = obj;
        aanVar.b++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        if (this.a == 0) {
            return ((defpackage.bzc) this.b).k(i, collection);
        }
        collection.getClass();
        java.lang.Object obj = this.b;
        if (i < 0 || i > ((defpackage.aan) obj).b) {
            ((defpackage.aan) obj).n(i);
        }
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        defpackage.aan aanVar = (defpackage.aan) obj;
        int size = aanVar.b + collection.size();
        java.lang.Object[] objArr = aanVar.a;
        if (objArr.length < size) {
            aanVar.m(size, objArr);
        }
        java.lang.Object[] objArr2 = aanVar.a;
        if (i != aanVar.b) {
            defpackage.afga.ck(objArr2, objArr2, collection.size() + i, i, aanVar.b);
        }
        for (T t : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                defpackage.afga.ai();
            }
            objArr2[i2 + i] = t;
            i2 = i3;
        }
        aanVar.b += collection.size();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.a;
        java.lang.Object obj = this.b;
        if (i != 0) {
            ((defpackage.aan) obj).k();
        } else {
            ((defpackage.bzc) obj).g();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        int i = this.a;
        java.lang.Object obj2 = this.b;
        return i != 0 ? ((defpackage.aan) obj2).e(obj) : ((defpackage.bzc) obj2).l(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        if (this.a == 0) {
            java.util.Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!((defpackage.bzc) this.b).l(it.next())) {
                    return false;
                }
            }
            return true;
        }
        collection.getClass();
        java.util.Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!((defpackage.aan) this.b).e(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        if (this.a != 0) {
            defpackage.aao.a(this, i);
            return ((defpackage.aan) this.b).c(i);
        }
        defpackage.bzd.a(this, i);
        return ((defpackage.bzc) this.b).a[i];
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        int i = this.a;
        java.lang.Object obj2 = this.b;
        return i != 0 ? ((defpackage.aan) obj2).a(obj) : ((defpackage.bzc) obj2).a(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        int i = this.a;
        java.lang.Object obj = this.b;
        if (i != 0) {
            return ((defpackage.aan) obj).f();
        }
        return ((defpackage.bzc) obj).b == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return this.a != 0 ? new defpackage.aae(this, 0) : new defpackage.bzb(this, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        int i = this.a;
        java.lang.Object obj2 = this.b;
        if (i == 0) {
            defpackage.bzc bzcVar = (defpackage.bzc) obj2;
            java.lang.Object[] objArr = bzcVar.a;
            for (int i2 = bzcVar.b - 1; i2 >= 0; i2--) {
                if (defpackage.afga.f(obj, objArr[i2])) {
                    return i2;
                }
            }
            return -1;
        }
        if (obj == null) {
            defpackage.aan aanVar = (defpackage.aan) obj2;
            java.lang.Object[] objArr2 = aanVar.a;
            for (int i3 = aanVar.b - 1; i3 >= 0; i3--) {
                if (objArr2[i3] == null) {
                    return i3;
                }
            }
            return -1;
        }
        defpackage.aan aanVar2 = (defpackage.aan) obj2;
        java.lang.Object[] objArr3 = aanVar2.a;
        for (int i4 = aanVar2.b - 1; i4 >= 0; i4--) {
            if (obj.equals(objArr3[i4])) {
                return i4;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return this.a != 0 ? new defpackage.aae(this, 0) : new defpackage.bzb(this, 0);
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i) {
        if (this.a != 0) {
            defpackage.aao.a(this, i);
            return ((defpackage.aan) this.b).h(i);
        }
        defpackage.bzd.a(this, i);
        return ((defpackage.bzc) this.b).c(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        if (this.a != 0) {
            collection.getClass();
            defpackage.aan aanVar = (defpackage.aan) this.b;
            int i = aanVar.b;
            java.util.Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                aanVar.o(it.next());
            }
            return i != aanVar.b;
        }
        if (!collection.isEmpty()) {
            defpackage.bzc bzcVar = (defpackage.bzc) this.b;
            int i2 = bzcVar.b;
            java.util.Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                bzcVar.m(it2.next());
            }
            if (i2 != bzcVar.b) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        if (this.a == 0) {
            defpackage.bzc bzcVar = (defpackage.bzc) this.b;
            int i = bzcVar.b;
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (!collection.contains(bzcVar.a[i2])) {
                    bzcVar.c(i2);
                }
            }
            return i != bzcVar.b;
        }
        collection.getClass();
        defpackage.aan aanVar = (defpackage.aan) this.b;
        int i3 = aanVar.b;
        java.lang.Object[] objArr = aanVar.a;
        for (int i4 = i3 - 1; i4 >= 0; i4--) {
            if (!collection.contains(objArr[i4])) {
                aanVar.h(i4);
            }
        }
        return i3 != aanVar.b;
    }

    @Override // java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        if (this.a != 0) {
            defpackage.aao.a(this, i);
            return ((defpackage.aan) this.b).i(i, obj);
        }
        defpackage.bzd.a(this, i);
        return ((defpackage.bzc) this.b).d(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i = this.a;
        java.lang.Object obj = this.b;
        return i != 0 ? ((defpackage.aan) obj).b : ((defpackage.bzc) obj).b;
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        if (this.a != 0) {
            defpackage.aao.b(this, i, i2);
            return new defpackage.aaf(this, i, i2);
        }
        defpackage.bzd.b(this, i, i2);
        return new defpackage.bza(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        if (this.a == 0) {
            return defpackage.afft.b(this, objArr);
        }
        objArr.getClass();
        return defpackage.afft.b(this, objArr);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i) {
        return this.a != 0 ? new defpackage.aae(this, i) : new defpackage.bzb(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return this.a != 0 ? defpackage.afft.a(this) : defpackage.afft.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        int i = this.a;
        java.lang.Object obj2 = this.b;
        if (i != 0) {
            return ((defpackage.aan) obj2).o(obj);
        }
        return ((defpackage.bzc) obj2).m(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        int i = this.a;
        java.lang.Object obj2 = this.b;
        if (i != 0) {
            ((defpackage.aan) obj2).p(obj);
            return true;
        }
        ((defpackage.bzc) obj2).n(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        if (this.a != 0) {
            collection.getClass();
            defpackage.aan aanVar = (defpackage.aan) this.b;
            int i = aanVar.b;
            java.util.Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                aanVar.p(it.next());
            }
            return i != aanVar.b;
        }
        defpackage.bzc bzcVar = (defpackage.bzc) this.b;
        return bzcVar.k(bzcVar.b, collection);
    }
}
