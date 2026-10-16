package com.waze.reports;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ak extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.a.e f33607a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.map.ai f33608b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.ah.b f33609c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.af.e f33610d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f33611e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f33612f;

    /* renamed from: g, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f33613g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f33614h;

    public ak(com.waze.map.a.e eVar, com.waze.map.ai aiVar, com.waze.ah.b bVar, com.waze.af.e eVar2, com.waze.shared_infra.i.e eVar3) {
        h.g.b.x.f(eVar, "mapStateHolder");
        h.g.b.x.f(aiVar, "mapLineResolver");
        h.g.b.x.f(bVar, "reverseGeocodingService");
        h.g.b.x.f(eVar2, "formatterService");
        h.g.b.x.f(eVar3, "logger");
        this.f33607a = eVar;
        this.f33608b = aiVar;
        this.f33609c = bVar;
        this.f33610d = eVar2;
        this.f33611e = eVar3;
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(new ac(eVar.a(), null, null, false, com.waze.places.d.f33105a));
        this.f33612f = bnVarB;
        this.f33613g = kotlinx.coroutines.b.ai.U(bnVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object f(com.waze.reports.ak r4, com.waze.shared_infra.h.c r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.waze.reports.ae
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.reports.ae r0 = (com.waze.reports.ae) r0
            int r1 = r0.f33588c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33588c = r1
            goto L18
        L13:
            com.waze.reports.ae r0 = new com.waze.reports.ae
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f33586a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f33588c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r6)
            com.waze.ah.a r6 = com.waze.ah.a.f14058a
            r0.f33588c = r3
            java.lang.Object r6 = r4.j(r5, r6, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            h.k r6 = (h.k) r6
            java.lang.Object r4 = r6.a()
            com.waze.av.a.p r4 = (com.waze.av.a.p) r4
            java.lang.Object r5 = r6.b()
            com.waze.reports_v2.presentation.p r5 = (com.waze.reports_v2.presentation.p) r5
            boolean r6 = r5 instanceof com.waze.places.b
            h.k r0 = new h.k
            if (r6 == 0) goto L55
            com.waze.places.d r5 = com.waze.places.d.f33105a
            com.waze.reports_v2.presentation.p r5 = (com.waze.reports_v2.presentation.p) r5
        L55:
            r0.<init>(r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports.ak.f(com.waze.reports.ak, com.waze.shared_infra.h.c, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(com.waze.shared_infra.h.c r6, com.waze.ah.a r7, h.c.e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.waze.reports.ad
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.reports.ad r0 = (com.waze.reports.ad) r0
            int r1 = r0.f33584c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33584c = r1
            goto L18
        L13:
            com.waze.reports.ad r0 = new com.waze.reports.ad
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f33582a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f33584c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            com.waze.av.a.p r5 = r0.f33585d
            r6 = r5
            com.waze.av.a.p r6 = (com.waze.av.a.p) r6
            e.b.c.b(r8)
            goto L6b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            e.b.c.b(r8)
            goto L4c
        L3b:
            e.b.c.b(r8)
            com.waze.ah.b r8 = r5.f33609c
            kotlinx.coroutines.am r6 = r8.a(r6, r7)
            r0.f33584c = r4
            java.lang.Object r8 = r6.c(r0)
            if (r8 == r1) goto La5
        L4c:
            r6 = r8
            com.waze.av.a.p r6 = (com.waze.av.a.p) r6
            if (r6 != 0) goto L5a
            h.k r5 = new h.k
            r6 = 0
            com.waze.places.b r7 = com.waze.places.b.f33103a
            r5.<init>(r6, r7)
            return r5
        L5a:
            com.waze.af.e r5 = r5.f33610d
            kotlinx.coroutines.am r5 = r5.b(r6)
            r0.f33585d = r6
            r0.f33584c = r3
            java.lang.Object r8 = r5.c(r0)
            if (r8 == r1) goto La5
            r5 = r6
        L6b:
            com.waze.af.d r8 = (com.waze.af.d) r8
            boolean r6 = r8 instanceof com.waze.af.b
            if (r6 == 0) goto L7d
            com.waze.places.c r6 = new com.waze.places.c
            com.waze.af.b r8 = (com.waze.af.b) r8
            java.lang.String r7 = r8.f14048a
            r6.<init>(r7)
            com.waze.reports_v2.presentation.p r6 = (com.waze.reports_v2.presentation.p) r6
            goto L99
        L7d:
            boolean r6 = r8 instanceof com.waze.af.c
            if (r6 == 0) goto L8d
            com.waze.places.e r6 = new com.waze.places.e
            com.waze.af.c r8 = (com.waze.af.c) r8
            java.lang.String r7 = r8.f14049a
            r6.<init>(r7)
            com.waze.reports_v2.presentation.p r6 = (com.waze.reports_v2.presentation.p) r6
            goto L99
        L8d:
            com.waze.af.a r6 = com.waze.af.a.f14047a
            boolean r6 = h.g.b.x.n(r8, r6)
            if (r6 == 0) goto L9f
            com.waze.places.b r6 = com.waze.places.b.f33103a
            com.waze.reports_v2.presentation.p r6 = (com.waze.reports_v2.presentation.p) r6
        L99:
            h.k r7 = new h.k
            r7.<init>(r5, r6)
            return r7
        L9f:
            h.i r5 = new h.i
            r5.<init>()
            throw r5
        La5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports.ak.j(com.waze.shared_infra.h.c, com.waze.ah.a, h.c.e):java.lang.Object");
    }

    public final kotlinx.coroutines.b.ch h() {
        return this.f33613g;
    }

    public final void i(com.waze.shared_infra.h.c cVar, boolean z) {
        Object objD;
        Object objD2;
        h.g.b.x.f(cVar, "initialCoordinate");
        if (this.f33614h) {
            return;
        }
        this.f33614h = true;
        com.waze.map.a.e eVar = this.f33607a;
        int i2 = com.waze.map.a.e.f27920a;
        eVar.e(cVar, 0.0f);
        addCloseable((AutoCloseable) eVar);
        kotlinx.coroutines.b.bn bnVar = this.f33612f;
        if (z) {
            do {
                objD2 = bnVar.d();
            } while (!bnVar.f(objD2, ac.f((ac) objD2, ab.f33572b, null, false, null, 29)));
            kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), null, null, new aj(this, null), 3);
        } else {
            do {
                objD = bnVar.d();
            } while (!bnVar.f(objD, ac.f((ac) objD, ab.f33571a, null, false, null, 29)));
            kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), null, null, new ah(this, cVar, (h.c.e) null, 0), 3);
        }
    }
}
