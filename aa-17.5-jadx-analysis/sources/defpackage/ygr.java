package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class ygr<E> extends yfg<E> implements Set<E>, j$.util.Set<E> {
    private static final long serialVersionUID = 912559;
    private transient yfq a;

    static int j(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            woy.O(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static ygr l(int i, Object... objArr) {
        if (i == 0) {
            return yly.a;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new ymp(obj);
        }
        int iJ = j(i);
        Object[] objArr2 = new Object[iJ];
        int i2 = iJ - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            yrm.A(obj2, i5);
            int iHashCode = obj2.hashCode();
            int iW = wub.w(iHashCode);
            while (true) {
                int i6 = iW & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iW++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new ymp(obj4);
        }
        if (j(i4) < iJ / 2) {
            return l(i4, objArr);
        }
        if (u(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new yly(objArr, i3, objArr2, i2, i4);
    }

    public static ygr m(Iterable iterable) {
        if (iterable instanceof Collection) {
            return n((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return yly.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return new ymp(next);
        }
        ygp ygpVar = new ygp();
        ygpVar.c(next);
        it.getClass();
        while (it.hasNext()) {
            ygpVar.c(it.next());
        }
        return ygpVar.g();
    }

    public static ygr n(Collection collection) {
        if ((collection instanceof ygr) && !(collection instanceof SortedSet)) {
            ygr ygrVar = (ygr) collection;
            if (!ygrVar.f()) {
                return ygrVar;
            }
        }
        Object[] array = collection.toArray();
        return l(array.length, array);
    }

    public static ygr o(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? l(length, (Object[]) objArr.clone()) : new ymp(objArr[0]) : yly.a;
    }

    public static ygr p(Object obj, Object obj2) {
        return l(2, obj, obj2);
    }

    public static ygr q(Object obj, Object obj2, Object obj3) {
        return l(3, obj, obj2, obj3);
    }

    public static ygr r(Object obj, Object obj2, Object obj3, Object obj4) {
        return l(4, obj, obj2, obj3, obj4);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static ygr s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return l(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static ygr t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return l(i, objArr2);
    }

    public static boolean u(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public static void v() {
        yly ylyVar = yly.a;
    }

    @Override // defpackage.yfg
    public yfq d() {
        yfq yfqVar = this.a;
        if (yfqVar != null) {
            return yfqVar;
        }
        yfq yfqVarK = k();
        this.a = yfqVarK;
        return yfqVarK;
    }

    @Override // defpackage.yfg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public abstract yno iterator();

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ygr) && i() && ((ygr) obj).i() && hashCode() != obj.hashCode()) {
            return false;
        }
        return yrm.v(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return yrm.m(this);
    }

    public boolean i() {
        return false;
    }

    public yfq k() {
        return yfq.k(toArray());
    }

    @Override // defpackage.yfg
    public Object writeReplace() {
        return new ygq(toArray());
    }
}
