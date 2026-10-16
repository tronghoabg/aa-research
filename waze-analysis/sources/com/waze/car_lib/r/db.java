package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class db extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f21352a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f21353b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.ch f21354c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.a.ad f21355d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ de f21356e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f21357f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    db(boolean z, kotlinx.coroutines.b.ch chVar, kotlinx.coroutines.a.ad adVar, de deVar, h.c.e eVar) {
        super(2, eVar);
        this.f21353b = z;
        this.f21354c = chVar;
        this.f21355d = adVar;
        this.f21356e = deVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        db dbVar = new db(this.f21353b, this.f21354c, this.f21355d, this.f21356e, eVar);
        dbVar.f21357f = obj;
        return dbVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((db) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
    
        if (kotlinx.coroutines.b.ai.d(com.waze.t.b.bz.d(r9.f21354c), r9) == r0) goto L23;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r9.f21352a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L21
            if (r1 == r4) goto L18
            java.lang.Object r4 = r9.f21357f
            if (r1 == r3) goto L12
            kotlinx.coroutines.br r4 = (kotlinx.coroutines.br) r4
            goto L1d
        L12:
            kotlinx.coroutines.br r4 = (kotlinx.coroutines.br) r4
            e.b.c.b(r10)
            goto L7a
        L18:
            java.lang.Object r9 = r9.f21357f
            r4 = r9
            kotlinx.coroutines.br r4 = (kotlinx.coroutines.br) r4
        L1d:
            e.b.c.b(r10)
            goto L8d
        L21:
            e.b.c.b(r10)
            java.lang.Object r10 = r9.f21357f
            kotlinx.coroutines.af r10 = (kotlinx.coroutines.af) r10
            kotlinx.coroutines.b.ch r1 = r9.f21354c
            com.waze.car_lib.r.de r5 = r9.f21356e
            com.waze.car_lib.r.as r6 = new com.waze.car_lib.r.as
            r7 = 5
            r8 = 0
            r6.<init>(r1, r5, r8, r7)
            h.g.a.p r6 = (h.g.a.p) r6
            kotlinx.coroutines.br r10 = kotlinx.coroutines.aj.z(r10, r8, r8, r6, r2)
            boolean r6 = r9.f21353b
            if (r6 == 0) goto L66
            kotlinx.coroutines.b.k r1 = com.waze.t.b.bz.d(r1)
            com.waze.car_lib.r.fe r2 = new com.waze.car_lib.r.fe
            r2.<init>(r1, r5, r4)
            kotlinx.coroutines.b.k r2 = (kotlinx.coroutines.b.k) r2
            kotlinx.coroutines.b.k r1 = kotlinx.coroutines.b.ai.y(r2)
            kotlinx.coroutines.a.ad r2 = r9.f21355d
            com.waze.car_lib.r.am r3 = new com.waze.car_lib.r.am
            r5 = 12
            r3.<init>(r2, r5)
            kotlinx.coroutines.b.l r3 = (kotlinx.coroutines.b.l) r3
            r2 = r9
            h.c.e r2 = (h.c.e) r2
            r9.f21357f = r10
            r9.f21352a = r4
            java.lang.Object r9 = r1.collect(r3, r2)
            if (r9 == r0) goto L93
            r4 = r10
            goto L8d
        L66:
            kotlinx.coroutines.a.ad r1 = r9.f21355d
            com.waze.car_lib.r.cv r4 = com.waze.car_lib.r.de.b(r5)
            r5 = r9
            h.c.e r5 = (h.c.e) r5
            r9.f21357f = r10
            r9.f21352a = r3
            java.lang.Object r1 = r1.g(r4, r5)
            if (r1 == r0) goto L93
            r4 = r10
        L7a:
            kotlinx.coroutines.b.ch r10 = r9.f21354c
            kotlinx.coroutines.b.k r10 = com.waze.t.b.bz.d(r10)
            r1 = r9
            h.c.e r1 = (h.c.e) r1
            r9.f21357f = r4
            r9.f21352a = r2
            java.lang.Object r9 = kotlinx.coroutines.b.ai.d(r10, r1)
            if (r9 == r0) goto L93
        L8d:
            h.g.b.o.o(r4)
            h.ab r9 = h.ab.f48028a
            return r9
        L93:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.db.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
