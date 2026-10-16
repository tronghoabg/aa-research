package com.waze.c.d;

import com.waze.navigate.cj;
import com.waze.navigate.eo;
import com.waze.navigate.fr;
import com.waze.navigate.gx;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.c.b.a f18358a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.modules.navigation.a f18359b;

    /* renamed from: c, reason: collision with root package name */
    private final fr f18360c;

    /* renamed from: d, reason: collision with root package name */
    private final eo f18361d;

    /* renamed from: e, reason: collision with root package name */
    private final cj f18362e;

    /* renamed from: f, reason: collision with root package name */
    private final af f18363f;

    /* renamed from: g, reason: collision with root package name */
    private final f f18364g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f18365h;

    public h(com.waze.c.b.a aVar, com.waze.modules.navigation.a aVar2, gx gxVar, fr frVar, eo eoVar, cj cjVar, af afVar, az azVar, f fVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(aVar, "alternateRoutesRepository");
        h.g.b.x.f(aVar2, "alternateRoutesNavigationStarter");
        h.g.b.x.f(gxVar, "visualActiveRouteProvider");
        h.g.b.x.f(frVar, "rerouteDetector");
        h.g.b.x.f(eoVar, "navigationStatusInterface");
        h.g.b.x.f(cjVar, "etaStateInterface");
        h.g.b.x.f(afVar, "alternateRoutesCurrentRouteActionHandler");
        h.g.b.x.f(azVar, "currentNavigatingDestinationProvider");
        h.g.b.x.f(fVar, "alternateRoutesRequirementsChecker");
        h.g.b.x.f(eVar, "logger");
        this.f18358a = aVar;
        this.f18359b = aVar2;
        this.f18360c = frVar;
        this.f18361d = eoVar;
        this.f18362e = cjVar;
        this.f18363f = afVar;
        this.f18364g = fVar;
        this.f18365h = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object b(com.waze.c.d.h r12, com.waze.c.d.am r13, h.c.e r14) {
        /*
            boolean r0 = r14 instanceof com.waze.c.d.g
            if (r0 == 0) goto L13
            r0 = r14
            com.waze.c.d.g r0 = (com.waze.c.d.g) r0
            int r1 = r0.f18356d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18356d = r1
            goto L18
        L13:
            com.waze.c.d.g r0 = new com.waze.c.d.g
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f18354b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f18356d
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r12 = r0.f18353a
            r13 = r12
            com.waze.c.d.am r13 = (com.waze.c.d.am) r13
            com.waze.c.d.h r12 = r0.f18357e
            r0 = r12
            com.waze.c.d.h r0 = (com.waze.c.d.h) r0
            e.b.c.b(r14)
            goto L4a
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            e.b.c.b(r14)
            com.waze.c.d.f r14 = r12.f18364g
            r0.f18357e = r12
            r0.f18353a = r13
            r0.f18356d = r3
            java.lang.Object r14 = r14.a(r0)
            if (r14 == r1) goto L8c
        L4a:
            r10 = r13
            com.waze.c.d.d r14 = (com.waze.c.d.d) r14
            boolean r13 = r14 instanceof com.waze.c.d.b
            if (r13 == 0) goto L73
            com.waze.c.d.ae r0 = new com.waze.c.d.ae
            com.waze.c.b.a r1 = r12.f18358a
            com.waze.modules.navigation.a r2 = r12.f18359b
            com.waze.c.d.b r14 = (com.waze.c.d.b) r14
            com.waze.modules.c.ar r3 = r14.b()
            com.waze.sharedui.e.c r4 = r14.c()
            com.waze.modules.navigation.ak r5 = r14.a()
            com.waze.navigate.fr r6 = r12.f18360c
            com.waze.navigate.eo r7 = r12.f18361d
            com.waze.navigate.cj r8 = r12.f18362e
            com.waze.c.d.af r9 = r12.f18363f
            com.waze.shared_infra.i.e r11 = r12.f18365h
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L73:
            boolean r13 = r14 instanceof com.waze.c.d.c
            if (r13 == 0) goto L86
            com.waze.shared_infra.i.e r12 = r12.f18365h
            com.waze.c.d.c r14 = (com.waze.c.d.c) r14
            java.lang.String r13 = r14.a()
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            r12.g(r13)
            r12 = 0
            return r12
        L86:
            h.i r12 = new h.i
            r12.<init>()
            throw r12
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.c.d.h.b(com.waze.c.d.h, com.waze.c.d.am, h.c.e):java.lang.Object");
    }

    public final Object a(am amVar, h.c.e eVar) {
        return b(this, amVar, eVar);
    }
}
