package j$.util.concurrent;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class b implements Collection, Serializable {
    private static final long serialVersionUID = 7249069246763182397L;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f50170a;

    public b(ConcurrentHashMap concurrentHashMap) {
        this.f50170a = concurrentHashMap;
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f50170a.clear();
    }

    @Override // java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (collection == this) {
            return true;
        }
        for (Object obj : collection) {
            if (obj == null || !contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f50170a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract Iterator iterator();

    @Override // java.util.Collection, java.util.Set
    public abstract boolean remove(Object obj);

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        collection.getClass();
        k[] kVarArr = this.f50170a.f50150a;
        boolean zRemove = false;
        if (kVarArr == null) {
            return false;
        }
        if (!(collection instanceof Set) || collection.size() <= kVarArr.length) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= remove(it.next());
            }
            return zRemove;
        }
        Iterator it2 = iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        Iterator it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f50170a.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        long j2 = this.f50170a.j();
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 > 2147483639) {
            throw new OutOfMemoryError("Required array size too large");
        }
        int i2 = (int) j2;
        Object[] objArrCopyOf = objArr.length >= i2 ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
        int length = objArrCopyOf.length;
        Iterator it = iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (i3 == length) {
                if (length >= 2147483639) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                int i4 = length < 1073741819 ? (length >>> 1) + 1 + length : 2147483639;
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                length = i4;
            }
            objArrCopyOf[i3] = next;
            i3++;
        }
        if (objArr != objArrCopyOf || i3 >= length) {
            return i3 == length ? objArrCopyOf : Arrays.copyOf(objArrCopyOf, i3);
        }
        objArrCopyOf[i3] = null;
        return objArrCopyOf;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        if (it.hasNext()) {
            while (true) {
                Object next = it.next();
                if (next == this) {
                    next = "(this Collection)";
                }
                sb.append(next);
                if (!it.hasNext()) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        long j2 = this.f50170a.j();
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= 2147483639) {
            int i2 = (int) j2;
            Object[] objArrCopyOf = new Object[i2];
            Iterator it = iterator();
            int i3 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                if (i3 == i2) {
                    if (i2 < 2147483639) {
                        int i4 = i2 < 1073741819 ? (i2 >>> 1) + 1 + i2 : 2147483639;
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                        i2 = i4;
                    } else {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                }
                objArrCopyOf[i3] = next;
                i3++;
            }
            return i3 == i2 ? objArrCopyOf : Arrays.copyOf(objArrCopyOf, i3);
        }
        throw new OutOfMemoryError("Required array size too large");
    }
}
