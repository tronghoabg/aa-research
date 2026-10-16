package com.waze.map.canvas;

import com.waze.map.cj;
import com.waze.map.cv;
import com.waze.map.dn;
import com.waze.map.dq;
import com.waze.map.gb;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bi {

    /* renamed from: a, reason: collision with root package name */
    private final bq f28592a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f28593b;

    /* renamed from: c, reason: collision with root package name */
    private final cj f28594c;

    /* renamed from: d, reason: collision with root package name */
    private final dq f28595d;

    /* renamed from: e, reason: collision with root package name */
    private final MainCanvasSwapperNativeManager f28596e;

    /* renamed from: f, reason: collision with root package name */
    private com.waze.map.ab f28597f;

    /* renamed from: g, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f28598g;

    public bi(bq bqVar, com.waze.shared_infra.i.e eVar, cj cjVar, dq dqVar) {
        h.g.b.x.f(bqVar, "viewDataProvider");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(cjVar, "presenterBuilder");
        h.g.b.x.f(dqVar, "touchNotifier");
        this.f28592a = bqVar;
        this.f28593b = eVar;
        this.f28594c = cjVar;
        this.f28595d = dqVar;
        this.f28596e = MainCanvasSwapperNativeManager.INSTANCE;
        this.f28598g = ck.b(dn.f28759a);
    }

    public final Object a(h.c.e eVar) {
        String strI;
        Object objI;
        com.waze.map.ab abVar = this.f28597f;
        return (abVar == null || (strI = abVar.i()) == null || (objI = kotlinx.coroutines.b.ai.i(this.f28596e.getSwapReadyCanvasIds(), new bc(strI, null), eVar)) != h.c.a.a.f48038a) ? h.ab.f48028a : objI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r8 != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(h.c.e r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.waze.map.canvas.bf
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.map.canvas.bf r0 = (com.waze.map.canvas.bf) r0
            int r1 = r0.f28585c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28585c = r1
            goto L18
        L13:
            com.waze.map.canvas.bf r0 = new com.waze.map.canvas.bf
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f28583a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f28585c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r8)
            goto L66
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            e.b.c.b(r8)
            goto L43
        L36:
            e.b.c.b(r8)
            com.waze.map.canvas.bq r8 = r7.f28592a
            r0.f28585c = r4
            java.lang.Object r8 = r8.b(r0)
            if (r8 == r1) goto L99
        L43:
            com.waze.map.canvas.MainCanvasSwapperNativeManager r2 = r7.f28596e
            android.graphics.Rect r8 = (android.graphics.Rect) r8
            com.waze.map.canvas.bb r2 = (com.waze.map.canvas.bb) r2
            int r4 = r8.width()
            int r8 = r8.height()
            r0.f28585c = r3
            kotlinx.coroutines.CompletableDeferred r3 = kotlinx.coroutines.bo.j()
            com.waze.car_lib.b.n r5 = new com.waze.car_lib.b.n
            r6 = 3
            r5.<init>(r3, r6)
            r2.prepareGenericCanvasForSwapping(r4, r8, r5)
            java.lang.Object r8 = r3.c(r0)
            if (r8 == r1) goto L99
        L66:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L76
            com.waze.shared_infra.i.e r7 = r7.f28593b
            java.lang.String r8 = "failed to create canvas id complete->canvasIdCompletion"
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r7.b(r8)
            h.ab r7 = h.ab.f48028a
            return r7
        L76:
            com.waze.map.ab r0 = new com.waze.map.ab
            r0.<init>(r8)
            r7.f28597f = r0
            kotlinx.coroutines.b.bn r7 = r7.f28598g
        L7f:
            java.lang.Object r8 = r7.d()
            r1 = r8
            com.waze.an.a.a.bd r1 = (com.waze.an.a.a.bd) r1
            com.waze.map.do r1 = new com.waze.map.do
            r2 = r0
            com.waze.ae.e r2 = (com.waze.ae.e) r2
            r1.<init>(r2)
            com.waze.an.a.a.bd r1 = (com.waze.an.a.a.bd) r1
            boolean r8 = r7.f(r8, r1)
            if (r8 == 0) goto L7f
            h.ab r7 = h.ab.f48028a
            return r7
        L99:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.canvas.bi.b(h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(h.c.e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.waze.map.canvas.bg
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.map.canvas.bg r0 = (com.waze.map.canvas.bg) r0
            int r1 = r0.f28588c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28588c = r1
            goto L18
        L13:
            com.waze.map.canvas.bg r0 = new com.waze.map.canvas.bg
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f28586a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f28588c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r7)
            goto L56
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            e.b.c.b(r7)
            com.waze.map.ab r7 = r6.f28597f
            if (r7 == 0) goto L6f
            java.lang.String r7 = r7.i()
            if (r7 != 0) goto L3d
            goto L6f
        L3d:
            com.waze.map.canvas.MainCanvasSwapperNativeManager r2 = r6.f28596e
            com.waze.map.canvas.bb r2 = (com.waze.map.canvas.bb) r2
            r0.f28588c = r3
            kotlinx.coroutines.CompletableDeferred r4 = kotlinx.coroutines.bo.j()
            com.waze.car_lib.b.n r5 = new com.waze.car_lib.b.n
            r5.<init>(r4, r3)
            r2.restoreToMainCanvas(r7, r5)
            java.lang.Object r7 = r4.c(r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            kotlinx.coroutines.b.bn r7 = r6.f28598g
        L58:
            java.lang.Object r0 = r7.d()
            r1 = r0
            com.waze.an.a.a.bd r1 = (com.waze.an.a.a.bd) r1
            com.waze.map.dn r1 = com.waze.map.dn.f28759a
            com.waze.an.a.a.bd r1 = (com.waze.an.a.a.bd) r1
            boolean r0 = r7.f(r0, r1)
            if (r0 == 0) goto L58
            r7 = 0
            r6.f28597f = r7
            h.ab r6 = h.ab.f48028a
            return r6
        L6f:
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.canvas.bi.c(h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(h.c.e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.waze.map.canvas.bh
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.map.canvas.bh r0 = (com.waze.map.canvas.bh) r0
            int r1 = r0.f28591c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28591c = r1
            goto L18
        L13:
            com.waze.map.canvas.bh r0 = new com.waze.map.canvas.bh
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f28589a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f28591c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r7)
            goto L57
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            e.b.c.b(r7)
            com.waze.map.ab r7 = r6.f28597f
            if (r7 == 0) goto L66
            java.lang.String r7 = r7.i()
            if (r7 != 0) goto L3d
            goto L66
        L3d:
            com.waze.map.canvas.MainCanvasSwapperNativeManager r6 = r6.f28596e
            com.waze.map.canvas.bb r6 = (com.waze.map.canvas.bb) r6
            r0.f28591c = r3
            kotlinx.coroutines.CompletableDeferred r2 = kotlinx.coroutines.bo.j()
            com.waze.car_lib.b.n r4 = new com.waze.car_lib.b.n
            r5 = 2
            r4.<init>(r2, r5)
            r6.startSwapping(r7, r4)
            java.lang.Object r7 = r2.c(r0)
            if (r7 != r1) goto L57
            return r1
        L57:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            boolean r6 = h.g.b.x.n(r7, r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L66:
            r6 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.canvas.bi.d(h.c.e):java.lang.Object");
    }

    public final gb e(kotlinx.coroutines.af afVar) {
        h.g.b.x.f(afVar, "scope");
        kotlinx.coroutines.b.bn bnVar = this.f28598g;
        cv cvVar = cv.f28707a;
        kotlinx.coroutines.b.bn bnVar2 = bnVar;
        kotlinx.coroutines.b.k kVarG = kotlinx.coroutines.b.ai.G(false);
        bq bqVar = this.f28592a;
        return this.f28594c.a(cvVar, afVar, bnVar2, kVarG, new bd(bqVar, 0), new be(bqVar), this.f28595d);
    }
}
