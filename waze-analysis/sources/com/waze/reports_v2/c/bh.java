package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bh extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f34237a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ad f34238b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f34239c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ bj f34240d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bh(ad adVar, String str, bj bjVar, h.c.e eVar) {
        super(2, eVar);
        this.f34238b = adVar;
        this.f34239c = str;
        this.f34240d = bjVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new bh(this.f34238b, this.f34239c, this.f34240d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bh) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r7 != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r7 == r0) goto L22;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r6.f34237a
            r2 = 1
            if (r1 == 0) goto L11
            if (r1 == r2) goto Ld
            e.b.c.b(r7)
            goto L67
        Ld:
            e.b.c.b(r7)
            goto L41
        L11:
            e.b.c.b(r7)
            com.waze.reports_v2.c.ad r7 = r6.f34238b
            boolean r1 = r7.f()
            java.lang.String r3 = r6.f34239c
            java.lang.String r4 = ""
            if (r1 == 0) goto L44
            com.waze.reports_v2.c.bj r1 = r6.f34240d
            com.waze.reports_v2.c.bs r5 = com.waze.reports_v2.c.bj.b(r1)
            java.lang.String r5 = r5.c()
            if (r5 != 0) goto L2d
            goto L2e
        L2d:
            r4 = r5
        L2e:
            com.waze.reports_v2.c.bs r1 = com.waze.reports_v2.c.bj.b(r1)
            com.waze.reports_v2.b.ac r1 = r1.b()
            r5 = r6
            h.c.e r5 = (h.c.e) r5
            r6.f34237a = r2
            java.lang.Object r7 = r7.c(r3, r4, r1, r5)
            if (r7 == r0) goto L66
        L41:
            com.waze.reports_v2.c.y r7 = (com.waze.reports_v2.c.y) r7
            goto L69
        L44:
            com.waze.reports_v2.c.bj r1 = r6.f34240d
            com.waze.reports_v2.c.bs r2 = com.waze.reports_v2.c.bj.b(r1)
            java.lang.String r2 = r2.c()
            if (r2 != 0) goto L51
            goto L52
        L51:
            r4 = r2
        L52:
            com.waze.reports_v2.c.bs r1 = com.waze.reports_v2.c.bj.b(r1)
            com.waze.reports_v2.b.ac r1 = r1.b()
            r2 = r6
            h.c.e r2 = (h.c.e) r2
            r5 = 2
            r6.f34237a = r5
            java.lang.Object r7 = r7.b(r3, r4, r1, r2)
            if (r7 != r0) goto L67
        L66:
            return r0
        L67:
            com.waze.reports_v2.c.y r7 = (com.waze.reports_v2.c.y) r7
        L69:
            boolean r0 = r7 instanceof com.waze.reports_v2.c.t
            if (r0 == 0) goto L75
            com.waze.reports_v2.c.bj r6 = r6.f34240d
            com.waze.reports_v2.c.t r7 = (com.waze.reports_v2.c.t) r7
            com.waze.reports_v2.c.bj.f(r6, r7)
            goto La8
        L75:
            boolean r0 = r7 instanceof com.waze.reports_v2.c.w
            if (r0 == 0) goto L89
            com.waze.reports_v2.c.bj r6 = r6.f34240d
            com.waze.reports_v2.c.w r7 = (com.waze.reports_v2.c.w) r7
            com.waze.reports_v2.c.ar r0 = r7.a()
            java.lang.String r7 = r7.b()
            com.waze.reports_v2.c.bj.h(r6, r0, r7)
            goto La8
        L89:
            boolean r0 = r7 instanceof com.waze.reports_v2.c.x
            if (r0 == 0) goto L99
            com.waze.reports_v2.c.bj r6 = r6.f34240d
            com.waze.reports_v2.c.x r7 = (com.waze.reports_v2.c.x) r7
            java.lang.String r7 = r7.a()
            com.waze.reports_v2.c.bj.i(r6, r7)
            goto La8
        L99:
            boolean r0 = r7 instanceof com.waze.reports_v2.c.v
            if (r0 == 0) goto Lab
            com.waze.reports_v2.c.bj r6 = r6.f34240d
            com.waze.reports_v2.c.v r7 = (com.waze.reports_v2.c.v) r7
            com.waze.reports_v2.c.u r7 = r7.a()
            com.waze.reports_v2.c.bj.g(r6, r7)
        La8:
            h.ab r6 = h.ab.f48028a
            return r6
        Lab:
            h.i r6 = new h.i
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports_v2.c.bh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
