package com.waze.av.b;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class be implements ah {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.w.p f15933a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.w.p f15934b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.w.p f15935c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.a f15936d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.places.g f15937e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f15938f;

    /* renamed from: g, reason: collision with root package name */
    private final kotlinx.coroutines.af f15939g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f15940h;

    /* renamed from: i, reason: collision with root package name */
    private final ch f15941i;

    public be(com.waze.w.p pVar, com.waze.w.p pVar2, h.c.j jVar, com.waze.w.p pVar3, h.g.a.a aVar, com.waze.places.g gVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(pVar, "recentsDataSource");
        h.g.b.x.f(pVar2, "favoritesDataSource");
        h.g.b.x.f(jVar, "coroutineContext");
        h.g.b.x.f(pVar3, "eventDataSource");
        h.g.b.x.f(aVar, "registerPlacesUpdateNotification");
        h.g.b.x.f(gVar, "placeActions");
        h.g.b.x.f(eVar, "logger");
        this.f15933a = pVar;
        this.f15934b = pVar2;
        this.f15935c = pVar3;
        this.f15936d = aVar;
        this.f15937e = gVar;
        this.f15938f = eVar;
        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(jVar);
        this.f15939g = afVarE;
        this.f15940h = new AtomicBoolean(false);
        al alVar = new al((kotlinx.coroutines.b.k[]) h.a.i.ao(h.a.i.i(pVar.e(), pVar2.e(), pVar3.e())).toArray(new kotlinx.coroutines.b.k[0]), 4);
        int i2 = bz.f51630a;
        this.f15941i = kotlinx.coroutines.b.ai.V(alVar, afVarE, by.b(), h.a.i.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(com.waze.av.a.p r6, h.g.a.l r7, h.c.e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.waze.av.b.av
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.av.b.av r0 = (com.waze.av.b.av) r0
            int r1 = r0.f15897d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15897d = r1
            goto L18
        L13:
            com.waze.av.b.av r0 = new com.waze.av.b.av
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f15895b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f15897d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.f15894a
            r7 = r5
            h.g.a.l r7 = (h.g.a.l) r7
            com.waze.av.a.p r6 = r0.f15898e
            r5 = r6
            com.waze.av.a.p r5 = (com.waze.av.a.p) r5
            e.b.c.b(r8)
            goto L54
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            e.b.c.b(r8)
            kotlinx.coroutines.b.ch r8 = r5.f15941i
            kotlinx.coroutines.b.k r8 = (kotlinx.coroutines.b.k) r8
            com.waze.av.b.aw r2 = new com.waze.av.b.aw
            r2.<init>(r5, r6, r7, r4)
            h.g.a.p r2 = (h.g.a.p) r2
            r0.f15898e = r6
            r0.f15894a = r7
            r0.f15897d = r3
            java.lang.Object r8 = kotlinx.coroutines.b.ai.k(r8, r2, r0)
            if (r8 == r1) goto L85
        L54:
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L84
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r5 = r8.iterator()
        L5e:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L82
            java.lang.Object r8 = r5.next()
            r0 = r8
            com.waze.av.b.aa r0 = (com.waze.av.b.aa) r0
            com.waze.av.a.p r1 = r0.a()
            boolean r1 = p(r6, r1)
            if (r1 == 0) goto L5e
            java.lang.Object r0 = r7.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5e
            r4 = r8
        L82:
            com.waze.av.b.aa r4 = (com.waze.av.b.aa) r4
        L84:
            return r4
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.av.b.be.n(com.waze.av.a.p, h.g.a.l, h.c.e):java.lang.Object");
    }

    private static final boolean o(aa aaVar) {
        return aaVar.c().isEmpty() && aaVar.d().isEmpty() && aaVar.b().isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(com.waze.av.a.p pVar, com.waze.av.a.p pVar2) {
        if (pVar.e() != null) {
            return h.g.b.x.n(pVar.e(), pVar2.e());
        }
        if (pVar.c().c() == null) {
            return false;
        }
        return h.g.b.x.n(pVar.c().c(), pVar2.c().c());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.av.b.ah
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.waze.av.a.p r10, com.waze.av.b.c r11, h.c.e r12) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.av.b.be.a(com.waze.av.a.p, com.waze.av.b.c, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.av.b.ah
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.waze.av.a.p r9, com.waze.av.b.h r10, h.c.e r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.waze.av.b.ay
            if (r0 == 0) goto L13
            r0 = r11
            com.waze.av.b.ay r0 = (com.waze.av.b.ay) r0
            int r1 = r0.f15912d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15912d = r1
            goto L18
        L13:
            com.waze.av.b.ay r0 = new com.waze.av.b.ay
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f15910b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f15912d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r8 = r0.f15909a
            com.waze.av.b.aa r8 = (com.waze.av.b.aa) r8
            e.b.c.b(r11)
            goto Lbd
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            com.waze.av.b.aa r9 = r0.f15913e
            r10 = r9
            com.waze.av.b.aa r10 = (com.waze.av.b.aa) r10
            java.lang.Object r10 = r0.f15909a
            com.waze.av.b.h r10 = (com.waze.av.b.h) r10
            e.b.c.b(r11)
            goto L86
        L45:
            e.b.c.b(r11)
            kotlinx.coroutines.b.ch r11 = r8.f15941i
            java.lang.Object r11 = r11.d()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
        L54:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L6c
            java.lang.Object r2 = r11.next()
            r6 = r2
            com.waze.av.b.aa r6 = (com.waze.av.b.aa) r6
            com.waze.av.a.p r6 = r6.a()
            boolean r6 = p(r6, r9)
            if (r6 == 0) goto L54
            goto L6d
        L6c:
            r2 = r5
        L6d:
            com.waze.av.b.aa r2 = (com.waze.av.b.aa) r2
            if (r2 != 0) goto L72
            return r5
        L72:
            com.waze.places.g r9 = r8.f15937e
            long r6 = r10.a()
            r0.f15909a = r10
            r0.f15913e = r2
            r0.f15912d = r4
            java.lang.Object r11 = r9.b(r6, r0)
            if (r11 != r1) goto L85
            goto Lc3
        L85:
            r9 = r2
        L86:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto Lc4
            java.util.List r11 = r9.c()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.List r11 = h.a.i.ae(r11, r10)
            r2 = 13
            com.waze.av.b.aa r11 = com.waze.av.b.aa.e(r9, r11, r5, r5, r2)
            boolean r2 = o(r11)
            if (r2 == 0) goto La5
            return r11
        La5:
            com.waze.av.a.p r11 = r9.a()
            com.waze.car_lib.b.n r2 = new com.waze.car_lib.b.n
            r4 = 15
            r2.<init>(r10, r4)
            r0.f15909a = r9
            r0.f15913e = r5
            r0.f15912d = r3
            java.lang.Object r11 = r8.n(r11, r2, r0)
            if (r11 == r1) goto Lc3
            r8 = r9
        Lbd:
            com.waze.av.b.aa r11 = (com.waze.av.b.aa) r11
            if (r11 != 0) goto Lc2
            return r8
        Lc2:
            return r11
        Lc3:
            return r1
        Lc4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.av.b.be.b(com.waze.av.a.p, com.waze.av.b.h, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.av.b.ah
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.waze.av.a.p r9, com.waze.av.b.y r10, h.c.e r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.waze.av.b.az
            if (r0 == 0) goto L13
            r0 = r11
            com.waze.av.b.az r0 = (com.waze.av.b.az) r0
            int r1 = r0.f15916c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15916c = r1
            goto L18
        L13:
            com.waze.av.b.az r0 = new com.waze.av.b.az
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f15914a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f15916c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            e.b.c.b(r11)
            return r11
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            com.waze.av.b.aa r9 = r0.f15918e
            r10 = r9
            com.waze.av.b.aa r10 = (com.waze.av.b.aa) r10
            com.waze.av.b.y r10 = r0.f15917d
            r2 = r10
            com.waze.av.b.y r2 = (com.waze.av.b.y) r2
            e.b.c.b(r11)
            goto L82
        L41:
            e.b.c.b(r11)
            kotlinx.coroutines.b.ch r11 = r8.f15941i
            java.lang.Object r11 = r11.d()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
        L50:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r11.next()
            r6 = r2
            com.waze.av.b.aa r6 = (com.waze.av.b.aa) r6
            com.waze.av.a.p r6 = r6.a()
            boolean r6 = p(r6, r9)
            if (r6 == 0) goto L50
            goto L69
        L68:
            r2 = r5
        L69:
            r9 = r2
            com.waze.av.b.aa r9 = (com.waze.av.b.aa) r9
            if (r9 != 0) goto L6f
            return r5
        L6f:
            com.waze.places.g r11 = r8.f15937e
            long r6 = r10.b()
            r0.f15917d = r10
            r0.f15918e = r9
            r0.f15916c = r4
            java.lang.Object r11 = r11.c(r6, r0)
            if (r11 != r1) goto L82
            goto Lb8
        L82:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto Lba
            java.util.List r11 = r9.d()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.List r11 = h.a.i.ae(r11, r10)
            r2 = 11
            com.waze.av.b.aa r11 = com.waze.av.b.aa.e(r9, r5, r11, r5, r2)
            boolean r2 = o(r11)
            if (r2 == 0) goto La1
            return r11
        La1:
            com.waze.av.a.p r9 = r9.a()
            com.waze.car_lib.b.n r11 = new com.waze.car_lib.b.n
            r2 = 16
            r11.<init>(r10, r2)
            r0.f15917d = r5
            r0.f15918e = r5
            r0.f15916c = r3
            java.lang.Object r8 = r8.n(r9, r11, r0)
            if (r8 != r1) goto Lb9
        Lb8:
            return r1
        Lb9:
            return r8
        Lba:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.av.b.be.c(com.waze.av.a.p, com.waze.av.b.y, h.c.e):java.lang.Object");
    }

    @Override // com.waze.av.b.ah
    public final ch d() {
        return this.f15941i;
    }

    @Override // com.waze.av.b.ah
    public final void e() {
        if (this.f15940h.compareAndSet(false, true)) {
            this.f15936d.invoke();
            kotlinx.coroutines.af afVar = this.f15939g;
            kotlinx.coroutines.aj.z(afVar, null, null, new bc(this, (h.c.e) null, 1, (byte[]) null), 3);
            kotlinx.coroutines.aj.z(afVar, null, null, new bc(this, null, 0), 3);
            kotlinx.coroutines.aj.z(afVar, null, null, new bc(this, (h.c.e) null, 2, (char[]) null), 3);
            kotlinx.coroutines.aj.z(afVar, null, null, new bc(this, (h.c.e) null, 3, (short[]) null), 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x01fa, code lost:
    
        if (r3 != r5) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e9, code lost:
    
        if (r3 == r5) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x017a, code lost:
    
        if (r3 == r5) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // com.waze.av.b.ah
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.waze.av.a.p r24, com.waze.ac.e r25, h.c.e r26) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.av.b.be.f(com.waze.av.a.p, com.waze.ac.e, h.c.e):java.lang.Object");
    }
}
