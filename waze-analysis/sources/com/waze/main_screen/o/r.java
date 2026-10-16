package com.waze.main_screen.o;

import h.g.b.x;
import java.util.HashSet;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class r implements k {

    /* renamed from: a, reason: collision with root package name */
    private final af f26722a;

    /* renamed from: b, reason: collision with root package name */
    private final d f26723b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f26724c;

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f26725d;

    /* renamed from: e, reason: collision with root package name */
    private final HashSet f26726e;

    /* renamed from: f, reason: collision with root package name */
    private final ch f26727f;

    public r(af afVar, d dVar, kotlinx.coroutines.b.k kVar, com.waze.shared_infra.i.e eVar) {
        x.f(afVar, "scope");
        x.f(dVar, "bannersApi");
        x.f(kVar, "refreshFlow");
        x.f(eVar, "logger");
        this.f26722a = afVar;
        this.f26723b = dVar;
        this.f26724c = eVar;
        this.f26725d = new HashSet();
        this.f26726e = new HashSet();
        o oVar = new o(kVar, this);
        int i2 = bz.f51630a;
        this.f26727f = ai.V(oVar, afVar, by.b(), h.a.i.h());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object d(com.waze.main_screen.o.r r4, h.c.e r5) {
        /*
            boolean r0 = r5 instanceof com.waze.main_screen.o.l
            if (r0 == 0) goto L13
            r0 = r5
            com.waze.main_screen.o.l r0 = (com.waze.main_screen.o.l) r0
            int r1 = r0.f26705c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26705c = r1
            goto L18
        L13:
            com.waze.main_screen.o.l r0 = new com.waze.main_screen.o.l
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f26703a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f26705c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            e.b.c.b(r5)
            h.m r5 = (h.m) r5
            java.lang.Object r5 = r5.b()
            goto L43
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            e.b.c.b(r5)
            com.waze.main_screen.o.d r5 = r4.f26723b
            r0.f26705c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            java.lang.Throwable r0 = h.m.c(r5)
            if (r0 == 0) goto L50
            com.waze.shared_infra.i.e r4 = r4.f26724c
            java.lang.String r1 = "failed to load menu banners"
            r4.c(r1, r0)
        L50:
            boolean r4 = r5 instanceof h.l
            java.util.List r0 = h.a.i.h()
            if (r4 != 0) goto L59
            return r5
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.o.r.d(com.waze.main_screen.o.r, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.main_screen.o.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, h.c.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.waze.main_screen.o.p
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.main_screen.o.p r0 = (com.waze.main_screen.o.p) r0
            int r1 = r0.f26716c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26716c = r1
            goto L18
        L13:
            com.waze.main_screen.o.p r0 = new com.waze.main_screen.o.p
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f26714a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f26716c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.String r5 = r0.f26717d
            r0 = r5
            java.lang.String r0 = (java.lang.String) r0
            e.b.c.b(r6)
            goto L4b
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            e.b.c.b(r6)
            java.util.HashSet r6 = r4.f26726e
            boolean r6 = r6.contains(r5)
            if (r6 != 0) goto L52
            com.waze.main_screen.o.d r6 = r4.f26723b
            r0.f26717d = r5
            r0.f26716c = r3
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 == r1) goto L51
        L4b:
            java.util.HashSet r4 = r4.f26726e
            r4.add(r5)
            goto L52
        L51:
            return r1
        L52:
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.o.r.a(java.lang.String, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.main_screen.o.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, h.c.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.waze.main_screen.o.q
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.main_screen.o.q r0 = (com.waze.main_screen.o.q) r0
            int r1 = r0.f26720c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26720c = r1
            goto L18
        L13:
            com.waze.main_screen.o.q r0 = new com.waze.main_screen.o.q
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f26718a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f26720c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.String r5 = r0.f26721d
            r0 = r5
            java.lang.String r0 = (java.lang.String) r0
            e.b.c.b(r6)
            goto L4b
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            e.b.c.b(r6)
            java.util.HashSet r6 = r4.f26725d
            boolean r6 = r6.contains(r5)
            if (r6 != 0) goto L52
            com.waze.main_screen.o.d r6 = r4.f26723b
            r0.f26721d = r5
            r0.f26720c = r3
            java.lang.Object r6 = r6.c(r5, r0)
            if (r6 == r1) goto L51
        L4b:
            java.util.HashSet r4 = r4.f26725d
            r4.add(r5)
            goto L52
        L51:
            return r1
        L52:
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.o.r.b(java.lang.String, h.c.e):java.lang.Object");
    }

    @Override // com.waze.main_screen.o.k
    public final ch c() {
        return this.f26727f;
    }
}
