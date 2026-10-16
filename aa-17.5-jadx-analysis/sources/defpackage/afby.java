package defpackage;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class afby<K, V> implements Map<K, V>, Serializable, afgg {
    public static final afby a;
    public Object[] b;
    public Object[] c;
    public int[] d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    private int[] i;
    private int j;
    private int k;
    private afca l;
    private afcb m;
    private afbz n;

    static {
        afby afbyVar = new afby(0);
        afbyVar.h = true;
        a = afbyVar;
    }

    public afby(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int[] iArr2 = new int[affa.B(i)];
        this.b = objArr;
        this.c = null;
        this.d = iArr;
        this.i = iArr2;
        this.j = 2;
        this.e = 0;
        this.k = Integer.numberOfLeadingZeros(l()) + 1;
    }

    private final int l() {
        return this.i.length;
    }

    private final int m(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.k;
    }

    private final void n(boolean z) {
        int i;
        Object[] objArr = this.c;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.e;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.d;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                int i5 = i3 + 1;
                Object[] objArr2 = this.b;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.i[i4] = i5;
                }
                i3 = i5;
            }
            i2++;
        }
        woy.aL(this.b, i3, i);
        if (objArr != null) {
            woy.aL(objArr, i3, this.e);
        }
        this.e = i3;
    }

    private final void o(int i) {
        Object[] objArrCopyOf;
        int iD = d();
        int i2 = this.e;
        int i3 = iD - i2;
        int i4 = i2 - this.g;
        if (i3 < i && i3 + i4 >= i && i4 >= (d() >> 2)) {
            n(true);
            return;
        }
        int i5 = this.e + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > d()) {
            int iDC = woy.dC(d(), i5);
            Object[] objArr = this.b;
            objArr.getClass();
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, iDC);
            objArrCopyOf2.getClass();
            this.b = objArrCopyOf2;
            Object[] objArr2 = this.c;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, iDC);
                objArrCopyOf.getClass();
            } else {
                objArrCopyOf = null;
            }
            this.c = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.d, iDC);
            iArrCopyOf.getClass();
            this.d = iArrCopyOf;
            int iB = affa.B(iDC);
            if (iB > l()) {
                q(iB);
            }
        }
    }

    private final void p() {
        this.f++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        r3[r0] = r6;
        r5.d[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void q(int r6) {
        /*
            r5 = this;
            r5.p()
            int r0 = r5.e
            int r1 = r5.g
            r2 = 0
            if (r0 <= r1) goto Ld
            r5.n(r2)
        Ld:
            int[] r0 = new int[r6]
            r5.i = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.k = r6
        L19:
            int r6 = r5.e
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.b
            r0 = r0[r2]
            int r0 = r5.m(r0)
            int r1 = r5.j
        L29:
            int[] r3 = r5.i
            r4 = r3[r0]
            if (r4 != 0) goto L37
            r3[r0] = r6
            int[] r1 = r5.d
            r1[r2] = r0
            r2 = r6
            goto L19
        L37:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r3 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r5.l()
            int r0 = r0 + (-1)
            goto L29
        L46:
            r0 = r3
            goto L29
        L48:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r5.<init>(r6)
            throw r5
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afby.q(int):void");
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.h) {
            return new afcd(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int a(Object obj) {
        f();
        while (true) {
            int iM = m(obj);
            int i = this.j;
            int i2 = i + i;
            int iL = l() >> 1;
            int i3 = 0;
            while (true) {
                int i4 = this.i[iM];
                if (i4 == 0) {
                    if (this.e < d()) {
                        int i5 = this.e;
                        int i6 = i5 + 1;
                        this.e = i6;
                        this.b[i5] = obj;
                        this.d[i5] = iM;
                        this.i[iM] = i6;
                        this.g++;
                        p();
                        if (i3 > this.j) {
                            this.j = i3;
                        }
                        return i5;
                    }
                    o(1);
                } else {
                    if (affa.f(this.b[i4 - 1], obj)) {
                        return -i4;
                    }
                    i3++;
                    if (i3 > (i2 > iL ? iL : i2)) {
                        int iL2 = l();
                        q(iL2 + iL2);
                        break;
                    }
                    iM = iM == 0 ? l() - 1 : iM - 1;
                }
            }
        }
    }

    public final int b(Object obj) {
        int iM = m(obj);
        int i = this.j;
        while (true) {
            int i2 = this.i[iM];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (affa.f(this.b[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iM = iM == 0 ? l() - 1 : iM - 1;
        }
    }

    public final int c(Object obj) {
        int i = this.e;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.d[i] >= 0) {
                Object[] objArr = this.c;
                objArr.getClass();
                if (affa.f(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        f();
        int i = this.e - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.d;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.i[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        woy.aL(this.b, 0, this.e);
        Object[] objArr = this.c;
        if (objArr != null) {
            woy.aL(objArr, 0, this.e);
        }
        this.g = 0;
        this.e = 0;
        p();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return b(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return c(obj) >= 0;
    }

    public final int d() {
        return this.b.length;
    }

    public final Map e() {
        f();
        this.h = true;
        if (this.g > 0) {
            return this;
        }
        afby afbyVar = a;
        afbyVar.getClass();
        return afbyVar;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        afbz afbzVar = this.n;
        if (afbzVar != null) {
            return afbzVar;
        }
        afbz afbzVar2 = new afbz(this);
        this.n = afbzVar2;
        return afbzVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.g == map.size() && h(map.entrySet())) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.h) {
            throw new UnsupportedOperationException();
        }
    }

    public final void g(int i) {
        int i2;
        int i3;
        woy.aK(this.b, i);
        Object[] objArr = this.c;
        if (objArr != null) {
            woy.aK(objArr, i);
        }
        int iL = this.d[i];
        loop0: while (true) {
            int i4 = iL;
            int i5 = 0;
            do {
                iL = iL == 0 ? l() - 1 : iL - 1;
                int[] iArr = this.i;
                i2 = iArr[iL];
                i5++;
                if (i5 > this.j) {
                    iArr[i4] = 0;
                    break loop0;
                } else {
                    if (i2 == 0) {
                        iArr[i4] = 0;
                        break loop0;
                    }
                    i3 = i2 - 1;
                }
            } while (((m(this.b[i3]) - iL) & (l() - 1)) < i5);
            this.i[i4] = i2;
            this.d[i3] = i4;
        }
        this.d[i] = -1;
        this.g--;
        p();
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        int iB = b(obj);
        if (iB < 0) {
            return null;
        }
        Object[] objArr = this.c;
        objArr.getClass();
        return (V) objArr[iB];
    }

    public final boolean h(Collection collection) {
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!i((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final int hashCode() {
        afbu afbuVar = new afbu(this);
        int i = 0;
        while (afbuVar.hasNext()) {
            int i2 = afbuVar.b;
            afby afbyVar = afbuVar.a;
            if (i2 >= afbyVar.e) {
                throw new NoSuchElementException();
            }
            afbuVar.b = i2 + 1;
            afbuVar.c = i2;
            Object obj = afbyVar.b[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = afbyVar.c;
            objArr.getClass();
            Object obj2 = objArr[afbuVar.c];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            afbuVar.b();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final boolean i(Map.Entry entry) {
        int iB = b(entry.getKey());
        if (iB < 0) {
            return false;
        }
        Object[] objArr = this.c;
        objArr.getClass();
        return affa.f(objArr[iB], entry.getValue());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.g == 0;
    }

    public final boolean j(Object obj) {
        f();
        int iB = b(obj);
        if (iB < 0) {
            return false;
        }
        g(iB);
        return true;
    }

    public final Object[] k() {
        Object[] objArr = this.c;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArr2 = new Object[d()];
        this.c = objArr2;
        return objArr2;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        afca afcaVar = this.l;
        if (afcaVar != null) {
            return afcaVar;
        }
        afca afcaVar2 = new afca(this);
        this.l = afcaVar2;
        return afcaVar2;
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        f();
        int iA = a(k);
        Object[] objArrK = k();
        if (iA >= 0) {
            objArrK[iA] = v;
            return null;
        }
        int i = (-iA) - 1;
        V v2 = (V) objArrK[i];
        objArrK[i] = v;
        return v2;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        map.getClass();
        f();
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        o(setEntrySet.size());
        for (Map.Entry<? extends K, ? extends V> entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArrK = k();
            if (iA >= 0) {
                objArrK[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!affa.f(entry.getValue(), objArrK[i])) {
                    objArrK[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        f();
        int iB = b(obj);
        if (iB < 0) {
            return null;
        }
        Object[] objArr = this.c;
        objArr.getClass();
        V v = (V) objArr[iB];
        g(iB);
        return v;
    }

    @Override // java.util.Map
    public final int size() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.g * 3) + 2);
        sb.append("{");
        afbu afbuVar = new afbu(this);
        int i = 0;
        while (afbuVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = afbuVar.b;
            afby afbyVar = afbuVar.a;
            if (i2 >= afbyVar.e) {
                throw new NoSuchElementException();
            }
            afbuVar.b = i2 + 1;
            afbuVar.c = i2;
            Object obj = afbyVar.b[i2];
            if (obj == afbyVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = afbyVar.c;
            objArr.getClass();
            Object obj2 = objArr[afbuVar.c];
            if (obj2 == afbyVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            afbuVar.b();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        afcb afcbVar = this.m;
        if (afcbVar != null) {
            return afcbVar;
        }
        afcb afcbVar2 = new afcb(this);
        this.m = afcbVar2;
        return afcbVar2;
    }

    public afby() {
        throw null;
    }
}
