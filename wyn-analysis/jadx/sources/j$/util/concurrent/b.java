package j$.util.concurrent;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
abstract class b implements Collection, Serializable {
    private static final long serialVersionUID = 7249069246763182397L;

    /* renamed from: a, reason: collision with root package name */
    final ConcurrentHashMap f37814a;

    @Override // java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract Iterator iterator();

    @Override // java.util.Collection, java.util.Set
    public abstract boolean remove(Object obj);

    b(ConcurrentHashMap concurrentHashMap) {
        this.f37814a = concurrentHashMap;
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f37814a.clear();
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f37814a.size();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f37814a.isEmpty();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        long j8 = this.f37814a.j();
        if (j8 < 0) {
            j8 = 0;
        }
        if (j8 > 2147483639) {
            throw new OutOfMemoryError("Required array size too large");
        }
        int i5 = (int) j8;
        Object[] objArrCopyOf = new Object[i5];
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (i10 == i5) {
                if (i5 >= 2147483639) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                int i11 = i5 < 1073741819 ? (i5 >>> 1) + 1 + i5 : 2147483639;
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i11);
                i5 = i11;
            }
            objArrCopyOf[i10] = next;
            i10++;
        }
        return i10 == i5 ? objArrCopyOf : Arrays.copyOf(objArrCopyOf, i10);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        long j8 = this.f37814a.j();
        if (j8 < 0) {
            j8 = 0;
        }
        if (j8 > 2147483639) {
            throw new OutOfMemoryError("Required array size too large");
        }
        int i5 = (int) j8;
        Object[] objArrCopyOf = objArr.length >= i5 ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i5);
        int length = objArrCopyOf.length;
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (i10 == length) {
                if (length >= 2147483639) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                int i11 = length < 1073741819 ? (length >>> 1) + 1 + length : 2147483639;
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i11);
                length = i11;
            }
            objArrCopyOf[i10] = next;
            i10++;
        }
        if (objArr != objArrCopyOf || i10 >= length) {
            return i10 == length ? objArrCopyOf : Arrays.copyOf(objArrCopyOf, i10);
        }
        objArrCopyOf[i10] = null;
        return objArrCopyOf;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        if (it.hasNext()) {
            while (true) {
                Object next = it.next();
                if (next == this) {
                    next = "(this Collection)";
                }
                sb2.append(next);
                if (!it.hasNext()) {
                    break;
                }
                sb2.append(", ");
            }
        }
        sb2.append(']');
        return sb2.toString();
    }

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
    public boolean removeAll(Collection collection) {
        collection.getClass();
        l[] lVarArr = this.f37814a.f37798a;
        boolean zRemove = false;
        if (lVarArr == null) {
            return false;
        }
        if ((collection instanceof Set) && collection.size() > lVarArr.length) {
            Iterator it = iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    zRemove = true;
                }
            }
            return zRemove;
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            zRemove |= remove(it2.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        Iterator it = iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }
}
