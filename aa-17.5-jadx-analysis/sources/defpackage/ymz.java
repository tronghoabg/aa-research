package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ymz<E> extends ynd implements Collection<E> {
    private static final long serialVersionUID = 0;

    public ymz(Collection collection, Object obj) {
        super(collection, obj);
    }

    public Collection a() {
        return (Collection) this.f;
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
    public final boolean addAll(Collection<? extends E> collection) {
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

    public boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.g) {
            zContains = a().contains(obj);
        }
        return zContains;
    }

    public boolean containsAll(Collection collection) {
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

    public Iterator<E> iterator() {
        return a().iterator();
    }

    public boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.g) {
            zRemove = a().remove(obj);
        }
        return zRemove;
    }

    public boolean removeAll(Collection collection) {
        boolean zRemoveAll;
        synchronized (this.g) {
            zRemoveAll = a().removeAll(collection);
        }
        return zRemoveAll;
    }

    public boolean retainAll(Collection collection) {
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

    public Object[] toArray() {
        Object[] array;
        synchronized (this.g) {
            array = a().toArray();
        }
        return array;
    }

    public <T> T[] toArray(T[] tArr) {
        T[] tArr2;
        synchronized (this.g) {
            tArr2 = (T[]) a().toArray(tArr);
        }
        return tArr2;
    }
}
