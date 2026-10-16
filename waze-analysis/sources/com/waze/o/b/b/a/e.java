package com.waze.o.b.b.a;

import com.waze.modules.c.ch;
import com.waze.search.bd;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e implements com.waze.o.c.c.a.e {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32697a;

    /* renamed from: b, reason: collision with root package name */
    private final ch f32698b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.sharedui.e.g f32699c;

    /* renamed from: d, reason: collision with root package name */
    private final bd f32700d;

    public e(com.waze.shared_infra.i.e eVar, ch chVar, com.waze.sharedui.e.g gVar, bd bdVar) {
        x.f(eVar, "logger");
        x.f(chVar, "routeCalculator");
        x.f(gVar, "wazeLocationService");
        x.f(bdVar, "searchOperation");
        this.f32697a = eVar;
        this.f32698b = chVar;
        this.f32699c = gVar;
        this.f32700d = bdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r7, h.c.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.waze.o.b.b.a.c
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.o.b.b.a.c r0 = (com.waze.o.b.b.a.c) r0
            int r1 = r0.f32691c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32691c = r1
            goto L18
        L13:
            com.waze.o.b.b.a.c r0 = new com.waze.o.b.b.a.c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f32689a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f32691c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.String r7 = r0.f32692d
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
            e.b.c.b(r8)
            goto L5c
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            e.b.c.b(r8)
            com.waze.shared_infra.i.e r8 = r6.f32697a
            java.lang.String r2 = java.lang.String.valueOf(r7)
            java.lang.String r5 = "resolving address for venueId: "
            java.lang.String r2 = r5.concat(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r8.a(r2)
            com.waze.search.bd r8 = r6.f32700d
            com.waze.av.c.g r2 = new com.waze.av.c.g
            r2.<init>(r7, r3)
            com.waze.ad.c.b r2 = (com.waze.ad.c.b) r2
            r0.f32692d = r7
            r0.f32691c = r4
            java.lang.Object r8 = com.waze.search.bd.h(r8, r2, r0)
            if (r8 == r1) goto Ld0
        L5c:
            com.waze.sdk.bq r8 = (com.waze.sdk.bq) r8
            boolean r0 = r8 instanceof com.waze.search.bc
            java.lang.String r1 = "failed to resolve venue id ("
            if (r0 == 0) goto L98
            com.waze.search.bc r8 = (com.waze.search.bc) r8
            com.waze.av.c.l r8 = r8.e()
            java.util.List r8 = r8.c()
            java.lang.Object r8 = h.a.i.R(r8)
            com.waze.av.d.k r8 = (com.waze.av.d.k) r8
            if (r8 == 0) goto L7f
            com.waze.av.b.n r6 = com.waze.ad.c.b.e(r8)
            com.waze.av.a.p r6 = r6.e()
            return r6
        L7f:
            com.waze.shared_infra.i.e r6 = r6.f32697a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            r8.append(r7)
            java.lang.String r7 = ") - no places returned"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r6.b(r7)
            goto Lc9
        L98:
            boolean r0 = r8 instanceof com.waze.search.bb
            if (r0 == 0) goto Lca
            com.waze.shared_infra.i.e r6 = r6.f32697a
            com.waze.search.bb r8 = (com.waze.search.bb) r8
            int r0 = r8.e()
            java.lang.String r8 = r8.f()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r7)
            java.lang.String r7 = ") | errorCode="
            r2.append(r7)
            r2.append(r0)
            java.lang.String r7 = ", errorDescription="
            r2.append(r7)
            r2.append(r8)
            java.lang.String r7 = r2.toString()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r6.b(r7)
        Lc9:
            return r3
        Lca:
            h.i r6 = new h.i
            r6.<init>()
            throw r6
        Ld0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.o.b.b.a.e.c(java.lang.String, h.c.e):java.lang.Object");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // com.waze.o.c.c.a.e
    public final java.lang.Object a(java.lang.String r26, h.c.e r27) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.o.b.b.a.e.a(java.lang.String, h.c.e):java.lang.Object");
    }
}
