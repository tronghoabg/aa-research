package com.waze.o.b.b.a;

import com.waze.o.c.c.a.n;
import com.waze.search.bd;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i implements n {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32714a;

    /* renamed from: b, reason: collision with root package name */
    private final bd f32715b;

    public i(com.waze.shared_infra.i.e eVar, bd bdVar) {
        x.f(eVar, "logger");
        x.f(bdVar, "searchOperation");
        this.f32714a = eVar;
        this.f32715b = bdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.o.c.c.a.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, h.c.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.waze.o.b.b.a.h
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.o.b.b.a.h r0 = (com.waze.o.b.b.a.h) r0
            int r1 = r0.f32712c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32712c = r1
            goto L18
        L13:
            com.waze.o.b.b.a.h r0 = new com.waze.o.b.b.a.h
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f32710a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f32712c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.String r7 = r0.f32713d
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
            com.waze.shared_infra.i.e r8 = r6.f32714a
            java.lang.String r2 = java.lang.String.valueOf(r7)
            java.lang.String r5 = "resolving address for venueId: "
            java.lang.String r2 = r5.concat(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r8.a(r2)
            com.waze.search.bd r8 = r6.f32715b
            com.waze.av.c.g r2 = new com.waze.av.c.g
            r2.<init>(r7, r3)
            com.waze.ad.c.b r2 = (com.waze.ad.c.b) r2
            r0.f32713d = r7
            r0.f32712c = r4
            java.lang.Object r8 = com.waze.search.bd.h(r8, r2, r0)
            if (r8 == r1) goto Le5
        L5c:
            com.waze.sdk.bq r8 = (com.waze.sdk.bq) r8
            boolean r0 = r8 instanceof com.waze.search.bc
            if (r0 == 0) goto L9c
            com.waze.search.bc r8 = (com.waze.search.bc) r8
            com.waze.av.c.l r8 = r8.e()
            java.util.List r8 = r8.c()
            java.lang.Object r8 = h.a.i.R(r8)
            com.waze.av.d.k r8 = (com.waze.av.d.k) r8
            if (r8 == 0) goto L7c
            com.waze.av.b.n r8 = com.waze.ad.c.b.e(r8)
            com.waze.av.a.p r3 = r8.e()
        L7c:
            if (r3 == 0) goto L86
            com.waze.o.c.c.a.l r6 = new com.waze.o.c.c.a.l
            r6.<init>(r3)
            com.waze.o.c.c.a.m r6 = (com.waze.o.c.c.a.m) r6
            return r6
        L86:
            com.waze.shared_infra.i.e r6 = r6.f32714a
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "no places were found for venueId: "
            java.lang.String r7 = r8.concat(r7)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r6.g(r7)
            com.waze.o.c.c.a.k r6 = com.waze.o.c.c.a.k.f32838a
            com.waze.o.c.c.a.m r6 = (com.waze.o.c.c.a.m) r6
            return r6
        L9c:
            boolean r0 = r8 instanceof com.waze.search.bb
            if (r0 == 0) goto Ldf
            com.waze.shared_infra.i.e r6 = r6.f32714a
            com.waze.search.bb r8 = (com.waze.search.bb) r8
            int r0 = r8.e()
            java.lang.String r1 = r8.f()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "error searching for venueId: "
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r7 = " | code: "
            r2.append(r7)
            r2.append(r0)
            java.lang.String r7 = ", description: "
            r2.append(r7)
            r2.append(r1)
            java.lang.String r7 = r2.toString()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r6.b(r7)
            com.waze.o.c.c.a.j r6 = new com.waze.o.c.c.a.j
            int r7 = r8.e()
            java.lang.String r8 = r8.f()
            r6.<init>(r7, r8)
            com.waze.o.c.c.a.m r6 = (com.waze.o.c.c.a.m) r6
            return r6
        Ldf:
            h.i r6 = new h.i
            r6.<init>()
            throw r6
        Le5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.o.b.b.a.i.a(java.lang.String, h.c.e):java.lang.Object");
    }
}
