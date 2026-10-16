package com.waze.search.a.c;

import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f35462a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f35463b;

    public e(l lVar, g gVar) {
        this.f35462a = lVar;
        this.f35463b = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r9, h.c.e r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.waze.search.a.c.d
            if (r0 == 0) goto L13
            r0 = r10
            com.waze.search.a.c.d r0 = (com.waze.search.a.c.d) r0
            int r1 = r0.f35460b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35460b = r1
            goto L18
        L13:
            com.waze.search.a.c.d r0 = new com.waze.search.a.c.d
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f35459a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f35460b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r10)
            goto L78
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            e.b.c.b(r10)
            kotlinx.coroutines.b.l r10 = r8.f35462a
            r2 = r0
            h.c.e r2 = (h.c.e) r2
            java.util.List r9 = (java.util.List) r9
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = h.a.i.q(r9, r4)
            r2.<init>(r4)
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r9 = r9.iterator()
        L4c:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L6d
            java.lang.Object r4 = r9.next()
            com.waze.li r4 = (com.waze.li) r4
            com.waze.search.a.c.g r5 = r8.f35463b
            com.waze.search.a.c.a r6 = com.waze.search.a.c.g.a(r5)
            com.waze.search.a.c.c r7 = new com.waze.search.a.c.c
            r7.<init>(r5)
            h.g.a.l r7 = (h.g.a.l) r7
            com.waze.search.d.a.a.a r4 = r6.a(r4, r7)
            r2.add(r4)
            goto L4c
        L6d:
            java.util.List r2 = (java.util.List) r2
            r0.f35460b = r3
            java.lang.Object r8 = r10.emit(r2, r0)
            if (r8 != r1) goto L78
            return r1
        L78:
            h.ab r8 = h.ab.f48028a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.a.c.e.emit(java.lang.Object, h.c.e):java.lang.Object");
    }
}
