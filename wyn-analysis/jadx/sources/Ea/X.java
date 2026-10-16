package ea;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class X implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public static final X f34506a = new X();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f34507b;

    /* renamed from: c, reason: collision with root package name */
    public static W9.u f34508c;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC3340k.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        AbstractC3340k.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        AbstractC3340k.e(activity, "activity");
        W9.u uVar = f34508c;
        if (uVar != null) {
            uVar.j(2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C2515C c2515c;
        AbstractC3340k.e(activity, "activity");
        W9.u uVar = f34508c;
        if (uVar != null) {
            uVar.j(1);
            c2515c = C2515C.f34653a;
        } else {
            c2515c = null;
        }
        if (c2515c == null) {
            f34507b = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        AbstractC3340k.e(activity, "activity");
        AbstractC3340k.e(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        AbstractC3340k.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        AbstractC3340k.e(activity, "activity");
    }
}
