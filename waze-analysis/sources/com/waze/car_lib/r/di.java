package com.waze.car_lib.r;

import androidx.car.app.CarContext;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class di extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    int f21385a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f21386b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dl f21387c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.af f21388d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ CarContext f21389e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f21390f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di(h.c.e eVar, dl dlVar, kotlinx.coroutines.af afVar, CarContext carContext) {
        super(3, eVar);
        this.f21387c = dlVar;
        this.f21388d = afVar;
        this.f21389e = carContext;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        di diVar = new di((h.c.e) obj3, this.f21387c, this.f21388d, this.f21389e);
        diVar.f21390f = (kotlinx.coroutines.b.l) obj;
        diVar.f21386b = obj2;
        return diVar.invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005d  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r10.f21385a
            if (r1 == 0) goto La
            e.b.c.b(r11)
            goto L6a
        La:
            e.b.c.b(r11)
            java.lang.Object r11 = r10.f21390f
            kotlinx.coroutines.b.l r11 = (kotlinx.coroutines.b.l) r11
            java.lang.Object r1 = r10.f21386b
            r2 = r10
            h.c.e r2 = (h.c.e) r2
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L5d
            com.waze.car_lib.r.dl r1 = r10.f21387c
            com.waze.reports_v2.d r5 = com.waze.car_lib.r.dl.f(r1)
            boolean r5 = r5 instanceof com.waze.reports_v2.a
            if (r5 == 0) goto L5d
            com.waze.car_lib.r.u r5 = com.waze.car_lib.r.dl.d(r1)
            kotlinx.coroutines.af r6 = r10.f21388d
            androidx.car.app.CarContext r7 = r10.f21389e
            java.lang.String r8 = "scope"
            h.g.b.x.f(r6, r8)
            java.lang.String r8 = "carContext"
            h.g.b.x.f(r7, r8)
            com.waze.car_lib.r.as r8 = new com.waze.car_lib.r.as
            r8.<init>(r5, r7, r4, r3)
            h.g.a.p r8 = (h.g.a.p) r8
            r7 = 3
            kotlinx.coroutines.aj.z(r6, r4, r4, r8, r7)
            com.waze.car_lib.r.j r8 = new com.waze.car_lib.r.j
            r9 = 2
            r8.<init>(r5, r4, r9)
            h.g.a.p r8 = (h.g.a.p) r8
            kotlinx.coroutines.aj.z(r6, r4, r4, r8, r7)
            com.waze.car_lib.r.u r1 = com.waze.car_lib.r.dl.d(r1)
            kotlinx.coroutines.b.ch r1 = r1.i()
            kotlinx.coroutines.b.k r1 = (kotlinx.coroutines.b.k) r1
            goto L61
        L5d:
            kotlinx.coroutines.b.k r1 = kotlinx.coroutines.b.ai.G(r4)
        L61:
            r10.f21385a = r3
            java.lang.Object r10 = kotlinx.coroutines.b.ai.g(r11, r1, r2)
            if (r10 != r0) goto L6a
            return r0
        L6a:
            h.ab r10 = h.ab.f48028a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.di.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
