package com.waze.search.b;

import com.waze.search.bd;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final bd f35532a;

    public c(bd bdVar) {
        x.f(bdVar, "searchOperation");
        this.f35532a = bdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.search.b.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, java.lang.String r6, h.c.e r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.waze.search.b.b
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.search.b.b r0 = (com.waze.search.b.b) r0
            int r1 = r0.f35531c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35531c = r1
            goto L18
        L13:
            com.waze.search.b.b r0 = new com.waze.search.b.b
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f35529a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f35531c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r7)
            goto L43
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r7)
            com.waze.search.bd r4 = r4.f35532a
            com.waze.av.c.g r7 = new com.waze.av.c.g
            r7.<init>(r5, r6)
            com.waze.ad.c.b r7 = (com.waze.ad.c.b) r7
            r0.f35531c = r3
            java.lang.Object r7 = com.waze.search.bd.h(r4, r7, r0)
            if (r7 == r1) goto L62
        L43:
            com.waze.sdk.bq r7 = (com.waze.sdk.bq) r7
            boolean r4 = r7 instanceof com.waze.search.bc
            r5 = 0
            if (r4 == 0) goto L4d
            com.waze.search.bc r7 = (com.waze.search.bc) r7
            goto L4e
        L4d:
            r7 = r5
        L4e:
            if (r7 == 0) goto L61
            com.waze.av.c.l r4 = r7.e()
            java.util.List r4 = r4.c()
            if (r4 == 0) goto L61
            java.lang.Object r4 = h.a.i.R(r4)
            com.waze.av.d.k r4 = (com.waze.av.d.k) r4
            return r4
        L61:
            return r5
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.b.c.a(java.lang.String, java.lang.String, h.c.e):java.lang.Object");
    }
}
