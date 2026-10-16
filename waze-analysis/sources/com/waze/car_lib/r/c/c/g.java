package com.waze.car_lib.r.c.c;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class g extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f21161a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f21162b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.main_screen.u.a.d f21163c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(i iVar, com.waze.main_screen.u.a.d dVar, h.c.e eVar) {
        super(2, eVar);
        this.f21162b = iVar;
        this.f21163c = dVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new g(this.f21162b, this.f21163c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((g) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        if (kotlinx.coroutines.aj.r(h.o.c.i(10, h.o.d.f48273d), r6) == r0) goto L20;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r6.f21161a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            if (r1 == r2) goto Le
            e.b.c.b(r7)
            goto L78
        Le:
            e.b.c.b(r7)
            goto L33
        L12:
            e.b.c.b(r7)
            com.waze.car_lib.r.c.c.i r7 = r6.f21162b
            com.waze.bn.b r7 = com.waze.car_lib.r.c.c.i.b(r7)
            kotlinx.coroutines.b.ch r7 = r7.a()
            kotlinx.coroutines.b.k r7 = (kotlinx.coroutines.b.k) r7
            com.waze.car_lib.r.c.c.f r1 = new com.waze.car_lib.r.c.c.f
            r1.<init>(r3)
            h.g.a.p r1 = (h.g.a.p) r1
            r4 = r6
            h.c.e r4 = (h.c.e) r4
            r6.f21161a = r2
            java.lang.Object r7 = kotlinx.coroutines.b.ai.k(r7, r1, r4)
            if (r7 == r0) goto L87
        L33:
            com.waze.resume_drive.a r7 = (com.waze.resume_drive.a) r7
            com.waze.car_lib.r.c.c.i r7 = r6.f21162b
            kotlinx.coroutines.b.bn r1 = com.waze.car_lib.r.c.c.i.e(r7)
            java.lang.Object r1 = r1.d()
            boolean r2 = r1 instanceof com.waze.car_lib.p.bf
            if (r2 == 0) goto L46
            com.waze.car_lib.p.bf r1 = (com.waze.car_lib.p.bf) r1
            goto L47
        L46:
            r1 = r3
        L47:
            if (r1 == 0) goto L61
            com.waze.main_screen.u.a.d r2 = r6.f21163c
            kotlinx.coroutines.b.bn r7 = com.waze.car_lib.r.c.c.i.e(r7)
            com.waze.main_screen.u.a.b r2 = (com.waze.main_screen.u.a.b) r2
            long r4 = r2.a()
            h.o.a r2 = h.o.a.z(r4)
            r4 = 3
            com.waze.car_lib.p.bf r1 = com.waze.car_lib.p.bf.i(r1, r3, r2, r4)
            r7.e(r1)
        L61:
            h.o.c r7 = h.o.a.f48264a
            r7 = 10
            h.o.d r1 = h.o.d.f48273d
            long r1 = h.o.c.i(r7, r1)
            r7 = r6
            h.c.e r7 = (h.c.e) r7
            r3 = 2
            r6.f21161a = r3
            java.lang.Object r7 = kotlinx.coroutines.aj.r(r1, r7)
            if (r7 != r0) goto L78
            goto L87
        L78:
            com.waze.car_lib.r.c.c.i r6 = r6.f21162b
            com.waze.car_lib.r.c.c.i.i(r6)
            com.waze.car_lib.p.aq r7 = com.waze.car_lib.p.aq.f20586a
            com.waze.o.ad r7 = (com.waze.o.ad) r7
            r6.j(r7)
            h.ab r6 = h.ab.f48028a
            return r6
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.c.c.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
