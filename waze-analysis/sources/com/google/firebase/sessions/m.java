package com.google.firebase.sessions;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class m extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f10971a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f10972b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h.c.j f10973c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ax f10974d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(n nVar, h.c.j jVar, ax axVar, h.c.e eVar) {
        super(2, eVar);
        this.f10972b = nVar;
        this.f10973c = jVar;
        this.f10974d = axVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new m(this.f10972b, this.f10973c, this.f10974d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((m) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (com.google.firebase.sessions.n.b(r4.f10972b).c(r4) == r0) goto L29;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r4.f10971a
            java.lang.String r2 = "FirebaseSessions"
            r3 = 1
            if (r1 == 0) goto L13
            if (r1 == r3) goto Lf
            e.b.c.b(r5)
            goto L62
        Lf:
            e.b.c.b(r5)
            goto L23
        L13:
            e.b.c.b(r5)
            com.google.firebase.sessions.a.c r5 = com.google.firebase.sessions.a.c.f10774a
            r1 = r4
            h.c.e r1 = (h.c.e) r1
            r4.f10971a = r3
            java.lang.Object r5 = r5.a(r1)
            if (r5 == r0) goto La6
        L23:
            java.util.Map r5 = (java.util.Map) r5
            java.util.Collection r5 = r5.values()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r1 = r5 instanceof java.util.Collection
            if (r1 == 0) goto L39
            r1 = r5
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L39
            goto L98
        L39:
            java.util.Iterator r5 = r5.iterator()
        L3d:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L98
            java.lang.Object r1 = r5.next()
            com.google.firebase.crashlytics.a.c.j r1 = (com.google.firebase.crashlytics.a.c.j) r1
            boolean r1 = r1.d()
            if (r1 == 0) goto L3d
            com.google.firebase.sessions.n r5 = r4.f10972b
            com.google.firebase.sessions.b.k r5 = com.google.firebase.sessions.n.b(r5)
            r1 = r4
            h.c.e r1 = (h.c.e) r1
            r3 = 2
            r4.f10971a = r3
            java.lang.Object r5 = r5.c(r1)
            if (r5 != r0) goto L62
            goto La6
        L62:
            com.google.firebase.sessions.n r5 = r4.f10972b
            com.google.firebase.sessions.b.k r0 = com.google.firebase.sessions.n.b(r5)
            boolean r0 = r0.d()
            if (r0 != 0) goto L7a
            java.lang.String r4 = "Sessions SDK disabled. Not listening to lifecycle events."
            int r4 = android.util.Log.d(r2, r4)
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            goto La3
        L7a:
            h.c.j r0 = r4.f10973c
            com.google.firebase.sessions.av r1 = new com.google.firebase.sessions.av
            r1.<init>(r0)
            com.google.firebase.sessions.ax r4 = r4.f10974d
            r1.f(r4)
            com.google.firebase.sessions.az r4 = com.google.firebase.sessions.az.f10855a
            r4.a(r1)
            com.google.firebase.e r4 = com.google.firebase.sessions.n.a(r5)
            com.google.firebase.sessions.q r5 = new com.google.firebase.sessions.q
            r5.<init>()
            r4.p(r5)
            goto La3
        L98:
            java.lang.String r4 = "No Sessions subscribers. Not listening to lifecycle events."
            int r4 = android.util.Log.d(r2, r4)
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
        La3:
            h.ab r4 = h.ab.f48028a
            return r4
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
