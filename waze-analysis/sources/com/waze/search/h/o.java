package com.waze.search.h;

import com.waze.strings.DisplayStrings;
import java.util.Objects;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;
import l.a.bjz;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.j.b.a f35945a;

    /* renamed from: b, reason: collision with root package name */
    private final a f35946b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.search.stats.s f35947c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.av.b.o f35948d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.j.a.b f35949e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f35950f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f35951g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f35952h = true;

    /* renamed from: i, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f35953i;

    /* renamed from: j, reason: collision with root package name */
    private final ch f35954j;

    /* renamed from: k, reason: collision with root package name */
    private final kotlinx.coroutines.b.bm f35955k;

    /* renamed from: l, reason: collision with root package name */
    private final ay f35956l;
    private final ad m;

    public /* synthetic */ o(com.waze.j.b.a aVar, ay ayVar, a aVar2, com.waze.search.stats.s sVar, com.waze.av.b.o oVar, com.waze.j.a.b bVar, ad adVar, boolean z, com.waze.shared_infra.i.e eVar) {
        this.f35945a = aVar;
        this.f35956l = ayVar;
        this.f35946b = aVar2;
        this.f35947c = sVar;
        this.f35948d = oVar;
        this.f35949e = bVar;
        this.m = adVar;
        this.f35950f = z;
        this.f35951g = eVar;
        kotlinx.coroutines.b.bn bnVarB = ck.b(new com.waze.search.e.ac(null, h.a.i.h()));
        this.f35953i = bnVarB;
        this.f35954j = kotlinx.coroutines.b.ai.U(bnVarB);
        this.f35955k = kotlinx.coroutines.b.bu.c(0, 1, kotlinx.coroutines.a.a.f51272b);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ca A[PHI: r21
  0x01ca: PHI (r21v2 boolean) = (r21v1 boolean), (r21v4 boolean) binds: [B:79:0x01b4, B:83:0x01c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object f(com.waze.search.h.o r24, com.waze.w.i r25, java.lang.String r26, int r27, h.c.e r28) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.h.o.f(com.waze.search.h.o, com.waze.w.i, java.lang.String, int, h.c.e):java.lang.Object");
    }

    public static final /* synthetic */ void k(o oVar, String str, String str2, int i2) {
        y yVar;
        if (h.g.b.x.n(str, "AUTOCOMPLETE_MORE_ITEM_ID")) {
            oVar.f35947c.d(com.waze.search.stats.c.f36013b, (DisplayStrings.DS_SDK_ERROR_MESSAGE_POPUP_MAIN_BUTTON & 2) != 0 ? null : Long.valueOf(i2), (DisplayStrings.DS_SDK_ERROR_MESSAGE_POPUP_MAIN_BUTTON & 4) != 0 ? null : Integer.valueOf(i2), (DisplayStrings.DS_SDK_ERROR_MESSAGE_POPUP_MAIN_BUTTON & 8) != 0 ? null : Long.valueOf(h.n.o.v(str2).toString().length()), (DisplayStrings.DS_SDK_ERROR_MESSAGE_POPUP_MAIN_BUTTON & 16) != 0 ? null : null, null, null, null, null, null, null, bjz.MOBILE_ANDROID);
            yVar = new y(str2);
        } else {
            yVar = null;
        }
        if (yVar != null) {
            oVar.f35956l.a(yVar);
        }
    }

    private final x q(boolean z, com.waze.av.b.n nVar, com.waze.j.n nVar2) {
        if (!z) {
            return new x(nVar, nVar2, this.f35950f);
        }
        t(nVar);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(com.waze.w.i r11, java.lang.String r12, int r13, h.c.e r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.waze.search.h.g
            if (r0 == 0) goto L13
            r0 = r14
            com.waze.search.h.g r0 = (com.waze.search.h.g) r0
            int r1 = r0.f35920e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35920e = r1
            goto L18
        L13:
            com.waze.search.h.g r0 = new com.waze.search.h.g
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f35918c
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f35920e
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            int r13 = r0.f35917b
            java.lang.String r12 = r0.f35921f
            r11 = r12
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r0.f35916a
            com.waze.w.i r11 = (com.waze.w.i) r11
            e.b.c.b(r14)
        L31:
            r2 = r11
            r6 = r12
            r4 = r13
            goto L68
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3d:
            e.b.c.b(r14)
            kotlinx.coroutines.b.bn r14 = r10.f35953i
        L42:
            java.lang.Object r2 = r14.d()
            r4 = r2
            com.waze.search.e.ac r4 = (com.waze.search.e.ac) r4
            com.waze.search.e.ab r5 = com.waze.search.e.ab.f35612a
            com.waze.search.v2.o r5 = (com.waze.search.v2.o) r5
            com.waze.search.e.ac r4 = com.waze.search.e.ac.c(r4, r5)
            boolean r2 = r14.f(r2, r4)
            if (r2 == 0) goto L42
            com.waze.j.b.a r14 = r10.f35945a
            r0.f35916a = r11
            r0.f35921f = r12
            r0.f35917b = r13
            r0.f35920e = r3
            java.lang.Object r14 = r14.a(r11, r12, r0)
            if (r14 != r1) goto L31
            return r1
        L68:
            kotlinx.coroutines.b.bn r5 = r10.f35953i
            r9 = r14
            com.waze.av.b.n r9 = (com.waze.av.b.n) r9
        L6d:
            java.lang.Object r10 = r5.d()
            r11 = r10
            com.waze.search.e.ac r11 = (com.waze.search.e.ac) r11
            r12 = 0
            com.waze.search.e.ac r11 = com.waze.search.e.ac.c(r11, r12)
            boolean r10 = r5.f(r10, r11)
            if (r10 == 0) goto L6d
            boolean r10 = r2 instanceof com.waze.w.h
            if (r10 == 0) goto Lba
            com.waze.w.h r2 = (com.waze.w.h) r2
            boolean r10 = r2.j()
            if (r10 == 0) goto Lba
            if (r9 == 0) goto L9d
            com.waze.av.a.p r10 = r9.e()
            if (r10 == 0) goto L9d
            com.waze.av.a.o r10 = r10.c()
            java.lang.String r10 = r10.c()
            r7 = r10
            goto L9e
        L9d:
            r7 = r12
        L9e:
            if (r9 == 0) goto Lae
            com.waze.av.a.p r10 = r9.e()
            if (r10 == 0) goto Lae
            com.waze.av.a.o r10 = r10.c()
            java.lang.String r12 = r10.b()
        Lae:
            r8 = r12
            java.lang.String r10 = "searchTerm"
            h.g.b.x.f(r6, r10)
            java.lang.String r3 = "ADS_CATEGORY_AUTOCOMPLETE_INFO"
            r5 = 0
            com.waze.ads.c.e.g(r3, r4, r5, r6, r7, r8)
        Lba:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.h.o.r(com.waze.w.i, java.lang.String, int, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(com.waze.w.i r5, java.lang.String r6, int r7, h.c.e r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.waze.search.h.i
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.search.h.i r0 = (com.waze.search.h.i) r0
            int r1 = r0.f35928d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35928d = r1
            goto L18
        L13:
            com.waze.search.h.i r0 = new com.waze.search.h.i
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f35926b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f35928d
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.String r6 = r0.f35929e
            r5 = r6
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r0.f35925a
            com.waze.w.i r5 = (com.waze.w.i) r5
            e.b.c.b(r8)
            goto L47
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            e.b.c.b(r8)
            r0.f35925a = r5
            r0.f35929e = r6
            r0.f35928d = r3
            java.lang.Object r8 = r4.r(r5, r6, r7, r0)
            if (r8 == r1) goto L8d
        L47:
            com.waze.av.b.n r8 = (com.waze.av.b.n) r8
            if (r8 == 0) goto L6a
            com.waze.av.a.p r6 = r8.e()
            com.waze.av.a.o r6 = r6.c()
            java.lang.Boolean r6 = r6.a()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            boolean r6 = h.g.b.x.n(r6, r7)
            com.waze.j.n r5 = r5.a()
            com.waze.search.h.x r4 = r4.q(r6, r8, r5)
            com.waze.search.h.ab r4 = (com.waze.search.h.ab) r4
            return r4
        L6a:
            boolean r7 = r5 instanceof com.waze.w.h
            if (r7 == 0) goto L85
            java.lang.String r6 = "fetchAutocompletePlace() failed, using existing data"
            com.waze.shared_infra.i.h.j(r6)
            com.waze.w.h r5 = (com.waze.w.h) r5
            com.waze.av.b.n r6 = r5.d()
            com.waze.j.n r5 = r5.a()
            r7 = 0
            com.waze.search.h.x r4 = r4.q(r7, r6, r5)
            com.waze.search.h.ab r4 = (com.waze.search.h.ab) r4
            return r4
        L85:
            com.waze.search.h.y r4 = new com.waze.search.h.y
            r4.<init>(r6)
            com.waze.search.h.ab r4 = (com.waze.search.h.ab) r4
            return r4
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.h.o.s(com.waze.w.i, java.lang.String, int, h.c.e):java.lang.Object");
    }

    private final void t(com.waze.av.b.n nVar) {
        if (nVar instanceof com.waze.av.b.l) {
            com.waze.av.b.l lVar = (com.waze.av.b.l) nVar;
            if (lVar.c() == com.waze.av.b.z.f16014b) {
                com.waze.av.a.o oVarC = lVar.e().c();
                String strC = oVarC.c();
                String strB = oVarC.b();
                if (strC != null && strB != null) {
                    com.waze.search.e.g.d(strC, strB);
                }
            }
        }
        this.f35948d.E(nVar, this.f35950f, com.waze.modules.navigation.ah.f30290f);
    }

    public final ch i() {
        return this.f35954j;
    }

    public final void m(com.waze.z.a.d.an anVar) {
        h.g.b.x.f(anVar, "searchFieldState");
        Objects.toString(anVar);
        this.f35951g.a("updating searchFieldState: ".concat(String.valueOf(anVar)));
        this.f35955k.c(anVar);
    }
}
