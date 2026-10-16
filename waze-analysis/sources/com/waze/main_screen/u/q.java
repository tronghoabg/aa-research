package com.waze.main_screen.u;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class q extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f27724a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f27725b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f27726c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f27727d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(com.waze.main_screen.u.a.d dVar, w wVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27727d = i2;
        this.f27726c = dVar;
        this.f27725b = wVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f27727d;
        if (i2 == 0) {
            return new q((w) this.f27725b, (com.waze.main_screen.u.a.d) this.f27726c, eVar, 0);
        }
        Object obj2 = this.f27726c;
        if (i2 != 1) {
            return new q((com.waze.main_screen.u.a.d) obj2, (w) this.f27725b, eVar, 2);
        }
        return new q((h) obj2, (com.waze.location.b.c) this.f27725b, eVar, 1);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f27727d;
        return i2 != 0 ? i2 != 1 ? ((q) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((q) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((q) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
    
        if (kotlinx.coroutines.aj.q(h.o.a.m(((com.waze.main_screen.u.a.b) r9.f27726c).a()), r9) == r0) goto L31;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f27727d
            r1 = 1
            if (r0 == 0) goto L71
            if (r0 == r1) goto L39
            h.c.a.a r0 = h.c.a.a.f48038a
            int r2 = r9.f27724a
            if (r2 == 0) goto L11
            e.b.c.b(r10)
            goto L28
        L11:
            e.b.c.b(r10)
            java.lang.Object r10 = r9.f27726c
            com.waze.main_screen.u.a.c r10 = (com.waze.main_screen.u.a.c) r10
            long r2 = r10.a()
            r10 = r9
            h.c.e r10 = (h.c.e) r10
            r9.f27724a = r1
            java.lang.Object r10 = kotlinx.coroutines.aj.r(r2, r10)
            if (r10 != r0) goto L28
            return r0
        L28:
            java.lang.Object r9 = r9.f27725b
            com.waze.main_screen.u.w r9 = (com.waze.main_screen.u.w) r9
            com.waze.main_screen.u.w.t(r9)
            com.waze.ui.u.o r10 = com.waze.ui.u.o.f43464a
            com.waze.ui.u.p r10 = (com.waze.ui.u.p) r10
            r9.b(r10)
            h.ab r9 = h.ab.f48028a
            return r9
        L39:
            h.c.a.a r0 = h.c.a.a.f48038a
            int r2 = r9.f27724a
            if (r2 == 0) goto L43
            e.b.c.b(r10)
            return r10
        L43:
            e.b.c.b(r10)
            java.lang.Object r10 = r9.f27726c
            java.lang.Object r2 = r9.f27725b
            com.waze.main_screen.u.h r10 = (com.waze.main_screen.u.h) r10
            com.waze.bd.a.d r3 = com.waze.main_screen.u.h.b(r10)
            com.waze.location.b.c r2 = (com.waze.location.b.c) r2
            com.waze.sharedui.e.c r10 = r2.c()
            com.waze.shared_infra.h.c r4 = r10.f()
            com.waze.sharedui.e.c r10 = r2.c()
            java.lang.Long r5 = r10.i()
            r8 = r9
            h.c.e r8 = (h.c.e) r8
            r9.f27724a = r1
            r6 = 1
            r7 = 1
            java.lang.Object r9 = r3.a(r4, r5, r6, r7, r8)
            if (r9 != r0) goto L70
            return r0
        L70:
            return r9
        L71:
            h.c.a.a r0 = h.c.a.a.f48038a
            int r2 = r9.f27724a
            if (r2 == 0) goto L81
            if (r2 == r1) goto L7d
            e.b.c.b(r10)
            goto Lc0
        L7d:
            e.b.c.b(r10)
            goto La7
        L81:
            e.b.c.b(r10)
            java.lang.Object r10 = r9.f27725b
            com.waze.main_screen.u.w r10 = (com.waze.main_screen.u.w) r10
            com.waze.bn.b r10 = com.waze.main_screen.u.w.k(r10)
            kotlinx.coroutines.b.ch r10 = r10.a()
            kotlinx.coroutines.b.k r10 = (kotlinx.coroutines.b.k) r10
            com.waze.main_screen.u.p r2 = new com.waze.main_screen.u.p
            r3 = 0
            r4 = 0
            r2.<init>(r3, r4)
            h.g.a.p r2 = (h.g.a.p) r2
            r3 = r9
            h.c.e r3 = (h.c.e) r3
            r9.f27724a = r1
            java.lang.Object r10 = kotlinx.coroutines.b.ai.k(r10, r2, r3)
            if (r10 != r0) goto La7
            goto Lbf
        La7:
            java.lang.Object r10 = r9.f27726c
            com.waze.main_screen.u.a.b r10 = (com.waze.main_screen.u.a.b) r10
            long r1 = r10.a()
            long r1 = h.o.a.m(r1)
            r10 = r9
            h.c.e r10 = (h.c.e) r10
            r3 = 2
            r9.f27724a = r3
            java.lang.Object r10 = kotlinx.coroutines.aj.q(r1, r10)
            if (r10 != r0) goto Lc0
        Lbf:
            return r0
        Lc0:
            java.lang.Object r9 = r9.f27725b
            com.waze.main_screen.u.w r9 = (com.waze.main_screen.u.w) r9
            com.waze.main_screen.u.w.t(r9)
            com.waze.ui.u.m r10 = com.waze.ui.u.m.f43462a
            com.waze.ui.u.p r10 = (com.waze.ui.u.p) r10
            r9.b(r10)
            h.ab r9 = h.ab.f48028a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.u.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(h hVar, com.waze.location.b.c cVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27727d = i2;
        this.f27726c = hVar;
        this.f27725b = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(w wVar, com.waze.main_screen.u.a.d dVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27727d = i2;
        this.f27725b = wVar;
        this.f27726c = dVar;
    }
}
