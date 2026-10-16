package com.google.d.c;

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

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class bd<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, j$.util.concurrent.ConcurrentMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    static final Logger f7344a = Logger.getLogger(bd.class.getName());

    /* renamed from: b, reason: collision with root package name */
    static final as f7345b = new m();

    /* renamed from: c, reason: collision with root package name */
    static final Queue f7346c = new n();
    public static final /* synthetic */ int x = 0;

    /* renamed from: d, reason: collision with root package name */
    final int f7347d;

    /* renamed from: e, reason: collision with root package name */
    final int f7348e;

    /* renamed from: f, reason: collision with root package name */
    final aj[] f7349f;

    /* renamed from: g, reason: collision with root package name */
    final int f7350g;

    /* renamed from: h, reason: collision with root package name */
    final com.google.d.b.s f7351h;

    /* renamed from: i, reason: collision with root package name */
    final com.google.d.b.s f7352i;

    /* renamed from: j, reason: collision with root package name */
    final al f7353j;

    /* renamed from: k, reason: collision with root package name */
    final al f7354k;

    /* renamed from: l, reason: collision with root package name */
    final long f7355l;
    final bi m;
    final long n;
    final long o;
    final Queue p;
    final bg q;
    final com.google.d.b.aq r;
    final z s;
    final j t;
    Set u;
    Collection v;
    Set w;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.d.c.bd, java.util.AbstractMap] */
    bd(h hVar) {
        ?? abstractMap = new AbstractMap();
        int i2 = hVar.f7371e;
        abstractMap.f7350g = Math.min(i2 == -1 ? 4 : i2, 65536);
        al alVarC = hVar.c();
        abstractMap.f7353j = alVarC;
        abstractMap.f7354k = hVar.d();
        abstractMap.f7351h = (com.google.d.b.s) com.google.d.b.an.I(hVar.m, hVar.c().a());
        abstractMap.f7352i = (com.google.d.b.s) com.google.d.b.an.I(hVar.n, hVar.d().a());
        long j2 = (hVar.f7377k == 0 || hVar.f7378l == 0) ? 0L : hVar.f7374h == null ? hVar.f7372f : hVar.f7373g;
        abstractMap.f7355l = j2;
        abstractMap.m = (bi) com.google.d.b.an.I(hVar.f7374h, g.f7365a);
        long j3 = hVar.f7378l;
        abstractMap.n = j3 == -1 ? 0L : j3;
        long j4 = hVar.f7377k;
        abstractMap.o = j4 != -1 ? j4 : 0L;
        bg bgVar = hVar.o;
        f fVar = f.f7363a;
        bg bgVar2 = (bg) com.google.d.b.an.I(bgVar, fVar);
        abstractMap.q = bgVar2;
        abstractMap.p = bgVar2 == fVar ? f7346c : new ConcurrentLinkedQueue();
        int i3 = 0;
        int i4 = 1;
        boolean z = abstractMap.l() || abstractMap.i();
        com.google.d.b.aq aqVar = hVar.p;
        abstractMap.r = aqVar == null ? z ? com.google.d.b.aq.systemTicker() : h.f7368b : aqVar;
        char c2 = (abstractMap.m() || abstractMap.i()) ? (char) 1 : (char) 0;
        boolean z2 = abstractMap.j() || abstractMap.l();
        z zVar = z.f7391a;
        abstractMap.s = z.f7399i[(alVarC != al.f7301c ? (char) 0 : (char) 4) | c2 | (true != z2 ? 0 : 2)];
        abstractMap.t = null;
        int i5 = hVar.f7370d;
        int iMin = Math.min(i5 == -1 ? 16 : i5, 1073741824);
        if (abstractMap.h() && !abstractMap.g()) {
            iMin = (int) Math.min(iMin, j2);
        }
        int i6 = 0;
        int i7 = 1;
        while (i7 < abstractMap.f7350g && (!abstractMap.h() || i7 * 20 <= abstractMap.f7355l)) {
            i6++;
            i7 += i7;
        }
        abstractMap.f7348e = 32 - i6;
        abstractMap.f7347d = i7 - 1;
        abstractMap.f7349f = new aj[i7];
        int i8 = iMin / i7;
        while (i4 < (i8 * i7 < iMin ? i8 + 1 : i8)) {
            i4 += i4;
        }
        if (abstractMap.h()) {
            long j5 = i7;
            long j6 = abstractMap.f7355l;
            long j7 = (j6 / j5) + 1;
            long j8 = j6 % j5;
            while (true) {
                aj[] ajVarArr = abstractMap.f7349f;
                if (i3 >= ajVarArr.length) {
                    return;
                }
                if (i3 == j8) {
                    j7--;
                }
                long j9 = j7;
                ajVarArr[i3] = new aj(abstractMap, i4, j9, (a) hVar.q.get());
                i3++;
                j7 = j9;
            }
        } else {
            int i9 = i4;
            bd<K, V> bdVar = abstractMap;
            while (true) {
                aj[] ajVarArr2 = bdVar.f7349f;
                if (i3 >= ajVarArr2.length) {
                    return;
                }
                ajVarArr2[i3] = new aj(bdVar, i9, -1L, (a) hVar.q.get());
                i3++;
                bdVar = this;
            }
        }
    }

    static void c(be beVar, be beVar2) {
        beVar.l(beVar2);
        beVar2.n(beVar);
    }

    static void d(be beVar, be beVar2) {
        beVar.m(beVar2);
        beVar2.o(beVar);
    }

    static void e(be beVar) {
        ai aiVar = ai.f7284a;
        beVar.l(aiVar);
        beVar.n(aiVar);
    }

    static void f(be beVar) {
        ai aiVar = ai.f7284a;
        beVar.m(aiVar);
        beVar.o(aiVar);
    }

    final int a(Object obj) {
        int iC = this.f7351h.c(obj);
        int i2 = iC + ((iC << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    final aj b(int i2) {
        return this.f7349f[(i2 >>> this.f7348e) & this.f7347d];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        aj[] ajVarArr = this.f7349f;
        int length = ajVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            aj ajVar = ajVarArr[i2];
            if (ajVar.f7287b != 0) {
                ajVar.lock();
                try {
                    bd bdVar = ajVar.f7286a;
                    ajVar.r(bdVar.r.read());
                    AtomicReferenceArray atomicReferenceArray = ajVar.f7291f;
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        for (be beVarE = (be) atomicReferenceArray.get(i3); beVarE != null; beVarE = beVarE.e()) {
                            if (beVarE.d().f()) {
                                Object objJ = beVarE.j();
                                Object obj = beVarE.d().get();
                                bf bfVar = (objJ == null || obj == null) ? bf.f7358c : bf.f7356a;
                                beVarE.a();
                                ajVar.w(objJ, obj, beVarE.d().a(), bfVar);
                            }
                        }
                    }
                    for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                        atomicReferenceArray.set(i4, null);
                    }
                    if (bdVar.n()) {
                        while (ajVar.f7293h.poll() != null) {
                        }
                    }
                    if (bdVar.o()) {
                        while (ajVar.f7294i.poll() != null) {
                        }
                    }
                    ajVar.f7297l.clear();
                    ajVar.m.clear();
                    ajVar.f7296k.set(0);
                    ajVar.f7289d++;
                    ajVar.f7287b = 0;
                } finally {
                    ajVar.unlock();
                    ajVar.s();
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
        aj ajVarB = b(iA);
        try {
            if (ajVarB.f7287b == 0) {
                return false;
            }
            be beVarC = ajVarB.c(obj, iA, ajVarB.f7286a.r.read());
            if (beVarC == null) {
                return false;
            }
            return beVarC.d().get() != null;
        } finally {
            ajVarB.n();
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
            com.google.d.b.aq r3 = r0.r
            com.google.d.c.aj[] r4 = r0.f7349f
            long r5 = r3.read()
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
            int r14 = r13.f7287b
            java.util.concurrent.atomic.AtomicReferenceArray r14 = r13.f7291f
            r15 = r2
            r16 = r15
        L25:
            int r2 = r14.length()
            if (r15 >= r2) goto L51
            java.lang.Object r2 = r14.get(r15)
            com.google.d.c.be r2 = (com.google.d.c.be) r2
        L31:
            r17 = r3
            if (r2 == 0) goto L4e
            java.lang.Object r3 = r13.f(r2, r5)
            r18 = r2
            if (r3 == 0) goto L47
            com.google.d.b.s r2 = r0.f7352i
            boolean r2 = r2.f(r1, r3)
            if (r2 == 0) goto L47
            r0 = 1
            return r0
        L47:
            com.google.d.c.be r2 = r18.e()
            r3 = r17
            goto L31
        L4e:
            int r15 = r15 + 1
            goto L25
        L51:
            r17 = r3
            int r2 = r13.f7289d
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.c.bd.containsValue(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.w;
        if (set != null) {
            return set;
        }
        ab abVar = new ab(this);
        this.w = abVar;
        return abVar;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        ConcurrentMap.CC.$default$forEach(this, biConsumer);
    }

    final boolean g() {
        return this.m != g.f7365a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        V v = null;
        if (obj == null) {
            return null;
        }
        int iA = a(obj);
        aj ajVarB = b(iA);
        try {
            if (ajVarB.f7287b != 0) {
                bd bdVar = ajVarB.f7286a;
                long j2 = bdVar.r.read();
                be beVarC = ajVarB.c(obj, iA, j2);
                if (beVarC != null) {
                    Object obj2 = beVarC.d().get();
                    if (obj2 != 0) {
                        ajVarB.p(beVarC, j2);
                        beVarC.j();
                        j jVar = bdVar.t;
                        v = obj2;
                    } else {
                        ajVarB.t();
                    }
                }
            }
            return v;
        } finally {
            ajVarB.n();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    final boolean h() {
        return this.f7355l >= 0;
    }

    final boolean i() {
        return this.n > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        aj[] ajVarArr = this.f7349f;
        long j2 = 0;
        for (aj ajVar : ajVarArr) {
            if (ajVar.f7287b != 0) {
                return false;
            }
            j2 += r7.f7289d;
        }
        if (j2 == 0) {
            return true;
        }
        for (aj ajVar2 : ajVarArr) {
            if (ajVar2.f7287b != 0) {
                return false;
            }
            j2 -= r8.f7289d;
        }
        return j2 == 0;
    }

    final boolean j() {
        return this.o > 0;
    }

    final boolean k(be beVar, long j2) {
        com.google.d.b.an.B(beVar);
        if (!i() || j2 - beVar.b() < this.n) {
            return j() && j2 - beVar.c() >= this.o;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.u;
        if (set != null) {
            return set;
        }
        ae aeVar = new ae(this);
        this.u = aeVar;
        return aeVar;
    }

    final boolean l() {
        return j();
    }

    final boolean m() {
        return i() || h();
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$merge(this, obj, obj2, biFunction);
    }

    final boolean n() {
        return this.f7353j != al.f7299a;
    }

    final boolean o() {
        return this.f7354k != al.f7299a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k2, V v) {
        com.google.d.b.an.B(k2);
        com.google.d.b.an.B(v);
        int iA = a(k2);
        return (V) b(iA).g(k2, iA, v, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final V putIfAbsent(K k2, V v) {
        com.google.d.b.an.B(k2);
        com.google.d.b.an.B(v);
        int iA = a(k2);
        return (V) b(iA).g(k2, iA, v, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        r7 = r4.d();
        r12 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (r11.f7352i.f(r13, r12) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        r11 = com.google.d.c.bf.f7356a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        r8 = r11;
        r6 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (r12 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (r7.f() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        r11 = com.google.d.c.bf.f7358c;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        r2.f7289d++;
        r11 = r2.x(r3, r4, r5, r6, r7, r8);
        r13 = r2.f7287b - 1;
        r9.set(r10, r11);
        r2.f7287b = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        if (r8 != com.google.d.c.bf.f7356a) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
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
            if (r12 == 0) goto L94
            if (r13 != 0) goto L7
            goto L94
        L7:
            int r1 = r11.a(r12)
            com.google.d.c.aj r2 = r11.b(r1)
            r2.lock()
            com.google.d.c.bd r11 = r2.f7286a     // Catch: java.lang.Throwable -> L8b
            com.google.d.b.aq r3 = r11.r     // Catch: java.lang.Throwable -> L8b
            long r3 = r3.read()     // Catch: java.lang.Throwable -> L8b
            r2.r(r3)     // Catch: java.lang.Throwable -> L8b
            int r3 = r2.f7287b     // Catch: java.lang.Throwable -> L8b
            java.util.concurrent.atomic.AtomicReferenceArray r9 = r2.f7291f     // Catch: java.lang.Throwable -> L8b
            int r3 = r9.length()     // Catch: java.lang.Throwable -> L8b
            int r3 = r3 + (-1)
            r10 = r1 & r3
            java.lang.Object r3 = r9.get(r10)     // Catch: java.lang.Throwable -> L8b
            com.google.d.c.be r3 = (com.google.d.c.be) r3     // Catch: java.lang.Throwable -> L8b
            r4 = r3
        L30:
            if (r4 == 0) goto L7f
            java.lang.Object r5 = r4.j()     // Catch: java.lang.Throwable -> L8b
            int r6 = r4.a()     // Catch: java.lang.Throwable -> L8b
            if (r6 != r1) goto L86
            if (r5 == 0) goto L86
            com.google.d.b.s r6 = r11.f7351h     // Catch: java.lang.Throwable -> L8b
            boolean r6 = r6.f(r12, r5)     // Catch: java.lang.Throwable -> L8b
            if (r6 == 0) goto L86
            com.google.d.c.as r7 = r4.d()     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r12 = r7.get()     // Catch: java.lang.Throwable -> L8b
            com.google.d.b.s r11 = r11.f7352i     // Catch: java.lang.Throwable -> L8b
            boolean r11 = r11.f(r13, r12)     // Catch: java.lang.Throwable -> L8b
            if (r11 == 0) goto L5b
            com.google.d.c.bf r11 = com.google.d.c.bf.f7356a     // Catch: java.lang.Throwable -> L8b
        L58:
            r8 = r11
            r6 = r12
            goto L67
        L5b:
            if (r12 != 0) goto L7f
            boolean r11 = r7.f()     // Catch: java.lang.Throwable -> L8b
            if (r11 == 0) goto L7f
            com.google.d.c.bf r11 = com.google.d.c.bf.f7358c     // Catch: java.lang.Throwable -> L8b
            r12 = 0
            goto L58
        L67:
            int r11 = r2.f7289d     // Catch: java.lang.Throwable -> L8b
            r12 = 1
            int r11 = r11 + r12
            r2.f7289d = r11     // Catch: java.lang.Throwable -> L8b
            com.google.d.c.be r11 = r2.x(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L8b
            int r13 = r2.f7287b     // Catch: java.lang.Throwable -> L8b
            int r13 = r13 + (-1)
            r9.set(r10, r11)     // Catch: java.lang.Throwable -> L8b
            r2.f7287b = r13     // Catch: java.lang.Throwable -> L8b
            com.google.d.c.bf r11 = com.google.d.c.bf.f7356a     // Catch: java.lang.Throwable -> L8b
            if (r8 != r11) goto L7f
            r0 = r12
        L7f:
            r2.unlock()
            r2.s()
            return r0
        L86:
            com.google.d.c.be r4 = r4.e()     // Catch: java.lang.Throwable -> L8b
            goto L30
        L8b:
            r0 = move-exception
            r11 = r0
            r2.unlock()
            r2.s()
            throw r11
        L94:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.c.bd.remove(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(K k2, V v, V v2) {
        com.google.d.b.an.B(k2);
        com.google.d.b.an.B(v2);
        boolean z = false;
        if (v == null) {
            return false;
        }
        int iA = a(k2);
        aj ajVarB = b(iA);
        ajVarB.lock();
        try {
            bd bdVar = ajVarB.f7286a;
            long j2 = bdVar.r.read();
            ajVarB.r(j2);
            AtomicReferenceArray atomicReferenceArray = ajVarB.f7291f;
            int length = iA & (atomicReferenceArray.length() - 1);
            be beVar = (be) atomicReferenceArray.get(length);
            long j3 = j2;
            be beVarE = beVar;
            while (true) {
                if (beVarE == null) {
                    break;
                }
                be beVar2 = beVar;
                Object objJ = beVarE.j();
                if (beVarE.a() == iA && objJ != null && bdVar.f7351h.f(k2, objJ)) {
                    long j4 = j3;
                    as asVarD = beVarE.d();
                    Object obj = asVarD.get();
                    if (obj == null) {
                        if (asVarD.f()) {
                            int i2 = ajVarB.f7287b;
                            ajVarB.f7289d++;
                            be beVarX = ajVarB.x(beVar2, beVarE, objJ, null, asVarD, bf.f7358c);
                            int i3 = ajVarB.f7287b - 1;
                            atomicReferenceArray.set(length, beVarX);
                            ajVarB.f7287b = i3;
                        }
                    } else if (bdVar.f7352i.f(v, obj)) {
                        ajVarB.f7289d++;
                        ajVarB.w(k2, obj, asVarD.a(), bf.f7357b);
                        ajVarB.y(beVarE, v2, j4);
                        ajVarB.k(beVarE);
                        z = true;
                    } else {
                        ajVarB.o(beVarE, j4);
                    }
                } else {
                    beVar = beVar2;
                    long j5 = j3;
                    beVarE = beVarE.e();
                    j3 = j5;
                }
            }
            return z;
        } finally {
            ajVarB.unlock();
            ajVarB.s();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        ConcurrentMap.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long jMax = 0;
        for (int i2 = 0; i2 < this.f7349f.length; i2++) {
            jMax += Math.max(0, r7[i2].f7287b);
        }
        return com.google.d.l.j.k(jMax);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.v;
        if (collection != null) {
            return collection;
        }
        at atVar = new at(this);
        this.v = atVar;
        return atVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        r7 = r4.d();
        r6 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r6 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        r11 = com.google.d.c.bf.f7356a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        r8 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r7.f() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        r11 = com.google.d.c.bf.f7358c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        r2.f7289d++;
        r11 = r2.x(r3, r4, r5, r6, r7, r8);
        r12 = r2.f7287b - 1;
        r9.set(r10, r11);
        r2.f7287b = r12;
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
            com.google.d.c.aj r2 = r11.b(r1)
            r2.lock()
            com.google.d.c.bd r11 = r2.f7286a     // Catch: java.lang.Throwable -> L7b
            com.google.d.b.aq r3 = r11.r     // Catch: java.lang.Throwable -> L7b
            long r3 = r3.read()     // Catch: java.lang.Throwable -> L7b
            r2.r(r3)     // Catch: java.lang.Throwable -> L7b
            int r3 = r2.f7287b     // Catch: java.lang.Throwable -> L7b
            java.util.concurrent.atomic.AtomicReferenceArray r9 = r2.f7291f     // Catch: java.lang.Throwable -> L7b
            int r3 = r9.length()     // Catch: java.lang.Throwable -> L7b
            int r3 = r3 + (-1)
            r10 = r1 & r3
            java.lang.Object r3 = r9.get(r10)     // Catch: java.lang.Throwable -> L7b
            com.google.d.c.be r3 = (com.google.d.c.be) r3     // Catch: java.lang.Throwable -> L7b
            r4 = r3
        L2d:
            if (r4 == 0) goto L74
            java.lang.Object r5 = r4.j()     // Catch: java.lang.Throwable -> L7b
            int r6 = r4.a()     // Catch: java.lang.Throwable -> L7b
            if (r6 != r1) goto L6f
            if (r5 == 0) goto L6f
            com.google.d.b.s r6 = r11.f7351h     // Catch: java.lang.Throwable -> L7b
            boolean r6 = r6.f(r12, r5)     // Catch: java.lang.Throwable -> L7b
            if (r6 == 0) goto L6f
            com.google.d.c.as r7 = r4.d()     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r6 = r7.get()     // Catch: java.lang.Throwable -> L7b
            if (r6 == 0) goto L51
            com.google.d.c.bf r11 = com.google.d.c.bf.f7356a     // Catch: java.lang.Throwable -> L7b
        L4f:
            r8 = r11
            goto L5a
        L51:
            boolean r11 = r7.f()     // Catch: java.lang.Throwable -> L7b
            if (r11 == 0) goto L74
            com.google.d.c.bf r11 = com.google.d.c.bf.f7358c     // Catch: java.lang.Throwable -> L7b
            goto L4f
        L5a:
            int r11 = r2.f7289d     // Catch: java.lang.Throwable -> L7b
            int r11 = r11 + 1
            r2.f7289d = r11     // Catch: java.lang.Throwable -> L7b
            com.google.d.c.be r11 = r2.x(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L7b
            int r12 = r2.f7287b     // Catch: java.lang.Throwable -> L7b
            int r12 = r12 + (-1)
            r9.set(r10, r11)     // Catch: java.lang.Throwable -> L7b
            r2.f7287b = r12     // Catch: java.lang.Throwable -> L7b
            r0 = r6
            goto L74
        L6f:
            com.google.d.c.be r4 = r4.e()     // Catch: java.lang.Throwable -> L7b
            goto L2d
        L74:
            r2.unlock()
            r2.s()
            return r0
        L7b:
            r0 = move-exception
            r11 = r0
            r2.unlock()
            r2.s()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.c.bd.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final V replace(K k2, V v) {
        V v2;
        com.google.d.b.an.B(k2);
        com.google.d.b.an.B(v);
        int iA = a(k2);
        aj ajVarB = b(iA);
        ajVarB.lock();
        try {
            bd bdVar = ajVarB.f7286a;
            long j2 = bdVar.r.read();
            ajVarB.r(j2);
            AtomicReferenceArray atomicReferenceArray = ajVarB.f7291f;
            int length = iA & (atomicReferenceArray.length() - 1);
            be beVar = (be) atomicReferenceArray.get(length);
            long j3 = j2;
            be beVarE = beVar;
            while (true) {
                v2 = null;
                if (beVarE == null) {
                    break;
                }
                be beVar2 = beVar;
                Object objJ = beVarE.j();
                if (beVarE.a() == iA && objJ != null && bdVar.f7351h.f(k2, objJ)) {
                    long j4 = j3;
                    as asVarD = beVarE.d();
                    Object obj = asVarD.get();
                    if (obj == null) {
                        if (asVarD.f()) {
                            int i2 = ajVarB.f7287b;
                            ajVarB.f7289d++;
                            be beVarX = ajVarB.x(beVar2, beVarE, objJ, null, asVarD, bf.f7358c);
                            int i3 = ajVarB.f7287b - 1;
                            atomicReferenceArray.set(length, beVarX);
                            ajVarB.f7287b = i3;
                        }
                    } else {
                        ajVarB.f7289d++;
                        ajVarB.w(k2, obj, asVarD.a(), bf.f7357b);
                        ajVarB.y(beVarE, v, j4);
                        ajVarB.k(beVarE);
                        v2 = (V) obj;
                    }
                } else {
                    long j5 = j3;
                    beVarE = beVarE.e();
                    beVar = beVar2;
                    j3 = j5;
                }
            }
            return v2;
        } finally {
            ajVarB.unlock();
            ajVarB.s();
        }
    }
}
