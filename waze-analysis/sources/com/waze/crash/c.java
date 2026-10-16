package com.waze.crash;

import android.app.Activity;
import com.b.b.a.u;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.waze.NativeManager;
import com.waze.map.opengl.r;
import com.waze.mywaze.MyWazeNativeManager;
import com.waze.z;
import h.g.b.x;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final FirebaseCrashlytics f23215a;

    /* renamed from: b, reason: collision with root package name */
    private final NativeManager f23216b;

    /* renamed from: c, reason: collision with root package name */
    private final MyWazeNativeManager f23217c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.sharedui.profile.b f23218d;

    /* renamed from: e, reason: collision with root package name */
    private final z f23219e;

    /* renamed from: f, reason: collision with root package name */
    private final r f23220f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.map.main.b f23221g;

    /* renamed from: h, reason: collision with root package name */
    private final d f23222h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f23223i;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f23224j;

    /* renamed from: k, reason: collision with root package name */
    private final af f23225k;

    public c(FirebaseCrashlytics firebaseCrashlytics, NativeManager nativeManager, MyWazeNativeManager myWazeNativeManager, com.waze.sharedui.profile.b bVar, z zVar, r rVar, com.waze.map.main.b bVar2, d dVar, com.waze.shared_infra.i.e eVar, h.c.j jVar) {
        x.f(firebaseCrashlytics, "firebaseCrashlytics");
        x.f(nativeManager, "nativeManager");
        x.f(myWazeNativeManager, "myWazeNativeManager");
        x.f(bVar, "profileManager");
        x.f(zVar, "appType");
        x.f(rVar, "singleRenderThreadConfig");
        x.f(bVar2, "mainMapConfiguration");
        x.f(dVar, "crashManagerConfig");
        x.f(eVar, "logger");
        x.f(jVar, "dispatcher");
        this.f23215a = firebaseCrashlytics;
        this.f23216b = nativeManager;
        this.f23217c = myWazeNativeManager;
        this.f23218d = bVar;
        this.f23219e = zVar;
        this.f23220f = rVar;
        this.f23221g = bVar2;
        this.f23222h = dVar;
        this.f23223i = eVar;
        this.f23224j = new AtomicBoolean(false);
        this.f23225k = aj.e(jVar);
    }

    public final void d(boolean z) {
        if (z) {
            this.f23224j.set(true);
        }
        FirebaseCrashlytics firebaseCrashlytics = this.f23215a;
        firebaseCrashlytics.setCustomKey("KEY_IS_CURRENTLY_CONNECTED_TO_ANDROID_AUTO_PROJECTED", z);
        firebaseCrashlytics.setCustomKey("KEY_IS_CONNECTED_IN_THIS_SESSION_TO_ANDROID_AUTO_PROJECTED", this.f23224j.get());
    }

    public final void e() {
        this.f23223i.g("About to crash Waze Java on purpose");
    }

    public final void f() {
        FirebaseCrashlytics firebaseCrashlytics = this.f23215a;
        firebaseCrashlytics.setCrashlyticsCollectionEnabled(true);
        d dVar = this.f23222h;
        String strA = dVar.a();
        String str = strA;
        if (str == null || str.length() == 0) {
            firebaseCrashlytics.setUserId(dVar.b());
        } else {
            firebaseCrashlytics.setUserId(strA);
        }
        firebaseCrashlytics.setCustomKey("INSTALLATION_ID", dVar.b());
        firebaseCrashlytics.setCustomKey("APP_TYPE", u.f(this.f23219e));
        firebaseCrashlytics.setCustomKey("BUILD_TYPE", "release");
        firebaseCrashlytics.setCustomKey("USER_FLAG", dVar.c());
        aj.z(this.f23225k, null, null, new b(this, null), 3);
    }

    public final void g(String str) {
        x.f(str, "message");
        this.f23215a.log(str);
    }

    public final void h(Activity activity) {
        x.f(activity, "activity");
        this.f23215a.setCustomKey("PREVIOUS_SCREEN", activity.getLocalClassName());
    }

    public final void i(Activity activity) {
        x.f(activity, "activity");
        this.f23215a.setCustomKey("VISIBLE_SCREEN", activity.getLocalClassName());
    }

    public final void j() {
        MyWazeNativeManager myWazeNativeManager = this.f23217c;
        String userIdNTV = myWazeNativeManager.getUserIdNTV();
        String str = userIdNTV;
        if (str != null && str.length() != 0 && !x.n(userIdNTV, "0") && !x.n(userIdNTV, "-1")) {
            this.f23215a.setUserId(userIdNTV);
            this.f23222h.e(userIdNTV);
        }
        FirebaseCrashlytics firebaseCrashlytics = this.f23215a;
        String realUserNameNTV = myWazeNativeManager.getRealUserNameNTV();
        String str2 = realUserNameNTV;
        if (str2 == null || str2.length() == 0) {
            realUserNameNTV = null;
        }
        if (realUserNameNTV == null) {
            realUserNameNTV = this.f23218d.b().getUserName();
        }
        firebaseCrashlytics.setCustomKey("USER_NAME", realUserNameNTV);
        firebaseCrashlytics.setCustomKey("SERVER_ID", this.f23216b.getRTServerId());
        firebaseCrashlytics.setCustomKey("NEW_RENDERER_ENABLED", this.f23222h.g());
        firebaseCrashlytics.setCustomKey("NEW_RENDERER_SINGLE_THREAD_ENABLED", this.f23220f.a());
        firebaseCrashlytics.setCustomKey("APP_TYPE", u.f(this.f23219e));
        com.waze.map.main.b bVar = this.f23221g;
        firebaseCrashlytics.setCustomKey("WAZE_MAP_AS_PRIMARY_ENABLED", bVar.b());
        firebaseCrashlytics.setCustomKey("WAZE_MAP_AS_PRIMARY_INCAR_ENABLED", bVar.a());
    }

    public final void k() {
        d dVar = this.f23222h;
        this.f23215a.setUserId(dVar.b());
        dVar.e(null);
    }

    public final void l(long j2) {
        this.f23215a.setCustomKey("SESSION_UPTIME_SEC", j2 / 1000);
    }

    public final boolean m() {
        return this.f23215a.didCrashOnPreviousExecution();
    }

    public final void n() {
        this.f23215a.setCustomKey("CLUSTER_CONNECTED_THIS_SESSION", true);
    }
}
