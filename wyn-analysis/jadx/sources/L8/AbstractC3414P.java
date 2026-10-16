package l8;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import ka.AbstractC3256n;

/* renamed from: l8.P, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3414P extends AbstractC3404F implements Set, j$.util.Set {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f40063c = 0;

    /* renamed from: b, reason: collision with root package name */
    public transient AbstractC3409K f40064b;

    public static int h(int i5) {
        int iMax = Math.max(i5, 2);
        if (iMax >= 751619276) {
            Fe.e.p("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (iHighestOneBit * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static AbstractC3414P i(int i5, Object... objArr) {
        if (i5 == 0) {
            return k0.f40128j;
        }
        if (i5 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new r0(obj);
        }
        int iH = h(i5);
        Object[] objArr2 = new Object[iH];
        int i10 = iH - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i5; i13++) {
            Object obj2 = objArr[i13];
            if (obj2 == null) {
                throw new NullPointerException(AbstractC3256n.g(i13, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iR = AbstractC3437s.r(iHashCode);
            while (true) {
                int i14 = iR & i10;
                Object obj3 = objArr2[i14];
                if (obj3 == null) {
                    objArr[i12] = obj2;
                    objArr2[i14] = obj2;
                    i11 += iHashCode;
                    i12++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iR++;
            }
        }
        Arrays.fill(objArr, i12, i5, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new r0(obj4);
        }
        if (h(i12) < iH / 2) {
            return i(i12, objArr);
        }
        int length = objArr.length;
        if (i12 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new k0(objArr, i11, objArr2, i10, i12);
    }

    public static AbstractC3414P j(Collection collection) {
        if ((collection instanceof AbstractC3414P) && !(collection instanceof SortedSet)) {
            AbstractC3414P abstractC3414P = (AbstractC3414P) collection;
            if (!abstractC3414P.f()) {
                return abstractC3414P;
            }
        }
        Object[] array = collection.toArray();
        return i(array.length, array);
    }

    @Override // l8.AbstractC3404F
    public AbstractC3409K a() {
        AbstractC3409K abstractC3409K = this.f40064b;
        if (abstractC3409K != null) {
            return abstractC3409K;
        }
        AbstractC3409K abstractC3409KK = k();
        this.f40064b = abstractC3409KK;
        return abstractC3409KK;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC3414P) && (this instanceof k0)) {
            AbstractC3414P abstractC3414P = (AbstractC3414P) obj;
            abstractC3414P.getClass();
            if ((abstractC3414P instanceof k0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return AbstractC3437s.g(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC3437s.k(this);
    }

    public AbstractC3409K k() {
        Object[] array = toArray(AbstractC3404F.f40047a);
        C3407I c3407i = AbstractC3409K.f40056b;
        return AbstractC3409K.h(array.length, array);
    }
}
