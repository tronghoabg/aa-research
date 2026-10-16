package com.google.d.l;

import com.google.d.b.an;
import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.Stream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Comparator;
import java.util.RandomAccess;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e extends AbstractList implements RandomAccess, Serializable, List {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    final int[] f7967a;

    /* renamed from: b, reason: collision with root package name */
    final int f7968b;

    /* renamed from: c, reason: collision with root package name */
    final int f7969c;

    e(int[] iArr, int i2, int i3) {
        this.f7967a = iArr;
        this.f7968b = i2;
        this.f7969c = i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && j.g(this.f7967a, ((Integer) obj).intValue(), this.f7968b, this.f7969c) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return super.equals(obj);
        }
        e eVar = (e) obj;
        int size = size();
        if (eVar.size() != size) {
            return false;
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f7967a[this.f7968b + i2] != eVar.f7967a[eVar.f7968b + i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        an.A(i2, size());
        return Integer.valueOf(this.f7967a[this.f7968b + i2]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = this.f7968b; i3 < this.f7969c; i3++) {
            i2 = (i2 * 31) + this.f7967a[i3];
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int[] iArr = this.f7967a;
        int iIntValue = ((Integer) obj).intValue();
        int i2 = this.f7968b;
        int iG = j.g(iArr, iIntValue, i2, this.f7969c);
        if (iG >= 0) {
            return iG - i2;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.f7967a;
            int iIntValue = ((Integer) obj).intValue();
            int i2 = this.f7968b;
            int i3 = this.f7969c - 1;
            while (true) {
                if (i3 < i2) {
                    i3 = -1;
                    break;
                }
                if (iArr[i3] == iIntValue) {
                    break;
                }
                i3--;
            }
            if (i3 >= 0) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        Integer num = (Integer) obj;
        an.A(i2, size());
        int i3 = this.f7968b;
        int[] iArr = this.f7967a;
        int i4 = i3 + i2;
        int i5 = iArr[i4];
        an.B(num);
        iArr[i4] = num.intValue();
        return Integer.valueOf(i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7969c - this.f7968b;
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List, j$.util.List, j$.util.Collection, j$.lang.a
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this.f7967a, this.f7968b, this.f7969c, 0);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List<Integer> subList(int i2, int i3) {
        an.t(i2, i3, size());
        if (i2 == i3) {
            return Collections.EMPTY_LIST;
        }
        int[] iArr = this.f7967a;
        int i4 = this.f7968b;
        return new e(iArr, i4 + i2, i3 + i4);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.f7967a;
        int i2 = this.f7968b;
        sb.append(iArr[i2]);
        while (true) {
            i2++;
            if (i2 >= this.f7969c) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i2]);
        }
    }
}
