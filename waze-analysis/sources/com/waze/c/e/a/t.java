package com.waze.c.e.a;

import androidx.compose.ui.geometry.Rect;
import com.waze.c.d.am;
import com.waze.map.b.aj;
import com.waze.map.b.cj;
import com.waze.map.b.ea;
import com.waze.map.b.ec;
import com.waze.map.b.ed;
import com.waze.modules.c.ar;
import com.waze.navigate.eo;
import h.ab;
import h.g.b.x;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final h.c.j f18470a;

    /* renamed from: b, reason: collision with root package name */
    private final u f18471b;

    /* renamed from: c, reason: collision with root package name */
    private final cj f18472c;

    /* renamed from: d, reason: collision with root package name */
    private final aj f18473d;

    /* renamed from: e, reason: collision with root package name */
    private final eo f18474e;

    /* renamed from: f, reason: collision with root package name */
    private final w f18475f;

    /* renamed from: g, reason: collision with root package name */
    private final am f18476g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f18477h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.maplabelsposition.b f18478i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.c.a.b f18479j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f18480k;

    /* renamed from: l, reason: collision with root package name */
    private final af f18481l;
    private final bn m;
    private final ch n;
    private final ed o;
    private List p;
    private ec q;
    private com.waze.shared_infra.n.c r;

    public t(h.c.j jVar, u uVar, cj cjVar, aj ajVar, eo eoVar, w wVar, am amVar, boolean z, com.waze.maplabelsposition.b bVar, com.waze.c.a.b bVar2, com.waze.shared_infra.i.e eVar) {
        x.f(jVar, "coroutineContext");
        x.f(uVar, "alternativeRouteMapContentTransformer");
        x.f(cjVar, "mapViewControllerFactory");
        x.f(ajVar, "mainMapController");
        x.f(eoVar, "navigationStatusInterface");
        x.f(wVar, "onAltRouteMapRouteClicked");
        x.f(amVar, "alternateRoutesStatsSender");
        x.f(bVar, "mapLabelsPositionsCalculator");
        x.f(bVar2, "config");
        x.f(eVar, "logger");
        this.f18470a = jVar;
        this.f18471b = uVar;
        this.f18472c = cjVar;
        this.f18473d = ajVar;
        this.f18474e = eoVar;
        this.f18475f = wVar;
        this.f18476g = amVar;
        this.f18477h = z;
        this.f18478i = bVar;
        this.f18479j = bVar2;
        this.f18480k = eVar;
        this.f18481l = kotlinx.coroutines.aj.e(jVar);
        bn bnVarB = ck.b(new c(new d(this), 31));
        this.m = bnVarB;
        this.n = ai.U(bnVarB);
        this.o = cjVar.a(eVar, com.waze.map.b.ch.f28144a);
        this.p = h.a.i.h();
        this.q = new ea(false, null, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        if (r7 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object d(com.waze.c.e.a.t r7, h.c.e r8) {
        /*
            boolean r0 = r8 instanceof com.waze.c.e.a.f
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.c.e.a.f r0 = (com.waze.c.e.a.f) r0
            int r1 = r0.f18431c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18431c = r1
            goto L18
        L13:
            com.waze.c.e.a.f r0 = new com.waze.c.e.a.f
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f18429a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f18431c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            e.b.c.b(r8)
            goto La4
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            e.b.c.b(r8)
            goto L81
        L38:
            e.b.c.b(r8)
            com.waze.navigate.eo r8 = r7.f18474e
            kotlinx.coroutines.b.ch r8 = r8.ae()
            java.lang.Object r8 = r8.d()
            com.waze.navigate.ec r8 = (com.waze.navigate.ec) r8
            com.waze.navigate.ec r2 = com.waze.navigate.ec.f31300a
            int r8 = r8.ordinal()
            if (r8 == 0) goto L63
            if (r8 != r5) goto L5d
            com.waze.map.b.aj r7 = r7.f18473d
            com.waze.map.b.p r8 = com.waze.map.b.p.f28363a
            com.waze.ap.b.o r8 = (com.waze.ap.b.o) r8
            com.waze.an.c.q.c(r7, r8)
            h.ab r7 = h.ab.f48028a
            return r7
        L5d:
            h.i r7 = new h.i
            r7.<init>()
            throw r7
        L63:
            r0.f18431c = r5
            com.waze.c.e.a.a r8 = new com.waze.c.e.a.a
            r8.<init>(r7, r3)
            kotlinx.coroutines.b.bn r2 = r7.m
            kotlinx.coroutines.b.k r2 = (kotlinx.coroutines.b.k) r2
            com.waze.c.e.a.s r5 = new com.waze.c.e.a.s
            r6 = 0
            r5.<init>(r8, r6)
            h.g.a.p r5 = (h.g.a.p) r5
            java.lang.Object r8 = kotlinx.coroutines.b.ai.i(r2, r5, r0)
            if (r8 == r1) goto L7e
            h.ab r8 = h.ab.f48028a
        L7e:
            if (r8 != r1) goto L81
            goto La3
        L81:
            r0.f18431c = r4
            kotlinx.coroutines.b.bn r8 = r7.m
            kotlinx.coroutines.b.k r8 = (kotlinx.coroutines.b.k) r8
            com.waze.c.c.a r2 = new com.waze.c.c.a
            r4 = 8
            r2.<init>(r4)
            kotlinx.coroutines.b.k r8 = kotlinx.coroutines.b.ai.z(r8, r2)
            com.waze.c.e.a.o r2 = new com.waze.c.e.a.o
            r2.<init>(r7, r3)
            kotlinx.coroutines.b.l r2 = (kotlinx.coroutines.b.l) r2
            java.lang.Object r7 = r8.collect(r2, r0)
            if (r7 == r1) goto La1
            h.ab r7 = h.ab.f48028a
        La1:
            if (r7 != r1) goto La4
        La3:
            return r1
        La4:
            h.ab r7 = h.ab.f48028a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.c.e.a.t.d(com.waze.c.e.a.t, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0101, code lost:
    
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object e(com.waze.c.e.a.t r7, com.waze.c.e.a.c r8, boolean r9, h.c.e r10) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.c.e.a.t.e(com.waze.c.e.a.t, com.waze.c.e.a.c, boolean, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object f(com.waze.c.e.a.t r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.waze.c.e.a.m
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.c.e.a.m r0 = (com.waze.c.e.a.m) r0
            int r1 = r0.f18448c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18448c = r1
            goto L18
        L13:
            com.waze.c.e.a.m r0 = new com.waze.c.e.a.m
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f18446a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f18448c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            e.b.c.b(r6)
            goto L4d
        L2f:
            e.b.c.b(r6)
            com.waze.map.b.ed r6 = r5.o
            kotlinx.coroutines.b.ch r6 = r6.x()
            kotlinx.coroutines.b.bq r6 = (kotlinx.coroutines.b.bq) r6
            com.waze.c.e.a.n r2 = new com.waze.c.e.a.n
            r4 = 0
            r2.<init>(r5, r4)
            h.g.a.p r2 = (h.g.a.p) r2
            kotlinx.coroutines.b.k r6 = (kotlinx.coroutines.b.k) r6
            r0.f18448c = r3
            java.lang.Object r5 = kotlinx.coroutines.b.ai.e(r6, r2, r0)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "SharedFlow never completes, this call should never return."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.c.e.a.t.f(com.waze.c.e.a.t, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object g(com.waze.c.e.a.t r8, h.c.e r9) {
        /*
            boolean r0 = r9 instanceof com.waze.c.e.a.p
            if (r0 == 0) goto L13
            r0 = r9
            com.waze.c.e.a.p r0 = (com.waze.c.e.a.p) r0
            int r1 = r0.f18455c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18455c = r1
            goto L18
        L13:
            com.waze.c.e.a.p r0 = new com.waze.c.e.a.p
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f18453a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f18455c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            e.b.c.b(r9)
            goto L8c
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            com.waze.shared_infra.n.c r2 = r0.f18456d
            r4 = r2
            com.waze.shared_infra.n.c r4 = (com.waze.shared_infra.n.c) r4
            e.b.c.b(r9)
            goto L73
        L3c:
            e.b.c.b(r9)
            com.waze.shared_infra.i.e r9 = r8.f18480k
            java.lang.String r2 = "Taking control of main canvas"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r9.a(r2)
            kotlinx.coroutines.af r9 = r8.f18481l
            kotlinx.coroutines.s r2 = h.g.b.o.i()
            kotlinx.coroutines.br r2 = (kotlinx.coroutines.br) r2
            com.waze.c.e.a.e r6 = new com.waze.c.e.a.e
            r7 = 6
            r6.<init>(r8, r5, r7, r5)
            h.g.a.p r6 = (h.g.a.p) r6
            kotlinx.coroutines.ag r7 = kotlinx.coroutines.ag.f51342a
            kotlinx.coroutines.am r9 = kotlinx.coroutines.bo.b(r9, r2, r7, r6)
            com.waze.map.b.aj r2 = r8.f18473d
            com.waze.map.b.ed r6 = r8.o
            com.waze.shared_infra.n.c r2 = r2.p(r6)
            r8.r = r2
            r0.f18456d = r2
            r0.f18455c = r4
            java.lang.Object r9 = r9.c(r0)
            if (r9 != r1) goto L73
            goto L8b
        L73:
            kotlinx.coroutines.b.ch r9 = r2.e()
            kotlinx.coroutines.b.k r9 = (kotlinx.coroutines.b.k) r9
            com.waze.c.e.a.q r2 = new com.waze.c.e.a.q
            r4 = 0
            r2.<init>(r5, r4)
            h.g.a.p r2 = (h.g.a.p) r2
            r0.f18456d = r5
            r0.f18455c = r3
            java.lang.Object r9 = kotlinx.coroutines.b.ai.k(r9, r2, r0)
            if (r9 != r1) goto L8c
        L8b:
            return r1
        L8c:
            com.waze.map.b.d r9 = (com.waze.map.b.d) r9
            if (r9 != 0) goto L9c
            com.waze.shared_infra.i.e r8 = r8.f18480k
            java.lang.String r9 = "MainCanvasDelegator did not reach swapping, flow is empty probably"
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r8.b(r9)
            h.ab r8 = h.ab.f48028a
            return r8
        L9c:
            kotlinx.coroutines.b.bn r8 = r8.m
        L9e:
            java.lang.Object r9 = r8.d()
            r0 = r9
            com.waze.c.e.a.c r0 = (com.waze.c.e.a.c) r0
            r5 = 0
            r6 = 62
            r1 = 1
            r2 = 0
            r3 = 0
            r4 = 0
            com.waze.c.e.a.c r0 = com.waze.c.e.a.c.g(r0, r1, r2, r3, r4, r5, r6)
            boolean r9 = r8.f(r9, r0)
            if (r9 == 0) goto L9e
            h.ab r8 = h.ab.f48028a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.c.e.a.t.g(com.waze.c.e.a.t, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        if (r7.c(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object i(com.waze.c.e.a.t r7, h.c.e r8) {
        /*
            boolean r0 = r8 instanceof com.waze.c.e.a.g
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.c.e.a.g r0 = (com.waze.c.e.a.g) r0
            int r1 = r0.f18434c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18434c = r1
            goto L18
        L13:
            com.waze.c.e.a.g r0 = new com.waze.c.e.a.g
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f18432a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f18434c
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L33
            if (r2 != r3) goto L2b
            e.b.c.b(r8)
            goto L7c
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            com.waze.c.e.a.t r7 = r0.f18435d
            r2 = r7
            com.waze.c.e.a.t r2 = (com.waze.c.e.a.t) r2
            e.b.c.b(r8)
            goto L54
        L3c:
            e.b.c.b(r8)
            kotlinx.coroutines.b.bn r8 = r7.m
            kotlinx.coroutines.b.k r8 = (kotlinx.coroutines.b.k) r8
            com.waze.c.e.a.q r2 = new com.waze.c.e.a.q
            r2.<init>(r4, r5, r4)
            h.g.a.p r2 = (h.g.a.p) r2
            r0.f18435d = r7
            r0.f18434c = r5
            java.lang.Object r8 = kotlinx.coroutines.b.ai.i(r8, r2, r0)
            if (r8 == r1) goto L7f
        L54:
            com.waze.shared_infra.i.e r8 = r7.f18480k
            java.lang.String r2 = "Recenter Map"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r8.a(r2)
            com.waze.map.b.ed r8 = r7.o
            com.waze.map.b.ec r7 = r7.q
            com.waze.map.b.cp r2 = new com.waze.map.b.cp
            r2.<init>(r4)
            com.waze.destination_cell.b.e r2 = (com.waze.destination_cell.b.e) r2
            r6 = 4
            com.waze.shared_infra.s.c r7 = com.waze.install.ah.e(r8, r7, r2, r5, r6)
            kotlinx.coroutines.am r7 = r7.a()
            r0.f18435d = r4
            r0.f18434c = r3
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L7c
            goto L7f
        L7c:
            h.ab r7 = h.ab.f48028a
            return r7
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.c.e.a.t.i(com.waze.c.e.a.t, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02d9 A[RETURN] */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r2v12, types: [com.waze.c.e.a.u] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object k(com.waze.c.e.a.t r31, com.waze.c.d.t r32, h.c.e r33) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.c.e.a.t.k(com.waze.c.e.a.t, com.waze.c.d.t, h.c.e):java.lang.Object");
    }

    public static /* synthetic */ ab l(t tVar, ar arVar) {
        x.f(arVar, "route");
        tVar.x(arVar.a(), com.waze.c.d.ai.f18291b);
        return ab.f48028a;
    }

    public static final /* synthetic */ void p(t tVar) {
        tVar.f18476g.a(com.waze.c.d.ai.f18299j, com.waze.c.d.aj.f18307f);
        kotlinx.coroutines.aj.z(tVar.f18481l, null, null, new e(tVar, null, 0), 3);
    }

    static final boolean v(t tVar, Rect rect) {
        x.f(rect, "viewport");
        return (tVar.f18477h && rect.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(long j2, com.waze.c.d.ai aiVar) {
        h.k kVarA = this.f18475f.a(j2);
        if (kVarA != null) {
            this.f18476g.b((com.waze.c.d.m) kVarA.a(), (com.waze.c.d.m) kVarA.b(), this.f18474e.ak().d() != null, aiVar, com.waze.c.d.aj.f18302a, null);
            kotlinx.coroutines.aj.z(this.f18481l, null, null, new e(this, (h.c.e) null, 1, (byte[]) null), 3);
        }
    }

    public final Object h(h.c.e eVar) {
        return i(this, eVar);
    }

    public final Object j(com.waze.c.d.t tVar, h.c.e eVar) {
        return k(this, tVar, eVar);
    }

    public final ch n() {
        return this.n;
    }

    public final void q(Rect rect) {
        x.f(rect, "rect");
        while (true) {
            bn bnVar = this.m;
            Object objD = bnVar.d();
            Rect rect2 = rect;
            if (bnVar.f(objD, c.g((c) objD, false, null, null, false, rect2, 47))) {
                return;
            } else {
                rect = rect2;
            }
        }
    }

    public final void r() {
        this.f18480k.a("Start");
        e eVar = new e(this, (h.c.e) null, 2, (char[]) null);
        af afVar = this.f18481l;
        kotlinx.coroutines.aj.z(afVar, null, null, eVar, 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new e(this, (h.c.e) null, 3, (short[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new e(this, (h.c.e) null, 4, (int[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new e(this, (h.c.e) null, 5, (boolean[]) null), 3);
    }

    public final void s() {
        this.f18480k.a("Stop");
        com.waze.shared_infra.n.c cVar = this.r;
        if (cVar != null) {
            cVar.f();
        }
    }

    public final void t() {
        this.o.z();
    }

    public final void u() {
        this.o.A();
    }
}
