package com.waze.reports_v2.presentation;

import com.waze.reports_v2.c.dj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cl extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f34957a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cz f34958b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dj f34959c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f34960d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cl(cz czVar, dj djVar, boolean z, h.c.e eVar) {
        super(2, eVar);
        this.f34958b = czVar;
        this.f34959c = djVar;
        this.f34960d = z;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new cl(this.f34958b, this.f34959c, this.f34960d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((cl) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c6, code lost:
    
        if (com.waze.reports_v2.presentation.cz.k(r1, com.waze.reports_v2.presentation.cc.f34943a, r7) == r0) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r7.f34957a
            r2 = 1
            if (r1 == 0) goto L12
            if (r1 == r2) goto Le
            e.b.c.b(r8)
            goto Lc9
        Le:
            e.b.c.b(r8)
            goto L26
        L12:
            e.b.c.b(r8)
            com.waze.reports_v2.presentation.cz r8 = r7.f34958b
            com.waze.reports_v2.c.n r8 = com.waze.reports_v2.presentation.cz.f(r8)
            r1 = r7
            h.c.e r1 = (h.c.e) r1
            r7.f34957a = r2
            java.lang.Object r8 = r8.c(r1)
            if (r8 == r0) goto Lcc
        L26:
            com.waze.reports_v2.presentation.cz r1 = r7.f34958b
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r8 = r8.iterator()
        L35:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L4f
            java.lang.Object r4 = r8.next()
            com.waze.bm.a.a.ad r4 = (com.waze.bm.a.a.ad) r4
            com.waze.reports_v2.presentation.bb r5 = com.waze.reports_v2.presentation.cz.h(r1)
            com.waze.ui.w.b.av r4 = r5.f(r4)
            if (r4 == 0) goto L35
            r3.add(r4)
            goto L35
        L4f:
            java.util.List r3 = (java.util.List) r3
            r8 = r3
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            r4 = 0
            if (r2 != r8) goto L5c
            r3 = r4
        L5c:
            r8 = 2
            if (r3 == 0) goto Lb9
            com.waze.reports_v2.c.dj r0 = r7.f34959c
            boolean r7 = r7.f34960d
            if (r0 == 0) goto Laf
            com.waze.ui.w.b.b r5 = com.waze.ui.w.b.b.f43626a
            com.waze.ui.w.b.bd r5 = com.waze.ui.w.b.bd.f43641a
            com.waze.reports_v2.b.s r5 = com.waze.reports_v2.b.s.f34126a
            int r0 = r0.ordinal()
            if (r0 == r2) goto L7e
            if (r0 == r8) goto L7b
            r8 = 3
            if (r0 == r8) goto L78
            r8 = r4
            goto L80
        L78:
            com.waze.ui.w.b.bh r8 = com.waze.ui.w.b.bh.f43663d
            goto L80
        L7b:
            com.waze.ui.w.b.bh r8 = com.waze.ui.w.b.bh.f43661b
            goto L80
        L7e:
            com.waze.ui.w.b.bh r8 = com.waze.ui.w.b.bh.f43660a
        L80:
            r0 = r3
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L87:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto La7
            java.lang.Object r2 = r0.next()
            r5 = r2
            com.waze.ui.w.b.av r5 = (com.waze.ui.w.b.av) r5
            boolean r6 = r5 instanceof com.waze.ui.w.b.as
            if (r6 == 0) goto L9b
            com.waze.ui.w.b.as r5 = (com.waze.ui.w.b.as) r5
            goto L9c
        L9b:
            r5 = r4
        L9c:
            if (r5 == 0) goto La3
            com.waze.ui.w.b.bh r5 = r5.d()
            goto La4
        La3:
            r5 = r4
        La4:
            if (r5 != r8) goto L87
            goto La8
        La7:
            r2 = r4
        La8:
            boolean r8 = r2 instanceof com.waze.ui.w.b.as
            if (r8 == 0) goto Laf
            r4 = r2
            com.waze.ui.w.b.as r4 = (com.waze.ui.w.b.as) r4
        Laf:
            if (r4 == 0) goto Lb5
            com.waze.reports_v2.presentation.cz.q(r1, r4)
            goto Lc9
        Lb5:
            com.waze.reports_v2.presentation.cz.r(r1, r3, r7)
            goto Lc9
        Lb9:
            com.waze.reports_v2.presentation.cc r2 = com.waze.reports_v2.presentation.cc.f34943a
            com.waze.reports_v2.presentation.cg r2 = (com.waze.reports_v2.presentation.cg) r2
            r3 = r7
            h.c.e r3 = (h.c.e) r3
            r7.f34957a = r8
            java.lang.Object r7 = com.waze.reports_v2.presentation.cz.k(r1, r2, r3)
            if (r7 != r0) goto Lc9
            goto Lcc
        Lc9:
            h.ab r7 = h.ab.f48028a
            return r7
        Lcc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports_v2.presentation.cl.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
