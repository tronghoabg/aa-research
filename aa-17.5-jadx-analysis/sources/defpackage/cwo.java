package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* loaded from: classes.dex */
public final class cwo implements List, j$.util.List, afgc {
    public final aag b = new aag(16);
    public final zn c = new zn(16);
    public int a = -1;

    public final int a() {
        return this.b.b;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends cfx> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final long b() {
        long jG = tv.g(Float.POSITIVE_INFINITY, false, false);
        int i = this.a + 1;
        int iA = a() - 1;
        if (i <= iA) {
            while (true) {
                zn znVar = this.c;
                if (i < 0 || i >= znVar.b) {
                    ca.aa("Index must be between 0 and size");
                }
                long j = znVar.a[i];
                if (cwi.a(j, jG) < 0) {
                    jG = j;
                }
                if ((Float.intBitsToFloat((int) (jG >> 32)) < BitmapDescriptorFactory.HUE_RED && cwi.c(jG)) || i == iA) {
                    break;
                }
                i++;
            }
        }
        return jG;
    }

    @Override // java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final cfx get(int i) {
        Object objC = this.b.c(i);
        objC.getClass();
        return (cfx) objC;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.a = -1;
        this.b.k();
        this.c.b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        return (obj instanceof cfx) && indexOf((cfx) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((cfx) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d(int i, int i2) {
        int i3;
        if (i >= i2) {
            return;
        }
        this.b.l(i, i2);
        zn znVar = this.c;
        if (i < 0 || i > (i3 = znVar.b) || i2 < 0 || i2 > i3) {
            ca.aa("Index must be between 0 and size");
        }
        if (i2 < i) {
            ca.Y("The end index must be < start index");
        }
        if (i2 != i) {
            int i4 = znVar.b;
            if (i2 < i4) {
                long[] jArr = znVar.a;
                woy.dp(jArr, jArr, i, i2, i4);
            }
            znVar.b -= i2 - i;
        }
    }

    public final boolean e(float f, boolean z) {
        if (this.a != a() - 1) {
            return cwi.a(b(), tv.g(f, z, false)) > 0;
        }
        return true;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof cfx)) {
            return -1;
        }
        cfx cfxVar = (cfx) obj;
        int iA = a() - 1;
        if (iA < 0) {
            return -1;
        }
        int i = 0;
        while (!affa.f(this.b.c(i), cfxVar)) {
            if (i == iA) {
                return -1;
            }
            i++;
        }
        return i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.b.f();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<cfx> iterator() {
        return new cwm(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof cfx)) {
            return -1;
        }
        cfx cfxVar = (cfx) obj;
        for (int iA = a() - 1; iA >= 0; iA--) {
            if (affa.f(this.b.c(iA), cfxVar)) {
                return iA;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new cwm(this, 0, 7);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    public final /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator<cfx> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator<? super cfx> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        return new cwn(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return afet.a(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) afet.b(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends cfx> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<cfx> listIterator(int i) {
        return new cwm(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
