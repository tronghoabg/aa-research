package j$.util;

import j$.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public class g extends f implements java.util.List, List {
    private static final long serialVersionUID = -7754090372962971524L;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f50247c;

    public g(java.util.List list) {
        super(list);
        this.f50247c = list;
    }

    private Object readResolve() {
        java.util.List list = this.f50247c;
        return list instanceof RandomAccess ? new i(list) : this;
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        synchronized (this.f50226b) {
            this.f50247c.add(i2, obj);
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i2, java.util.Collection collection) {
        boolean zAddAll;
        synchronized (this.f50226b) {
            zAddAll = this.f50247c.addAll(i2, collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f50226b) {
            zEquals = this.f50247c.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        Object obj;
        synchronized (this.f50226b) {
            obj = this.f50247c.get(i2);
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f50226b) {
            iHashCode = this.f50247c.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iIndexOf;
        synchronized (this.f50226b) {
            iIndexOf = this.f50247c.indexOf(obj);
        }
        return iIndexOf;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int iLastIndexOf;
        synchronized (this.f50226b) {
            iLastIndexOf = this.f50247c.lastIndexOf(obj);
        }
        return iLastIndexOf;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f50247c.listIterator();
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        Object objRemove;
        synchronized (this.f50226b) {
            objRemove = this.f50247c.remove(i2);
        }
        return objRemove;
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        synchronized (this.f50226b) {
            java.util.List list = this.f50247c;
            if (list instanceof List) {
                ((List) list).replaceAll(unaryOperator);
            } else {
                List.CC.$default$replaceAll(list, unaryOperator);
            }
        }
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        Object obj2;
        synchronized (this.f50226b) {
            obj2 = this.f50247c.set(i2, obj);
        }
        return obj2;
    }

    @Override // java.util.List, j$.util.List
    public final void sort(java.util.Comparator comparator) {
        synchronized (this.f50226b) {
            List.EL.sort(this.f50247c, comparator);
        }
    }

    @Override // java.util.List
    public java.util.List subList(int i2, int i3) {
        g gVar;
        synchronized (this.f50226b) {
            gVar = new g(this.f50247c.subList(i2, i3), this.f50226b);
        }
        return gVar;
    }

    public g(java.util.List list, Object obj) {
        super(list, obj);
        this.f50247c = list;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        return this.f50247c.listIterator(i2);
    }
}
