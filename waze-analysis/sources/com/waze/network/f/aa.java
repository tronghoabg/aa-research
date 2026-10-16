package com.waze.network.f;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class aa extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f32266a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f32267b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ab f32268c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(ab abVar, h.c.e eVar) {
        super(2, eVar);
        this.f32268c = abVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        aa aaVar = new aa(this.f32268c, eVar);
        aaVar.f32267b = ((Boolean) obj).booleanValue();
        return aaVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((aa) create(bool, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r3.f32268c.f32269a.c(r3) != r0) goto L15;
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
            int r1 = r3.f32266a
            r2 = 1
            if (r1 == 0) goto L11
            if (r1 == r2) goto Ld
            e.b.c.b(r4)
            goto L39
        Ld:
            e.b.c.b(r4)
            goto L26
        L11:
            e.b.c.b(r4)
            boolean r4 = r3.f32267b
            if (r4 != 0) goto L39
            r4 = r3
            h.c.e r4 = (h.c.e) r4
            r3.f32266a = r2
            r1 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r4 = kotlinx.coroutines.aj.q(r1, r4)
            if (r4 != r0) goto L26
            goto L38
        L26:
            com.waze.network.f.ab r4 = r3.f32268c
            com.waze.network.f.x r4 = com.waze.network.f.ab.a(r4)
            r1 = r3
            h.c.e r1 = (h.c.e) r1
            r2 = 2
            r3.f32266a = r2
            java.lang.Object r3 = r4.c(r1)
            if (r3 != r0) goto L39
        L38:
            return r0
        L39:
            h.ab r3 = h.ab.f48028a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.network.f.aa.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
