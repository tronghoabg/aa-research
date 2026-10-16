package com.waze.car_lib;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ah extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f18880a;

    /* renamed from: b, reason: collision with root package name */
    int f18881b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ai f18882c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f18883d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ah(ai aiVar, h.c.e eVar) {
        super(2, eVar);
        this.f18882c = aiVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ah ahVar = new ah(this.f18882c, eVar);
        ahVar.f18883d = obj;
        return ahVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ah) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (com.waze.car_lib.ai.e(r4.f18882c, (com.waze.a.af) r2.f48105a, r4) != r0) goto L23;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r4.f18881b
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 == r2) goto Ld
            e.b.c.b(r5)
            goto L62
        Ld:
            java.lang.Object r1 = r4.f18880a
            h.g.b.aq r1 = (h.g.b.aq) r1
            java.lang.Object r2 = r4.f18883d
            h.g.b.aq r2 = (h.g.b.aq) r2
            e.b.c.b(r5)     // Catch: java.lang.Throwable -> L19
            goto L42
        L19:
            r5 = move-exception
            goto L47
        L1b:
            e.b.c.b(r5)
            java.lang.Object r5 = r4.f18883d
            kotlinx.coroutines.af r5 = (kotlinx.coroutines.af) r5
            h.g.b.aq r1 = new h.g.b.aq
            r1.<init>()
            com.waze.h.b.l r5 = com.waze.h.b.l.f24329a
            r1.f48105a = r5
            com.waze.car_lib.ai r5 = r4.f18882c
            com.waze.h.b.r r5 = com.waze.car_lib.ai.a(r5)     // Catch: java.lang.Throwable -> L45
            com.waze.h.c.b r3 = com.waze.car_lib.ai.b()     // Catch: java.lang.Throwable -> L45
            r4.f18883d = r1     // Catch: java.lang.Throwable -> L45
            r4.f18880a = r1     // Catch: java.lang.Throwable -> L45
            r4.f18881b = r2     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r5.a(r3, r4)     // Catch: java.lang.Throwable -> L45
            if (r5 == r0) goto L61
            r2 = r1
        L42:
            r1.f48105a = r5     // Catch: java.lang.Throwable -> L19
            goto L4a
        L45:
            r5 = move-exception
            r2 = r1
        L47:
            e.b.c.a(r5)
        L4a:
            com.waze.car_lib.ai r5 = r4.f18882c
            java.lang.Object r1 = r2.f48105a
            com.waze.a.af r1 = (com.waze.a.af) r1
            r2 = r4
            h.c.e r2 = (h.c.e) r2
            r3 = 0
            r4.f18883d = r3
            r4.f18880a = r3
            r3 = 2
            r4.f18881b = r3
            java.lang.Object r5 = com.waze.car_lib.ai.e(r5, r1, r2)
            if (r5 != r0) goto L62
        L61:
            return r0
        L62:
            com.waze.car_lib.ai r4 = r4.f18882c
            com.waze.h.b.r r4 = com.waze.car_lib.ai.a(r4)
            r4.close()
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.ah.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
