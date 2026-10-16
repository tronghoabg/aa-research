package defpackage;

import defpackage.abnu;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class abpq<K extends abnu> extends AbstractMap<K, Object> {
    private volatile abpp d;
    public boolean c = false;
    public Object[] a = null;
    public int b = 0;
    private volatile boolean e = true;

    private final void e(int i) {
        int length;
        Object[] objArr = this.a;
        if (objArr == null || (length = objArr.length) == 0) {
            this.a = new Object[Math.max(16, i)];
            return;
        }
        if (i > length) {
            if (!this.e) {
                c();
                if (i <= this.a.length) {
                    return;
                }
            }
            Object[] objArr2 = this.a;
            int length2 = objArr2.length;
            int i2 = length2 + (length2 >> 1);
            if (i2 - i >= 0) {
                i = i2;
            }
            if ((-2147483639) + i > 0) {
                i = 2147483639;
            }
            this.a = Arrays.copyOf(objArr2, i);
        }
    }

    private final int f(abnu abnuVar) {
        int i = this.b - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int iCompareTo = ((abpn) this.a[i3]).c.compareTo(abnuVar);
            if (iCompareTo < 0) {
                i2 = i3 + 1;
            } else {
                if (iCompareTo <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public final Map.Entry a(int i) {
        c();
        if (i < this.b) {
            return (abpn) this.a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final void b() {
        if (this.c) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003f A[Catch: all -> 0x0057, TryCatch #0 {, blocks: (B:8:0x000a, B:10:0x000e, B:12:0x0010, B:14:0x0015, B:16:0x0017, B:17:0x001e, B:19:0x0022, B:21:0x002a, B:23:0x003a, B:25:0x0045, B:24:0x003f, B:27:0x004a, B:28:0x0053, B:29:0x0055), top: B:35:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r7 = this;
            boolean r0 = r7.c
            if (r0 == 0) goto L5
            goto L5a
        L5:
            boolean r0 = r7.e
            if (r0 != 0) goto L5a
            monitor-enter(r7)
            boolean r0 = r7.e     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L10
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L57
            return
        L10:
            int r0 = r7.b     // Catch: java.lang.Throwable -> L57
            r1 = 1
            if (r0 > r1) goto L17
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L57
            return
        L17:
            java.lang.Object[] r2 = r7.a     // Catch: java.lang.Throwable -> L57
            r3 = 0
            java.util.Arrays.sort(r2, r3, r0)     // Catch: java.lang.Throwable -> L57
            r0 = r3
        L1e:
            int r2 = r7.b     // Catch: java.lang.Throwable -> L57
            if (r3 >= r2) goto L48
            java.lang.Object[] r2 = r7.a     // Catch: java.lang.Throwable -> L57
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L57
            abpn r4 = (defpackage.abpn) r4     // Catch: java.lang.Throwable -> L57
            if (r0 <= 0) goto L3f
            int r5 = r0 + (-1)
            r2 = r2[r5]     // Catch: java.lang.Throwable -> L57
            abpn r2 = (defpackage.abpn) r2     // Catch: java.lang.Throwable -> L57
            abnu r2 = r2.c     // Catch: java.lang.Throwable -> L57
            abnu r6 = r4.c     // Catch: java.lang.Throwable -> L57
            boolean r2 = r2.equals(r6)     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L3f
            java.lang.Object[] r2 = r7.a     // Catch: java.lang.Throwable -> L57
            r2[r5] = r4     // Catch: java.lang.Throwable -> L57
            goto L45
        L3f:
            java.lang.Object[] r2 = r7.a     // Catch: java.lang.Throwable -> L57
            r2[r0] = r4     // Catch: java.lang.Throwable -> L57
            int r0 = r0 + 1
        L45:
            int r3 = r3 + 1
            goto L1e
        L48:
            if (r0 >= r2) goto L53
            r7.b = r0     // Catch: java.lang.Throwable -> L57
            java.lang.Object[] r2 = r7.a     // Catch: java.lang.Throwable -> L57
            int r3 = r2.length     // Catch: java.lang.Throwable -> L57
            r4 = 0
            java.util.Arrays.fill(r2, r0, r3, r4)     // Catch: java.lang.Throwable -> L57
        L53:
            r7.e = r1     // Catch: java.lang.Throwable -> L57
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L57
            return
        L57:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L57
            throw r0
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abpq.c():void");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (this.b != 0) {
            this.a = null;
            this.b = 0;
            this.e = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        c();
        return f((abnu) obj) >= 0;
    }

    public final void d(abnu abnuVar, Object obj) {
        b();
        abnuVar.getClass();
        boolean z = this.e;
        int i = this.b;
        if (i > 0) {
            int iCompareTo = abnuVar.compareTo(((abpn) this.a[i - 1]).c);
            if (iCompareTo < 0) {
                z = false;
            } else if (iCompareTo == 0) {
                ((abpn) this.a[this.b - 1]).setValue(obj);
                return;
            }
        }
        e(this.b + 1);
        Object[] objArr = this.a;
        int i2 = this.b;
        this.b = i2 + 1;
        objArr[i2] = new abpn(this, abnuVar, obj);
        this.e = z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, Object>> entrySet() {
        c();
        if (this.d == null) {
            this.d = new abpp(this);
        }
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abpq)) {
            return super.equals(obj);
        }
        abpq abpqVar = (abpq) obj;
        int size = size();
        if (size != abpqVar.size()) {
            return false;
        }
        Object[] objArr = this.a;
        Object[] objArr2 = abpqVar.a;
        for (int i = 0; i < size; i++) {
            if (!objArr[i].equals(objArr2[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        c();
        int iF = f((abnu) obj);
        if (iF >= 0) {
            return ((abpn) this.a[iF]).a;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += this.a[i].hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        d((abnu) obj, obj2);
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ?> map) {
        b();
        if (!(map instanceof abpq)) {
            e(this.b + map.size());
            for (Map.Entry<? extends K, ?> entry : map.entrySet()) {
                d(entry.getKey(), entry.getValue());
            }
            return;
        }
        abpq abpqVar = (abpq) map;
        e(this.b + abpqVar.b);
        int i = this.b;
        int i2 = abpqVar.b + i;
        for (int i3 = i; i3 < i2; i3++) {
            abpn abpnVar = (abpn) abpqVar.a[i3 - i];
            d(abpnVar.c, abpnVar.a);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        c();
        int iF = f((abnu) obj);
        if (iF < 0) {
            return null;
        }
        Object[] objArr = this.a;
        Object obj2 = ((abpn) objArr[iF]).a;
        System.arraycopy(objArr, iF + 1, objArr, iF, (this.b - iF) - 1);
        Object[] objArr2 = this.a;
        int i = this.b - 1;
        this.b = i;
        objArr2[i] = null;
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        c();
        return this.b;
    }
}
