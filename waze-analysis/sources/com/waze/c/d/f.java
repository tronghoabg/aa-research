package com.waze.c.d;

import com.waze.navigate.gx;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final gx f18350a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sharedui.e.g f18351b;

    /* renamed from: c, reason: collision with root package name */
    private final az f18352c;

    public f(gx gxVar, com.waze.sharedui.e.g gVar, az azVar) {
        h.g.b.x.f(gxVar, "visualActiveRouteProvider");
        h.g.b.x.f(gVar, "wazeLocationService");
        h.g.b.x.f(azVar, "currentNavigatingDestinationProvider");
        this.f18350a = gxVar;
        this.f18351b = gVar;
        this.f18352c = azVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(h.c.e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.waze.c.d.e
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.c.d.e r0 = (com.waze.c.d.e) r0
            int r1 = r0.f18348c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18348c = r1
            goto L18
        L13:
            com.waze.c.d.e r0 = new com.waze.c.d.e
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f18346a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f18348c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.waze.sharedui.e.c r0 = r0.f18349d
            r1 = r0
            com.waze.sharedui.e.c r1 = (com.waze.sharedui.e.c) r1
            e.b.c.b(r7)
            goto L4c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            e.b.c.b(r7)
            com.waze.sharedui.e.g r7 = r6.f18351b
            com.waze.c.d.az r2 = r6.f18352c
            com.waze.sharedui.e.c r7 = r7.a()
            r0.f18349d = r7
            r0.f18348c = r3
            java.lang.Object r0 = r2.a(r0)
            if (r0 == r1) goto Ld1
            r5 = r0
            r0 = r7
            r7 = r5
        L4c:
            com.waze.navigate.gx r6 = r6.f18350a
            com.waze.modules.navigation.ak r7 = (com.waze.modules.navigation.ak) r7
            kotlinx.coroutines.b.ch r6 = r6.Z()
            java.lang.Object r6 = r6.d()
            com.waze.modules.c.eb r6 = (com.waze.modules.c.eb) r6
            boolean r1 = r6 instanceof com.waze.modules.c.dv
            r2 = 0
            if (r1 == 0) goto L62
            com.waze.modules.c.dv r6 = (com.waze.modules.c.dv) r6
            goto L63
        L62:
            r6 = r2
        L63:
            if (r6 == 0) goto L6a
            com.waze.modules.c.ar r6 = r6.a()
            goto L6b
        L6a:
            r6 = r2
        L6b:
            if (r6 == 0) goto L85
            if (r7 == 0) goto L85
            if (r0 == 0) goto L85
            com.waze.shared_infra.h.c r1 = r0.f()
            if (r1 == 0) goto L85
            boolean r1 = r1.g()
            if (r1 != 0) goto L85
            com.waze.c.d.b r1 = new com.waze.c.d.b
            r1.<init>(r6, r7, r0)
            com.waze.c.d.d r1 = (com.waze.c.d.d) r1
            return r1
        L85:
            r1 = 0
            if (r6 == 0) goto L8a
            r6 = r3
            goto L8b
        L8a:
            r6 = r1
        L8b:
            if (r7 == 0) goto L8f
            r7 = r3
            goto L90
        L8f:
            r7 = r1
        L90:
            if (r0 == 0) goto L93
            goto L94
        L93:
            r3 = r1
        L94:
            com.waze.c.d.c r1 = new com.waze.c.d.c
            if (r0 == 0) goto La6
            com.waze.shared_infra.h.c r0 = r0.f()
            if (r0 == 0) goto La6
            boolean r0 = r0.g()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        La6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Cannot create AlternateRoutesController while one of: local active route, current destination, last known location is nulllocalActiveRoute:"
            r0.<init>(r4)
            r0.append(r6)
            java.lang.String r6 = ", currentDestination:"
            r0.append(r6)
            r0.append(r7)
            java.lang.String r6 = ", lastKnownLocation:"
            r0.append(r6)
            r0.append(r3)
            java.lang.String r6 = ", valid lastKnownLocation: "
            r0.append(r6)
            r0.append(r2)
            java.lang.String r6 = r0.toString()
            r1.<init>(r6)
            com.waze.c.d.d r1 = (com.waze.c.d.d) r1
        Ld1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.c.d.f.a(h.c.e):java.lang.Object");
    }
}
