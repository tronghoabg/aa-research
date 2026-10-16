package com.waze.car_lib.r.d;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class n extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21310a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f21311b;

    n(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        n nVar = new n((h.c.e) obj3);
        nVar.f21310a = (com.waze.c.b.h) obj;
        nVar.f21311b = (Integer) obj2;
        return nVar.invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            e.b.c.b(r10)
            java.lang.Object r10 = r9.f21310a
            com.waze.c.b.h r10 = (com.waze.c.b.h) r10
            java.lang.Object r9 = r9.f21311b
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 == 0) goto L39
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            com.waze.modules.c.as r0 = r10.c()
            com.waze.modules.c.dk r0 = (com.waze.modules.c.dk) r0
            java.util.List r0 = r0.f()
            java.lang.Object r9 = h.a.i.S(r0, r9)
            com.waze.modules.c.ar r9 = (com.waze.modules.c.ar) r9
            if (r9 == 0) goto L31
            long r0 = r9.a()
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r0)
            goto L32
        L31:
            r9 = 0
        L32:
            if (r9 == 0) goto L39
            long r0 = r9.longValue()
            goto L4d
        L39:
            com.waze.modules.c.as r9 = r10.c()
            com.waze.modules.c.dk r9 = (com.waze.modules.c.dk) r9
            java.util.List r9 = r9.f()
            java.lang.Object r9 = h.a.i.P(r9)
            com.waze.modules.c.ar r9 = (com.waze.modules.c.ar) r9
            long r0 = r9.a()
        L4d:
            r7 = r0
            com.waze.car_lib.j.s r2 = new com.waze.car_lib.j.s
            com.waze.modules.c.as r9 = r10.c()
            r3 = r9
            com.waze.modules.c.dk r3 = (com.waze.modules.c.dk) r3
            com.waze.modules.navigation.j r9 = r10.e()
            com.waze.shared_infra.h.c r4 = com.waze.av.d.t.f(r9)
            com.waze.modules.navigation.ak r9 = r10.b()
            com.waze.av.b.n r9 = r9.a()
            com.waze.av.a.p r9 = r9.e()
            com.waze.shared_infra.h.c r5 = r9.d()
            com.waze.shared_infra.h.c r6 = r10.d()
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.d.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
