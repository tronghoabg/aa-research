package com.waze.car_lib.r;

import androidx.car.app.CarContext;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dh extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    int f21380a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f21381b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dl f21382c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ CarContext f21383d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f21384e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh(h.c.e eVar, dl dlVar, CarContext carContext) {
        super(3, eVar);
        this.f21382c = dlVar;
        this.f21383d = carContext;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        dh dhVar = new dh((h.c.e) obj3, this.f21382c, this.f21383d);
        dhVar.f21384e = (kotlinx.coroutines.b.l) obj;
        dhVar.f21381b = obj2;
        return dhVar.invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r4.f21380a
            if (r1 == 0) goto La
            e.b.c.b(r5)
            goto L42
        La:
            e.b.c.b(r5)
            java.lang.Object r5 = r4.f21384e
            kotlinx.coroutines.b.l r5 = (kotlinx.coroutines.b.l) r5
            java.lang.Object r1 = r4.f21381b
            r2 = r4
            h.c.e r2 = (h.c.e) r2
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L33
            com.waze.car_lib.r.dl r1 = r4.f21382c
            com.waze.reports_v2.d r3 = com.waze.car_lib.r.dl.f(r1)
            boolean r3 = r3 instanceof com.waze.reports_v2.c
            if (r3 == 0) goto L33
            com.waze.car_lib.r.de r1 = com.waze.car_lib.r.dl.e(r1)
            androidx.car.app.CarContext r3 = r4.f21383d
            kotlinx.coroutines.b.k r1 = r1.i(r3)
            goto L38
        L33:
            r1 = 0
            kotlinx.coroutines.b.k r1 = kotlinx.coroutines.b.ai.G(r1)
        L38:
            r3 = 1
            r4.f21380a = r3
            java.lang.Object r4 = kotlinx.coroutines.b.ai.g(r5, r1, r2)
            if (r4 != r0) goto L42
            return r0
        L42:
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.dh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
