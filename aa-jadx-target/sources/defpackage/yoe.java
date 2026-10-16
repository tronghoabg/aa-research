package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class yoe<E> extends defpackage.yoi implements java.util.Collection<E> {
    private static final long serialVersionUID = 0;

    public yoe(java.util.Collection collection, java.lang.Object obj) {
        super(collection, obj);
    }

    public java.util.Collection a() {
        return (java.util.Collection) this.f;
    }

    @Override // java.util.Collection
    public final boolean add(E e) {
        boolean zAdd;
        synchronized (this.g) {
            zAdd = a().add(e);
        }
        return zAdd;
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection<? extends E> collection) {
        boolean zAddAll;
        synchronized (this.g) {
            zAddAll = a().addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public final void clear() {
        synchronized (this.g) {
            a().clear();
        }
    }

    @Override // java.util.Collection
    public boolean contains(java.lang.Object obj) {
        boolean zContains;
        synchronized (this.g) {
            zContains = a().contains(obj);
        }
        return zContains;
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        boolean zContainsAll;
        synchronized (this.g) {
            zContainsAll = a().containsAll(collection);
        }
        return zContainsAll;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.g) {
            zIsEmpty = a().isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
        return a().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object obj) {
        boolean zRemove;
        synchronized (this.g) {
            zRemove = a().remove(obj);
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        boolean zRemoveAll;
        synchronized (this.g) {
            zRemoveAll = a().removeAll(collection);
        }
        return zRemoveAll;
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        boolean zRetainAll;
        synchronized (this.g) {
            zRetainAll = a().retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // java.util.Collection
    public final int size() {
        int size;
        synchronized (this.g) {
            size = a().size();
        }
        return size;
    }

    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
        java.lang.Object[] array;
        synchronized (this.g) {
            array = a().toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        T[] tArr2;
        synchronized (this.g) {
            tArr2 = (T[]) a().toArray(tArr);
        }
        return tArr2;
    }
}
