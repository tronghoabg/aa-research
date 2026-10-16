package com.bytedance.sdk.openadsdk.core.wrv.uef;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes3.dex */
public class uef implements Application.ActivityLifecycleCallbacks {
    private static volatile uef uef;

    /* renamed from: oa, reason: collision with root package name */
    private final oa f25822oa;

    private uef(Application application) {
        this.f25822oa = oa.uef(application);
    }

    public static uef uef(Application application) {
        if (uef == null) {
            synchronized (uef.class) {
                try {
                    if (uef == null) {
                        uef = new uef(application);
                        application.registerActivityLifecycleCallbacks(uef);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        oa oaVar = this.f25822oa;
        if (oaVar != null) {
            oaVar.uef(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        oa oaVar = this.f25822oa;
        if (oaVar != null) {
            oaVar.oa(activity);
        }
    }

    public String uef(String str, long j8, int i5) {
        oa oaVar = this.f25822oa;
        if (oaVar != null) {
            return oaVar.uef(str, j8, i5);
        }
        return "null";
    }
}
