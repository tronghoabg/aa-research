package ef;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3339j;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4291a;

/* renamed from: ef.A, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2513A implements Collection, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public final short[] f34652a;

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
        if (!(obj instanceof C2542z)) {
            return false;
        }
        short s10 = ((C2542z) obj).f34691a;
        short[] sArr = this.f34652a;
        int length = sArr.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i5 = -1;
                break;
            }
            if (s10 == sArr[i5]) {
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
                if (obj instanceof C2542z) {
                    short s10 = ((C2542z) obj).f34691a;
                    short[] sArr = this.f34652a;
                    int length = sArr.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length) {
                            i5 = -1;
                            break;
                        }
                        if (s10 == sArr[i5]) {
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
        if (obj instanceof C2513A) {
            return AbstractC3340k.a(this.f34652a, ((C2513A) obj).f34652a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f34652a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f34652a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new Uf.h(this.f34652a, 4);
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
        return this.f34652a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC3339j.b(this);
    }

    public final String toString() {
        return "UShortArray(storage=" + Arrays.toString(this.f34652a) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC3340k.e(array, "array");
        return AbstractC3339j.c(this, array);
    }
}
