package t0;

import com.unity3d.services.UnityAdsConstants;
import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import kotlin.jvm.internal.AbstractC3339j;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;
import uf.InterfaceC4291a;

/* renamed from: t0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4060h implements List, InterfaceC4291a, j$.util.List {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f45476a = new Object[16];

    /* renamed from: b, reason: collision with root package name */
    public long[] f45477b = new long[16];

    /* renamed from: c, reason: collision with root package name */
    public int f45478c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f45479d;

    public final long a() {
        long jI = Fe.g.i(Float.POSITIVE_INFINITY, false);
        int i5 = this.f45478c + 1;
        int iZ = AbstractC3935e.z(this);
        if (i5 <= iZ) {
            while (true) {
                long j8 = this.f45477b[i5];
                if (Fe.c.m(j8, jI) < 0) {
                    jI = j8;
                }
                if (Float.intBitsToFloat((int) (jI >> 32)) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && ((int) (4294967295L & jI)) != 0) {
                    return jI;
                }
                if (i5 == iZ) {
                    break;
                }
                i5++;
            }
        }
        return jI;
    }

    @Override // java.util.List
    public final void add(int i5, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i5, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void c(Object obj, float f10, boolean z2, tf.a aVar) {
        int i5 = this.f45478c;
        int i10 = i5 + 1;
        this.f45478c = i10;
        Object[] objArr = this.f45476a;
        if (i10 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
            AbstractC3340k.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f45476a = objArrCopyOf;
            long[] jArrCopyOf = Arrays.copyOf(this.f45477b, length);
            AbstractC3340k.d(jArrCopyOf, "copyOf(this, newSize)");
            this.f45477b = jArrCopyOf;
        }
        Object[] objArr2 = this.f45476a;
        int i11 = this.f45478c;
        objArr2[i11] = obj;
        this.f45477b[i11] = Fe.g.i(f10, z2);
        d();
        aVar.invoke();
        this.f45478c = i5;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f45478c = -1;
        d();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
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

    public final void d() {
        int i5 = this.f45478c + 1;
        int iZ = AbstractC3935e.z(this);
        if (i5 <= iZ) {
            while (true) {
                this.f45476a[i5] = null;
                if (i5 == iZ) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        this.f45479d = this.f45478c + 1;
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.List
    public final Object get(int i5) {
        return this.f45476a[i5];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iZ = AbstractC3935e.z(this);
        if (iZ < 0) {
            return -1;
        }
        int i5 = 0;
        while (!AbstractC3340k.a(this.f45476a[i5], obj)) {
            if (i5 == iZ) {
                return -1;
            }
            i5++;
        }
        return i5;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f45479d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new X.v(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        for (int iZ = AbstractC3935e.z(this); -1 < iZ; iZ--) {
            if (AbstractC3340k.a(this.f45476a[iZ], obj)) {
                return iZ;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new X.v(this, 0, 7);
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Stream.Wrapper.convert(Collection.CC.$default$parallelStream(this));
    }

    @Override // java.util.List
    public final Object remove(int i5) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final Object set(int i5, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f45479d;
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(List.CC.$default$spliterator(this));
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(Collection.CC.$default$stream(this));
    }

    @Override // java.util.List
    public final java.util.List subList(int i5, int i10) {
        return new C4059g(this, i5, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC3339j.b(this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i5) {
        return new X.v(this, i5, 6);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ j$.util.stream.Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection
    public final /* synthetic */ j$.util.Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ j$.util.stream.Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC3340k.e(array, "array");
        return AbstractC3339j.c(this, array);
    }
}
