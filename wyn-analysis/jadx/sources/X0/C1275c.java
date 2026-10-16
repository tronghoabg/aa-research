package X0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* renamed from: X0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1275c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f15825a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f15826b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15827c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15828d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15829e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15830f = false;

    public C1275c(Activity activity) {
        this.f15826b = activity;
        this.f15827c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f15826b == activity) {
            this.f15826b = null;
            this.f15829e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f15829e || this.f15830f || this.f15828d) {
            return;
        }
        Object obj = this.f15825a;
        try {
            Object obj2 = AbstractC1276d.f15833c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f15827c) {
                AbstractC1276d.f15837g.postAtFrontOfQueue(new L7.b(11, AbstractC1276d.f15832b.get(activity), obj2));
                this.f15830f = true;
                this.f15825a = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f15826b == activity) {
            this.f15828d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
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
