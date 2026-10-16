package com.waze.car_lib.j;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class v extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f20279a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f20280b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ w f20281c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f20282d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(w wVar, h.g.a.l lVar, h.c.e eVar) {
        super(2, eVar);
        this.f20281c = wVar;
        this.f20282d = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        v vVar = new v(this.f20281c, this.f20282d, eVar);
        vVar.f20280b = obj;
        return vVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((v) create((h.k) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r11.f20279a
            if (r1 == 0) goto Lf
            e.b.c.b(r12)     // Catch: java.lang.Throwable -> Lb
            r10 = r11
            goto L45
        Lb:
            r0 = move-exception
            r12 = r0
            r10 = r11
            goto L4d
        Lf:
            e.b.c.b(r12)
            java.lang.Object r12 = r11.f20280b
            h.k r12 = (h.k) r12
            java.lang.Object r1 = r12.a()
            com.waze.car_lib.j.s r1 = (com.waze.car_lib.j.s) r1
            java.lang.Object r12 = r12.b()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r8 = r12.booleanValue()
            com.waze.car_lib.j.w r2 = r11.f20281c
            h.g.a.l r9 = r11.f20282d
            com.waze.shared_infra.h.c r3 = r1.d()     // Catch: java.lang.Throwable -> L4a
            com.waze.shared_infra.h.c r4 = r1.c()     // Catch: java.lang.Throwable -> L4a
            com.waze.modules.c.dk r5 = r1.b()     // Catch: java.lang.Throwable -> L4a
            long r6 = r1.a()     // Catch: java.lang.Throwable -> L4a
            r12 = 1
            r11.f20279a = r12     // Catch: java.lang.Throwable -> L4a
            r10 = r11
            java.lang.Object r11 = com.waze.car_lib.j.w.d(r2, r3, r4, r5, r6, r8, r9, r10)     // Catch: java.lang.Throwable -> L48
            if (r11 != r0) goto L45
            return r0
        L45:
            h.ab r11 = h.ab.f48028a     // Catch: java.lang.Throwable -> L48
            goto L51
        L48:
            r0 = move-exception
            goto L4c
        L4a:
            r0 = move-exception
            r10 = r11
        L4c:
            r12 = r0
        L4d:
            java.lang.Object r11 = e.b.c.a(r12)
        L51:
            com.waze.car_lib.j.w r12 = r10.f20281c
            java.lang.Throwable r11 = h.m.c(r11)
            if (r11 == 0) goto L66
            boolean r0 = r11 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L66
            com.waze.shared_infra.i.e r12 = com.waze.car_lib.j.w.c(r12)
            java.lang.String r0 = "setData failed with non CancellationException"
            com.waze.settings.tree.c.f.e(r12, r0, r11)
        L66:
            h.ab r11 = h.ab.f48028a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.j.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
