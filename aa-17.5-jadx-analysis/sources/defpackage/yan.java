package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import j$.util.concurrent.ConcurrentMap;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
final class yan<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, j$.util.concurrent.ConcurrentMap<K, V> {
    static final Logger a = Logger.getLogger(yan.class.getName());
    static final yac b = new xyt();
    static final Queue c = new xyu();
    public static final /* synthetic */ int x = 0;
    final int d;
    final int e;
    final xzt[] f;
    final int g;
    final xww h;
    final xww i;
    final xzv j;
    final xzv k;
    final long l;
    final long m;
    final long n;
    final Queue o;
    final xyi p;
    final xzg q;
    final xyr r;
    Set s;
    Collection t;
    Set u;
    final xyo v;
    final xyn w;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractMap, yan] */
    public yan(xyp xypVar, xyr xyrVar) {
        ?? abstractMap = new AbstractMap();
        int i = xypVar.d;
        abstractMap.g = Math.min(i == -1 ? 4 : i, 65536);
        xzv xzvVarC = xypVar.c();
        abstractMap.j = xzvVarC;
        abstractMap.k = xypVar.d();
        abstractMap.h = (xww) woy.ap(xypVar.k, xypVar.c().a());
        abstractMap.i = (xww) woy.ap(xypVar.l, xypVar.d().a());
        long j = (xypVar.i == 0 || xypVar.j == 0) ? 0L : xypVar.o == null ? xypVar.e : xypVar.f;
        abstractMap.l = j;
        abstractMap.v = (xyo) woy.ap(xypVar.o, xyo.a);
        long j2 = xypVar.j;
        abstractMap.m = j2 == -1 ? 0L : j2;
        long j3 = xypVar.i;
        abstractMap.n = j3 != -1 ? j3 : 0L;
        xyn xynVar = xypVar.p;
        xyn xynVar2 = xyn.a;
        xyn xynVar3 = (xyn) woy.ap(xynVar, xynVar2);
        abstractMap.w = xynVar3;
        abstractMap.o = xynVar3 == xynVar2 ? c : new ConcurrentLinkedQueue();
        int i2 = 0;
        int i3 = 1;
        boolean z = abstractMap.m() || abstractMap.j();
        xyi xyiVar = xypVar.m;
        abstractMap.p = xyiVar == null ? z ? xyi.d : xyp.b : xyiVar;
        char c2 = (abstractMap.n() || abstractMap.j()) ? (char) 1 : (char) 0;
        boolean z2 = abstractMap.k() || abstractMap.m();
        xzg xzgVar = xzg.a;
        abstractMap.q = xzg.i[(xzvVarC != xzv.c ? (char) 0 : (char) 4) | c2 | (true != z2 ? 0 : 2)];
        abstractMap.r = xyrVar;
        int iMin = Math.min(16, 1073741824);
        if (abstractMap.i() && !abstractMap.h()) {
            iMin = (int) Math.min(iMin, j);
        }
        int i4 = 0;
        int i5 = 1;
        while (i5 < abstractMap.g && (!abstractMap.i() || i5 * 20 <= abstractMap.l)) {
            i4++;
            i5 += i5;
        }
        abstractMap.e = 32 - i4;
        abstractMap.d = i5 - 1;
        abstractMap.f = new xzt[i5];
        int i6 = iMin / i5;
        while (i3 < (i6 * i5 < iMin ? i6 + 1 : i6)) {
            i3 += i3;
        }
        if (abstractMap.i()) {
            long j4 = i5;
            long j5 = abstractMap.l;
            long j6 = (j5 / j4) + 1;
            long j7 = j5 % j4;
            while (true) {
                xzt[] xztVarArr = abstractMap.f;
                if (i2 >= xztVarArr.length) {
                    return;
                }
                if (i2 == j7) {
                    j6--;
                }
                long j8 = j6;
                xztVarArr[i2] = new xzt(abstractMap, i3, j8, (ysi) ((xyf) xypVar.n).a);
                i2++;
                j6 = j8;
            }
        } else {
            int i7 = i3;
            yan<K, V> yanVar = abstractMap;
            while (true) {
                xzt[] xztVarArr2 = yanVar.f;
                if (i2 >= xztVarArr2.length) {
                    return;
                }
                xztVarArr2[i2] = new xzt(yanVar, i7, -1L, (ysi) ((xyf) xypVar.n).a);
                i2++;
                yanVar = this;
            }
        }
    }

    static void d(yao yaoVar, yao yaoVar2) {
        yaoVar.l(yaoVar2);
        yaoVar2.n(yaoVar);
    }

    static void e(yao yaoVar, yao yaoVar2) {
        yaoVar.m(yaoVar2);
        yaoVar2.o(yaoVar);
    }

    static void f(yao yaoVar) {
        xzs xzsVar = xzs.a;
        yaoVar.l(xzsVar);
        yaoVar.n(xzsVar);
    }

    static void g(yao yaoVar) {
        xzs xzsVar = xzs.a;
        yaoVar.m(xzsVar);
        yaoVar.o(xzsVar);
    }

    final int a(Object obj) {
        int iC = this.h.c(obj);
        int i = iC + ((iC << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    final xzt b(int i) {
        return this.f[(i >>> this.e) & this.d];
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x020d, code lost:
    
        if (r8.d() != r4) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x020f, code lost:
    
        r4.f();
        r5.set(r6, r3.e(r7, r8));
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041 A[Catch: all -> 0x0246, ExecutionException -> 0x0248, TRY_LEAVE, TryCatch #1 {ExecutionException -> 0x0248, blocks: (B:3:0x0012, B:5:0x0016, B:7:0x001c, B:9:0x002a, B:10:0x0031, B:12:0x003b, B:13:0x0041, B:44:0x00e5, B:89:0x01bb, B:124:0x0236, B:122:0x0233, B:123:0x0235, B:33:0x00b9, B:128:0x023f, B:129:0x0245), top: B:145:0x0012, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0129 A[Catch: all -> 0x01c7, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x01c7, blocks: (B:62:0x0129, B:86:0x01b6, B:81:0x0185, B:92:0x01c0, B:93:0x01c6, B:96:0x01ca, B:97:0x01d7, B:63:0x012f, B:65:0x0142, B:66:0x0149, B:68:0x015b, B:71:0x0167, B:73:0x016f, B:76:0x017b, B:79:0x0180, B:83:0x0189, B:84:0x019b, B:85:0x01a1), top: B:149:0x0127, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ca A[Catch: all -> 0x01c7, TryCatch #4 {all -> 0x01c7, blocks: (B:62:0x0129, B:86:0x01b6, B:81:0x0185, B:92:0x01c0, B:93:0x01c6, B:96:0x01ca, B:97:0x01d7, B:63:0x012f, B:65:0x0142, B:66:0x0149, B:68:0x015b, B:71:0x0167, B:73:0x016f, B:76:0x017b, B:79:0x0180, B:83:0x0189, B:84:0x019b, B:85:0x01a1), top: B:149:0x0127, inners: #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.lang.Object c(java.lang.Object r18, defpackage.xyr r19) throws java.util.concurrent.ExecutionException {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yan.c(java.lang.Object, xyr):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        xzt[] xztVarArr = this.f;
        int length = xztVarArr.length;
        for (int i = 0; i < length; i++) {
            xzt xztVar = xztVarArr[i];
            if (xztVar.b != 0) {
                xztVar.lock();
                try {
                    yan yanVar = xztVar.a;
                    xztVar.r(yanVar.p.b());
                    AtomicReferenceArray atomicReferenceArray = xztVar.f;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        for (yao yaoVarE = (yao) atomicReferenceArray.get(i2); yaoVarE != null; yaoVarE = yaoVarE.e()) {
                            if (yaoVarE.d().f()) {
                                Object objJ = yaoVarE.j();
                                Object obj = yaoVarE.d().get();
                                yaoVarE.a();
                                xztVar.y(objJ, obj, yaoVarE.d().a());
                            }
                        }
                    }
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        atomicReferenceArray.set(i3, null);
                    }
                    if (yanVar.o()) {
                        while (xztVar.h.poll() != null) {
                        }
                    }
                    if (yanVar.p()) {
                        while (xztVar.i.poll() != null) {
                        }
                    }
                    xztVar.l.clear();
                    xztVar.m.clear();
                    xztVar.k.set(0);
                    xztVar.d++;
                    xztVar.b = 0;
                } finally {
                    xztVar.unlock();
                    xztVar.s();
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
        if (obj == null) {
            return false;
        }
        int iA = a(obj);
        xzt xztVarB = b(iA);
        try {
            if (xztVarB.b == 0) {
                return false;
            }
            yao yaoVarC = xztVarB.c(obj, iA, xztVarB.a.p.b());
            if (yaoVarC == null) {
                return false;
            }
            return yaoVarC.d().get() != null;
        } finally {
            xztVarB.n();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        r15 = r15 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.concurrent.atomic.AtomicReferenceArray] */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsValue(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            xyi r3 = r0.p
            xzt[] r4 = r0.f
            long r5 = r3.b()
            r7 = -1
            r3 = r2
        L13:
            r9 = 3
            if (r3 >= r9) goto L6d
            int r9 = r4.length
            r10 = 0
            r12 = r2
        L1a:
            if (r12 >= r9) goto L5e
            r13 = r4[r12]
            int r14 = r13.b
            java.util.concurrent.atomic.AtomicReferenceArray r14 = r13.f
            r15 = r2
            r16 = r15
        L25:
            int r2 = r14.length()
            if (r15 >= r2) goto L51
            java.lang.Object r2 = r14.get(r15)
            yao r2 = (defpackage.yao) r2
        L31:
            r17 = r3
            if (r2 == 0) goto L4e
            java.lang.Object r3 = r13.f(r2, r5)
            r18 = r2
            if (r3 == 0) goto L47
            xww r2 = r0.i
            boolean r2 = r2.d(r1, r3)
            if (r2 == 0) goto L47
            r0 = 1
            return r0
        L47:
            yao r2 = r18.e()
            r3 = r17
            goto L31
        L4e:
            int r15 = r15 + 1
            goto L25
        L51:
            r17 = r3
            int r2 = r13.d
            long r2 = (long) r2
            long r10 = r10 + r2
            int r12 = r12 + 1
            r2 = r16
            r3 = r17
            goto L1a
        L5e:
            r16 = r2
            r17 = r3
            int r2 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r2 != 0) goto L67
            goto L6f
        L67:
            int r3 = r17 + 1
            r7 = r10
            r2 = r16
            goto L13
        L6d:
            r16 = r2
        L6f:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yan.containsValue(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.u;
        if (set != null) {
            return set;
        }
        xzi xziVar = new xzi(this);
        this.u = xziVar;
        return xziVar;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        ConcurrentMap.CC.$default$forEach(this, biConsumer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        V v = null;
        if (obj == null) {
            return null;
        }
        int iA = a(obj);
        xzt xztVarB = b(iA);
        try {
            if (xztVarB.b != 0) {
                yan yanVar = xztVarB.a;
                long jB = yanVar.p.b();
                yao yaoVarC = xztVarB.c(obj, iA, jB);
                if (yaoVarC != null) {
                    Object obj2 = yaoVarC.d().get();
                    if (obj2 != 0) {
                        xztVarB.p(yaoVarC, jB);
                        yaoVarC.j();
                        xyr xyrVar = yanVar.r;
                        v = obj2;
                    } else {
                        xztVarB.t();
                    }
                }
            }
            return v;
        } finally {
            xztVarB.n();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        V v = get(obj);
        return v != null ? v : obj2;
    }

    final boolean h() {
        return this.v != xyo.a;
    }

    final boolean i() {
        return this.l >= 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        xzt[] xztVarArr = this.f;
        long j = 0;
        for (xzt xztVar : xztVarArr) {
            if (xztVar.b != 0) {
                return false;
            }
            j += r7.d;
        }
        if (j == 0) {
            return true;
        }
        for (xzt xztVar2 : xztVarArr) {
            if (xztVar2.b != 0) {
                return false;
            }
            j -= r8.d;
        }
        return j == 0;
    }

    final boolean j() {
        return this.m > 0;
    }

    final boolean k() {
        return this.n > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.s;
        if (set != null) {
            return set;
        }
        xzl xzlVar = new xzl(this);
        this.s = xzlVar;
        return xzlVar;
    }

    final boolean l(yao yaoVar, long j) {
        yaoVar.getClass();
        if (!j() || j - yaoVar.b() < this.m) {
            return k() && j - yaoVar.c() >= this.n;
        }
        return true;
    }

    final boolean m() {
        return k();
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$merge(this, obj, obj2, biFunction);
    }

    final boolean n() {
        return j() || i();
    }

    final boolean o() {
        return this.j != xzv.a;
    }

    final boolean p() {
        return this.k != xzv.a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        k.getClass();
        v.getClass();
        int iA = a(k);
        return (V) b(iA).g(k, iA, v, false);
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
        return b(iA).g(obj, iA, obj2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        r7 = r4.d();
        r12 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r11.i.d(r13, r12) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        r6 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r12 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r7.f() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        r12 = null;
        r8 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        r2.d++;
        r11 = r2.w(r3, r4, r5, r6, r7, r8);
        r12 = r2.b - 1;
        r9.set(r10, r11);
        r2.b = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r8 != 1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        r0 = true;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L90
            if (r13 != 0) goto L7
            goto L90
        L7:
            int r1 = r11.a(r12)
            xzt r2 = r11.b(r1)
            r2.lock()
            yan r11 = r2.a     // Catch: java.lang.Throwable -> L87
            xyi r3 = r11.p     // Catch: java.lang.Throwable -> L87
            long r3 = r3.b()     // Catch: java.lang.Throwable -> L87
            r2.r(r3)     // Catch: java.lang.Throwable -> L87
            int r3 = r2.b     // Catch: java.lang.Throwable -> L87
            java.util.concurrent.atomic.AtomicReferenceArray r9 = r2.f     // Catch: java.lang.Throwable -> L87
            int r3 = r9.length()     // Catch: java.lang.Throwable -> L87
            int r3 = r3 + (-1)
            r10 = r1 & r3
            java.lang.Object r3 = r9.get(r10)     // Catch: java.lang.Throwable -> L87
            yao r3 = (defpackage.yao) r3     // Catch: java.lang.Throwable -> L87
            r4 = r3
        L30:
            if (r4 == 0) goto L7b
            java.lang.Object r5 = r4.j()     // Catch: java.lang.Throwable -> L87
            int r6 = r4.a()     // Catch: java.lang.Throwable -> L87
            if (r6 != r1) goto L82
            if (r5 == 0) goto L82
            xww r6 = r11.h     // Catch: java.lang.Throwable -> L87
            boolean r6 = r6.d(r12, r5)     // Catch: java.lang.Throwable -> L87
            if (r6 == 0) goto L82
            yac r7 = r4.d()     // Catch: java.lang.Throwable -> L87
            java.lang.Object r12 = r7.get()     // Catch: java.lang.Throwable -> L87
            xww r11 = r11.i     // Catch: java.lang.Throwable -> L87
            boolean r11 = r11.d(r13, r12)     // Catch: java.lang.Throwable -> L87
            r13 = 1
            if (r11 == 0) goto L5a
            r8 = r13
        L58:
            r6 = r12
            goto L66
        L5a:
            if (r12 != 0) goto L7b
            boolean r11 = r7.f()     // Catch: java.lang.Throwable -> L87
            if (r11 == 0) goto L7b
            r11 = 3
            r12 = 0
            r8 = r11
            goto L58
        L66:
            int r11 = r2.d     // Catch: java.lang.Throwable -> L87
            int r11 = r11 + r13
            r2.d = r11     // Catch: java.lang.Throwable -> L87
            yao r11 = r2.w(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L87
            int r12 = r2.b     // Catch: java.lang.Throwable -> L87
            int r12 = r12 + (-1)
            r9.set(r10, r11)     // Catch: java.lang.Throwable -> L87
            r2.b = r12     // Catch: java.lang.Throwable -> L87
            if (r8 != r13) goto L7b
            r0 = r13
        L7b:
            r2.unlock()
            r2.s()
            return r0
        L82:
            yao r4 = r4.e()     // Catch: java.lang.Throwable -> L87
            goto L30
        L87:
            r0 = move-exception
            r11 = r0
            r2.unlock()
            r2.s()
            throw r11
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yan.remove(java.lang.Object, java.lang.Object):boolean");
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
        xzt xztVarB = b(iA);
        xztVarB.lock();
        try {
            yan yanVar = xztVarB.a;
            long jB = yanVar.p.b();
            xztVarB.r(jB);
            AtomicReferenceArray atomicReferenceArray = xztVarB.f;
            int length = iA & (atomicReferenceArray.length() - 1);
            yao yaoVar = (yao) atomicReferenceArray.get(length);
            long j = jB;
            yao yaoVarE = yaoVar;
            while (true) {
                if (yaoVarE == null) {
                    break;
                }
                yao yaoVar2 = yaoVar;
                Object objJ = yaoVarE.j();
                if (yaoVarE.a() == iA && objJ != null && yanVar.h.d(obj, objJ)) {
                    long j2 = j;
                    yac yacVarD = yaoVarE.d();
                    Object obj4 = yacVarD.get();
                    if (obj4 == null) {
                        if (yacVarD.f()) {
                            int i = xztVarB.b;
                            xztVarB.d++;
                            yao yaoVarW = xztVarB.w(yaoVar2, yaoVarE, objJ, null, yacVarD, 3);
                            int i2 = xztVarB.b - 1;
                            atomicReferenceArray.set(length, yaoVarW);
                            xztVarB.b = i2;
                        }
                    } else if (yanVar.i.d(obj2, obj4)) {
                        xztVarB.d++;
                        xztVarB.y(obj, obj4, yacVarD.a());
                        xztVarB.x(yaoVarE, obj3, j2);
                        xztVarB.k(yaoVarE);
                        z = true;
                    } else {
                        xztVarB.o(yaoVarE, j2);
                    }
                } else {
                    yaoVar = yaoVar2;
                    long j3 = j;
                    yaoVarE = yaoVarE.e();
                    j = j3;
                }
            }
            return z;
        } finally {
            xztVarB.unlock();
            xztVarB.s();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        ConcurrentMap.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long jMax = 0;
        for (int i = 0; i < this.f.length; i++) {
            jMax += Math.max(0, r7[i].b);
        }
        return wub.aw(jMax);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.t;
        if (collection != null) {
            return collection;
        }
        yad yadVar = new yad(this);
        this.t = yadVar;
        return yadVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        r7 = r4.d();
        r6 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r6 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (r7.f() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        r8 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        r2.d++;
        r11 = r2.w(r3, r4, r5, r6, r7, r8);
        r12 = r2.b - 1;
        r9.set(r10, r11);
        r2.b = r12;
        r0 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V remove(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 0
            if (r12 != 0) goto L4
            return r0
        L4:
            int r1 = r11.a(r12)
            xzt r2 = r11.b(r1)
            r2.lock()
            yan r11 = r2.a     // Catch: java.lang.Throwable -> L78
            xyi r3 = r11.p     // Catch: java.lang.Throwable -> L78
            long r3 = r3.b()     // Catch: java.lang.Throwable -> L78
            r2.r(r3)     // Catch: java.lang.Throwable -> L78
            int r3 = r2.b     // Catch: java.lang.Throwable -> L78
            java.util.concurrent.atomic.AtomicReferenceArray r9 = r2.f     // Catch: java.lang.Throwable -> L78
            int r3 = r9.length()     // Catch: java.lang.Throwable -> L78
            int r3 = r3 + (-1)
            r10 = r1 & r3
            java.lang.Object r3 = r9.get(r10)     // Catch: java.lang.Throwable -> L78
            yao r3 = (defpackage.yao) r3     // Catch: java.lang.Throwable -> L78
            r4 = r3
        L2d:
            if (r4 == 0) goto L71
            java.lang.Object r5 = r4.j()     // Catch: java.lang.Throwable -> L78
            int r6 = r4.a()     // Catch: java.lang.Throwable -> L78
            if (r6 != r1) goto L6c
            if (r5 == 0) goto L6c
            xww r6 = r11.h     // Catch: java.lang.Throwable -> L78
            boolean r6 = r6.d(r12, r5)     // Catch: java.lang.Throwable -> L78
            if (r6 == 0) goto L6c
            yac r7 = r4.d()     // Catch: java.lang.Throwable -> L78
            java.lang.Object r6 = r7.get()     // Catch: java.lang.Throwable -> L78
            r11 = 1
            if (r6 == 0) goto L50
            r8 = r11
            goto L58
        L50:
            boolean r12 = r7.f()     // Catch: java.lang.Throwable -> L78
            if (r12 == 0) goto L71
            r12 = 3
            r8 = r12
        L58:
            int r12 = r2.d     // Catch: java.lang.Throwable -> L78
            int r12 = r12 + r11
            r2.d = r12     // Catch: java.lang.Throwable -> L78
            yao r11 = r2.w(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L78
            int r12 = r2.b     // Catch: java.lang.Throwable -> L78
            int r12 = r12 + (-1)
            r9.set(r10, r11)     // Catch: java.lang.Throwable -> L78
            r2.b = r12     // Catch: java.lang.Throwable -> L78
            r0 = r6
            goto L71
        L6c:
            yao r4 = r4.e()     // Catch: java.lang.Throwable -> L78
            goto L2d
        L71:
            r2.unlock()
            r2.s()
            return r0
        L78:
            r0 = move-exception
            r11 = r0
            r2.unlock()
            r2.s()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yan.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        Object obj3;
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        xzt xztVarB = b(iA);
        xztVarB.lock();
        try {
            yan yanVar = xztVarB.a;
            long jB = yanVar.p.b();
            xztVarB.r(jB);
            AtomicReferenceArray atomicReferenceArray = xztVarB.f;
            int length = iA & (atomicReferenceArray.length() - 1);
            yao yaoVar = (yao) atomicReferenceArray.get(length);
            long j = jB;
            yao yaoVarE = yaoVar;
            while (true) {
                obj3 = null;
                if (yaoVarE == null) {
                    break;
                }
                yao yaoVar2 = yaoVar;
                Object objJ = yaoVarE.j();
                if (yaoVarE.a() == iA && objJ != null && yanVar.h.d(obj, objJ)) {
                    long j2 = j;
                    yac yacVarD = yaoVarE.d();
                    Object obj4 = yacVarD.get();
                    if (obj4 == null) {
                        if (yacVarD.f()) {
                            int i = xztVarB.b;
                            xztVarB.d++;
                            yao yaoVarW = xztVarB.w(yaoVar2, yaoVarE, objJ, null, yacVarD, 3);
                            int i2 = xztVarB.b - 1;
                            atomicReferenceArray.set(length, yaoVarW);
                            xztVarB.b = i2;
                        }
                    } else {
                        xztVarB.d++;
                        xztVarB.y(obj, obj4, yacVarD.a());
                        xztVarB.x(yaoVarE, obj2, j2);
                        xztVarB.k(yaoVarE);
                        obj3 = obj4;
                    }
                } else {
                    long j3 = j;
                    yaoVarE = yaoVarE.e();
                    yaoVar = yaoVar2;
                    j = j3;
                }
            }
            return obj3;
        } finally {
            xztVarB.unlock();
            xztVarB.s();
        }
    }
}
