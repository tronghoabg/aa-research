package com.google.firebase.sessions;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class al extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f10808a;

    /* renamed from: b, reason: collision with root package name */
    Object f10809b;

    /* renamed from: c, reason: collision with root package name */
    Object f10810c;

    /* renamed from: d, reason: collision with root package name */
    Object f10811d;

    /* renamed from: e, reason: collision with root package name */
    Object f10812e;

    /* renamed from: f, reason: collision with root package name */
    Object f10813f;

    /* renamed from: g, reason: collision with root package name */
    int f10814g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ an f10815h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ ah f10816i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    al(an anVar, ah ahVar, h.c.e eVar) {
        super(2, eVar);
        this.f10815h = anVar;
        this.f10816i = ahVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new al(this.f10815h, this.f10816i, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((al) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r9.f10814g
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 == r3) goto L34
            if (r1 == r2) goto L30
            java.lang.Object r0 = r9.f10813f
            com.google.firebase.sessions.b.k r0 = (com.google.firebase.sessions.b.k) r0
            java.lang.Object r1 = r9.f10812e
            com.google.firebase.sessions.ah r1 = (com.google.firebase.sessions.ah) r1
            java.lang.Object r2 = r9.f10811d
            com.google.firebase.e r2 = (com.google.firebase.e) r2
            java.lang.Object r3 = r9.f10810c
            com.google.firebase.sessions.aj r3 = (com.google.firebase.sessions.aj) r3
            java.lang.Object r4 = r9.f10809b
            com.google.firebase.sessions.an r4 = (com.google.firebase.sessions.an) r4
            java.lang.Object r9 = r9.f10808a
            com.google.firebase.sessions.s r9 = (com.google.firebase.sessions.s) r9
            e.b.c.b(r10)
            r7 = r3
            r3 = r0
            r0 = r7
            r7 = r2
            r2 = r1
            r1 = r7
        L2d:
            r7 = r4
            goto L96
        L30:
            e.b.c.b(r10)
            goto L63
        L34:
            e.b.c.b(r10)
            goto L48
        L38:
            e.b.c.b(r10)
            com.google.firebase.sessions.an r10 = r9.f10815h
            r1 = r9
            h.c.e r1 = (h.c.e) r1
            r9.f10814g = r3
            java.lang.Object r10 = com.google.firebase.sessions.an.e(r10, r1)
            if (r10 == r0) goto Lab
        L48:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto La8
            com.google.firebase.sessions.an r10 = r9.f10815h
            com.google.firebase.sessions.q r1 = com.google.firebase.sessions.s.f10983a
            com.google.firebase.installations.d r10 = com.google.firebase.sessions.an.c(r10)
            r3 = r9
            h.c.e r3 = (h.c.e) r3
            r9.f10814g = r2
            java.lang.Object r10 = r1.c(r10, r3)
            if (r10 == r0) goto Lab
        L63:
            com.google.firebase.sessions.an r4 = r9.f10815h
            com.google.firebase.sessions.ah r1 = r9.f10816i
            com.google.firebase.sessions.s r10 = (com.google.firebase.sessions.s) r10
            com.google.firebase.sessions.aj r3 = com.google.firebase.sessions.aj.f10806a
            com.google.firebase.e r2 = com.google.firebase.sessions.an.b(r4)
            com.google.firebase.sessions.b.k r5 = com.google.firebase.sessions.an.d(r4)
            com.google.firebase.sessions.a.c r6 = com.google.firebase.sessions.a.c.f10774a
            r7 = r9
            h.c.e r7 = (h.c.e) r7
            r9.f10808a = r10
            r9.f10809b = r4
            r9.f10810c = r3
            r9.f10811d = r2
            r9.f10812e = r1
            r9.f10813f = r5
            r8 = 3
            r9.f10814g = r8
            java.lang.Object r9 = r6.a(r7)
            if (r9 == r0) goto Lab
            r0 = r10
            r10 = r9
            r9 = r0
            r0 = r2
            r2 = r1
            r1 = r0
            r0 = r3
            r3 = r5
            goto L2d
        L96:
            r4 = r10
            java.util.Map r4 = (java.util.Map) r4
            java.lang.String r5 = r9.b()
            java.lang.String r6 = r9.a()
            com.google.firebase.sessions.ai r9 = r0.a(r1, r2, r3, r4, r5, r6)
            com.google.firebase.sessions.an.f(r7, r9)
        La8:
            h.ab r9 = h.ab.f48028a
            return r9
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.al.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
