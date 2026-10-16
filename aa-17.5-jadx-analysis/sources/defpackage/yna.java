package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class yna<E> extends ymz<E> implements List<E> {
    private static final long serialVersionUID = 0;

    public yna(List list, Object obj) {
        super(list, obj);
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        synchronized (this.g) {
            a().add(i, e);
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        boolean zAddAll;
        synchronized (this.g) {
            zAddAll = a().addAll(i, collection);
        }
        return zAddAll;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.ymz
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final List a() {
        return (List) super.a();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
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
    public final int indexOf(Object obj) {
        int iIndexOf;
        synchronized (this.g) {
            iIndexOf = a().indexOf(obj);
        }
        return iIndexOf;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int iLastIndexOf;
        synchronized (this.g) {
            iLastIndexOf = a().lastIndexOf(obj);
        }
        return iLastIndexOf;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
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
    public final List subList(int i, int i2) {
        List listL;
        Object obj = this.g;
        synchronized (obj) {
            listL = yrm.l(a().subList(i, i2), obj);
        }
        return listL;
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator(int i) {
        return a().listIterator(i);
    }
}
