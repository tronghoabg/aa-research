package com.google.d.d;

import androidx.media3.common.MimeTypes;
import j$.util.List;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class bn<E> extends bh<E> implements List<E>, RandomAccess, j$.util.List<E> {

    /* renamed from: a, reason: collision with root package name */
    private static final fv f7455a = new bj(es.f7582a, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f7456d = 0;
    private static final long serialVersionUID = -889275714;

    bn() {
    }

    public static bn A() {
        return B(MimeTypes.VIDEO_AV1, MimeTypes.VIDEO_H263, "video/avc", MimeTypes.VIDEO_H265, MimeTypes.VIDEO_MP4V, MimeTypes.VIDEO_VP9, MimeTypes.VIDEO_APV, MimeTypes.VIDEO_DOLBY_VISION);
    }

    private static bn B(Object... objArr) {
        fo.r(objArr);
        return k(objArr);
    }

    public static bi c(int i2) {
        fo.ah(i2, "expectedSize");
        return new bi(i2);
    }

    static bn k(Object[] objArr) {
        return l(objArr, objArr.length);
    }

    static bn l(Object[] objArr, int i2) {
        return i2 == 0 ? es.f7582a : new es(objArr, i2);
    }

    public static bn m(Iterable iterable) {
        com.google.d.b.an.B(iterable);
        if (iterable instanceof Collection) {
            return n((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return es.f7582a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return q(next);
        }
        bi biVar = new bi();
        biVar.g(next);
        biVar.j(it);
        return biVar.f();
    }

    public static bn n(Collection collection) {
        if (!(collection instanceof bh)) {
            return B(collection.toArray());
        }
        bn bnVarG = ((bh) collection).g();
        return bnVarG.i() ? k(bnVarG.toArray()) : bnVarG;
    }

    public static bn o(Object[] objArr) {
        return objArr.length == 0 ? es.f7582a : B((Object[]) objArr.clone());
    }

    public static bn p() {
        return es.f7582a;
    }

    public static bn q(Object obj) {
        return B(obj);
    }

    public static bn r(Object obj, Object obj2) {
        return B(obj, obj2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static bn s(Object obj, Object obj2, Object obj3) {
        return B(obj, obj2, obj3);
    }

    public static bn t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return B(obj, obj2, obj3, obj4, obj5);
    }

    public static bn u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return B(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public static bn v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return B(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @SafeVarargs
    public static bn w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        com.google.d.b.an.m(true, "the total number of elements must fit in an int");
        int length = objArr.length;
        Object[] objArr2 = new Object[length + 12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        return B(objArr2);
    }

    public static bn x(Comparator comparator, Iterable iterable) {
        com.google.d.b.an.B(comparator);
        Object[] objArrR = fo.R(iterable);
        fo.r(objArrR);
        Arrays.sort(objArrR, comparator);
        return k(objArrR);
    }

    public bn a() {
        return size() <= 1 ? this : new bk(this);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i2, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bn subList(int i2, int i3) {
        com.google.d.b.an.t(i2, i3, size());
        int i4 = i3 - i2;
        return i4 == size() ? this : i4 == 0 ? es.f7582a : new bm(this, i2, i4);
    }

    @Override // com.google.d.d.bh, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.d.d.bh
    int d(Object[] objArr, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i2 + i3] = get(i3);
        }
        return i2 + size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i2 = 0; i2 < size; i2++) {
                if (!Objects.equals(get(i2), list.get(i2))) {
                    return false;
                }
            }
            return true;
        }
        Iterator<E> it = iterator();
        Iterator<E> it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !Objects.equals(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // com.google.d.d.bh
    @Deprecated
    public final bn g() {
        return this;
    }

    @Override // com.google.d.d.bh
    /* renamed from: h */
    public final fu listIterator() {
        return iterator();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i2 = 0; i2 < size; i2++) {
            iHashCode = (iHashCode * 31) + get(i2).hashCode();
        }
        return iHashCode;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (obj.equals(get(i2))) {
                return i2;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i2, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // com.google.d.d.bh
    Object writeReplace() {
        return new bl(toArray());
    }

    @Override // java.util.List
    /* renamed from: y, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final fv listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final fv listIterator(int i2) {
        com.google.d.b.an.E(i2, size());
        return isEmpty() ? f7455a : new bj(this, i2);
    }
}
