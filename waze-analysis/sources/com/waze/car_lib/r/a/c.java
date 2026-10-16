package com.waze.car_lib.r.a;

import com.waze.c.d.am;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.b.n f20874a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sharedui.utils.f f20875b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.c.d.h f20876c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.c.e.a.b f20877d;

    /* renamed from: e, reason: collision with root package name */
    private final am f20878e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.car_lib.l.d f20879f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.perf.tracer.g f20880g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f20881h;

    public c(com.waze.map.b.n nVar, com.waze.sharedui.utils.f fVar, com.waze.c.d.h hVar, com.waze.c.e.a.b bVar, am amVar, com.waze.car_lib.l.d dVar, com.waze.perf.tracer.g gVar, com.waze.shared_infra.i.e eVar) {
        x.f(nVar, "mainMapController");
        x.f(fVar, "distanceUtils");
        x.f(hVar, "alternateRoutesControllerFactory");
        x.f(bVar, "alternateRoutesMapStateHolderFactory");
        x.f(amVar, "alternateRoutesStatsSender");
        x.f(dVar, "errorController");
        x.f(gVar, "perfTracer");
        x.f(eVar, "logger");
        this.f20874a = nVar;
        this.f20875b = fVar;
        this.f20876c = hVar;
        this.f20877d = bVar;
        this.f20878e = amVar;
        this.f20879f = dVar;
        this.f20880g = gVar;
        this.f20881h = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(h.c.e r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.waze.car_lib.r.a.b
            if (r0 == 0) goto L13
            r0 = r10
            com.waze.car_lib.r.a.b r0 = (com.waze.car_lib.r.a.b) r0
            int r1 = r0.f20873c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20873c = r1
            goto L18
        L13:
            com.waze.car_lib.r.a.b r0 = new com.waze.car_lib.r.a.b
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f20871a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f20873c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r10)
            goto L3e
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            e.b.c.b(r10)
            com.waze.c.d.h r10 = r9.f20876c
            com.waze.c.d.am r2 = r9.f20878e
            r0.f20873c = r3
            java.lang.Object r10 = r10.a(r2, r0)
            if (r10 == r1) goto L62
        L3e:
            r3 = r10
            com.waze.c.d.ae r3 = (com.waze.c.d.ae) r3
            if (r3 != 0) goto L4e
            com.waze.shared_infra.i.e r9 = r9.f20881h
            java.lang.String r10 = "Cannot continue with null AlternateRoutesCore"
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            r9.g(r10)
            r9 = 0
            return r9
        L4e:
            com.waze.map.b.n r1 = r9.f20874a
            com.waze.sharedui.utils.f r2 = r9.f20875b
            com.waze.c.e.a.b r4 = r9.f20877d
            com.waze.c.d.am r5 = r9.f20878e
            com.waze.car_lib.l.d r6 = r9.f20879f
            com.waze.perf.tracer.g r7 = r9.f20880g
            com.waze.shared_infra.i.e r8 = r9.f20881h
            com.waze.car_lib.r.a.p r0 = new com.waze.car_lib.r.a.p
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.a.c.a(h.c.e):java.lang.Object");
    }
}
