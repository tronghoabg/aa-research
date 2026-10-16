package com.waze.main_screen.u;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class v extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f27741a;

    /* renamed from: b, reason: collision with root package name */
    int f27742b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ w f27743c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(w wVar, h.c.e eVar) {
        super(2, eVar);
        this.f27743c = wVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new v(this.f27743c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((v) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (com.waze.main_screen.u.w.o(r3, r1, r9, r8) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c6, code lost:
    
        if (com.waze.main_screen.u.w.n(r3, r1, r9.c(), r8) == r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r8.f27742b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 == r3) goto L12
            e.b.c.b(r9)
            goto Lc9
        L12:
            java.lang.Object r1 = r8.f27741a
            com.waze.main_screen.u.a r1 = (com.waze.main_screen.u.a) r1
            e.b.c.b(r9)
            goto L4a
        L1a:
            e.b.c.b(r9)
            goto L32
        L1e:
            e.b.c.b(r9)
            com.waze.main_screen.u.w r9 = r8.f27743c
            com.waze.main_screen.u.c r9 = com.waze.main_screen.u.w.f(r9)
            r1 = r8
            h.c.e r1 = (h.c.e) r1
            r8.f27742b = r4
            java.lang.Object r9 = r9.a(r1)
            if (r9 == r0) goto Lcc
        L32:
            com.waze.main_screen.u.w r1 = r8.f27743c
            com.waze.main_screen.u.a r9 = (com.waze.main_screen.u.a) r9
            com.waze.location.b.d r1 = com.waze.main_screen.u.w.e(r1)
            r5 = r8
            h.c.e r5 = (h.c.e) r5
            r8.f27741a = r9
            r8.f27742b = r3
            java.lang.Object r1 = r1.a(r5)
            if (r1 == r0) goto Lcc
            r7 = r1
            r1 = r9
            r9 = r7
        L4a:
            com.waze.main_screen.u.w r3 = r8.f27743c
            com.waze.location.b.c r9 = (com.waze.location.b.c) r9
            com.waze.main_screen.u.w.s(r3)
            r5 = 0
            if (r1 == 0) goto L59
            com.waze.main_screen.u.b r6 = r1.a()
            goto L5a
        L59:
            r6 = r5
        L5a:
            if (r6 != 0) goto L6b
            com.waze.shared_infra.i.e r8 = com.waze.main_screen.u.w.l(r3)
            java.lang.String r9 = "No prediction data or resume drive provided"
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r8.a(r9)
            r3.close()
            goto Lc9
        L6b:
            int r6 = r6.ordinal()
            if (r6 == 0) goto L95
            if (r6 != r4) goto L8f
            com.waze.shared_infra.i.e r4 = com.waze.main_screen.u.w.l(r3)
            java.lang.String r6 = "Resume drive data received, launching resume drive UI"
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r4.a(r6)
            com.waze.main_screen.u.w.p(r3, r1)
            r4 = r8
            h.c.e r4 = (h.c.e) r4
            r8.f27741a = r5
            r8.f27742b = r2
            java.lang.Object r8 = com.waze.main_screen.u.w.o(r3, r1, r9, r4)
            if (r8 != r0) goto Lc9
            goto Lcc
        L8f:
            h.i r8 = new h.i
            r8.<init>()
            throw r8
        L95:
            if (r9 != 0) goto La8
            com.waze.shared_infra.i.e r8 = com.waze.main_screen.u.w.l(r3)
            java.lang.String r9 = "Prediction data received, but fused location is null"
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r8.g(r9)
            r3.close()
            h.ab r8 = h.ab.f48028a
            return r8
        La8:
            com.waze.shared_infra.i.e r2 = com.waze.main_screen.u.w.l(r3)
            java.lang.String r4 = "Prediction data received, launching prediction UI"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r2.a(r4)
            com.waze.main_screen.u.w.p(r3, r1)
            com.waze.sharedui.e.c r9 = r9.c()
            r2 = r8
            h.c.e r2 = (h.c.e) r2
            r8.f27741a = r5
            r4 = 4
            r8.f27742b = r4
            java.lang.Object r8 = com.waze.main_screen.u.w.n(r3, r1, r9, r2)
            if (r8 != r0) goto Lc9
            goto Lcc
        Lc9:
            h.ab r8 = h.ab.f48028a
            return r8
        Lcc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.u.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
