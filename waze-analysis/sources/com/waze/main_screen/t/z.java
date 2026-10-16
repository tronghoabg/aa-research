package com.waze.main_screen.t;

import com.waze.map.canvas.bj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class z extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f27639a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bj f27640b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ am f27641c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f27642d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f27643e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.waze.reports_v2.presentation.a.ab f27644f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(bj bjVar, am amVar, boolean z, boolean z2, com.waze.reports_v2.presentation.a.ab abVar, h.c.e eVar) {
        super(2, eVar);
        this.f27640b = bjVar;
        this.f27641c = amVar;
        this.f27642d = z;
        this.f27643e = z2;
        this.f27644f = abVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new z(this.f27640b, this.f27641c, this.f27642d, this.f27643e, this.f27644f, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((z) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r4.b(r3) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r4.a(r3) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        return r0;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r3.f27639a
            r2 = 1
            if (r1 == 0) goto Lb
            e.b.c.b(r4)
            goto L4b
        Lb:
            e.b.c.b(r4)
            com.waze.map.canvas.bj r4 = r3.f27640b
            boolean r4 = com.waze.map.el.d(r4)
            if (r4 == 0) goto L3a
            com.waze.main_screen.t.am r4 = r3.f27641c
            com.waze.reports_v2.presentation.a.az r4 = r4.m()
            boolean r4 = r4.m()
            if (r4 != 0) goto L3a
            boolean r4 = r3.f27642d
            if (r4 == 0) goto L2a
            boolean r4 = r3.f27643e
            if (r4 == 0) goto L3a
        L2a:
            com.waze.reports_v2.presentation.a.ab r4 = r3.f27644f
            if (r4 == 0) goto L4b
            r1 = r3
            h.c.e r1 = (h.c.e) r1
            r3.f27639a = r2
            java.lang.Object r3 = r4.b(r1)
            if (r3 != r0) goto L4b
            goto L4a
        L3a:
            com.waze.reports_v2.presentation.a.ab r4 = r3.f27644f
            if (r4 == 0) goto L4b
            r1 = r3
            h.c.e r1 = (h.c.e) r1
            r2 = 2
            r3.f27639a = r2
            java.lang.Object r3 = r4.a(r1)
            if (r3 != r0) goto L4b
        L4a:
            return r0
        L4b:
            h.ab r3 = h.ab.f48028a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.t.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
