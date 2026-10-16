package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class yof<E> extends defpackage.yoe<E> implements java.util.List<E> {
    private static final long serialVersionUID = 0;

    public yof(java.util.List list, java.lang.Object obj) {
        super(list, obj);
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        synchronized (this.g) {
            a().add(i, e);
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection<? extends E> collection) {
        boolean zAddAll;
        synchronized (this.g) {
            zAddAll = a().addAll(i, collection);
        }
        return zAddAll;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.yoe
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final java.util.List a() {
        return (java.util.List) super.a();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            zEquals = a().equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.List
    public final E get(int i) {
        E e;
        synchronized (this.g) {
            e = (E) a().get(i);
        }
        return e;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode;
        synchronized (this.g) {
            iHashCode = a().hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        int iIndexOf;
        synchronized (this.g) {
            iIndexOf = a().indexOf(obj);
        }
        return iIndexOf;
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        int iLastIndexOf;
        synchronized (this.g) {
            iLastIndexOf = a().lastIndexOf(obj);
        }
        return iLastIndexOf;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return a().listIterator();
    }

    @Override // java.util.List
    public final E remove(int i) {
        E e;
        synchronized (this.g) {
            e = (E) a().remove(i);
        }
        return e;
    }

    @Override // java.util.List
    public final E set(int i, E e) {
        E e2;
        synchronized (this.g) {
            e2 = (E) a().set(i, e);
        }
        return e2;
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        java.util.List listL;
        java.lang.Object obj = this.g;
        synchronized (obj) {
            listL = defpackage.ysr.l(a().subList(i, i2), obj);
        }
        return listL;
    }

    @Override // java.util.List
    public final java.util.ListIterator<E> listIterator(int i) {
        return a().listIterator(i);
    }
}
