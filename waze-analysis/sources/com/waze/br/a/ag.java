package com.waze.br.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ag implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.l f17270a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aj f17271b;

    public ag(kotlinx.coroutines.b.l lVar, aj ajVar) {
        this.f17270a = lVar;
        this.f17271b = ajVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, h.c.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.waze.br.a.af
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.br.a.af r0 = (com.waze.br.a.af) r0
            int r1 = r0.f17268b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17268b = r1
            goto L18
        L13:
            com.waze.br.a.af r0 = new com.waze.br.a.af
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f17267a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f17268b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r8)
            goto L8e
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            e.b.c.b(r8)
            kotlinx.coroutines.b.l r8 = r6.f17270a
            r2 = r0
            h.c.e r2 = (h.c.e) r2
            com.waze.bs.af r7 = (com.waze.bs.af) r7
            boolean r2 = r7.hasChatId()
            if (r2 == 0) goto L76
            java.lang.String r2 = r7.getChatId()
            h.g.b.x.c(r2)
            com.waze.br.a.aj r6 = r6.f17271b
            com.waze.bs.ab r7 = r7.getResponse()
            java.lang.String r4 = "getResponse(...)"
            h.g.b.x.e(r7, r4)
            com.waze.t.a.u r7 = com.waze.br.a.aj.c(r6, r7)
            if (r7 != 0) goto L5a
            com.waze.br.a.y r6 = com.waze.br.a.y.f17313a
            goto L85
        L5a:
            com.waze.shared_infra.i.e r6 = com.waze.br.a.aj.d(r6)
            java.util.Objects.toString(r7)
            java.lang.String r4 = r7.toString()
            java.lang.String r5 = "response: "
            java.lang.String r4 = r5.concat(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r6.e(r4)
            com.waze.br.a.z r6 = new com.waze.br.a.z
            r6.<init>(r2, r7)
            goto L85
        L76:
            com.waze.br.a.aj r6 = r6.f17271b
            com.waze.shared_infra.i.e r6 = com.waze.br.a.aj.d(r6)
            java.lang.String r7 = "start chat returned no chat id"
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r6.g(r7)
            com.waze.br.a.y r6 = com.waze.br.a.y.f17313a
        L85:
            r0.f17268b = r3
            java.lang.Object r6 = r8.emit(r6, r0)
            if (r6 != r1) goto L8e
            return r1
        L8e:
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.br.a.ag.emit(java.lang.Object, h.c.e):java.lang.Object");
    }
}
