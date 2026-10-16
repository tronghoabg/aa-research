package ef;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3339j;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4291a;

/* renamed from: ef.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2540x implements Collection, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f34689a;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof C2539w)) {
            return false;
        }
        long j8 = ((C2539w) obj).f34688a;
        long[] jArr = this.f34689a;
        int length = jArr.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i5 = -1;
                break;
            }
            if (j8 == jArr[i5]) {
                break;
            }
            i5++;
        }
        return i5 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC3340k.e(elements, "elements");
        Collection collection = elements;
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (obj instanceof C2539w) {
                    long j8 = ((C2539w) obj).f34688a;
                    long[] jArr = this.f34689a;
                    int length = jArr.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length) {
                            i5 = -1;
                            break;
                        }
                        if (j8 == jArr[i5]) {
                            break;
                        }
                        i5++;
                    }
                    if (i5 >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof C2540x) {
            return AbstractC3340k.a(this.f34689a, ((C2540x) obj).f34689a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f34689a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f34689a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new Uf.h(this.f34689a, 3);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f34689a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC3339j.b(this);
    }

    public final String toString() {
        return "ULongArray(storage=" + Arrays.toString(this.f34689a) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC3340k.e(array, "array");
        return AbstractC3339j.c(this, array);
    }
}
