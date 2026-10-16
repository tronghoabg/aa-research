package com.waze.car_lib.screens.b;

import androidx.car.app.CarContext;
import androidx.car.app.model.Template;
import androidx.car.app.navigation.model.RoutePreviewNavigationTemplate;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.car_lib.p.dh;
import h.ab;
import h.g.b.x;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final CarContext f21841a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.car_lib.r.d.d f21842b;

    /* renamed from: c, reason: collision with root package name */
    private final RoutePreviewNavigationTemplate f21843c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(CarContext carContext, com.waze.car_lib.r.d.d dVar) {
        super(carContext, "TripOverviewListScreen");
        x.f(carContext, "carContext");
        x.f(dVar, "viewModel");
        this.f21841a = carContext;
        this.f21842b = dVar;
        this.f21843c = dh.D();
        aj.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new h(this, (h.c.e) null, 1, (byte[]) null), 3);
        addBackPressedCallback(new e(this, 1));
        dVar.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object e(com.waze.car_lib.screens.b.j r4, h.c.e r5) {
        /*
            boolean r0 = r5 instanceof com.waze.car_lib.screens.b.d
            if (r0 == 0) goto L13
            r0 = r5
            com.waze.car_lib.screens.b.d r0 = (com.waze.car_lib.screens.b.d) r0
            int r1 = r0.f21833c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21833c = r1
            goto L18
        L13:
            com.waze.car_lib.screens.b.d r0 = new com.waze.car_lib.screens.b.d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f21831a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f21833c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            e.b.c.b(r5)
            goto L48
        L2f:
            e.b.c.b(r5)
            com.waze.car_lib.r.d.d r5 = r4.f21842b
            kotlinx.coroutines.b.ch r5 = r5.b()
            com.waze.car_lib.screens.b.i r2 = new com.waze.car_lib.screens.b.i
            r2.<init>(r4)
            kotlinx.coroutines.b.l r2 = (kotlinx.coroutines.b.l) r2
            r0.f21833c = r3
            java.lang.Object r4 = r5.collect(r2, r0)
            if (r4 != r1) goto L48
            return r1
        L48:
            h.e r4 = new h.e
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.screens.b.j.e(com.waze.car_lib.screens.b.j, h.c.e):java.lang.Object");
    }

    static final ab f(j jVar) {
        jVar.f21842b.d();
        return ab.f48028a;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21843c;
    }
}
