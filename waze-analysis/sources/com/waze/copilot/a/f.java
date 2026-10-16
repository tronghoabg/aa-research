package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class f extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f22825a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f22826b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f22827c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f22828d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(g gVar, boolean z, h.c.e eVar) {
        super(2, eVar);
        this.f22826b = gVar;
        this.f22827c = z;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        f fVar = new f(this.f22826b, this.f22827c, eVar);
        fVar.f22828d = obj;
        return fVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((f) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
    
        if (r8 != r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00af, code lost:
    
        if (r7 != r0) goto L31;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r7.f22825a
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L1f
            if (r1 == r3) goto L12
            e.b.c.b(r8)
            goto L78
        L12:
            java.lang.Object r1 = r7.f22828d
            kotlinx.coroutines.am r1 = (kotlinx.coroutines.am) r1
            e.b.c.b(r8)
            h.m r8 = (h.m) r8
            r8.b()
            goto L6a
        L1f:
            e.b.c.b(r8)
            h.m r8 = (h.m) r8
            java.lang.Object r7 = r8.b()
            goto Lb1
        L2a:
            e.b.c.b(r8)
            java.lang.Object r8 = r7.f22828d
            kotlinx.coroutines.af r8 = (kotlinx.coroutines.af) r8
            com.waze.copilot.a.g r1 = r7.f22826b
            com.waze.copilot.a.a r6 = com.waze.copilot.a.g.b(r1)
            boolean r6 = r6.a()
            if (r6 == 0) goto L97
            boolean r6 = r7.f22827c
            if (r6 == 0) goto L97
            com.waze.shared_infra.i.e r4 = com.waze.copilot.a.g.d(r1)
            java.lang.String r6 = "refreshing recorded voice selection"
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r4.a(r6)
            com.waze.copilot.a.e r4 = new com.waze.copilot.a.e
            r6 = 0
            r4.<init>(r1, r5, r6)
            h.g.a.p r4 = (h.g.a.p) r4
            kotlinx.coroutines.am r8 = kotlinx.coroutines.aj.y(r8, r5, r5, r4, r2)
            com.waze.copilot.a.be r1 = com.waze.copilot.a.g.c(r1)
            r4 = r7
            h.c.e r4 = (h.c.e) r4
            r7.f22828d = r8
            r7.f22825a = r3
            java.lang.Object r1 = com.waze.copilot.a.be.b(r1, r4)
            if (r1 == r0) goto Lb6
            r1 = r8
        L6a:
            r8 = r7
            h.c.e r8 = (h.c.e) r8
            r7.f22828d = r5
            r7.f22825a = r2
            java.lang.Object r8 = r1.c(r8)
            if (r8 != r0) goto L78
            goto Lb6
        L78:
            r0 = r8
            java.lang.String r0 = (java.lang.String) r0
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L85
            boolean r0 = h.n.o.G(r0)
            if (r0 == 0) goto L86
        L85:
            r8 = r5
        L86:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L8b
            return r5
        L8b:
            com.waze.copilot.a.g r7 = r7.f22826b
            com.waze.sound.b.f r7 = com.waze.copilot.a.g.g(r7)
            r7.a(r8)
            h.ab r7 = h.ab.f48028a
            return r7
        L97:
            com.waze.shared_infra.i.e r8 = com.waze.copilot.a.g.d(r1)
            java.lang.String r2 = "refreshCustomPromptsOnProfileChange is disabled, skipping"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r8.a(r2)
            com.waze.copilot.a.be r8 = com.waze.copilot.a.g.c(r1)
            r1 = r7
            h.c.e r1 = (h.c.e) r1
            r7.f22825a = r4
            java.lang.Object r7 = com.waze.copilot.a.be.b(r8, r1)
            if (r7 == r0) goto Lb6
        Lb1:
            h.m r7 = h.m.d(r7)
            return r7
        Lb6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.a.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
