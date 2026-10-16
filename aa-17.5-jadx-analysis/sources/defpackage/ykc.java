package defpackage;

import defpackage.yiy;
import defpackage.yjc;
import j$.util.concurrent.ConcurrentMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes3.dex */
public final class ykc<K, V, E extends yiy<K, V, E>, S extends yjc<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, j$.util.concurrent.ConcurrentMap<K, V> {
    static final yjz a = new yiq();
    public static final /* synthetic */ int k = 0;
    private static final long serialVersionUID = 5;
    final transient int b;
    final transient int c;
    final transient yjc[] d;
    final int e;
    final xww f;
    final transient yiz g;
    transient Set h;
    transient Collection i;
    transient Set j;

    public ykc(yip yipVar, yiz yizVar) {
        this.e = Math.min(yipVar.a(), 65536);
        this.f = (xww) woy.ap(yipVar.f, yipVar.c().a());
        this.g = yizVar;
        int iMin = Math.min(yipVar.b(), 1073741824);
        int i = 1;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i3 < this.e) {
            i4++;
            i3 += i3;
        }
        this.c = 32 - i4;
        this.b = i3 - 1;
        this.d = new yjc[i3];
        int i5 = iMin / i3;
        while (i < (i3 * i5 < iMin ? i5 + 1 : i5)) {
            i += i;
        }
        while (true) {
            yjc[] yjcVarArr = this.d;
            if (i2 >= yjcVarArr.length) {
                return;
            }
            yjcVarArr[i2] = this.g.c(this, i);
            i2++;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializationProxy");
    }

    public final int a(Object obj) {
        int iC = this.f.c(obj);
        int i = iC + ((iC << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    final xww b() {
        return this.g.e().a();
    }

    public final yjc c(int i) {
        return this.d[(i >>> this.c) & this.b];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        yjc[] yjcVarArr = this.d;
        int length = yjcVarArr.length;
        for (int i = 0; i < length; i++) {
            yjc yjcVar = yjcVarArr[i];
            if (yjcVar.b != 0) {
                yjcVar.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = yjcVar.e;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    yjcVar.g();
                    yjcVar.f.set(0);
                    yjcVar.c++;
                    yjcVar.b = 0;
                } finally {
                    yjcVar.unlock();
                }
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return ConcurrentMap.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        yiy yiyVarB;
        boolean z = false;
        if (obj == null) {
            return false;
        }
        int iA = a(obj);
        yjc yjcVarC = c(iA);
        try {
            if (yjcVarC.b != 0 && (yiyVarB = yjcVarC.b(obj, iA)) != null) {
                if (yiyVarB.d() != null) {
                    z = true;
                }
            }
            return z;
        } finally {
            yjcVarC.i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.concurrent.atomic.AtomicReferenceArray] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Object objD;
        boolean z = false;
        if (obj == null) {
            return false;
        }
        yjc[] yjcVarArr = this.d;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = yjcVarArr.length;
            long j2 = 0;
            for (?? r10 = z; r10 < length; r10++) {
                yjc yjcVar = yjcVarArr[r10];
                int i2 = yjcVar.b;
                ?? r12 = yjcVar.e;
                for (?? r13 = z; r13 < r12.length(); r13++) {
                    yiy yiyVarB = (yiy) r12.get(r13);
                    while (yiyVarB != null) {
                        if (yiyVarB.c() == null || (objD = yiyVarB.d()) == null) {
                            yjcVar.l();
                            objD = null;
                        }
                        boolean z2 = z;
                        if (objD != null && b().d(obj, objD)) {
                            return true;
                        }
                        yiyVarB = yiyVarB.b();
                        z = z2;
                    }
                }
                j2 += yjcVar.c;
                z = z;
            }
            boolean z3 = z;
            if (j2 == j) {
                return z3;
            }
            i++;
            j = j2;
            z = z3;
        }
        return z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.j;
        if (set != null) {
            return set;
        }
        yiw yiwVar = new yiw(this);
        this.j = yiwVar;
        return yiwVar;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        ConcurrentMap.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        V v = null;
        if (obj == null) {
            return null;
        }
        int iA = a(obj);
        yjc yjcVarC = c(iA);
        try {
            yiy yiyVarB = yjcVarC.b(obj, iA);
            if (yiyVarB != null && (v = (V) yiyVarB.d()) == null) {
                yjcVarC.l();
            }
            return v;
        } finally {
            yjcVarC.i();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return ConcurrentMap.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        int i = 0;
        long j = 0;
        while (true) {
            yjc[] yjcVarArr = this.d;
            if (i >= yjcVarArr.length) {
                if (j == 0) {
                    return true;
                }
                for (int i2 = 0; i2 < yjcVarArr.length; i2++) {
                    if (yjcVarArr[i2].b != 0) {
                        return false;
                    }
                    j -= yjcVarArr[i2].c;
                }
                return j == 0;
            }
            if (yjcVarArr[i].b != 0) {
                return false;
            }
            j += yjcVarArr[i].c;
            i++;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.h;
        if (set != null) {
            return set;
        }
        yjb yjbVar = new yjb(this);
        this.h = yjbVar;
        return yjbVar;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k2, V v) {
        k2.getClass();
        v.getClass();
        int iA = a(k2);
        return (V) c(iA).d(k2, iA, v, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        return c(iA).d(obj, iA, obj2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r7.b().d(r11, r5.d()) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (defpackage.yjc.m(r5) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        r9.c++;
        r10 = r9.c(r4, r5);
        r11 = r9.b - 1;
        r2.set(r3, r10);
        r9.b = r11;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r10, java.lang.Object r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L77
            if (r11 != 0) goto L7
            goto L77
        L7:
            int r1 = r9.a(r10)
            yjc r9 = r9.c(r1)
            r9.lock()
            r9.j()     // Catch: java.lang.Throwable -> L72
            int r2 = r9.b     // Catch: java.lang.Throwable -> L72
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r9.e     // Catch: java.lang.Throwable -> L72
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L72
            int r3 = r3 + (-1)
            r3 = r3 & r1
            java.lang.Object r4 = r2.get(r3)     // Catch: java.lang.Throwable -> L72
            yiy r4 = (defpackage.yiy) r4     // Catch: java.lang.Throwable -> L72
            r5 = r4
        L27:
            if (r5 == 0) goto L6e
            java.lang.Object r6 = r5.c()     // Catch: java.lang.Throwable -> L72
            int r7 = r5.a()     // Catch: java.lang.Throwable -> L72
            if (r7 != r1) goto L69
            if (r6 == 0) goto L69
            ykc r7 = r9.a     // Catch: java.lang.Throwable -> L72
            xww r8 = r7.f     // Catch: java.lang.Throwable -> L72
            boolean r6 = r8.d(r10, r6)     // Catch: java.lang.Throwable -> L72
            if (r6 == 0) goto L69
            java.lang.Object r10 = r5.d()     // Catch: java.lang.Throwable -> L72
            xww r1 = r7.b()     // Catch: java.lang.Throwable -> L72
            boolean r10 = r1.d(r11, r10)     // Catch: java.lang.Throwable -> L72
            r11 = 1
            if (r10 == 0) goto L50
            r0 = r11
            goto L56
        L50:
            boolean r10 = defpackage.yjc.m(r5)     // Catch: java.lang.Throwable -> L72
            if (r10 == 0) goto L6e
        L56:
            int r10 = r9.c     // Catch: java.lang.Throwable -> L72
            int r10 = r10 + r11
            r9.c = r10     // Catch: java.lang.Throwable -> L72
            yiy r10 = r9.c(r4, r5)     // Catch: java.lang.Throwable -> L72
            int r11 = r9.b     // Catch: java.lang.Throwable -> L72
            int r11 = r11 + (-1)
            r2.set(r3, r10)     // Catch: java.lang.Throwable -> L72
            r9.b = r11     // Catch: java.lang.Throwable -> L72
            goto L6e
        L69:
            yiy r5 = r5.b()     // Catch: java.lang.Throwable -> L72
            goto L27
        L6e:
            r9.unlock()
            return r0
        L72:
            r10 = move-exception
            r9.unlock()
            throw r10
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ykc.remove(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj3.getClass();
        boolean z = false;
        if (obj2 == null) {
            return false;
        }
        int iA = a(obj);
        yjc yjcVarC = c(iA);
        yjcVarC.lock();
        try {
            yjcVarC.j();
            AtomicReferenceArray atomicReferenceArray = yjcVarC.e;
            int length = (atomicReferenceArray.length() - 1) & iA;
            yiy yiyVar = (yiy) atomicReferenceArray.get(length);
            yiy yiyVarB = yiyVar;
            while (true) {
                if (yiyVarB == null) {
                    break;
                }
                Object objC = yiyVarB.c();
                if (yiyVarB.a() == iA && objC != null) {
                    ykc ykcVar = yjcVarC.a;
                    if (ykcVar.f.d(obj, objC)) {
                        Object objD = yiyVarB.d();
                        if (objD == null) {
                            if (yjc.m(yiyVarB)) {
                                int i = yjcVarC.b;
                                yjcVarC.c++;
                                yiy yiyVarC = yjcVarC.c(yiyVar, yiyVarB);
                                int i2 = yjcVarC.b - 1;
                                atomicReferenceArray.set(length, yiyVarC);
                                yjcVarC.b = i2;
                            }
                        } else if (ykcVar.b().d(obj2, objD)) {
                            yjcVarC.c++;
                            yjcVarC.k(yiyVarB, obj3);
                            z = true;
                        }
                    }
                }
                yiyVarB = yiyVarB.b();
            }
            return z;
        } finally {
            yjcVarC.unlock();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        ConcurrentMap.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        int i = 0;
        long j = 0;
        while (true) {
            if (i >= this.d.length) {
                return wub.aw(j);
            }
            j += r3[i].b;
            i++;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.i;
        if (collection != null) {
            return collection;
        }
        yjo yjoVar = new yjo(this);
        this.i = yjoVar;
        return yjoVar;
    }

    Object writeReplace() {
        yiz yizVar = this.g;
        yje yjeVarD = yizVar.d();
        yje yjeVarE = yizVar.e();
        yizVar.e().a();
        return new yjd(yjeVarD, yjeVarE, this.f, this.e, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        r9 = r5.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r9 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (defpackage.yjc.m(r5) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r8.c++;
        r0 = r8.c(r4, r5);
        r1 = r8.b - 1;
        r2.set(r3, r0);
        r8.b = r1;
        r0 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V remove(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            int r1 = r8.a(r9)
            yjc r8 = r8.c(r1)
            r8.lock()
            r8.j()     // Catch: java.lang.Throwable -> L68
            int r2 = r8.b     // Catch: java.lang.Throwable -> L68
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r8.e     // Catch: java.lang.Throwable -> L68
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L68
            int r3 = r3 + (-1)
            r3 = r3 & r1
            java.lang.Object r4 = r2.get(r3)     // Catch: java.lang.Throwable -> L68
            yiy r4 = (defpackage.yiy) r4     // Catch: java.lang.Throwable -> L68
            r5 = r4
        L24:
            if (r5 == 0) goto L64
            java.lang.Object r6 = r5.c()     // Catch: java.lang.Throwable -> L68
            int r7 = r5.a()     // Catch: java.lang.Throwable -> L68
            if (r7 != r1) goto L5f
            if (r6 == 0) goto L5f
            ykc r7 = r8.a     // Catch: java.lang.Throwable -> L68
            xww r7 = r7.f     // Catch: java.lang.Throwable -> L68
            boolean r6 = r7.d(r9, r6)     // Catch: java.lang.Throwable -> L68
            if (r6 == 0) goto L5f
            java.lang.Object r9 = r5.d()     // Catch: java.lang.Throwable -> L68
            if (r9 == 0) goto L43
            goto L4a
        L43:
            boolean r1 = defpackage.yjc.m(r5)     // Catch: java.lang.Throwable -> L68
            if (r1 != 0) goto L4a
            goto L64
        L4a:
            int r0 = r8.c     // Catch: java.lang.Throwable -> L68
            int r0 = r0 + 1
            r8.c = r0     // Catch: java.lang.Throwable -> L68
            yiy r0 = r8.c(r4, r5)     // Catch: java.lang.Throwable -> L68
            int r1 = r8.b     // Catch: java.lang.Throwable -> L68
            int r1 = r1 + (-1)
            r2.set(r3, r0)     // Catch: java.lang.Throwable -> L68
            r8.b = r1     // Catch: java.lang.Throwable -> L68
            r0 = r9
            goto L64
        L5f:
            yiy r5 = r5.b()     // Catch: java.lang.Throwable -> L68
            goto L24
        L64:
            r8.unlock()
            return r0
        L68:
            r9 = move-exception
            r8.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ykc.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        Object obj3;
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        yjc yjcVarC = c(iA);
        yjcVarC.lock();
        try {
            yjcVarC.j();
            AtomicReferenceArray atomicReferenceArray = yjcVarC.e;
            int length = (atomicReferenceArray.length() - 1) & iA;
            yiy yiyVar = (yiy) atomicReferenceArray.get(length);
            yiy yiyVarB = yiyVar;
            while (true) {
                obj3 = null;
                if (yiyVarB == null) {
                    break;
                }
                Object objC = yiyVarB.c();
                if (yiyVarB.a() == iA && objC != null && yjcVarC.a.f.d(obj, objC)) {
                    Object objD = yiyVarB.d();
                    if (objD == null) {
                        if (yjc.m(yiyVarB)) {
                            int i = yjcVarC.b;
                            yjcVarC.c++;
                            yiy yiyVarC = yjcVarC.c(yiyVar, yiyVarB);
                            int i2 = yjcVarC.b - 1;
                            atomicReferenceArray.set(length, yiyVarC);
                            yjcVarC.b = i2;
                        }
                    } else {
                        yjcVarC.c++;
                        yjcVarC.k(yiyVarB, obj2);
                        obj3 = objD;
                    }
                } else {
                    yiyVarB = yiyVarB.b();
                }
            }
            return obj3;
        } finally {
            yjcVarC.unlock();
        }
    }
}
