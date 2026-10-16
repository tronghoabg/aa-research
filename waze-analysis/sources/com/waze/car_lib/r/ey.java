package com.waze.car_lib.r;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.waze.R;
import com.waze.car_lib.f.gu;
import com.waze.car_lib.f.gw;
import com.waze.car_lib.f.gy;
import com.waze.car_lib.f.ha;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ey {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21599a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.car_lib.n.al f21600b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.config.b f21601c;

    /* renamed from: d, reason: collision with root package name */
    private final gw f21602d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.car_lib.q.h f21603e;

    /* renamed from: f, reason: collision with root package name */
    private final String f21604f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.car_lib.p.cs f21605g;

    /* renamed from: h, reason: collision with root package name */
    private final String f21606h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f21607i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f21608j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.car_lib.p.cw f21609k;

    /* renamed from: l, reason: collision with root package name */
    private final MutableLiveData f21610l;

    public ey(com.waze.shared_infra.o.a aVar, com.waze.car_lib.n.al alVar, com.waze.car_lib.n.w wVar, com.waze.config.b bVar, gw gwVar, com.waze.car_lib.q.h hVar) {
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(alVar, "searchController");
        h.g.b.x.f(wVar, "searchQueryFactory");
        h.g.b.x.f(bVar, "nd4cAlgoTransparencyFeatureEnabledConfig");
        h.g.b.x.f(gwVar, "coordinatorController");
        h.g.b.x.f(hVar, "wazeResourceLoader");
        this.f21599a = aVar;
        this.f21600b = alVar;
        this.f21601c = bVar;
        this.f21602d = gwVar;
        this.f21603e = hVar;
        String strC = aVar.c(R.string.AAOS_ND4C_INFO_BUTTON, new Object[0]);
        this.f21604f = strC;
        this.f21605g = new com.waze.car_lib.p.cs(aVar.c(R.string.CATEGORIES, new Object[0]), w(R.drawable.icon_t2_apps_svg), new ej(this, 8, (char[][]) null));
        String strC2 = aVar.c(R.string.NAVLIST_SEARCH_ON_MAP_HINT, new Object[0]);
        this.f21606h = strC2;
        com.waze.car_lib.p.cw cwVar = new com.waze.car_lib.p.cw(strC2, null, strC, false, com.waze.car_lib.p.cu.f20750a);
        this.f21609k = cwVar;
        this.f21610l = new MutableLiveData(cwVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final h.ab f(ey eyVar, com.waze.w.i iVar) {
        com.waze.car_lib.n.al alVar = eyVar.f21600b;
        alVar.b(iVar);
        if (iVar instanceof com.waze.w.f) {
            com.waze.w.f fVar = (com.waze.w.f) iVar;
            if (fVar.b().d().g()) {
                eyVar.l(fVar.g(), null);
            } else {
                eyVar.f21602d.g(new com.waze.av.b.m(fVar.b()), false);
            }
        } else {
            boolean z = false;
            boolean z2 = true;
            if (iVar instanceof com.waze.w.h) {
                MutableLiveData mutableLiveData = eyVar.f21610l;
                com.waze.car_lib.p.cw cwVar = (com.waze.car_lib.p.cw) mutableLiveData.getValue();
                mutableLiveData.setValue(cwVar != null ? com.waze.car_lib.p.cw.f(cwVar, null, false, com.waze.car_lib.p.cu.f20750a, 15) : null);
                eyVar.f21608j = true;
                eyVar.f21602d.g(((com.waze.w.h) iVar).d(), true);
            } else {
                if (!(iVar instanceof com.waze.w.e)) {
                    throw new h.i();
                }
                com.waze.w.e eVar = (com.waze.w.e) iVar;
                String strE = eVar.e();
                String strD = eVar.d();
                if (strD != null) {
                    tVar = new com.waze.car_lib.n.t(strD, z2, com.waze.car_lib.n.s.f20433b);
                } else if (strE != null) {
                    tVar = new com.waze.car_lib.n.t(strE, z, com.waze.car_lib.n.s.f20433b);
                }
                if (tVar != null) {
                    alVar.e((com.waze.car_lib.n.v) tVar, eyVar.f21602d);
                }
            }
        }
        return h.ab.f48028a;
    }

    public static final /* synthetic */ void g(ey eyVar) {
        eyVar.f21600b.g(com.waze.car_lib.n.ae.f20359a);
        eyVar.f21602d.H(gy.f19639a);
    }

    public static final /* synthetic */ void i(ey eyVar) {
        eyVar.f21600b.g(com.waze.car_lib.n.ah.f20362a);
        eyVar.f21602d.H(new ha(gu.f19628b));
    }

    static final h.ab q(ey eyVar, cq cqVar) {
        com.waze.car_lib.n.ag agVar = (com.waze.car_lib.n.ag) cqVar;
        eyVar.f21600b.g(agVar);
        eyVar.f21602d.g(com.waze.bw.c.d.v.v(agVar.a(), null, null, null, null, 15), false);
        return h.ab.f48028a;
    }

    static final h.ab r(ey eyVar, cq cqVar) {
        com.waze.car_lib.n.ai aiVar = (com.waze.car_lib.n.ai) cqVar;
        eyVar.f21600b.g(aiVar);
        eyVar.f21602d.g(com.waze.bw.c.d.v.v(aiVar.a(), null, null, null, null, 15), false);
        return h.ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(com.waze.car_lib.n.ad r13, h.c.e r14) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.ey.s(com.waze.car_lib.n.ad, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(com.waze.w.i r6, h.c.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.waze.car_lib.r.ev
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.car_lib.r.ev r0 = (com.waze.car_lib.r.ev) r0
            int r1 = r0.f21586d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21586d = r1
            goto L18
        L13:
            com.waze.car_lib.r.ev r0 = new com.waze.car_lib.r.ev
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f21584b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f21586d
            r3 = 2131232069(0x7f080545, float:1.8080237E38)
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r5 = r0.f21583a
            com.waze.w.i r5 = (com.waze.w.i) r5
            e.b.c.b(r7)
            r6 = r5
            goto L6b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            e.b.c.b(r7)
            boolean r7 = r6 instanceof com.waze.w.e
            if (r7 == 0) goto L48
            r5 = 2131231838(0x7f08045e, float:1.8079768E38)
            com.waze.car_lib.p.cq r5 = w(r5)
            com.waze.car_lib.r.co r5 = (com.waze.car_lib.r.co) r5
            return r5
        L48:
            boolean r7 = r6 instanceof com.waze.w.f
            if (r7 == 0) goto L53
            com.waze.car_lib.p.cq r5 = w(r3)
            com.waze.car_lib.r.co r5 = (com.waze.car_lib.r.co) r5
            return r5
        L53:
            boolean r7 = r6 instanceof com.waze.w.h
            if (r7 == 0) goto Lc2
            r7 = r6
            com.waze.w.h r7 = (com.waze.w.h) r7
            com.waze.ui.ac.i r7 = r7.e()
            if (r7 == 0) goto L71
            r0.f21583a = r6
            r0.f21586d = r4
            java.lang.Object r7 = r5.u(r7, r0)
            if (r7 != r1) goto L6b
            return r1
        L6b:
            com.waze.car_lib.r.co r7 = (com.waze.car_lib.r.co) r7
            if (r7 != 0) goto L70
            goto L71
        L70:
            return r7
        L71:
            com.waze.w.h r6 = (com.waze.w.h) r6
            com.waze.av.b.n r5 = r6.d()
            boolean r6 = r5 instanceof com.waze.av.b.k
            if (r6 == 0) goto La4
            com.waze.av.b.k r5 = (com.waze.av.b.k) r5
            com.waze.av.b.i r5 = r5.f()
            com.waze.av.b.i r6 = com.waze.av.b.i.f15955a
            int r5 = r5.ordinal()
            if (r5 == 0) goto La0
            if (r5 == r4) goto L9c
            r6 = 2
            if (r5 == r6) goto L98
            r6 = 3
            if (r5 != r6) goto L92
            goto La0
        L92:
            h.i r5 = new h.i
            r5.<init>()
            throw r5
        L98:
            r3 = 2131232081(0x7f080551, float:1.8080261E38)
            goto Lbb
        L9c:
            r3 = 2131232065(0x7f080541, float:1.8080229E38)
            goto Lbb
        La0:
            r3 = 2131231174(0x7f0801c6, float:1.8078422E38)
            goto Lbb
        La4:
            boolean r6 = r5 instanceof com.waze.av.b.l
            if (r6 == 0) goto Lac
            r3 = 2131232064(0x7f080540, float:1.8080227E38)
            goto Lbb
        Lac:
            boolean r6 = r5 instanceof com.waze.av.b.m
            if (r6 != 0) goto Lbb
            boolean r5 = r5 instanceof com.waze.av.b.j
            if (r5 == 0) goto Lb5
            goto Lbb
        Lb5:
            h.i r5 = new h.i
            r5.<init>()
            throw r5
        Lbb:
            com.waze.car_lib.p.cq r5 = w(r3)
            com.waze.car_lib.r.co r5 = (com.waze.car_lib.r.co) r5
            return r5
        Lc2:
            h.i r5 = new h.i
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.ey.t(com.waze.w.i, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(com.waze.ui.ac.i r6, h.c.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.waze.car_lib.r.ew
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.car_lib.r.ew r0 = (com.waze.car_lib.r.ew) r0
            int r1 = r0.f21589c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21589c = r1
            goto L18
        L13:
            com.waze.car_lib.r.ew r0 = new com.waze.car_lib.r.ew
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f21587a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f21589c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            e.b.c.b(r7)
            goto L70
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            e.b.c.b(r7)
            boolean r7 = r6 instanceof com.waze.ui.ac.a
            if (r7 == 0) goto L38
            return r3
        L38:
            boolean r7 = r6 instanceof com.waze.ui.ac.e
            if (r7 == 0) goto L44
            com.waze.car_lib.p.cq r5 = new com.waze.car_lib.p.cq
            r5.<init>(r6)
            com.waze.car_lib.r.co r5 = (com.waze.car_lib.r.co) r5
            return r5
        L44:
            boolean r7 = r6 instanceof com.waze.ui.ac.f
            if (r7 == 0) goto L50
            com.waze.car_lib.p.cq r5 = new com.waze.car_lib.p.cq
            r5.<init>(r6)
            com.waze.car_lib.r.co r5 = (com.waze.car_lib.r.co) r5
            return r5
        L50:
            boolean r7 = r6 instanceof com.waze.ui.ac.g
            if (r7 == 0) goto L5c
            com.waze.car_lib.p.cq r5 = new com.waze.car_lib.p.cq
            r5.<init>(r6)
            com.waze.car_lib.r.co r5 = (com.waze.car_lib.r.co) r5
            return r5
        L5c:
            boolean r7 = r6 instanceof com.waze.ui.ac.h
            if (r7 == 0) goto L7d
            com.waze.car_lib.q.h r5 = r5.f21603e
            com.waze.ui.ac.h r6 = (com.waze.ui.ac.h) r6
            java.lang.String r6 = r6.b()
            r0.f21589c = r4
            java.lang.Object r7 = r5.a(r6, r0)
            if (r7 == r1) goto L7c
        L70:
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            if (r7 == 0) goto L79
            com.waze.car_lib.p.cp r3 = new com.waze.car_lib.p.cp
            r3.<init>(r7)
        L79:
            com.waze.car_lib.r.co r3 = (com.waze.car_lib.r.co) r3
            return r3
        L7c:
            return r1
        L7d:
            h.i r5 = new h.i
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.ey.u(com.waze.ui.ac.i, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        this.f21600b.g(com.waze.car_lib.n.af.f20360a);
        this.f21602d.H(new ha(gu.f19627a));
    }

    private static final com.waze.car_lib.p.cq w(int i2) {
        return new com.waze.car_lib.p.cq(new com.waze.ui.ac.f(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0196 -> B:54:0x0199). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(com.waze.car_lib.r.cr r11, h.c.e r12) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.ey.x(com.waze.car_lib.r.cr, h.c.e):java.lang.Object");
    }

    public final LiveData a(kotlinx.coroutines.af afVar) {
        h.g.b.x.f(afVar, "scope");
        Boolean boolB = this.f21601c.b();
        h.g.b.x.e(boolB, "getValue(...)");
        this.f21607i = boolB.booleanValue();
        kotlinx.coroutines.aj.z(afVar, null, null, new j(this, (h.c.e) null, 13), 3);
        return this.f21610l;
    }

    public final com.waze.car_lib.n.al b() {
        return this.f21600b;
    }

    public final com.waze.car_lib.p.cw c() {
        return this.f21609k;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(h.c.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.waze.car_lib.r.es
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.car_lib.r.es r0 = (com.waze.car_lib.r.es) r0
            int r1 = r0.f21578c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21578c = r1
            goto L18
        L13:
            com.waze.car_lib.r.es r0 = new com.waze.car_lib.r.es
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f21576a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f21578c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            e.b.c.b(r6)
            goto L4a
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            e.b.c.b(r6)
            com.waze.car_lib.n.al r6 = r5.f21600b
            kotlinx.coroutines.b.ch r6 = r6.a()
            kotlinx.coroutines.b.k r6 = (kotlinx.coroutines.b.k) r6
            com.waze.car_lib.r.et r2 = new com.waze.car_lib.r.et
            r2.<init>(r4)
            h.g.a.p r2 = (h.g.a.p) r2
            r0.f21578c = r3
            java.lang.Object r6 = kotlinx.coroutines.b.ai.i(r6, r2, r0)
            if (r6 == r1) goto L7a
        L4a:
            java.lang.String r0 = "null cannot be cast to non-null type com.waze.car_lib.search.TextSearchController.SearchState.EmptyText"
            h.g.b.x.d(r6, r0)
            com.waze.car_lib.n.ak r6 = (com.waze.car_lib.n.ak) r6
            java.util.List r6 = r6.a()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L5b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L72
            java.lang.Object r0 = r6.next()
            com.waze.car_lib.r.cq r0 = (com.waze.car_lib.r.cq) r0
            boolean r1 = r0 instanceof com.waze.car_lib.n.af
            if (r1 == 0) goto L6e
            com.waze.car_lib.n.af r0 = (com.waze.car_lib.n.af) r0
            goto L6f
        L6e:
            r0 = r4
        L6f:
            if (r0 == 0) goto L5b
            r4 = r0
        L72:
            if (r4 == 0) goto L77
            r5.v()
        L77:
            h.ab r5 = h.ab.f48028a
            return r5
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.ey.d(h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(h.c.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.waze.car_lib.r.eu
            if (r0 == 0) goto L13
            r0 = r5
            com.waze.car_lib.r.eu r0 = (com.waze.car_lib.r.eu) r0
            int r1 = r0.f21582c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21582c = r1
            goto L18
        L13:
            com.waze.car_lib.r.eu r0 = new com.waze.car_lib.r.eu
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f21580a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f21582c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r5)
            goto L4b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r5)
            boolean r5 = r4.f21608j
            if (r5 == 0) goto L4e
            com.waze.car_lib.n.al r5 = r4.f21600b
            kotlinx.coroutines.b.ch r5 = r5.a()
            java.lang.Object r5 = r5.d()
            com.waze.car_lib.r.cr r5 = (com.waze.car_lib.r.cr) r5
            r0.f21582c = r3
            java.lang.Object r5 = r4.x(r5, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            r5 = 0
            r4.f21608j = r5
        L4e:
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.ey.e(h.c.e):java.lang.Object");
    }

    public final void j(String str, String str2) {
        h.g.b.x.f(str, "searchText");
        l(str, str2);
    }

    public final void k(String str) {
        h.g.b.x.f(str, "searchText");
        this.f21600b.d(str);
    }

    public final void l(String str, String str2) {
        h.g.b.x.f(str, "searchText");
        if (str2 == null) {
            str2 = com.waze.ad.c.b.u();
        }
        this.f21600b.e(new com.waze.car_lib.n.u(str, str2), this.f21602d);
    }
}
