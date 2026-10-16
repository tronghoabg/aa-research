package com.waze.car_lib.j;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ai extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f20186a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f20187b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ak f20188c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ai(ak akVar, h.c.e eVar) {
        super(2, eVar);
        this.f20188c = akVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ai aiVar = new ai(this.f20188c, eVar);
        aiVar.f20187b = obj;
        return aiVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ai) create((h.k) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        if (r5.f20199f.emit(false, r7) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
    
        if (com.waze.car_lib.j.ak.c(r7.f20188c, com.waze.car_lib.j.aa.f20170d, r7) != r0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r7.f20186a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1a
            if (r1 == r3) goto L15
            if (r1 == r2) goto L10
            goto L1a
        L10:
            e.b.c.b(r8)
            goto Lb4
        L15:
            e.b.c.b(r8)
            goto L8f
        L1a:
            e.b.c.b(r8)
            goto Lc5
        L1f:
            e.b.c.b(r8)
            java.lang.Object r8 = r7.f20187b
            h.k r8 = (h.k) r8
            java.lang.Object r1 = r8.a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r8 = r8.b()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            com.waze.car_lib.j.ak r5 = r7.f20188c
            com.waze.car_lib.j.y r6 = com.waze.car_lib.j.ak.a(r5)
            boolean r6 = r6.c()
            if (r6 != 0) goto L5c
            kotlinx.coroutines.b.bn r8 = com.waze.car_lib.j.ak.d(r5)
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = r7
            h.c.e r2 = (h.c.e) r2
            r7.f20186a = r4
            java.lang.Object r7 = r8.emit(r1, r2)
            if (r7 != r0) goto Lc5
            goto Lc8
        L5c:
            com.waze.car_lib.j.aa r6 = com.waze.car_lib.j.ak.b(r5)
            if (r1 != 0) goto L65
            com.waze.car_lib.j.aa r8 = com.waze.car_lib.j.aa.f20167a
            goto L84
        L65:
            if (r8 == 0) goto L6a
            com.waze.car_lib.j.aa r8 = com.waze.car_lib.j.aa.f20168b
            goto L84
        L6a:
            com.waze.car_lib.j.aa r8 = com.waze.car_lib.j.aa.f20167a
            int r8 = r6.ordinal()
            if (r8 == 0) goto L82
            if (r8 == r4) goto L7f
            if (r8 == r3) goto L7f
            if (r8 != r2) goto L79
            goto L82
        L79:
            h.i r7 = new h.i
            r7.<init>()
            throw r7
        L7f:
            com.waze.car_lib.j.aa r8 = com.waze.car_lib.j.aa.f20169c
            goto L84
        L82:
            com.waze.car_lib.j.aa r8 = com.waze.car_lib.j.aa.f20170d
        L84:
            r1 = r7
            h.c.e r1 = (h.c.e) r1
            r7.f20186a = r3
            java.lang.Object r8 = com.waze.car_lib.j.ak.c(r5, r8, r1)
            if (r8 == r0) goto Lc8
        L8f:
            com.waze.car_lib.j.ak r8 = r7.f20188c
            com.waze.car_lib.j.aa r1 = com.waze.car_lib.j.ak.b(r8)
            com.waze.car_lib.j.aa r3 = com.waze.car_lib.j.aa.f20169c
            if (r1 != r3) goto Lc5
            h.o.c r1 = h.o.a.f48264a
            com.waze.car_lib.j.y r8 = com.waze.car_lib.j.ak.a(r8)
            int r8 = r8.b()
            h.o.d r1 = h.o.d.f48273d
            long r3 = h.o.c.i(r8, r1)
            r8 = r7
            h.c.e r8 = (h.c.e) r8
            r7.f20186a = r2
            java.lang.Object r8 = kotlinx.coroutines.aj.r(r3, r8)
            if (r8 == r0) goto Lc8
        Lb4:
            com.waze.car_lib.j.ak r8 = r7.f20188c
            com.waze.car_lib.j.aa r1 = com.waze.car_lib.j.aa.f20170d
            r2 = r7
            h.c.e r2 = (h.c.e) r2
            r3 = 4
            r7.f20186a = r3
            java.lang.Object r7 = com.waze.car_lib.j.ak.c(r8, r1, r2)
            if (r7 != r0) goto Lc5
            goto Lc8
        Lc5:
            h.ab r7 = h.ab.f48028a
            return r7
        Lc8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.j.ai.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
