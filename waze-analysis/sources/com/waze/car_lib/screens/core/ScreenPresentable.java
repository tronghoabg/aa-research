package com.waze.car_lib.screens.core;

import androidx.car.app.CarContext;
import androidx.car.app.Screen;
import androidx.car.app.ScreenManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import h.ab;
import h.g.b.ar;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.bo;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public abstract class ScreenPresentable extends Screen implements com.waze.shared_infra.coordinators.f, org.a.d.a.a {
    private final List<Runnable> backPressedCallbacks;
    private final List<c> backPressedHandlers;
    private final com.waze.shared_infra.coordinators.b coordinatorBackClickDispatcher;
    private CompletableDeferred<ab> getTemplateCompletableDeferred;
    private final com.waze.shared_infra.i.e logger;
    private final com.waze.crash.k loggerWithBreadcrumbs;
    private br pushingScreenJob;
    private final d safeScreenManager;
    private final String screenName;
    private final String uuid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenPresentable(CarContext carContext, String str, String str2) {
        super(carContext);
        x.f(carContext, "carContext");
        x.f(str, "screenName");
        x.f(str2, "uuid");
        this.screenName = str;
        this.uuid = str2;
        org.a.d.k.b bVarC = getKoin().a().c();
        int i2 = ar.f48106a;
        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVarC.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("ScreenPresentable"));
        x.e(eVarA, "provide(...)");
        this.logger = eVarA;
        this.loggerWithBreadcrumbs = ((com.waze.crash.j) getKoin().a().c().a(new h.g.b.m(com.waze.crash.j.class), null, null)).a();
        this.coordinatorBackClickDispatcher = (com.waze.shared_infra.coordinators.b) getKoin().a().c().a(new h.g.b.m(com.waze.shared_infra.coordinators.b.class), null, null);
        ScreenManager screenManager = getScreenManager();
        x.e(screenManager, "getScreenManager(...)");
        this.safeScreenManager = new d(screenManager, eVarA);
        setMarker(str2);
        setupBackPressedListener();
        this.getTemplateCompletableDeferred = bo.j();
        this.backPressedHandlers = new ArrayList();
        this.backPressedCallbacks = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitTop(h.c.e<? super h.ab> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.waze.car_lib.screens.core.e
            if (r0 == 0) goto L13
            r0 = r5
            com.waze.car_lib.screens.core.e r0 = (com.waze.car_lib.screens.core.e) r0
            int r1 = r0.f21950c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21950c = r1
            goto L18
        L13:
            com.waze.car_lib.screens.core.e r0 = new com.waze.car_lib.screens.core.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f21948a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f21950c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r5)     // Catch: java.lang.Throwable -> L3d
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r5)
            kotlinx.coroutines.CompletableDeferred<h.ab> r4 = r4.getTemplateCompletableDeferred     // Catch: java.lang.Throwable -> L3d
            r0.f21950c = r3     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r4 = r4.c(r0)     // Catch: java.lang.Throwable -> L3d
            if (r4 != r1) goto L41
            return r1
        L3d:
            r4 = move-exception
            e.b.c.a(r4)
        L41:
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.screens.core.ScreenPresentable.awaitTop(h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitTopScreen(h.c.e<? super h.ab> r13) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.screens.core.ScreenPresentable.awaitTopScreen(h.c.e):java.lang.Object");
    }

    static final boolean disableBackPresses$lambda$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBackPressed() {
        Iterator<c> it = this.backPressedHandlers.iterator();
        if (it.hasNext()) {
            it.next().a();
            return;
        }
        Iterator<T> it2 = this.backPressedCallbacks.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        this.coordinatorBackClickDispatcher.b(this.uuid);
    }

    private final void onTop() {
        this.logger.a("onTop ".concat(String.valueOf(this.screenName)));
        this.getTemplateCompletableDeferred = bo.j();
    }

    private final void setupBackPressedListener() {
        getCarContext().getOnBackPressedDispatcher().addCallback(this, new i(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void addBackPressedCallback(final h.g.a.a<ab> aVar) {
        x.f(aVar, "callback");
        this.backPressedCallbacks.add(new Runnable() { // from class: com.waze.car_lib.screens.core.a
            @Override // java.lang.Runnable
            public final void run() {
                aVar.invoke();
            }
        });
    }

    public final void addBackPressedHandler(c cVar) {
        x.f(cVar, "handler");
        this.backPressedHandlers.add(cVar);
    }

    public final void disableBackPresses() {
        this.backPressedHandlers.add(new b());
    }

    @Override // com.waze.shared_infra.coordinators.f
    public Lifecycle getAndroidLifecycle() {
        Lifecycle lifecycle = getLifecycle();
        x.e(lifecycle, "<get-lifecycle>(...)");
        return lifecycle;
    }

    public final CompletableDeferred<ab> getGetTemplateCompletableDeferred() {
        return this.getTemplateCompletableDeferred;
    }

    @Override // org.a.d.a.a
    public /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }

    public final void getTemplateCalled() {
        aj.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new g(this, null), 3);
    }

    @Override // com.waze.shared_infra.coordinators.f
    public final String getUuid() {
        return this.uuid;
    }

    public final boolean isTop() {
        return x.n(this.safeScreenManager.a(), this);
    }

    public final void popToThis() {
        this.logger.e("popToThis ".concat(String.valueOf(this.screenName)));
        if (x.n(this.safeScreenManager.a(), this)) {
            return;
        }
        this.loggerWithBreadcrumbs.e("pop To ".concat(String.valueOf(this.screenName)));
        this.safeScreenManager.b(this.uuid);
        onTop();
    }

    public final void push() {
        this.logger.e("push ".concat(String.valueOf(this.screenName)));
        this.pushingScreenJob = aj.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new h(this, null), 3);
    }

    public final void remove() {
        this.loggerWithBreadcrumbs.e("remove ".concat(String.valueOf(this.screenName)));
        br brVar = this.pushingScreenJob;
        if (brVar != null) {
            brVar.s(null);
            this.loggerWithBreadcrumbs.a("canceled job pushing ".concat(String.valueOf(this.screenName)));
        }
        Screen screenA = this.safeScreenManager.a();
        ScreenPresentable screenPresentable = screenA instanceof ScreenPresentable ? (ScreenPresentable) screenA : null;
        this.safeScreenManager.d(this);
        Screen screenA2 = this.safeScreenManager.a();
        ScreenPresentable screenPresentable2 = screenA2 instanceof ScreenPresentable ? (ScreenPresentable) screenA2 : null;
        if (x.n(screenPresentable2, screenPresentable) || screenPresentable2 == null) {
            return;
        }
        screenPresentable2.onTop();
    }

    public final void setGetTemplateCompletableDeferred(CompletableDeferred<ab> completableDeferred) {
        x.f(completableDeferred, "<set-?>");
        this.getTemplateCompletableDeferred = completableDeferred;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ScreenPresentable(CarContext carContext, String str, String str2, int i2, o oVar) {
        if ((i2 & 4) != 0) {
            str2 = UUID.randomUUID().toString();
            x.e(str2, "toString(...)");
        }
        this(carContext, str, str2);
    }
}
