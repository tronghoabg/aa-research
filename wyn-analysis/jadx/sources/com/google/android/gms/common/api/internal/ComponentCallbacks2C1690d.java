package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.api.internal.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ComponentCallbacks2C1690d implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e, reason: collision with root package name */
    public static final ComponentCallbacks2C1690d f26513e = new ComponentCallbacks2C1690d();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f26514a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f26515b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f26516c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f26517d = false;

    public static void c(Application application) {
        ComponentCallbacks2C1690d componentCallbacks2C1690d = f26513e;
        synchronized (componentCallbacks2C1690d) {
            try {
                if (!componentCallbacks2C1690d.f26517d) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C1690d);
                    application.registerComponentCallbacks(componentCallbacks2C1690d);
                    componentCallbacks2C1690d.f26517d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(InterfaceC1689c interfaceC1689c) {
        synchronized (f26513e) {
            this.f26516c.add(interfaceC1689c);
        }
    }

    public final void e(boolean z2) {
        synchronized (f26513e) {
            try {
                Iterator it = this.f26516c.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1689c) it.next()).a(z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f26515b;
        boolean zCompareAndSet = this.f26514a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            e(false);
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
        AtomicBoolean atomicBoolean = this.f26515b;
        boolean zCompareAndSet = this.f26514a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            e(false);
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
    public final void onTrimMemory(int i5) {
        if (i5 == 20 && this.f26514a.compareAndSet(false, true)) {
            this.f26515b.set(true);
            e(true);
        }
    }
}
