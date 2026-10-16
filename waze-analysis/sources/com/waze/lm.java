package com.waze;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class lm implements Application.ActivityLifecycleCallbacks, ac {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f25154a = 0;

    /* renamed from: c, reason: collision with root package name */
    private static lm f25156c;

    /* renamed from: h, reason: collision with root package name */
    private MainActivity f25161h;

    /* renamed from: b, reason: collision with root package name */
    private static final com.waze.shared_infra.i.e f25155b = com.waze.shared_infra.i.a.d("WazeActivityManager");

    /* renamed from: d, reason: collision with root package name */
    private static final com.waze.shared_infra.q.n f25157d = com.waze.shared_infra.q.m.a(true);

    /* renamed from: e, reason: collision with root package name */
    private static final com.waze.shared_infra.q.n f25158e = com.waze.shared_infra.q.m.a(false);

    /* renamed from: f, reason: collision with root package name */
    private final List f25159f = DesugarCollections.synchronizedList(new ArrayList(2));

    /* renamed from: g, reason: collision with root package name */
    private final HashSet f25160g = new HashSet();

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f25162i = true;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f25163j = false;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f25164k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f25165l = true;
    private final kotlinx.coroutines.b.bn m = kotlinx.coroutines.b.ck.b(true);
    private final kotlinx.coroutines.b.bn n = kotlinx.coroutines.b.ck.b(true);

    private lm() {
    }

    public static synchronized lm d() {
        lm lmVar;
        lmVar = f25156c;
        if (lmVar == null) {
            lmVar = new lm();
            f25156c = lmVar;
        }
        return lmVar;
    }

    static /* bridge */ /* synthetic */ void h(lm lmVar) {
        lmVar.f25164k = false;
        lmVar.n.e(true);
        lmVar.t();
    }

    static /* bridge */ /* synthetic */ void i(lm lmVar) {
        lmVar.f25164k = true;
        lmVar.n.e(false);
        lmVar.t();
    }

    private final int q() {
        Iterator it = this.f25160g.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (((com.waze.sharedui.a.e) it.next()).aL()) {
                i2++;
            }
        }
        return i2;
    }

    private final synchronized void r(com.waze.sharedui.a.e eVar) {
        com.waze.sharedui.a.e eVarE = e();
        if (eVarE != null && eVarE != eVar) {
            eVarE.aH();
        }
        com.waze.sharedui.a.e eVarE2 = eVarE;
        while (eVarE2 != null && !eVarE2.aK()) {
            this.f25159f.remove(eVarE2);
            eVarE2 = e();
        }
        this.f25159f.add(0, eVar);
        f25155b.a(String.format("Current active activity = %s, previous activity = %s", eVar == null ? "null" : eVar.getClass().toString(), eVarE == null ? "null" : eVarE.getClass().toString()));
    }

    private final synchronized void s(com.waze.sharedui.a.e eVar) {
        List list = this.f25159f;
        if (list.size() > 1) {
            Object obj = list.get(0);
            list.remove(eVar);
            if (obj == eVar) {
                f25155b.a(String.format("Current active activity = %s, removed activity = %s", list.isEmpty() ? "null" : ((com.waze.sharedui.a.e) list.get(0)).getClass().toString(), eVar == null ? "null" : eVar.getClass().toString()));
            }
        }
    }

    private final void t() {
        boolean z = (this.f25163j || this.f25164k) ? false : true;
        if (z == this.f25162i) {
            return;
        }
        com.waze.shared_infra.i.h.a("updateBackgroundState(isInBg:" + z + ")");
        if (!z) {
            this.f25162i = false;
            f25158e.c();
            NativeManager.runOnNativeManagerReady(new com.google.android.gms.common.api.internal.bc(8));
        } else {
            this.f25162i = true;
            f25158e.b();
            if (NativeManager.isAppStarted()) {
                NativeManager.getInstance().onAppBackground();
            }
        }
    }

    @Override // com.waze.ac
    public final kotlinx.coroutines.b.ch a() {
        return this.n;
    }

    @Override // com.waze.ac
    public final kotlinx.coroutines.b.ch b() {
        return this.m;
    }

    @Deprecated
    public final MainActivity c() {
        MainActivity mainActivity = this.f25161h;
        if (mainActivity == null || mainActivity.isFinishing()) {
            return null;
        }
        return this.f25161h;
    }

    @Deprecated
    public final synchronized com.waze.sharedui.a.e e() {
        List list = this.f25159f;
        if (list.isEmpty()) {
            return null;
        }
        return (com.waze.sharedui.a.e) list.get(0);
    }

    public final Long f() {
        return Long.valueOf(f25158e.a());
    }

    public final Long g() {
        return Long.valueOf(f25157d.a());
    }

    public final void j(Lifecycle lifecycle) {
        lifecycle.addObserver(new ll(this));
    }

    public final void k(boolean z) {
        this.f25165l = z;
        Iterator it = this.f25160g.iterator();
        while (it.hasNext()) {
            com.waze.sharedui.a.e eVar = (com.waze.sharedui.a.e) it.next();
            if (eVar.bs()) {
                if (z) {
                    eVar.getWindow().addFlags(128);
                } else {
                    eVar.getWindow().clearFlags(128);
                }
            }
        }
    }

    public final void l(Intent intent) {
        com.waze.sharedui.a.e eVarE = e();
        if (eVarE != null) {
            eVarE.startActivity(intent);
        }
    }

    public final void m() {
        Iterator it = this.f25160g.iterator();
        while (it.hasNext()) {
            com.waze.sharedui.a.e eVar = (com.waze.sharedui.a.e) it.next();
            if (eVar != null && !(eVar instanceof MainActivity)) {
                if (eVar.bt()) {
                    f25155b.a("Finishing activity:  ".concat(String.valueOf(eVar.toString())));
                    eVar.finish();
                } else {
                    f25155b.a("Not finishing activity as non-closeable:  ".concat(String.valueOf(eVar.toString())));
                }
            }
        }
    }

    public final void n() {
        m();
        com.waze.alerters.a.k.e().d();
    }

    @Deprecated
    public final synchronized boolean o() {
        if (e() != null) {
            if (e().aK()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity instanceof com.waze.sharedui.a.e) {
            if (activity instanceof MainActivity) {
                this.f25161h = (MainActivity) activity;
            }
            this.f25160g.add((com.waze.sharedui.a.e) activity);
            if (this.f25165l) {
                activity.getWindow().addFlags(128);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (activity instanceof com.waze.sharedui.a.e) {
            if (activity instanceof MainActivity) {
                this.f25161h = null;
            }
            this.f25160g.remove(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity instanceof com.waze.sharedui.a.e) {
            s((com.waze.sharedui.a.e) activity);
            ((com.waze.crash.c) com.waze.web.r.h(com.waze.crash.c.class)).h(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ((com.waze.crash.c) com.waze.web.r.h(com.waze.crash.c.class)).i(activity);
        if (activity instanceof com.waze.sharedui.a.e) {
            r((com.waze.sharedui.a.e) activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if ((activity instanceof com.waze.sharedui.a.e) && q() == 0) {
            this.f25163j = true;
            this.m.e(false);
            t();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if ((activity instanceof com.waze.sharedui.a.e) && q() == 1) {
            this.f25163j = false;
            this.m.e(true);
            t();
        }
    }

    public final boolean p() {
        return this.f25162i;
    }
}
