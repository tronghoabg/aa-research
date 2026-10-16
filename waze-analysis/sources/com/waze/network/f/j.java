package com.waze.network.f;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class j extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f32310a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f32311b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f32312c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(l lVar, h.c.e eVar) {
        super(2, eVar);
        this.f32312c = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        j jVar = new j(this.f32312c, eVar);
        jVar.f32311b = obj;
        return jVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((j) create((com.waze.shared_infra.h.b) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r5.f32318c.b(r4) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (r4.f32312c.f(r4) != r0) goto L21;
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
            int r1 = r4.f32310a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L15
            if (r1 == r3) goto L11
            if (r1 == r2) goto Ld
            goto L11
        Ld:
            e.b.c.b(r5)
            goto L5d
        L11:
            e.b.c.b(r5)
            goto L6c
        L15:
            e.b.c.b(r5)
            java.lang.Object r5 = r4.f32311b
            com.waze.shared_infra.h.b r5 = (com.waze.shared_infra.h.b) r5
            boolean r1 = r5 instanceof com.waze.shared_infra.r.t
            if (r1 == 0) goto L3d
            com.waze.network.f.l r5 = r4.f32312c
            com.waze.shared_infra.i.e r1 = com.waze.network.f.l.d(r5)
            java.lang.String r2 = "user is logged out, clearing token repository"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.a(r2)
            com.waze.network.f.ag r5 = com.waze.network.f.l.a(r5)
            r1 = r4
            h.c.e r1 = (h.c.e) r1
            r4.f32310a = r3
            java.lang.Object r4 = r5.b(r1)
            if (r4 != r0) goto L6c
            goto L6b
        L3d:
            boolean r5 = r5 instanceof com.waze.shared_infra.r.r
            if (r5 == 0) goto L6c
            com.waze.network.f.l r5 = r4.f32312c
            com.waze.shared_infra.i.e r1 = com.waze.network.f.l.d(r5)
            java.lang.String r3 = "user credentials changed, clearing token repository & fetching a new token"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r1.a(r3)
            com.waze.network.f.ag r5 = com.waze.network.f.l.a(r5)
            r1 = r4
            h.c.e r1 = (h.c.e) r1
            r4.f32310a = r2
            java.lang.Object r5 = r5.b(r1)
            if (r5 == r0) goto L6b
        L5d:
            com.waze.network.f.l r5 = r4.f32312c
            r1 = r4
            h.c.e r1 = (h.c.e) r1
            r2 = 3
            r4.f32310a = r2
            java.lang.Object r4 = com.waze.network.f.l.e(r5, r1)
            if (r4 != r0) goto L6c
        L6b:
            return r0
        L6c:
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.network.f.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
