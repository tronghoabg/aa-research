package x;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4292b;
import uf.InterfaceC4296f;
import y.AbstractC4517a;

/* renamed from: x.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4413f implements Collection, Set, InterfaceC4292b, InterfaceC4296f {

    /* renamed from: a, reason: collision with root package name */
    public int[] f47504a = AbstractC4517a.f47914a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f47505b = AbstractC4517a.f47915b;

    /* renamed from: c, reason: collision with root package name */
    public int f47506c;

    public C4413f(int i5) {
        if (i5 > 0) {
            AbstractC4416i.a(this, i5);
        }
    }

    public final Object a(int i5) {
        int i10 = this.f47506c;
        Object[] objArr = this.f47505b;
        Object obj = objArr[i5];
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i11 = i10 - 1;
        int[] iArr = this.f47504a;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i5 < i11) {
                int i12 = i5 + 1;
                ff.m.g0(i5, i12, i10, iArr, iArr);
                Object[] objArr2 = this.f47505b;
                ff.m.h0(objArr2, i5, objArr2, i12, i10);
            }
            this.f47505b[i11] = null;
        } else {
            AbstractC4416i.a(this, i10 > 8 ? i10 + (i10 >> 1) : 8);
            if (i5 > 0) {
                ff.m.i0(i5, 6, iArr, this.f47504a);
                ff.m.j0(objArr, 0, this.f47505b, i5, 6);
            }
            if (i5 < i11) {
                int i13 = i5 + 1;
                ff.m.g0(i5, i13, i10, iArr, this.f47504a);
                ff.m.h0(objArr, i5, this.f47505b, i13, i10);
            }
        }
        if (i10 != this.f47506c) {
            throw new ConcurrentModificationException();
        }
        this.f47506c = i11;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i5;
        int iB;
        int i10 = this.f47506c;
        if (obj == null) {
            iB = AbstractC4416i.b(this, null, 0);
            i5 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i5 = iHashCode;
            iB = AbstractC4416i.b(this, obj, iHashCode);
        }
        if (iB >= 0) {
            return false;
        }
        int i11 = ~iB;
        int[] iArr = this.f47504a;
        if (i10 >= iArr.length) {
            int i12 = 8;
            if (i10 >= 8) {
                i12 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i12 = 4;
            }
            Object[] objArr = this.f47505b;
            AbstractC4416i.a(this, i12);
            if (i10 != this.f47506c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f47504a;
            if (iArr2.length != 0) {
                ff.m.i0(iArr.length, 6, iArr, iArr2);
                ff.m.j0(objArr, 0, this.f47505b, objArr.length, 6);
            }
        }
        if (i11 < i10) {
            int[] iArr3 = this.f47504a;
            int i13 = i11 + 1;
            ff.m.g0(i13, i11, i10, iArr3, iArr3);
            Object[] objArr2 = this.f47505b;
            ff.m.h0(objArr2, i13, objArr2, i11, i10);
        }
        int i14 = this.f47506c;
        if (i10 == i14) {
            int[] iArr4 = this.f47504a;
            if (i11 < iArr4.length) {
                iArr4[i11] = i5;
                this.f47505b[i11] = obj;
                this.f47506c = i14 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        AbstractC3340k.e(elements, "elements");
        int size = elements.size() + this.f47506c;
        int i5 = this.f47506c;
        int[] iArr = this.f47504a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f47505b;
            AbstractC4416i.a(this, size);
            int i10 = this.f47506c;
            if (i10 > 0) {
                ff.m.i0(i10, 6, iArr, this.f47504a);
                ff.m.j0(objArr, 0, this.f47505b, this.f47506c, 6);
            }
        }
        if (this.f47506c != i5) {
            throw new ConcurrentModificationException();
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f47506c != 0) {
            this.f47504a = AbstractC4517a.f47914a;
            this.f47505b = AbstractC4517a.f47915b;
            this.f47506c = 0;
        }
        if (this.f47506c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC4416i.b(this, null, 0) : AbstractC4416i.b(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        AbstractC3340k.e(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f47506c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i5 = this.f47506c;
            for (int i10 = 0; i10 < i5; i10++) {
                if (!((Set) obj).contains(this.f47505b[i10])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f47504a;
        int i5 = this.f47506c;
        int i10 = 0;
        for (int i11 = 0; i11 < i5; i11++) {
            i10 += iArr[i11];
        }
        return i10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f47506c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C4408a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iB = obj == null ? AbstractC4416i.b(this, null, 0) : AbstractC4416i.b(this, obj, obj.hashCode());
        if (iB < 0) {
            return false;
        }
        a(iB);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        AbstractC3340k.e(elements, "elements");
        Iterator it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        AbstractC3340k.e(elements, "elements");
        boolean z2 = false;
        for (int i5 = this.f47506c - 1; -1 < i5; i5--) {
            if (!ff.o.k0(elements, this.f47505b[i5])) {
                a(i5);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f47506c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return ff.m.m0(this.f47505b, 0, this.f47506c);
    }

    public final String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f47506c * 14);
        sb2.append('{');
        int i5 = this.f47506c;
        for (int i10 = 0; i10 < i5; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f47505b[i10];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC3340k.d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        AbstractC3340k.e(array, "array");
        int i5 = this.f47506c;
        if (array.length < i5) {
            array = (Object[]) Array.newInstance(array.getClass().getComponentType(), i5);
        } else if (array.length > i5) {
            array[i5] = null;
        }
        ff.m.h0(this.f47505b, 0, array, 0, this.f47506c);
        return array;
    }
}
