package gf;

import S.j;
import ff.AbstractC2651f;
import ff.C2648c;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4295e;

/* renamed from: gf.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2759f implements Map, Serializable, InterfaceC4295e {

    /* renamed from: n, reason: collision with root package name */
    public static final C2759f f35894n;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f35895a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f35896b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f35897c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f35898d;

    /* renamed from: e, reason: collision with root package name */
    public int f35899e;

    /* renamed from: f, reason: collision with root package name */
    public int f35900f;

    /* renamed from: g, reason: collision with root package name */
    public int f35901g;

    /* renamed from: h, reason: collision with root package name */
    public int f35902h;

    /* renamed from: i, reason: collision with root package name */
    public int f35903i;

    /* renamed from: j, reason: collision with root package name */
    public C2760g f35904j;
    public j k;

    /* renamed from: l, reason: collision with root package name */
    public C2760g f35905l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f35906m;

    static {
        C2759f c2759f = new C2759f(0);
        c2759f.f35906m = true;
        f35894n = c2759f;
    }

    public C2759f() {
        this(8);
    }

    public final int a(Object obj) {
        d();
        while (true) {
            int iK = k(obj);
            int i5 = this.f35899e * 2;
            int length = this.f35898d.length / 2;
            if (i5 > length) {
                i5 = length;
            }
            int i10 = 0;
            while (true) {
                int[] iArr = this.f35898d;
                int i11 = iArr[iK];
                if (i11 == 0) {
                    int i12 = this.f35900f;
                    Object[] objArr = this.f35895a;
                    if (i12 < objArr.length) {
                        int i13 = i12 + 1;
                        this.f35900f = i13;
                        objArr[i12] = obj;
                        this.f35897c[i12] = iK;
                        iArr[iK] = i13;
                        this.f35903i++;
                        this.f35902h++;
                        if (i10 > this.f35899e) {
                            this.f35899e = i10;
                        }
                        return i12;
                    }
                    h(1);
                } else {
                    if (AbstractC3340k.a(this.f35895a[i11 - 1], obj)) {
                        return -i11;
                    }
                    i10++;
                    if (i10 > i5) {
                        l(this.f35898d.length * 2);
                        break;
                    }
                    iK = iK == 0 ? this.f35898d.length - 1 : iK - 1;
                }
            }
        }
    }

    public final C2759f c() {
        d();
        this.f35906m = true;
        if (this.f35903i > 0) {
            return this;
        }
        C2759f c2759f = f35894n;
        AbstractC3340k.c(c2759f, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c2759f;
    }

    @Override // java.util.Map
    public final void clear() {
        d();
        int i5 = this.f35900f - 1;
        if (i5 >= 0) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.f35897c;
                int i11 = iArr[i10];
                if (i11 >= 0) {
                    this.f35898d[i11] = 0;
                    iArr[i10] = -1;
                }
                if (i10 == i5) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        Fe.g.H(this.f35895a, 0, this.f35900f);
        Object[] objArr = this.f35896b;
        if (objArr != null) {
            Fe.g.H(objArr, 0, this.f35900f);
        }
        this.f35903i = 0;
        this.f35900f = 0;
        this.f35902h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return i(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return j(obj) >= 0;
    }

    public final void d() {
        if (this.f35906m) {
            throw new UnsupportedOperationException();
        }
    }

    public final void e(boolean z2) {
        int i5;
        Object[] objArr = this.f35896b;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i5 = this.f35900f;
            if (i10 >= i5) {
                break;
            }
            int[] iArr = this.f35897c;
            int i12 = iArr[i10];
            if (i12 >= 0) {
                Object[] objArr2 = this.f35895a;
                objArr2[i11] = objArr2[i10];
                if (objArr != null) {
                    objArr[i11] = objArr[i10];
                }
                if (z2) {
                    iArr[i11] = i12;
                    this.f35898d[i12] = i11 + 1;
                }
                i11++;
            }
            i10++;
        }
        Fe.g.H(this.f35895a, i11, i5);
        if (objArr != null) {
            Fe.g.H(objArr, i11, this.f35900f);
        }
        this.f35900f = i11;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C2760g c2760g = this.f35905l;
        if (c2760g != null) {
            return c2760g;
        }
        C2760g c2760g2 = new C2760g(this, 0);
        this.f35905l = c2760g2;
        return c2760g2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f35903i == map.size() && f(map.entrySet());
    }

    public final boolean f(Collection m10) {
        AbstractC3340k.e(m10, "m");
        for (Object obj : m10) {
            if (obj != null) {
                try {
                    if (!g((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean g(Map.Entry entry) {
        AbstractC3340k.e(entry, "entry");
        int i5 = i(entry.getKey());
        if (i5 < 0) {
            return false;
        }
        Object[] objArr = this.f35896b;
        AbstractC3340k.b(objArr);
        return AbstractC3340k.a(objArr[i5], entry.getValue());
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int i5 = i(obj);
        if (i5 < 0) {
            return null;
        }
        Object[] objArr = this.f35896b;
        AbstractC3340k.b(objArr);
        return objArr[i5];
    }

    public final void h(int i5) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f35895a;
        int length = objArr.length;
        int i10 = this.f35900f;
        int i11 = length - i10;
        int i12 = i10 - this.f35903i;
        if (i11 < i5 && i11 + i12 >= i5 && i12 >= objArr.length / 4) {
            e(true);
            return;
        }
        int i13 = i10 + i5;
        if (i13 < 0) {
            throw new OutOfMemoryError();
        }
        if (i13 > objArr.length) {
            C2648c c2648c = AbstractC2651f.Companion;
            int length2 = objArr.length;
            c2648c.getClass();
            int iE = C2648c.e(length2, i13);
            Object[] objArr2 = this.f35895a;
            AbstractC3340k.e(objArr2, "<this>");
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, iE);
            AbstractC3340k.d(objArrCopyOf2, "copyOf(...)");
            this.f35895a = objArrCopyOf2;
            Object[] objArr3 = this.f35896b;
            if (objArr3 != null) {
                objArrCopyOf = Arrays.copyOf(objArr3, iE);
                AbstractC3340k.d(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f35896b = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f35897c, iE);
            AbstractC3340k.d(iArrCopyOf, "copyOf(...)");
            this.f35897c = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((iE >= 1 ? iE : 1) * 3);
            if (iHighestOneBit > this.f35898d.length) {
                l(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        C2756c c2756c = new C2756c(this, 0);
        int i5 = 0;
        while (c2756c.hasNext()) {
            int i10 = c2756c.f35890a;
            C2759f c2759f = (C2759f) c2756c.f35893d;
            if (i10 >= c2759f.f35900f) {
                throw new NoSuchElementException();
            }
            c2756c.f35890a = i10 + 1;
            c2756c.f35891b = i10;
            Object obj = c2759f.f35895a[i10];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = c2759f.f35896b;
            AbstractC3340k.b(objArr);
            Object obj2 = objArr[c2756c.f35891b];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c2756c.f();
            i5 += iHashCode ^ iHashCode2;
        }
        return i5;
    }

    public final int i(Object obj) {
        int iK = k(obj);
        int i5 = this.f35899e;
        while (true) {
            int i10 = this.f35898d[iK];
            if (i10 == 0) {
                return -1;
            }
            int i11 = i10 - 1;
            if (AbstractC3340k.a(this.f35895a[i11], obj)) {
                return i11;
            }
            i5--;
            if (i5 < 0) {
                return -1;
            }
            iK = iK == 0 ? this.f35898d.length - 1 : iK - 1;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f35903i == 0;
    }

    public final int j(Object obj) {
        int i5 = this.f35900f;
        while (true) {
            i5--;
            if (i5 < 0) {
                return -1;
            }
            if (this.f35897c[i5] >= 0) {
                Object[] objArr = this.f35896b;
                AbstractC3340k.b(objArr);
                if (AbstractC3340k.a(objArr[i5], obj)) {
                    return i5;
                }
            }
        }
    }

    public final int k(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f35901g;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C2760g c2760g = this.f35904j;
        if (c2760g != null) {
            return c2760g;
        }
        C2760g c2760g2 = new C2760g(this, 1);
        this.f35904j = c2760g2;
        return c2760g2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f35897c[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r6) {
        /*
            r5 = this;
            int r0 = r5.f35902h
            int r0 = r0 + 1
            r5.f35902h = r0
            int r0 = r5.f35900f
            int r1 = r5.f35903i
            r2 = 0
            if (r0 <= r1) goto L10
            r5.e(r2)
        L10:
            int[] r0 = new int[r6]
            r5.f35898d = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.f35901g = r6
        L1c:
            int r6 = r5.f35900f
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f35895a
            r0 = r0[r2]
            int r0 = r5.k(r0)
            int r1 = r5.f35899e
        L2c:
            int[] r3 = r5.f35898d
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.f35897c
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r0)
            throw r6
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.C2759f.l(int):void");
    }

    public final void m(int i5) {
        int i10;
        int i11;
        int iK;
        int[] iArr;
        Object[] objArr = this.f35895a;
        AbstractC3340k.e(objArr, "<this>");
        objArr[i5] = null;
        Object[] objArr2 = this.f35896b;
        if (objArr2 != null) {
            objArr2[i5] = null;
        }
        int length = this.f35897c[i5];
        loop0: while (true) {
            int i12 = length;
            int i13 = 0;
            do {
                length = length == 0 ? this.f35898d.length - 1 : length - 1;
                int[] iArr2 = this.f35898d;
                i10 = iArr2[length];
                i13++;
                if (i13 > this.f35899e) {
                    iArr2[i12] = 0;
                    break loop0;
                } else if (i10 == 0) {
                    iArr2[i12] = 0;
                    break loop0;
                } else {
                    i11 = i10 - 1;
                    iK = k(this.f35895a[i11]) - length;
                    iArr = this.f35898d;
                }
            } while ((iK & (iArr.length - 1)) < i13);
            iArr[i12] = i10;
            this.f35897c[i11] = i12;
        }
        this.f35897c[i5] = -1;
        this.f35903i--;
        this.f35902h++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        d();
        int iA = a(obj);
        Object[] objArr = this.f35896b;
        if (objArr == null) {
            int length = this.f35895a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f35896b = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i5 = (-iA) - 1;
        Object obj3 = objArr[i5];
        objArr[i5] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        AbstractC3340k.e(from, "from");
        d();
        Set<Map.Entry> setEntrySet = from.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        h(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.f35896b;
            if (objArr == null) {
                int length = this.f35895a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f35896b = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i5 = (-iA) - 1;
                if (!AbstractC3340k.a(entry.getValue(), objArr[i5])) {
                    objArr[i5] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        d();
        int i5 = i(obj);
        if (i5 < 0) {
            return null;
        }
        Object[] objArr = this.f35896b;
        AbstractC3340k.b(objArr);
        Object obj2 = objArr[i5];
        m(i5);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f35903i;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f35903i * 3) + 2);
        sb2.append("{");
        C2756c c2756c = new C2756c(this, 0);
        int i5 = 0;
        while (c2756c.hasNext()) {
            if (i5 > 0) {
                sb2.append(", ");
            }
            int i10 = c2756c.f35890a;
            C2759f c2759f = (C2759f) c2756c.f35893d;
            if (i10 >= c2759f.f35900f) {
                throw new NoSuchElementException();
            }
            c2756c.f35890a = i10 + 1;
            c2756c.f35891b = i10;
            Object obj = c2759f.f35895a[i10];
            if (obj == c2759f) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = c2759f.f35896b;
            AbstractC3340k.b(objArr);
            Object obj2 = objArr[c2756c.f35891b];
            if (obj2 == c2759f) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            c2756c.f();
            i5++;
        }
        sb2.append("}");
        String string = sb2.toString();
        AbstractC3340k.d(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        j jVar = this.k;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this, 1);
        this.k = jVar2;
        return jVar2;
    }

    public C2759f(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i5];
        int[] iArr = new int[i5];
        int iHighestOneBit = Integer.highestOneBit((i5 < 1 ? 1 : i5) * 3);
        this.f35895a = objArr;
        this.f35896b = null;
        this.f35897c = iArr;
        this.f35898d = new int[iHighestOneBit];
        this.f35899e = 2;
        this.f35900f = 0;
        this.f35901g = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
