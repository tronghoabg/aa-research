package x;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import y.AbstractC4517a;

/* renamed from: x.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4429v {

    /* renamed from: a, reason: collision with root package name */
    public int[] f47561a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f47562b;

    /* renamed from: c, reason: collision with root package name */
    public int f47563c;

    public C4429v(int i5) {
        this.f47561a = i5 == 0 ? AbstractC4517a.f47914a : new int[i5];
        this.f47562b = i5 == 0 ? AbstractC4517a.f47915b : new Object[i5 << 1];
    }

    public final int a(Object obj) {
        int i5 = this.f47563c * 2;
        Object[] objArr = this.f47562b;
        if (obj == null) {
            for (int i10 = 1; i10 < i5; i10 += 2) {
                if (objArr[i10] == null) {
                    return i10 >> 1;
                }
            }
            return -1;
        }
        for (int i11 = 1; i11 < i5; i11 += 2) {
            if (obj.equals(objArr[i11])) {
                return i11 >> 1;
            }
        }
        return -1;
    }

    public final void c(int i5) {
        int i10 = this.f47563c;
        int[] iArr = this.f47561a;
        if (iArr.length < i5) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i5);
            AbstractC3340k.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f47561a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f47562b, i5 * 2);
            AbstractC3340k.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f47562b = objArrCopyOf;
        }
        if (this.f47563c != i10) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.f47563c > 0) {
            this.f47561a = AbstractC4517a.f47914a;
            this.f47562b = AbstractC4517a.f47915b;
            this.f47563c = 0;
        }
        if (this.f47563c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(int i5, Object obj) {
        int i10 = this.f47563c;
        if (i10 == 0) {
            return -1;
        }
        int iA = AbstractC4517a.a(i10, i5, this.f47561a);
        if (iA < 0 || AbstractC3340k.a(obj, this.f47562b[iA << 1])) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f47561a[i11] == i5) {
            if (AbstractC3340k.a(obj, this.f47562b[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f47561a[i12] == i5; i12--) {
            if (AbstractC3340k.a(obj, this.f47562b[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
    }

    public final int e(Object obj) {
        return obj == null ? f() : d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C4429v) {
                int i5 = this.f47563c;
                if (i5 != ((C4429v) obj).f47563c) {
                    return false;
                }
                C4429v c4429v = (C4429v) obj;
                for (int i10 = 0; i10 < i5; i10++) {
                    Object objG = g(i10);
                    Object objK = k(i10);
                    Object obj2 = c4429v.get(objG);
                    if (objK == null) {
                        if (obj2 != null || !c4429v.containsKey(objG)) {
                            return false;
                        }
                    } else if (!objK.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f47563c != ((Map) obj).size()) {
                return false;
            }
            int i11 = this.f47563c;
            for (int i12 = 0; i12 < i11; i12++) {
                Object objG2 = g(i12);
                Object objK2 = k(i12);
                Object obj3 = ((Map) obj).get(objG2);
                if (objK2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objG2)) {
                        return false;
                    }
                } else if (!objK2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int f() {
        int i5 = this.f47563c;
        if (i5 == 0) {
            return -1;
        }
        int iA = AbstractC4517a.a(i5, 0, this.f47561a);
        if (iA < 0 || this.f47562b[iA << 1] == null) {
            return iA;
        }
        int i10 = iA + 1;
        while (i10 < i5 && this.f47561a[i10] == 0) {
            if (this.f47562b[i10 << 1] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = iA - 1; i11 >= 0 && this.f47561a[i11] == 0; i11--) {
            if (this.f47562b[i11 << 1] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    public final Object g(int i5) {
        if (i5 < 0 || i5 >= this.f47563c) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f47562b[i5 << 1];
    }

    public Object get(Object obj) {
        int iE = e(obj);
        if (iE >= 0) {
            return this.f47562b[(iE << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iE = e(obj);
        return iE >= 0 ? this.f47562b[(iE << 1) + 1] : obj2;
    }

    public void h(C4429v map) {
        AbstractC3340k.e(map, "map");
        int i5 = map.f47563c;
        c(this.f47563c + i5);
        if (this.f47563c != 0) {
            for (int i10 = 0; i10 < i5; i10++) {
                put(map.g(i10), map.k(i10));
            }
        } else if (i5 > 0) {
            ff.m.g0(0, 0, i5, map.f47561a, this.f47561a);
            ff.m.h0(map.f47562b, 0, this.f47562b, 0, i5 << 1);
            this.f47563c = i5;
        }
    }

    public int hashCode() {
        int[] iArr = this.f47561a;
        Object[] objArr = this.f47562b;
        int i5 = this.f47563c;
        int i10 = 1;
        int i11 = 0;
        int iHashCode = 0;
        while (i11 < i5) {
            Object obj = objArr[i10];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i11];
            i11++;
            i10 += 2;
        }
        return iHashCode;
    }

    public Object i(int i5) {
        int i10;
        if (i5 < 0 || i5 >= (i10 = this.f47563c)) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "Expected index to be within 0..size()-1, but was ").toString());
        }
        Object[] objArr = this.f47562b;
        int i11 = i5 << 1;
        Object obj = objArr[i11 + 1];
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i12 = i10 - 1;
        int[] iArr = this.f47561a;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i5 < i12) {
                int i13 = i5 + 1;
                ff.m.g0(i5, i13, i10, iArr, iArr);
                Object[] objArr2 = this.f47562b;
                ff.m.h0(objArr2, i11, objArr2, i13 << 1, i10 << 1);
            }
            Object[] objArr3 = this.f47562b;
            int i14 = i12 << 1;
            objArr3[i14] = null;
            objArr3[i14 + 1] = null;
        } else {
            int i15 = i10 > 8 ? i10 + (i10 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i15);
            AbstractC3340k.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f47561a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f47562b, i15 << 1);
            AbstractC3340k.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f47562b = objArrCopyOf;
            if (i10 != this.f47563c) {
                throw new ConcurrentModificationException();
            }
            if (i5 > 0) {
                ff.m.g0(0, 0, i5, iArr, this.f47561a);
                ff.m.h0(objArr, 0, this.f47562b, 0, i11);
            }
            if (i5 < i12) {
                int i16 = i5 + 1;
                ff.m.g0(i5, i16, i10, iArr, this.f47561a);
                ff.m.h0(objArr, i11, this.f47562b, i16 << 1, i10 << 1);
            }
        }
        if (i10 != this.f47563c) {
            throw new ConcurrentModificationException();
        }
        this.f47563c = i12;
        return obj;
    }

    public final boolean isEmpty() {
        return this.f47563c <= 0;
    }

    public Object j(int i5, Object obj) {
        if (i5 < 0 || i5 >= this.f47563c) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "Expected index to be within 0..size()-1, but was ").toString());
        }
        int i10 = (i5 << 1) + 1;
        Object[] objArr = this.f47562b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final Object k(int i5) {
        if (i5 < 0 || i5 >= this.f47563c) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f47562b[(i5 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i5 = this.f47563c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iD = obj != null ? d(iHashCode, obj) : f();
        if (iD >= 0) {
            int i10 = (iD << 1) + 1;
            Object[] objArr = this.f47562b;
            Object obj3 = objArr[i10];
            objArr[i10] = obj2;
            return obj3;
        }
        int i11 = ~iD;
        int[] iArr = this.f47561a;
        if (i5 >= iArr.length) {
            int i12 = 8;
            if (i5 >= 8) {
                i12 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i12 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i12);
            AbstractC3340k.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f47561a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f47562b, i12 << 1);
            AbstractC3340k.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f47562b = objArrCopyOf;
            if (i5 != this.f47563c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i11 < i5) {
            int[] iArr2 = this.f47561a;
            int i13 = i11 + 1;
            ff.m.g0(i13, i11, i5, iArr2, iArr2);
            Object[] objArr2 = this.f47562b;
            ff.m.h0(objArr2, i13 << 1, objArr2, i11 << 1, this.f47563c << 1);
        }
        int i14 = this.f47563c;
        if (i5 == i14) {
            int[] iArr3 = this.f47561a;
            if (i11 < iArr3.length) {
                iArr3[i11] = iHashCode;
                Object[] objArr3 = this.f47562b;
                int i15 = i11 << 1;
                objArr3[i15] = obj;
                objArr3[i15 + 1] = obj2;
                this.f47563c = i14 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iE = e(obj);
        if (iE >= 0) {
            return i(iE);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE >= 0) {
            return j(iE, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f47563c;
    }

    public final String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f47563c * 28);
        sb2.append('{');
        int i5 = this.f47563c;
        for (int i10 = 0; i10 < i5; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object objG = g(i10);
            if (objG != sb2) {
                sb2.append(objG);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object objK = k(i10);
            if (objK != sb2) {
                sb2.append(objK);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC3340k.d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE < 0 || !AbstractC3340k.a(obj2, k(iE))) {
            return false;
        }
        i(iE);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iE = e(obj);
        if (iE < 0 || !AbstractC3340k.a(obj2, k(iE))) {
            return false;
        }
        j(iE, obj3);
        return true;
    }

    public C4429v(C4429v c4429v) {
        this(0);
        if (c4429v != null) {
            h(c4429v);
        }
    }
}
