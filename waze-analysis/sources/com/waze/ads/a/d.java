package com.waze.ads.a;

import com.waze.ads.AdsNativeManager;
import com.waze.navigate.dg;
import com.waze.search.bd;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    private final AdsNativeManager f13911a;

    /* renamed from: b, reason: collision with root package name */
    private final dg f13912b;

    /* renamed from: c, reason: collision with root package name */
    private final bd f13913c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f13914d;

    public d(AdsNativeManager adsNativeManager, dg dgVar, bd bdVar, com.waze.shared_infra.i.e eVar) {
        x.f(adsNativeManager, "adsNativeManager");
        x.f(dgVar, "navigationInfo");
        x.f(bdVar, "searchOperation");
        x.f(eVar, "logger");
        this.f13911a = adsNativeManager;
        this.f13912b = dgVar;
        this.f13913c = bdVar;
        this.f13914d = eVar;
    }

    @Override // com.waze.ads.a.a
    public final Object a(String str, h.c.e eVar) {
        return this.f13911a.fetchAdInfo(str, (h.c.e<? super f>) eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.waze.ads.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.waze.ads.a.f r51, h.c.e r52) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ads.a.d.b(com.waze.ads.a.f, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.ads.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.waze.ads.a.f r7, h.c.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.waze.ads.a.c
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.ads.a.c r0 = (com.waze.ads.a.c) r0
            int r1 = r0.f13909c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13909c = r1
            goto L18
        L13:
            com.waze.ads.a.c r0 = new com.waze.ads.a.c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f13907a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f13909c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            com.waze.ads.a.f r7 = r0.f13910d
            r0 = r7
            com.waze.ads.a.f r0 = (com.waze.ads.a.f) r0
            e.b.c.b(r8)
            goto L4f
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            e.b.c.b(r8)
            com.waze.search.bd r8 = r6.f13913c
            com.waze.av.c.g r2 = new com.waze.av.c.g
            java.lang.String r5 = r7.k()
            r2.<init>(r5, r3)
            com.waze.ad.c.b r2 = (com.waze.ad.c.b) r2
            r0.f13910d = r7
            r0.f13909c = r4
            java.lang.Object r8 = com.waze.search.bd.h(r8, r2, r0)
            if (r8 == r1) goto Lc2
        L4f:
            com.waze.sdk.bq r8 = (com.waze.sdk.bq) r8
            boolean r0 = r8 instanceof com.waze.search.bc
            java.lang.String r1 = "fetching data for "
            if (r0 == 0) goto L86
            com.waze.search.bc r8 = (com.waze.search.bc) r8
            com.waze.av.c.l r8 = r8.e()
            java.util.List r8 = r8.c()
            java.lang.Object r8 = h.a.i.R(r8)
            com.waze.av.d.k r8 = (com.waze.av.d.k) r8
            if (r8 == 0) goto Lbb
            com.waze.shared_infra.i.e r6 = r6.f13914d
            java.lang.String r7 = r7.e()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = " successful"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r6.a(r7)
            return r8
        L86:
            boolean r0 = r8 instanceof com.waze.search.bb
            if (r0 == 0) goto Lbc
            com.waze.shared_infra.i.e r6 = r6.f13914d
            java.lang.String r7 = r7.e()
            com.waze.search.bb r8 = (com.waze.search.bb) r8
            int r0 = r8.e()
            java.lang.String r8 = r8.f()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r7)
            java.lang.String r7 = " failed with "
            r2.append(r7)
            r2.append(r0)
            java.lang.String r7 = ":"
            r2.append(r7)
            r2.append(r8)
            java.lang.String r7 = r2.toString()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r6.g(r7)
        Lbb:
            return r3
        Lbc:
            h.i r6 = new h.i
            r6.<init>()
            throw r6
        Lc2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ads.a.d.c(com.waze.ads.a.f, h.c.e):java.lang.Object");
    }
}
