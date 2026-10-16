package com.waze.ads.a;

import com.waze.ads.d.i;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.libraries.f.a.a.a.e f13936a;

    /* renamed from: b, reason: collision with root package name */
    private final i f13937b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f13938c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f13939d;

    public h(com.google.android.libraries.f.a.a.a.e eVar, i iVar, com.waze.shared_infra.i.e eVar2) {
        x.f(eVar, "client");
        x.f(iVar, "adsStatsSender");
        x.f(eVar2, "logger");
        this.f13936a = eVar;
        this.f13937b = iVar;
        this.f13938c = eVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(h.c.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.waze.ads.a.g
            if (r0 == 0) goto L13
            r0 = r5
            com.waze.ads.a.g r0 = (com.waze.ads.a.g) r0
            int r1 = r0.f13935c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13935c = r1
            goto L18
        L13:
            com.waze.ads.a.g r0 = new com.waze.ads.a.g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f13933a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f13935c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r5)
            com.google.android.libraries.f.a.a.a.e r5 = r4.f13936a
            r0.f13935c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 == r1) goto Lcb
        L3c:
            com.google.android.libraries.f.a.a.a.d r5 = (com.google.android.libraries.f.a.a.a.d) r5
            boolean r0 = r5 instanceof com.google.android.libraries.f.a.a.a.c
            if (r0 == 0) goto L6e
            com.waze.ads.d.i r0 = r4.f13937b
            com.waze.ads.d.g r1 = com.waze.ads.d.g.f14018a
            com.waze.ads.d.h r1 = (com.waze.ads.d.h) r1
            r0.e(r1)
            boolean r0 = r4.f13939d
            if (r0 == 0) goto L67
            com.waze.shared_infra.i.e r4 = r4.f13938c
            r0 = r5
            com.google.android.libraries.f.a.a.a.c r0 = (com.google.android.libraries.f.a.a.a.c) r0
            java.lang.String r0 = r0.a()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Trustless Token: "
            java.lang.String r0 = r1.concat(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r4.e(r0)
        L67:
            com.google.android.libraries.f.a.a.a.c r5 = (com.google.android.libraries.f.a.a.a.c) r5
            java.lang.String r4 = r5.a()
            return r4
        L6e:
            boolean r0 = r5 instanceof com.google.android.libraries.f.a.a.a.b
            if (r0 == 0) goto Lc5
            com.waze.shared_infra.i.e r0 = r4.f13938c
            com.google.android.libraries.f.a.a.a.b r5 = (com.google.android.libraries.f.a.a.a.b) r5
            com.google.android.libraries.f.a.a.a.a r1 = r5.a()
            java.util.Objects.toString(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Failed to fetch trustless token: "
            java.lang.String r1 = r2.concat(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.g(r1)
            com.waze.ads.d.i r4 = r4.f13937b
            com.waze.ads.d.f r0 = new com.waze.ads.d.f
            com.google.android.libraries.f.a.a.a.a r5 = r5.a()
            com.google.android.libraries.f.a.a.a.a r1 = com.google.android.libraries.f.a.a.a.a.f5920a
            int r5 = r5.ordinal()
            if (r5 == 0) goto Lb9
            if (r5 == r3) goto Lb6
            r1 = 2
            if (r5 == r1) goto Lb3
            r1 = 3
            if (r5 == r1) goto Lb0
            r1 = 4
            if (r5 != r1) goto Laa
            com.waze.ads.d.e r5 = com.waze.ads.d.e.f14015f
            goto Lbb
        Laa:
            h.i r4 = new h.i
            r4.<init>()
            throw r4
        Lb0:
            com.waze.ads.d.e r5 = com.waze.ads.d.e.f14014e
            goto Lbb
        Lb3:
            com.waze.ads.d.e r5 = com.waze.ads.d.e.f14013d
            goto Lbb
        Lb6:
            com.waze.ads.d.e r5 = com.waze.ads.d.e.f14012c
            goto Lbb
        Lb9:
            com.waze.ads.d.e r5 = com.waze.ads.d.e.f14011b
        Lbb:
            r0.<init>(r5)
            com.waze.ads.d.h r0 = (com.waze.ads.d.h) r0
            r4.e(r0)
            r4 = 0
            return r4
        Lc5:
            h.i r4 = new h.i
            r4.<init>()
            throw r4
        Lcb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ads.a.h.a(h.c.e):java.lang.Object");
    }

    public final void b(boolean z) {
        this.f13939d = z;
    }

    public final boolean c() {
        return this.f13939d;
    }
}
