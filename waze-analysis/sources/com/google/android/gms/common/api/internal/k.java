package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    private static final k f4833a = new k();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f4834b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f4835c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f4836d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private boolean f4837e = false;

    private k() {
    }

    public static k a() {
        return f4833a;
    }

    public static void c(Application application) {
        k kVar = f4833a;
        synchronized (kVar) {
            if (!kVar.f4837e) {
                application.registerActivityLifecycleCallbacks(kVar);
                application.registerComponentCallbacks(kVar);
                kVar.f4837e = true;
            }
        }
    }

    private final void f(boolean z) {
        synchronized (f4833a) {
            Iterator it = this.f4836d.iterator();
            while (it.hasNext()) {
                ((j) it.next()).a(z);
            }
        }
    }

    public final void b(j jVar) {
        synchronized (f4833a) {
            this.f4836d.add(jVar);
        }
    }

    public final boolean d() {
        return this.f4834b.get();
    }

    public final boolean e() {
        AtomicBoolean atomicBoolean = this.f4835c;
        if (!atomicBoolean.get()) {
            if (com.google.android.gms.common.util.e.b()) {
                return true;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f4834b.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f4835c;
        boolean zCompareAndSet = this.f4834b.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f4835c;
        boolean zCompareAndSet = this.f4834b.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        if (i2 == 20 && this.f4834b.compareAndSet(false, true)) {
            this.f4835c.set(true);
            f(true);
        }
    }
}
