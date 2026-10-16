package com.waze.reports;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ag extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f33591a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f33592b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ak f33593c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(ak akVar, h.c.e eVar) {
        super(2, eVar);
        this.f33593c = akVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ag agVar = new ag(this.f33593c, eVar);
        agVar.f33592b = obj;
        return agVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ag) create((com.waze.shared_infra.h.c) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if (r13 == r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r12.f33591a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L21
            if (r1 == r3) goto L19
            if (r1 == r2) goto L11
            e.b.c.b(r13)
            goto L9a
        L11:
            java.lang.Object r1 = r12.f33592b
            com.waze.shared_infra.h.c r1 = (com.waze.shared_infra.h.c) r1
            e.b.c.b(r13)
            goto L7a
        L19:
            java.lang.Object r1 = r12.f33592b
            com.waze.shared_infra.h.c r1 = (com.waze.shared_infra.h.c) r1
            e.b.c.b(r13)
            goto L3e
        L21:
            e.b.c.b(r13)
            java.lang.Object r13 = r12.f33592b
            com.waze.shared_infra.h.c r13 = (com.waze.shared_infra.h.c) r13
            if (r13 == 0) goto Lc7
            com.waze.reports.ak r1 = r12.f33593c
            r4 = r12
            h.c.e r4 = (h.c.e) r4
            r12.f33592b = r13
            r12.f33591a = r3
            java.lang.Object r1 = com.waze.reports.ak.f(r1, r13, r4)
            if (r1 != r0) goto L3b
            goto Lc6
        L3b:
            r11 = r1
            r1 = r13
            r13 = r11
        L3e:
            h.k r13 = (h.k) r13
            java.lang.Object r3 = r13.a()
            r6 = r3
            com.waze.av.a.p r6 = (com.waze.av.a.p) r6
            java.lang.Object r13 = r13.b()
            r8 = r13
            com.waze.reports_v2.presentation.p r8 = (com.waze.reports_v2.presentation.p) r8
            com.waze.reports.ak r13 = r12.f33593c
            kotlinx.coroutines.b.bn r3 = com.waze.reports.ak.g(r13)
        L54:
            java.lang.Object r10 = r3.d()
            r4 = r10
            com.waze.reports.ac r4 = (com.waze.reports.ac) r4
            r7 = 0
            r9 = 11
            r5 = 0
            com.waze.reports.ac r4 = com.waze.reports.ac.f(r4, r5, r6, r7, r8, r9)
            boolean r4 = r3.f(r10, r4)
            if (r4 == 0) goto L54
            com.waze.map.a.e r13 = com.waze.reports.ak.b(r13)
            r3 = r12
            h.c.e r3 = (h.c.e) r3
            r12.f33592b = r1
            r12.f33591a = r2
            java.lang.Object r13 = r13.c(r3)
            if (r13 == r0) goto Lc6
        L7a:
            com.waze.reports.ak r13 = r12.f33593c
            com.waze.map.a.e r2 = com.waze.reports.ak.b(r13)
            com.waze.shared_infra.h.c r2 = r2.b()
            boolean r2 = h.g.b.x.n(r1, r2)
            if (r2 == 0) goto Lc7
            r2 = r12
            h.c.e r2 = (h.c.e) r2
            r3 = 0
            r12.f33592b = r3
            r3 = 3
            r12.f33591a = r3
            java.lang.Object r13 = com.waze.reports.ak.e(r13, r1, r2)
            if (r13 != r0) goto L9a
            goto Lc6
        L9a:
            h.k r13 = (h.k) r13
            java.lang.Object r0 = r13.a()
            r3 = r0
            com.waze.av.a.p r3 = (com.waze.av.a.p) r3
            java.lang.Object r13 = r13.b()
            r5 = r13
            com.waze.reports_v2.presentation.p r5 = (com.waze.reports_v2.presentation.p) r5
            com.waze.reports.ak r12 = r12.f33593c
            kotlinx.coroutines.b.bn r12 = com.waze.reports.ak.g(r12)
        Lb0:
            java.lang.Object r13 = r12.d()
            r1 = r13
            com.waze.reports.ac r1 = (com.waze.reports.ac) r1
            r4 = 0
            r6 = 11
            r2 = 0
            com.waze.reports.ac r0 = com.waze.reports.ac.f(r1, r2, r3, r4, r5, r6)
            boolean r13 = r12.f(r13, r0)
            if (r13 == 0) goto Lb0
            goto Lc7
        Lc6:
            return r0
        Lc7:
            h.ab r12 = h.ab.f48028a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports.ag.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
