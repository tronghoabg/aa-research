package com.waze.car_lib.screens.a;

import androidx.car.app.CarContext;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class e extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f21743a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f21744b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f21745c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ CarContext f21746d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(g gVar, boolean z, CarContext carContext, h.c.e eVar) {
        super(2, eVar);
        this.f21744b = gVar;
        this.f21745c = z;
        this.f21746d = carContext;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new e(this.f21744b, this.f21745c, this.f21746d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((e) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0088, code lost:
    
        if (kotlinx.coroutines.b.ai.e(r9, r3, r8) == r0) goto L14;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r8.f21743a
            r2 = 1
            if (r1 == 0) goto L12
            if (r1 != r2) goto Ld
            e.b.c.b(r9)
            goto L42
        Ld:
            e.b.c.b(r9)
            goto L8b
        L12:
            e.b.c.b(r9)
            com.waze.car_lib.screens.a.g r9 = r8.f21744b
            com.waze.car_lib.r.a.p r1 = com.waze.car_lib.screens.a.g.d(r9)
            r3 = r9
            androidx.lifecycle.LifecycleOwner r3 = (androidx.lifecycle.LifecycleOwner) r3
            androidx.lifecycle.LifecycleCoroutineScope r3 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r3)
            h.c.j r3 = r3.getCoroutineContext()
            com.waze.car_lib.f.a.f r4 = com.waze.car_lib.screens.a.g.c(r9)
            kotlinx.coroutines.b.bq r4 = r4.a()
            boolean r5 = r8.f21745c
            com.waze.app_nav.a.a r6 = new com.waze.app_nav.a.a
            r7 = 10
            r6.<init>(r9, r7)
            r9 = r8
            h.c.e r9 = (h.c.e) r9
            r8.f21743a = r2
            java.lang.Object r9 = r1.r(r3, r4, r5, r6)
            if (r9 == r0) goto L93
        L42:
            com.waze.car_lib.screens.a.g r1 = r8.f21744b
            kotlinx.coroutines.b.ch r9 = (kotlinx.coroutines.b.ch) r9
            com.waze.car_lib.bd r2 = com.waze.car_lib.screens.a.g.b(r1)
            com.waze.bk.a.a r3 = com.waze.bk.a.a.a()
            androidx.lifecycle.Lifecycle r4 = r1.getLifecycle()
            java.lang.String r5 = "<get-lifecycle>(...)"
            h.g.b.x.e(r4, r5)
            r2.u(r3, r4)
            com.waze.car_lib.r.a.p r2 = com.waze.car_lib.screens.a.g.d(r1)
            r2.o()
            com.waze.app_nav.a.a r2 = new com.waze.app_nav.a.a
            r3 = 11
            r2.<init>(r1, r3)
            com.waze.car_lib.screens.a.g.i(r1, r2)
            kotlinx.coroutines.b.bq r9 = (kotlinx.coroutines.b.bq) r9
            androidx.car.app.CarContext r2 = r8.f21746d
            com.waze.car_lib.screens.a.d r3 = new com.waze.car_lib.screens.a.d
            r4 = 0
            r3.<init>(r1, r2, r4)
            h.g.a.p r3 = (h.g.a.p) r3
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>"
            h.g.b.x.d(r9, r1)
            kotlinx.coroutines.b.k r9 = (kotlinx.coroutines.b.k) r9
            r1 = r8
            h.c.e r1 = (h.c.e) r1
            r2 = 2
            r8.f21743a = r2
            java.lang.Object r8 = kotlinx.coroutines.b.ai.e(r9, r3, r1)
            if (r8 != r0) goto L8b
            goto L93
        L8b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "SharedFlow never completes, this call should never return."
            r8.<init>(r9)
            throw r8
        L93:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.screens.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
