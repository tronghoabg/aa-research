package com.waze.car_lib.b;

import androidx.car.app.AppManager;
import androidx.car.app.CarContext;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class d extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f19078a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f19079b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ CarContext f19080c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AppManager f19081d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(f fVar, CarContext carContext, AppManager appManager, h.c.e eVar) {
        super(2, eVar);
        this.f19079b = fVar;
        this.f19080c = carContext;
        this.f19081d = appManager;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new d(this.f19079b, this.f19080c, this.f19081d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((d) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        if (kotlinx.coroutines.b.ai.e(r1, r4, r6) == r0) goto L12;
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
            int r1 = r6.f19078a
            r2 = 1
            if (r1 == 0) goto L11
            if (r1 != r2) goto Ld
            e.b.c.b(r7)
            goto L22
        Ld:
            e.b.c.b(r7)
            goto L4e
        L11:
            e.b.c.b(r7)
            r7 = r6
            h.c.e r7 = (h.c.e) r7
            r6.f19078a = r2
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r7 = kotlinx.coroutines.aj.q(r1, r7)
            if (r7 != r0) goto L22
            goto L4d
        L22:
            com.waze.car_lib.b.f r7 = r6.f19079b
            com.waze.car_lib.b.ap r1 = com.waze.car_lib.b.f.c(r7)
            kotlinx.coroutines.b.ch r1 = r1.C()
            kotlinx.coroutines.b.bq r1 = (kotlinx.coroutines.b.bq) r1
            androidx.car.app.CarContext r2 = r6.f19080c
            androidx.car.app.AppManager r3 = r6.f19081d
            com.waze.car_lib.b.c r4 = new com.waze.car_lib.b.c
            r5 = 0
            r4.<init>(r7, r2, r3, r5)
            h.g.a.p r4 = (h.g.a.p) r4
            java.lang.String r7 = "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>"
            h.g.b.x.d(r1, r7)
            kotlinx.coroutines.b.k r1 = (kotlinx.coroutines.b.k) r1
            r7 = r6
            h.c.e r7 = (h.c.e) r7
            r2 = 2
            r6.f19078a = r2
            java.lang.Object r6 = kotlinx.coroutines.b.ai.e(r1, r4, r7)
            if (r6 != r0) goto L4e
        L4d:
            return r0
        L4e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "SharedFlow never completes, this call should never return."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
