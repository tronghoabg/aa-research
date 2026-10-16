package com.waze.car_lib.b;

import androidx.car.app.AppManager;
import androidx.car.app.CarContext;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.waze.sound.es;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    private final ap f19086a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f19087b;

    /* renamed from: c, reason: collision with root package name */
    private final h f19088c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.af f19089d;

    /* renamed from: e, reason: collision with root package name */
    private r f19090e;

    public f(ap apVar, com.waze.shared_infra.i.e eVar, h hVar, kotlinx.coroutines.af afVar, com.waze.sound.m mVar, es esVar) {
        h.g.b.x.f(apVar, "alertPresenter");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(hVar, "alertNotificationPresenter");
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(mVar, "ttsService");
        h.g.b.x.f(esVar, "soundManager");
        this.f19086a = apVar;
        this.f19087b = eVar;
        this.f19088c = hVar;
        this.f19089d = afVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object e(com.waze.car_lib.b.f r5, com.waze.car_lib.b.r r6, h.c.e r7) {
        /*
            boolean r0 = r7 instanceof com.waze.car_lib.b.a
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.car_lib.b.a r0 = (com.waze.car_lib.b.a) r0
            int r1 = r0.f18928d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18928d = r1
            goto L18
        L13:
            com.waze.car_lib.b.a r0 = new com.waze.car_lib.b.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r5 = r0.f18926b
            h.c.a.a r7 = h.c.a.a.f48038a
            int r1 = r0.f18928d
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            java.lang.Object r6 = r0.f18925a
            com.waze.car_lib.b.v r6 = (com.waze.car_lib.b.v) r6
            e.b.c.b(r5)
            return r6
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            e.b.c.b(r5)
            com.waze.car_lib.b.v r5 = r6.d()
            r1 = 0
            if (r5 != 0) goto L3e
            return r1
        L3e:
            java.lang.Long r6 = r6.f()
            if (r6 == 0) goto L54
            long r3 = r6.longValue()
            r0.f18925a = r5
            r0.f18928d = r2
            java.lang.Object r6 = kotlinx.coroutines.aj.q(r3, r0)
            if (r6 == r7) goto L53
            return r5
        L53:
            return r7
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.b.f.e(com.waze.car_lib.b.f, com.waze.car_lib.b.r, h.c.e):java.lang.Object");
    }

    public final void h(Lifecycle lifecycle, CarContext carContext) {
        h.g.b.x.f(lifecycle, "lifecycle");
        h.g.b.x.f(carContext, "carContext");
        lifecycle.addObserver(new e(this, new h.g.b.aq(), carContext, (AppManager) carContext.getCarService(AppManager.class)));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        h.g.b.x.f(lifecycleOwner, "owner");
    }
}
