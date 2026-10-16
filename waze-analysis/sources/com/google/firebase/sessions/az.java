package com.google.firebase.sessions;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class az implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public static final az f10855a = new az();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f10856b;

    /* renamed from: c, reason: collision with root package name */
    private static av f10857c;

    private az() {
    }

    public final void a(av avVar) {
        f10857c = avVar;
        if (f10856b) {
            f10856b = false;
            avVar.g();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        h.g.b.x.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        h.g.b.x.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        h.g.b.x.f(activity, "activity");
        av avVar = f10857c;
        if (avVar != null) {
            avVar.e();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        h.g.b.x.f(activity, "activity");
        av avVar = f10857c;
        if (avVar != null) {
            avVar.g();
        } else {
            f10856b = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        h.g.b.x.f(activity, "activity");
        h.g.b.x.f(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        h.g.b.x.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        h.g.b.x.f(activity, "activity");
    }
}
