package com.google.d.d;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class ci<E> extends bh<E> implements Set<E>, j$.util.Set<E> {
    private static final long serialVersionUID = 912559;

    /* renamed from: a, reason: collision with root package name */
    private transient bn f7492a;

    ci() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ci a(int i2, Object... objArr) {
        if (i2 == 0) {
            return fb.f7608a;
        }
        if (i2 == 1) {
            return new fm(Objects.requireNonNull(objArr[0]));
        }
        int iC = c(i2);
        Object[] objArr2 = new Object[iC];
        int i3 = iC - 1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            Object obj = objArr[i6];
            fo.q(obj, i6);
            int iHashCode = obj.hashCode();
            int iV = fo.V(iHashCode);
            while (true) {
                int i7 = iV & i3;
                Object obj2 = objArr2[i7];
                if (obj2 == null) {
                    objArr[i5] = obj;
                    objArr2[i7] = obj;
                    i4 += iHashCode;
                    i5++;
                    break;
                }
                if (!obj2.equals(obj)) {
                    iV++;
                }
            }
        }
        Arrays.fill(objArr, i5, i2, (Object) null);
        if (i5 == 1) {
            return new fm(Objects.requireNonNull(objArr[0]));
        }
        if (c(i5) < iC / 2) {
            return a(i5, objArr);
        }
        int length = objArr.length;
        if (i5 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i5);
        }
        return new fb(objArr, i4, objArr2, i3, i5);
    }

    static int c(int i2) {
        int iMax = Math.max(i2, 2);
        if (iMax >= 751619276) {
            com.google.d.b.an.m(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static ci m(Collection collection) {
        if ((collection instanceof ci) && !(collection instanceof SortedSet)) {
            ci ciVar = (ci) collection;
            if (!ciVar.i()) {
                return ciVar;
            }
        }
        Object[] array = collection.toArray();
        return a(array.length, array);
    }

    public static ci n(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? a(length, (Object[]) objArr.clone()) : new fm(objArr[0]) : fb.f7608a;
    }

    public static ci o() {
        return fb.f7608a;
    }

    public static ci p(Object obj) {
        return new fm(obj);
    }

    public static ci q(Object obj, Object obj2) {
        return a(2, obj, obj2);
    }

    public static ci r(Object obj, Object obj2, Object obj3) {
        return a(3, obj, obj2, obj3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static ci s(Object obj, Object obj2, Object obj3, Object obj4) {
        return a(4, obj, obj2, obj3, obj4);
    }

    public static ci t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return a(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static ci u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        com.google.d.b.an.m(true, "the total number of elements must fit in an int");
        int length = objArr.length;
        int i2 = length + 6;
        Object[] objArr2 = new Object[i2];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return a(i2, objArr2);
    }

    boolean b() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ci) && b() && ((ci) obj).b() && hashCode() != obj.hashCode()) {
            return false;
        }
        return fo.h(this, obj);
    }

    @Override // com.google.d.d.bh
    public bn g() {
        bn bnVar = this.f7492a;
        if (bnVar != null) {
            return bnVar;
        }
        bn bnVarK = k();
        this.f7492a = bnVarK;
        return bnVarK;
    }

    @Override // com.google.d.d.bh, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public abstract fu listIterator();

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return fo.b(this);
    }

    bn k() {
        return bn.k(toArray());
    }

    @Override // com.google.d.d.bh
    Object writeReplace() {
        return new ch(toArray());
    }
}
