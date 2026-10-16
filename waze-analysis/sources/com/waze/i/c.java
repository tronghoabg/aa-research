package com.waze.i;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends e.a.e.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e.a.i iVar, e.a.h hVar) {
        super(iVar, hVar);
        h.g.b.x.f(iVar, "channel");
        h.g.b.x.f(hVar, "callOptions");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.waze.i.s r8, e.a.cm r9, h.c.e r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.waze.i.b
            if (r0 == 0) goto L13
            r0 = r10
            com.waze.i.b r0 = (com.waze.i.b) r0
            int r1 = r0.f24427c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24427c = r1
            goto L18
        L13:
            com.waze.i.b r0 = new com.waze.i.b
            r0.<init>(r7, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.f24425a
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r6.f24427c
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            e.b.c.b(r10)
            goto L5a
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L30:
            e.b.c.b(r10)
            e.a.i r1 = r7.getChannel()
            java.lang.String r10 = "getChannel(...)"
            h.g.b.x.e(r1, r10)
            r10 = r2
            e.a.cq r2 = com.waze.i.a.b()
            java.lang.String r3 = "getGetTokenMethod(...)"
            h.g.b.x.e(r2, r3)
            e.a.h r4 = r7.getCallOptions()
            java.lang.String r7 = "getCallOptions(...)"
            h.g.b.x.e(r4, r7)
            r6.f24427c = r10
            r3 = r8
            r5 = r9
            java.lang.Object r10 = e.a.e.f.b(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L5a
            return r0
        L5a:
            java.lang.String r7 = "unaryRpc(...)"
            h.g.b.x.e(r10, r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.i.c.a(com.waze.i.s, e.a.cm, h.c.e):java.lang.Object");
    }

    @Override // e.a.h.e
    public final /* bridge */ /* synthetic */ e.a.h.e build(e.a.i iVar, e.a.h hVar) {
        h.g.b.x.f(iVar, "channel");
        h.g.b.x.f(hVar, "callOptions");
        return new c(iVar, hVar);
    }
}
