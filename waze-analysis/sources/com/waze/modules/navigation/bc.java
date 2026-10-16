package com.waze.modules.navigation;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bc extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f30368a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bk f30369b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ao f30370c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f30371d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bc(bk bkVar, ao aoVar, h.c.e eVar) {
        super(2, eVar);
        this.f30369b = bkVar;
        this.f30370c = aoVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        bc bcVar = new bc(this.f30369b, this.f30370c, eVar);
        bcVar.f30371d = obj;
        return bcVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bc) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r8.f30368a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L18
            java.lang.Object r4 = r8.f30371d
            if (r1 == r3) goto L12
            com.waze.modules.navigation.j r4 = (com.waze.modules.navigation.j) r4
            e.b.c.b(r9)
            goto L5a
        L12:
            kotlinx.coroutines.am r4 = (kotlinx.coroutines.am) r4
            e.b.c.b(r9)
            goto L48
        L18:
            e.b.c.b(r9)
            java.lang.Object r9 = r8.f30371d
            kotlinx.coroutines.af r9 = (kotlinx.coroutines.af) r9
            com.waze.modules.navigation.bk r1 = r8.f30369b
            com.waze.modules.navigation.ao r4 = r8.f30370c
            com.waze.modules.navigation.ba r5 = new com.waze.modules.navigation.ba
            r6 = 0
            r5.<init>(r1, r4, r6, r2)
            h.g.a.p r5 = (h.g.a.p) r5
            r4 = 3
            kotlinx.coroutines.am r5 = kotlinx.coroutines.aj.y(r9, r6, r6, r5, r4)
            com.waze.modules.navigation.bj r7 = new com.waze.modules.navigation.bj
            r7.<init>(r1, r6, r3)
            h.g.a.p r7 = (h.g.a.p) r7
            kotlinx.coroutines.am r4 = kotlinx.coroutines.aj.y(r9, r6, r6, r7, r4)
            r9 = r8
            h.c.e r9 = (h.c.e) r9
            r8.f30371d = r4
            r8.f30368a = r3
            java.lang.Object r9 = r5.c(r9)
            if (r9 == r0) goto L67
        L48:
            com.waze.modules.navigation.j r9 = (com.waze.modules.navigation.j) r9
            r1 = r8
            h.c.e r1 = (h.c.e) r1
            r8.f30371d = r9
            r5 = 2
            r8.f30368a = r5
            java.lang.Object r8 = r4.c(r1)
            if (r8 == r0) goto L67
            r4 = r9
            r9 = r8
        L5a:
            if (r9 == 0) goto L5d
            r2 = r3
        L5d:
            h.k r8 = new h.k
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
            r8.<init>(r4, r9)
            return r8
        L67:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.modules.navigation.bc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
