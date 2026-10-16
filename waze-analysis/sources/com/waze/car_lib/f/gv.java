package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class gv extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f19630a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f19631b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ gw f19632c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.av.b.n f19633d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    gv(boolean z, gw gwVar, com.waze.av.b.n nVar, h.c.e eVar) {
        super(2, eVar);
        this.f19631b = z;
        this.f19632c = gwVar;
        this.f19633d = nVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new gv(this.f19631b, this.f19632c, this.f19633d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((gv) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r7.f19630a
            r2 = 1
            if (r1 == 0) goto Lb
            e.b.c.b(r8)
            goto L32
        Lb:
            e.b.c.b(r8)
            boolean r8 = r7.f19631b
            r1 = 0
            if (r8 == 0) goto L35
            com.waze.car_lib.f.gw r8 = r7.f19632c
            com.waze.car_lib.f.gt r3 = com.waze.car_lib.f.gw.a(r8)
            long r3 = r3.a()
            com.waze.av.b.n r5 = r7.f19633d
            com.waze.car_lib.f.hj r6 = new com.waze.car_lib.f.hj
            r6.<init>(r5, r8, r1, r2)
            h.g.a.p r6 = (h.g.a.p) r6
            r8 = r7
            h.c.e r8 = (h.c.e) r8
            r7.f19630a = r2
            java.lang.Object r8 = kotlinx.coroutines.aj.I(r3, r6, r8)
            if (r8 != r0) goto L32
            return r0
        L32:
            r1 = r8
            com.waze.av.d.k r1 = (com.waze.av.d.k) r1
        L35:
            com.waze.av.b.n r8 = r7.f19633d
            if (r1 == 0) goto L3d
            com.waze.av.b.n r8 = com.waze.ac.e.o(r8, r1)
        L3d:
            com.waze.car_lib.f.gw r0 = r7.f19632c
            com.waze.car_lib.f.hc r3 = new com.waze.car_lib.f.hc
            com.waze.car_lib.j.a r4 = com.waze.car_lib.f.gw.b(r0)
            boolean r4 = r4.a()
            if (r4 != 0) goto L6f
            com.waze.av.b.n r7 = r7.f19633d
            boolean r4 = r7 instanceof com.waze.av.b.j
            if (r4 == 0) goto L52
            goto L6f
        L52:
            boolean r4 = r7 instanceof com.waze.av.b.m
            if (r4 == 0) goto L5f
            if (r1 == 0) goto L6f
            boolean r7 = r1.N()
            if (r7 != r2) goto L6f
            goto L6e
        L5f:
            boolean r2 = r7 instanceof com.waze.av.b.l
            if (r2 != 0) goto L6e
            boolean r7 = r7 instanceof com.waze.av.b.k
            if (r7 == 0) goto L68
            goto L6e
        L68:
            h.i r7 = new h.i
            r7.<init>()
            throw r7
        L6e:
            r2 = 0
        L6f:
            r3.<init>(r8, r1, r2)
            r0.H(r3)
            h.ab r7 = h.ab.f48028a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.f.gv.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
