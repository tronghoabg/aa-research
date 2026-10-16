package com.waze;

import android.os.Handler;
import androidx.autofill.HintConstants;
import com.waze.navigate.NavResultData;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public abstract class iz extends iu implements gk, bq, gj {
    private final kotlinx.coroutines.b.bn<NavResultData> _navResultDataFlow;
    private final kotlinx.coroutines.af defaultScope;
    private final com.waze.am.h mInitStatus;
    private final kotlinx.coroutines.b.ch<NavResultData> navResultDataFlow;
    public static final ix Companion = new ix();
    public static final int $stable = 8;
    private static final h.f<com.waze.shared_infra.i.e> defaultLogger$delegate = h.g.a(new iw(0));

    public iz() {
        kotlinx.coroutines.b.bn<NavResultData> bnVarB = kotlinx.coroutines.b.ck.b(null);
        this._navResultDataFlow = bnVarB;
        this.navResultDataFlow = bnVarB;
        this.mInitStatus = new com.waze.am.h();
        this.defaultScope = kotlinx.coroutines.aj.e(kotlinx.coroutines.aj.Q().plus(kotlinx.coroutines.av.a()));
    }

    static final h.ab GetServerEnviornment$lambda$0(h.g.a.l lVar, String str) {
        lVar.invoke(str);
        return h.ab.f48028a;
    }

    public static final com.waze.shared_infra.i.e getNativeManagerLogger() {
        Object value = defaultLogger$delegate.getValue();
        h.g.b.x.e(value, "getValue(...)");
        return (com.waze.shared_infra.i.e) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object waitForAtLeast(com.waze.am.a aVar, h.c.e<? super h.ab> eVar) {
        Object objA = this.mInitStatus.a(aVar, eVar);
        return objA == h.c.a.a.f48038a ? objA : h.ab.f48028a;
    }

    static /* synthetic */ Object waitForOnline$suspendImpl(iz izVar, h.c.e<? super h.ab> eVar) {
        Object objWaitForAtLeast = izVar.waitForAtLeast(com.waze.am.a.f14307c, eVar);
        return objWaitForAtLeast == h.c.a.a.f48038a ? objWaitForAtLeast : h.ab.f48028a;
    }

    public void GetServerEnviornment(h.g.a.l<? super String, h.ab> lVar) {
        h.g.b.x.f(lVar, "callback");
        loadServerEnv(new iv(lVar, 0));
    }

    protected final kotlinx.coroutines.ab asCoroutineDispatcher(Handler handler, String str) {
        h.g.b.x.f(handler, "handler");
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        return kotlinx.coroutines.android.e.a(handler, str);
    }

    public final void completeLoadedVenue(com.waze.av.a.p pVar, CompletableDeferred<com.waze.av.b.n> completableDeferred) {
        h.g.b.x.f(completableDeferred, "completable");
        completableDeferred.a(pVar != null ? new com.waze.av.b.m(pVar) : null);
    }

    public final kotlinx.coroutines.b.ch<NavResultData> getNavResultDataFlow() {
        return this.navResultDataFlow;
    }

    public final void goOnline() {
        this.mInitStatus.c();
    }

    public final boolean isOfflineMode() {
        return this.mInitStatus.e();
    }

    protected final void launchOnCoroutineDispatchersDefault(Runnable runnable) {
        h.g.b.x.f(runnable, "action");
        kotlinx.coroutines.aj.z(this.defaultScope, null, null, new iy(runnable, (h.c.e) null, 0), 3);
    }

    protected abstract void offlineInit();

    public final void onCloseProgressPopup() {
        kotlinx.coroutines.b.bn<NavResultData> bnVar;
        Object objD;
        NavResultData navResultData;
        do {
            bnVar = this._navResultDataFlow;
            objD = bnVar.d();
            NavResultData navResultData2 = (NavResultData) objD;
            if (navResultData2 == null || (navResultData = navResultData2.copy()) == null) {
                navResultData = new NavResultData();
            }
            navResultData.bIsCalculating = false;
        } while (!bnVar.f(objD, navResultData));
    }

    protected final void onNativeLooperPrepared() {
        offlineInit();
        this.mInitStatus.d(com.waze.am.a.f14306b);
        kotlinx.coroutines.aj.t(h.c.k.f48060a, new ck(this, (h.c.e) null, 9));
        onlineInit();
        this.mInitStatus.d(com.waze.am.a.f14307c);
    }

    public final void onNavResultData(NavResultData navResultData) {
        h.g.b.x.f(navResultData, "navResultData");
        this._navResultDataFlow.c(navResultData);
    }

    protected abstract void onlineInit();

    public final void waitForAtLeastBlocking(com.waze.am.a aVar) {
        h.g.b.x.f(aVar, "targetPhase");
        kotlinx.coroutines.aj.t(h.c.k.f48060a, new ea(this, aVar, (h.c.e) null, 2));
    }

    @Override // com.waze.gk
    public Object waitForOnline(h.c.e<? super h.ab> eVar) {
        return waitForOnline$suspendImpl(this, eVar);
    }
}
