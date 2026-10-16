package com.vungle.ads.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ef.C2515C;
import ef.C2530n;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f, reason: collision with root package name */
    public static final d f33838f = new d();

    /* renamed from: b, reason: collision with root package name */
    public volatile int f33840b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f33841c;

    /* renamed from: d, reason: collision with root package name */
    public volatile c f33842d;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f33839a = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet f33843e = new CopyOnWriteArraySet();

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
        Iterator it = this.f33843e.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AbstractC3340k.e(activity, "activity");
        Iterator it = this.f33843e.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b(activity);
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
        this.f33840b++;
        if (this.f33841c || this.f33840b != 1) {
            return;
        }
        this.f33841c = true;
        c cVar = this.f33842d;
        if (cVar != null) {
            Context context = (Context) cVar.b().get();
            if (context != null) {
                a.a(context, cVar.c(), cVar.d(), cVar.a());
            }
            this.f33842d = null;
        }
        Iterator it = this.f33843e.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        AbstractC3340k.e(activity, "activity");
        this.f33840b--;
        if (this.f33841c && this.f33840b == 0) {
            this.f33841c = false;
            Iterator it = this.f33843e.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a();
            }
        }
    }

    public static final boolean a(d dVar, Context context, Intent intent, Intent intent2, com.vungle.ads.internal.ui.m mVar) {
        dVar.getClass();
        try {
            if (intent != null) {
                context.startActivity(intent);
                if (mVar != null) {
                    mVar.a(true);
                }
            } else {
                if (intent2 == null) {
                    return false;
                }
                context.startActivity(intent2);
            }
        } catch (Exception e7) {
            boolean z2 = u.f33874a;
            t.b("ActivityManager", "Failed to start activity: " + e7);
            if (intent != null && mVar != null) {
                try {
                    mVar.a(false);
                } catch (Exception unused) {
                    return false;
                }
            }
            if (intent != null && intent2 != null) {
                context.startActivity(intent2);
            }
            return false;
        }
        return true;
    }

    public static final void a(d dVar, Context context) {
        Object objZ;
        if (dVar.f33839a.getAndSet(true)) {
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            AbstractC3340k.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(dVar);
            objZ = C2515C.f34653a;
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        Throwable thA = C2530n.a(objZ);
        if (thA != null) {
            boolean z2 = u.f33874a;
            t.a("ActivityManager", "Error initializing ActivityManager", thA);
            dVar.f33839a.set(false);
        }
    }

    public static final boolean a(d dVar) {
        return !dVar.f33839a.get() || dVar.f33841c;
    }

    public static final void a(d dVar, b bVar) {
        dVar.f33843e.add(bVar);
    }

    public final void a(b callback) {
        AbstractC3340k.e(callback, "callback");
        this.f33843e.remove(callback);
    }
}
