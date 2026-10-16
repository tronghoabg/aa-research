package com.applovin.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1629c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private final List f21168a = DesugarCollections.synchronizedList(new ArrayList());

    /* renamed from: b, reason: collision with root package name */
    private WeakReference f21169b;

    /* renamed from: c, reason: collision with root package name */
    private WeakReference f21170c;

    public C1629c(Context context) {
        this.f21169b = new WeakReference(null);
        this.f21170c = new WeakReference(null);
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.f21169b = new WeakReference(activity);
            if (activity.hasWindowFocus()) {
                this.f21170c = this.f21169b;
            }
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    public Activity a() {
        return (Activity) this.f21170c.get();
    }

    public Activity b() {
        return (Activity) this.f21169b.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.f21168a).iterator();
        while (it.hasNext()) {
            ((AbstractC1626b) it.next()).onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Iterator it = new ArrayList(this.f21168a).iterator();
        while (it.hasNext()) {
            ((AbstractC1626b) it.next()).onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f21170c = new WeakReference(null);
        Iterator it = new ArrayList(this.f21168a).iterator();
        while (it.hasNext()) {
            ((AbstractC1626b) it.next()).onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        WeakReference weakReference = new WeakReference(activity);
        this.f21169b = weakReference;
        this.f21170c = weakReference;
        Iterator it = new ArrayList(this.f21168a).iterator();
        while (it.hasNext()) {
            ((AbstractC1626b) it.next()).onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.f21168a).iterator();
        while (it.hasNext()) {
            ((AbstractC1626b) it.next()).onActivitySaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Iterator it = new ArrayList(this.f21168a).iterator();
        while (it.hasNext()) {
            ((AbstractC1626b) it.next()).onActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Iterator it = new ArrayList(this.f21168a).iterator();
        while (it.hasNext()) {
            ((AbstractC1626b) it.next()).onActivityStopped(activity);
        }
    }

    public void a(AbstractC1626b abstractC1626b) {
        this.f21168a.add(abstractC1626b);
    }

    public void b(AbstractC1626b abstractC1626b) {
        this.f21168a.remove(abstractC1626b);
    }
}
