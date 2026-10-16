package J9;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import cf.C1608b;

/* renamed from: J9.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0657p implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public C8.g f5974d;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f5971a = new Handler();

    /* renamed from: b, reason: collision with root package name */
    public boolean f5972b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5973c = true;

    /* renamed from: e, reason: collision with root package name */
    public final C1608b f5975e = new C1608b();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f5973c = true;
        C8.g gVar = this.f5974d;
        Handler handler = this.f5971a;
        if (gVar != null) {
            handler.removeCallbacks(gVar);
        }
        C8.g gVar2 = new C8.g(this, 7);
        this.f5974d = gVar2;
        handler.postDelayed(gVar2, 1000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f5973c = false;
        boolean z2 = this.f5972b;
        this.f5972b = true;
        C8.g gVar = this.f5974d;
        if (gVar != null) {
            this.f5971a.removeCallbacks(gVar);
        }
        if (z2) {
            return;
        }
        ic.d.F("went foreground");
        this.f5975e.b("ON_FOREGROUND");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
